package sensor;

import util.Constants;

public class CameraDecorator extends SensorDecorator {

    public CameraDecorator(Sensor baseSensor) {
        super(baseSensor);
        System.out.println("Added Camera to sensor  " + getId());
    }

    @Override
    public Double getCost() {
        return Constants.SENSOR_CAMERA_COST + baseSensor.getCost();
    }
}
