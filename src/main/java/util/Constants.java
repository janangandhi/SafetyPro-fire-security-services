package util;

import java.util.HashMap;

public class Constants {

    public static final Double FIRE_SENSOR_COST = 20.00;
    public static final Double MOTION_SENSOR_COST = 25.00;
    public static final Double SENSOR_CAMERA_COST = 5.00;
    public static final Double SERVICE_CHARGES = 500.00;
    public static final String PHONE_ALERT = "Phone Alert";
    public static final String ALARM_ALERT = "Alarm Alert";
    public static final String ALARM_IMAGE = "alarmSiren.png";
    public static final String PHONE_IMAGE = "phone.png";

    public static final String CHARGES_DETAILS = "Charges: \n Cost of 1 Fire Sensor: $20 \n Cost of 1 Motion Sensor: $25 \n Cost of 1 Motion Camera Sensor: $30";

    public static HashMap<Integer, int[]> SECTION_MAPPING = new HashMap<>();

    static {
        SECTION_MAPPING.put(1, new int[]{1, 2, 3});
        SECTION_MAPPING.put(2, new int[]{4, 5, 6, 7});
        SECTION_MAPPING.put(3, new int[]{8, 9, 10});
        SECTION_MAPPING.put(4, new int[]{11, 12});
    }

}
