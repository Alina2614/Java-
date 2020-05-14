
package ac.daffodil.l4dc1000030.budgets.manager;


import ac.daffodil.l4dc1000030.budgets.beans.Accounts;
import ac.daffodil.l4dc1000030.budgets.beans.Schedule;
import ac.daffodil.l4dc1000030.budgets.beans.Transaction;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class ScheduleDataManager {
       private static final String FILE_NAME = "data/schedule";

    public static void save(ArrayList<Schedule> scheduleList) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(scheduleList);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            System.err.println("Cannot save to file.");
        }
    }

    public static ArrayList<Schedule> load() {
        ArrayList<Schedule> scheduleList = null;
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            scheduleList = (ArrayList<Schedule>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            System.err.println("Cannot load from file.");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Class not found.");
        }

        return scheduleList;
    }

    private static ArrayList<Schedule> getScheduleList() {
        ArrayList<Schedule> scheduleList = load();
        if (scheduleList == null) {
            scheduleList = new ArrayList<Schedule>();
        }

        return scheduleList;
    }

    public static void add(Schedule schedule) {
        if (schedule != null) {
            ArrayList<Schedule> scheduleList = ScheduleDataManager.getScheduleList();
            scheduleList.add(schedule);
            save(scheduleList);
        }
    }

    public static void update(Schedule schedule) {
        if (schedule != null) {
            ArrayList<Schedule> scheduleList = ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                Schedule oldSchedule = scheduleList.get(i);
                if (oldSchedule.equals(schedule)) {
                    scheduleList.set(i, schedule);
                    save(scheduleList);
                    break;
                }
            }
        }
    }

    public static void delete(Schedule schedule) {
        if (schedule != null) {
            ArrayList<Schedule> scheduleList = ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                Schedule oldSchedule = scheduleList.get(i);
                if (oldSchedule.equals(schedule)) {
                    scheduleList.remove(i);
                    save(scheduleList);
                    break;
                }
            }
        }
    }

    public static ArrayList<Schedule> getScheduleList(Accounts account) {
        ArrayList<Schedule> allScheduleList = load();
        ArrayList<Schedule> accountScheduleList = new ArrayList<Schedule>();
        if (allScheduleList != null) {
            for (int i = 0; i < allScheduleList.size(); i++) {
                Schedule schedule = allScheduleList.get(i);
                if (schedule.getAccountName().equals(account)) {
                    accountScheduleList.add(schedule);
                }
            }
        }

        return accountScheduleList;
    }

    public static ArrayList<Schedule> getScheduleList(ArrayList<Accounts> accountList) {
        ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
        for (int i = 0; i < accountList.size(); i++) {
            Accounts account = accountList.get(i);
            ArrayList<Schedule> accountScheduleList = ScheduleDataManager.getScheduleList(account);
            if (accountScheduleList != null) {
                for (int j = 0; j < accountScheduleList.size(); j++) {
                    Schedule schedule = accountScheduleList.get(j);
                    scheduleList.add(schedule);
                }
            }
        }
        return scheduleList;
    }

    public static ArrayList<Schedule> getUserScheduleList() {
        ArrayList<Accounts> userAccountList = AccountsDataManager.getUserAccountList();
        ArrayList<Schedule> userScheduleList = getScheduleList(userAccountList);
        return userScheduleList;
    }

    public static ArrayList<Schedule> getPendingScheduleList() {
        ArrayList<Schedule> pendingScheduleList = new ArrayList<Schedule>();
        ArrayList<Schedule> userScheduleList = getUserScheduleList();

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < userScheduleList.size(); i++) {
            Schedule schedule = userScheduleList.get(i);
            if (schedule.getDate() != null) {
                if (dateFormat.format(schedule.getDate()).equals(dateFormat.format(now))) {
                    pendingScheduleList.add(schedule);
                } else if (schedule.getDate().before(now)) {
                    pendingScheduleList.add(schedule);
                }
            }
        }

        return pendingScheduleList;
    }

    public static void moveScheduleToNextMonth(Schedule schedule) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(schedule.getDate());
        calendar.add(Calendar.MONTH, 1);

        schedule.setDate(calendar.getTime());

        update(schedule);
    }

    public static void addScheduledTransactions() {
        ArrayList<Schedule> pendingScheduleList = getPendingScheduleList();
        for (int i = 0; i < pendingScheduleList.size(); i++) {
            Schedule schedule = pendingScheduleList.get(i);

            Transaction transaction = new Transaction();
            transaction.setId(UUID.randomUUID().toString());
            transaction.setAccount(schedule.getAccountName());
            transaction.setAmount(schedule.getAmount());
            transaction.setCategory(schedule.getCategory());
            transaction.setDate(schedule.getDate());

            TransactionDataManager.add(transaction);

            moveScheduleToNextMonth(schedule);
        }
    }


}
