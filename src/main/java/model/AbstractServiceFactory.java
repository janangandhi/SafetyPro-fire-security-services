package model;
import java.util.List;

public  interface AbstractServiceFactory {
    public abstract Service createService();
    public abstract Alarm createAlarm();

}
