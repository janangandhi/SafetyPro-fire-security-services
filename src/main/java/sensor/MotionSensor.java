package sensor;

import util.Constants;

public class MotionSensor implements Sensor {

    private final int id;
    private boolean isOn;

    public MotionSensor(int id) {
        this.id = id;
        isOn = false;
        System.out.println("Added Motion sensor with id " + id);
    }

    public void turnOn() {
        if (!isOn) {
            System.out.println("Turning sensor " + id + " on!");
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("Turning sensor " + id + " off!");
            isOn = false;
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public Double getCost() {
        return Constants.MOTION_SENSOR_COST;
    }
}
