package sensor;

public interface SafetyProSensorFactory {

    Sensor createSensor(int id, SensorType type);

}
