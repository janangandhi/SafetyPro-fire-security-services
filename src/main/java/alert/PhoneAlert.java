package alert;

import model.User;
import util.Constants;

public class PhoneAlert implements TriggerNotification {

    private final User user;

    public PhoneAlert(User user) {
        this.user = user;
    }

    @Override
    public void arm() {
        System.out.println("CALLING PHONE NUMBER " + user.getPhoneNumber() + " FOR ALERT!!");
    }

    @Override
    public boolean disarm(String masterCode) {
        if (masterCode.equals(user.getMasterCode())) {
            System.out.println("Trigger disarmed. Disconnecting call!!");
            return true;
        }
        System.out.println("Incorrect master code passed. Call still in progress!!");
        return false;
    }

    @Override
    public String getFileName() {
        return Constants.PHONE_IMAGE;
    }

    @Override
    public String getAlertTypeLabel() {
        return "Calling Phone Number " + user.getPhoneNumber() + " For Alert!!";
    }
}
