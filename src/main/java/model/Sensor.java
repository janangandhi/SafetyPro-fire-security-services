package model;

public class Sensor implements Detector {

    public int sensorID;
    public String sensorName;
    public String sensorType;
    public boolean sensorStatus;
    public double sensorCost;
    public boolean breakIn;
    public String location;

    public Sensor(String sensorType){
        this.sensorType = sensorType;
    }

    //Setters

    public void setVariable(){
        if(this.getSensorType().equalsIgnoreCase("Security")) {
            SensorSetters setters = new SetForSecurity();
            setters.setSensorName();
            setters.setSensorCost();
            this.sensorName = setters.sensorName;
            this.sensorCost = setters.sensorCost;
        }
        else{
            SensorSetters setters = new SetForFireAlarm();
            setters.setSensorName();
            setters.setSensorCost();
            this.sensorName = setters.sensorName;
            this.sensorCost = setters.sensorCost;
        }

    }
    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }


    public void setSensorStatus(boolean sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Getters
    public int getSensorID() {
        return this.sensorID;
    }

    public  String getSensorName(){
        return this.sensorName;
    }

    public  String getSensorType(){
        return this.sensorType;
    }

    public boolean getSensorStatus() {
        return this.sensorStatus;
    }

    public  double getSensorCost(){
        return this.sensorCost;
    }

    public boolean getBreakIn() {
        return this.breakIn;
    }

    public String getLocation() {
        return this.location;
    }

    public String displaySensorInfo() {
        String s = " Sensor Name: " + this.getSensorName() + " Sensor Type: " + this.getSensorType() + " Sensor Status: " + this.getSensorStatus() + " Sensor Cost: " + this.getSensorCost() + " Break In: " + this.getBreakIn() + " Location: " + this.getLocation() + "\n";
        //String s = "Sensor ID: " + this.getSensorID() + " Sensor Name: " + this.getSensorName() + " Sensor Type: " + this.getSensorType() + " Sensor Status: " + this.getSensorStatus() + " Sensor Cost: " + this.getSensorCost() + " Break In: " + this.getBreakIn() + " Location: " + this.getLocation() + "\n";
        return s;

    }

}