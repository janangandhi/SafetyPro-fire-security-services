package model;

import java.util.HashMap;
public class DetectorFactory {
    public static final HashMap sensorMap = new HashMap();

    public static Detector getSensor(String sensorType){
        Sensor sensor =(Sensor) sensorMap.get(sensorType);
        if(sensor == null) {
            sensor = new Sensor(sensorType);
            sensorMap.put(sensorType, sensor);
            System.out.println("Creating Sensor of type : " + sensorType);
        }
        return sensor;
    }
}