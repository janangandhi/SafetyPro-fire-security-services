package alert;

import model.User;
import util.Constants;

public class AlarmAlert implements TriggerNotification {

    private final User user;

    public AlarmAlert(User user) {

        this.user = user;
    }

    @Override
    public void arm() {
        System.out.println("Alarm has been triggered at " + user.getAddress() + "!!");
    }

    public boolean disarm(String masterCode) {
        if (masterCode.equals(user.getMasterCode())) {
            System.out.println("Alarm disarmed successfully!!");
            return true;
        }
        System.out.println("Incorrect master code passed. Alarm NOT disarmed!!");
        return false;
    }

    @Override
    public String getFileName() {
        return Constants.ALARM_IMAGE;
    }

    @Override
    public String getAlertTypeLabel() {
        return "Alarm has been triggered at" + user.getAddress() + "!!";
    }
}
