package model;

public class FireAlarm extends Alarm {//create one after press triggle

    @Override
    public void setAlarmType(String alarmType) {
        super.alarmType = "Fire Alarm";
    }

    @Override
    public String getAlarmType() {
        return super.alarmType;
    }
}
