package model;

public abstract class SafetyProServiceBillBuilder {

    public String invoiceNumber;
    public String accountName;
    public String billableAddress;
    public int numberOfSensors;
    public Double sensorCost;
    public String serviceType;
    public Double totalCost;

    public abstract SafetyProServiceBillBuilder withAccountName(String accountName);

    public abstract SafetyProServiceBillBuilder withBillableAddress(String address);

    public abstract SafetyProServiceBillBuilder withSensorCount(int sensorCount);

    public abstract SafetyProServiceBillBuilder havingSensorCost(Double sensorCost);

    public abstract SafetyProServiceBillBuilder ofType(String serviceType);

    public abstract ServiceBill generateBill();
}
