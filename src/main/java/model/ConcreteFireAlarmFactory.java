package model;

public class ConcreteFireAlarmFactory implements AbstractServiceFactory {
    @Override
    public Service createService() {
        return new FireAlarmService();
    }

    @Override
    public Alarm createAlarm() {
        return new FireAlarm();
    }

}
