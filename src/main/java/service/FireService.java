package service;

import model.ServiceType;
import model.User;
import sensor.Sensor;

public class FireService extends SafetyProService {

    public FireService(User user) {
        super(user);
    }

    @Override
    public void activateService() {
        System.out.println("Turning all sensors on in Fire Service");
        sensorList.forEach(Sensor::turnOn);
    }

    @Override
    public void deactivateService() {
        System.out.println("Turning all sensors off in Fire Service");
        sensorList.forEach(Sensor::turnOff);
    }

    @Override
    public ServiceType getServiceType() {
        return ServiceType.FIRE_SERVICE;
    }

}
