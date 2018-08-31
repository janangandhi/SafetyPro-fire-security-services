package model;

public abstract class Alarm {
    public int alarmID;
    public String alarmType;
    public String alarmLocation;
    public boolean alarmStatus;

    public void setAlarmID(int alarmID) {
        this.alarmID = alarmID;
    }

    public abstract void setAlarmType(String alarmType);

    public void setAlarmLocation(String alarmLocation) {
        this.alarmLocation = alarmLocation;
    }

    public void setAlarmStatus(boolean alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public int getAlarmID() {
        return alarmID;
    }

    public abstract String getAlarmType();

    public String getAlarmLocation() {
        return alarmLocation;
    }

    public boolean getAlarmStatus(){
        return  alarmStatus;
    }

    public void displayAlarmInfo(){
        System.out.println("Alarm ID: "+this.getAlarmID()+" Alarm Location: "+this.getAlarmLocation()+" Alarm Status: "+this.getAlarmStatus());
    }
}
