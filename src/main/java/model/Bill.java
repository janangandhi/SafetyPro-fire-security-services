package model;
public class Bill {
    public static final double INSTALL_FEE = 200.0;

    private static Bill bill;
    private int billId;
    private double cost;
    private int number;

    private void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBillId() {
        return billId;
    }

    public static Bill getInstance() {
        if (bill == null) {
            return new Bill();
        }
        return bill;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setNumberOfSensors(int number) {
        this.number = number;
    }

    public int getNumberOfSensors() {
        return number;
    }

//    public void generateAndDisplayBill(User user){
//        this.setBillId(1);
//        System.out.println("Here's your Bill");
//        System.out.println("Bill Id: "+this.getBillId());
//        System.out.println("First Name: "+user.getFirstName());
//        System.out.println("Address: "+user.getAddress());
//        System.out.println("Email ID: "+user.getEmail());
//        System.out.println("Phone Number: "+user.getPhoneNumber());
//
//        System.out.println("here's the all Information of your services");
//        System.out.println("No of Services: "+ user.getNoOfServices());
//        System.out.println("No of Sections: "+ user.getNoOfSections());
//        System.out.println("No of rooms: "+ user.getNoOfRooms());
//        for(int i = 0; i < user.getNoOfServices(); i++){
//            System.out.println("Service "+i+" Info:");
//            System.out.println("ServiceID: "+user.getBuilding().getServices()[i].getServiceID());
//            System.out.println("Service Type: "+user.getBuilding().getServices()[i].getServiceType());
//            System.out.println("Coverage of Service: Start Date: "+user.getBuilding().getServices()[i].getSchedular().getStartDate()+" End Date: "+user.getBuilding().getServices()[i].getSchedular().getEndDate());
//            System.out.println("Furthur information of your service: "+i);
//            for(int j = 0; j < user.getNoOfSections(); j++){
//                System.out.println("Section "+j+" Info:");
//                System.out.println("Section ID: "+user.getBuilding().getServices()[i].getSections()[j].getSectionID());
//                for(int k = 0; k < user.getNoOfRooms(); k++){
//                    System.out.println("Room "+k+" Info:");
//                    System.out.println("Room Number: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getRoomNumber());
//                    System.out.println("Following Room has Sensor with this specification: ");
//                    System.out.println("Sensor ID: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorID()+
//                            " Sensor Name: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorName()+
//                            " Sensor Type: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorType()+
//                            " Sensor Status: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorStatus()+
//                            " Sensor Cost: "+user.getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorCost());
//                }
//            }
//        }
//
//        System.out.println("Total Cost for User "+ user.getFirstName()+" is: "+ user.getTotalCost());
//    }
}
