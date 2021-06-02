package service;

import alert.TriggerNotification;
import model.ServiceType;
import model.User;
import sensor.Sensor;
import sensor.SensorFactory;
import sensor.SensorType;

import java.util.ArrayList;
import java.util.List;

public abstract class SafetyProService implements SensorPublisher {

    List<Sensor> sensorList;
    User serviceUser;
    TriggerNotification alertNotification;

    public SafetyProService(User user) {
        this.serviceUser = user;
        sensorList = new ArrayList<>();
    }

    public void addSensor(int id, SensorType type) {
        boolean isSensorPresent = sensorList.stream().anyMatch(sensor -> sensor.getId() == id);
        if (!isSensorPresent) {
            sensorList.add(SensorFactory.getInstance().createSensor(id, type));
        }
    }

    public void removeSensor(int id) {
        boolean sensorRemoved = sensorList.removeIf(sensor -> sensor.getId() == id);
        if (sensorRemoved)
            System.out.println("Sensor " + id + " removed ");
    }

    public Double getTotalCost() {
        Double totalCost = 0.0;
        for (Sensor s : sensorList) {
            totalCost += s.getCost();
        }
        return totalCost;
    }

    public void setAlertNotification(TriggerNotification alertNotification) {
        this.alertNotification = alertNotification;
    }

    public void triggerService() {
        if (alertNotification != null) {
            alertNotification.arm();
        }
    }

    public boolean disarmService(String masterCode) {
        if (alertNotification != null) {
            return alertNotification.disarm(masterCode);
        }
        return false;
    }

    public User getServiceUser() {
        return serviceUser;
    }

    public List<Sensor> getSensorList() {
        return sensorList;
    }

    public TriggerNotification getAlertNotification() {
        return alertNotification;
    }

    public abstract void activateService();

    public abstract void deactivateService();

    public abstract ServiceType getServiceType();
}
