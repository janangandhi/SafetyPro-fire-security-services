package service;

import model.ServiceType;
import model.User;
import sensor.Sensor;

public class SecurityService extends SafetyProService {

    public SecurityService(User user) {
        super(user);
    }

    @Override
    public void activateService() {
        System.out.println("Turning all sensors on in Security Service");
        sensorList.forEach(Sensor::turnOn);
    }

    @Override
    public void deactivateService() {
        System.out.println("Turning all sensors off in Fire Service");
        sensorList.forEach(Sensor::turnOff);
    }

    @Override
    public ServiceType getServiceType() {
        return ServiceType.SECURITY_SERVICE;
    }

}
