package model;

public abstract class SensorSetters {
    String sensorName;
    double sensorCost;

    public abstract void setSensorName();
    public abstract void setSensorCost();

    public final void set() {
        setSensorName();
        setSensorCost();
    }
}
