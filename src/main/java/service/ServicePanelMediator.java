package service;

import alert.AlertFactory;
import model.SafetyProServiceBillBuilder;
import model.ServiceBill;
import model.TaskSchedule;
import sensor.SensorType;
import util.Constants;
import view.BillDetailsPanel;
import view.TriggerNotificationPanel;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ServicePanelMediator {

    private final SafetyProService service;
    private boolean isServiceActivated;
    private SafetyProServiceBillBuilder builder;

    public ServicePanelMediator(SafetyProService service, SafetyProServiceBillBuilder builder) {
        this.service = service;
        this.isServiceActivated = false;
        this.builder = builder;
    }

    public void onSensorSelected(int buttonId, SensorType type, boolean isSensorSelected) {
        if (isSensorSelected) {
            service.addSensor(buttonId, type);
        } else {
            service.removeSensor(buttonId);
        }
    }

    public void onSectionSelected(int sectionId, SensorType type, boolean isSectionSelected) {
        int[] sensorIds = Constants.SECTION_MAPPING.get(sectionId);
        if (isSectionSelected) {
            Arrays.stream(sensorIds).forEach(id -> service.addSensor(id, type));
        } else {
            Arrays.stream(sensorIds).forEach(service::removeSensor);
        }
    }

    public void toggleServiceStatus() {
        if (isServiceActivated) {
            service.deactivateService();
            isServiceActivated = false;
        } else {
            service.activateService();
            isServiceActivated = true;
        }
    }

    public void scheduleService(TaskSchedule schedule) {
        LocalDateTime startTime = LocalDateTime.of(LocalDate.now(), schedule.getFromTime());
        LocalDateTime endTime = LocalDateTime.of(LocalDate.now(), schedule.getToTime());
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        Runnable task = this::toggleServiceStatus;
        long durationInSeconds = Duration.between(startTime, endTime).toSeconds();
        service.schedule(task, 0, TimeUnit.MICROSECONDS);
        service.schedule(task, durationInSeconds, TimeUnit.SECONDS);
    }

    public void displayBillPanel() {

        ServiceBill bill = builder.withAccountName(service.getServiceUser().getName())
                .withBillableAddress(service.getServiceUser().getAddress())
                .withSensorCount(service.getSensorList().size())
                .havingSensorCost(service.getTotalCost())
                .ofType(service.getServiceType().getServiceName())
                .generateBill();
        new BillDetailsPanel(bill).launchFrame();
    }

    public void selectTriggerNotification(String alertType) {
        service.setAlertNotification(AlertFactory.getInstance().getAlertForType(alertType, service.getServiceUser()));
    }

    public void triggerSimulation() {
        if (service.getSensorList().size() <= 0) {
            System.out.println("No sensors selected for simulation. At least select one sensor!!");
            return;
        }
        new TriggerNotificationPanel(service).launchFrame();

    }
}
