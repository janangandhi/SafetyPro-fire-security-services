package model;

import util.Constants;

import java.util.UUID;

public class ServiceBill {

    private final String invoiceNumber;
    private final String accountName;
    private final String billableAddress;
    private final int numberOfSensors;
    private final String serviceType;
    private final Double totalCost;
    private final Double sensorCost;


    public ServiceBill(SafetyProServiceBillBuilder builder) {
        this.invoiceNumber = builder.invoiceNumber;
        this.accountName = builder.accountName;
        this.billableAddress = builder.billableAddress;
        this.numberOfSensors = builder.numberOfSensors;
        this.sensorCost = builder.sensorCost;
        this.totalCost = builder.totalCost;
        this.serviceType = builder.serviceType;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getBillableAddress() {
        return billableAddress;
    }

    public int getNumberOfSensors() {
        return numberOfSensors;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public Double getSensorCost() {
        return sensorCost;
    }


    public String getServiceType() {
        return serviceType;
    }

    public static class ServiceBillBuilder extends SafetyProServiceBillBuilder {

        public ServiceBillBuilder() {
            this.invoiceNumber = UUID.randomUUID().toString();
        }

        public ServiceBillBuilder withAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public ServiceBillBuilder withBillableAddress(String address) {
            this.billableAddress = address;
            return this;
        }

        public ServiceBillBuilder withSensorCount(int sensorCount) {
            this.numberOfSensors = sensorCount;
            return this;
        }

        public ServiceBillBuilder havingSensorCost(Double sensorCost) {
            this.sensorCost = sensorCost;
            this.totalCost = sensorCost + Constants.SERVICE_CHARGES;
            return this;
        }

        public ServiceBillBuilder ofType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public ServiceBill generateBill() {
            return new ServiceBill(this);
        }

    }

}
