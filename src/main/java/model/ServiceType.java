package model;

public enum ServiceType {
    FIRE_SERVICE("Fire service"),
    SECURITY_SERVICE("Security service");

    private final String serviceName;

    private ServiceType(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return this.serviceName;
    }
}
