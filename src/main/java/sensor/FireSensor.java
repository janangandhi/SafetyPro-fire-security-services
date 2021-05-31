package sensor;

import util.Constants;

public class FireSensor implements Sensor {

    private final int id;
    private boolean isOn;

    public FireSensor(int id) {
        this.id = id;
        isOn = false;
        System.out.println("Added Fire sensor with id " + id);
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
        return Constants.FIRE_SENSOR_COST;
    }
}
