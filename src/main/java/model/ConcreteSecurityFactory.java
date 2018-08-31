package model;

public class ConcreteSecurityFactory implements AbstractServiceFactory{
    @Override
    public Service createService() {
        return new SecurityService();
    }

    @Override
    public Alarm createAlarm() {
        return new SecurityAlarm();
    }
}
