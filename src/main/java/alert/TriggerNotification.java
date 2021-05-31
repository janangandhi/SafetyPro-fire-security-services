package alert;

public interface TriggerNotification {
    void arm();

    boolean disarm(String masterCode);

    String getFileName();

    String getAlertTypeLabel();
}
