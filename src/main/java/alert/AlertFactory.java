package alert;

import model.User;
import util.Constants;

public class AlertFactory {

    private static final AlertFactory instance = new AlertFactory();

    private AlertFactory() {
    }

    public static AlertFactory getInstance() {
        return instance;
    }

    public TriggerNotification getAlertForType(String alertType, User user) {
        switch (alertType) {
            case Constants.PHONE_ALERT:
                return new PhoneAlert(user);
            case Constants.ALARM_ALERT:
                return new AlarmAlert(user);
            default:
                return null;
        }
    }
}
