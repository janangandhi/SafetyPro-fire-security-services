package model;

public class SecurityAlarm extends Alarm{

    @Override
    public void setAlarmType(String alarmType) {
        super.alarmType = "Security Alarm";
    }

    @Override
    public String getAlarmType() {
        return super.alarmType;
    }


}
