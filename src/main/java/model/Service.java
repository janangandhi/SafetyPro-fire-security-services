package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Service {
    private List<Section> sectionList;
    private List<Room> roomList;
    private List<Room> roomList1;
    private List<Room> roomList2;
    private List<Room> roomList3;
    private List<Room> roomList4;

    private Section section1;
    private Section section2;
    private Section section3;
    private Section section4;

    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;
    private Room room10;
    private Room room11;
    private Room room12;
    private Room room13;
    private Room room14;

    public int serviceID;
    public String serviceType;
    public List<Sensor> sensorList;
    public int activeNumOfRooms;

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public abstract void setServiceType(String serviceType);


    public Service() {
        sectionList = new ArrayList<>();
        roomList = new ArrayList<>();
        roomList1 = new ArrayList<>();
        roomList2 = new ArrayList<>();
        roomList3 = new ArrayList<>();
        roomList4 = new ArrayList<>();

        section1 = new Section(1);
        section2 = new Section(2);
        section3 = new Section(3);
        section4 = new Section(4);

        room1 = new Room(1);
        room2 = new Room(2);
        room3 = new Room(3);
        room4 = new Room(4);
        room5 = new Room(5);
        room6 = new Room(6);
        room7 = new Room(7);
        room8 = new Room(8);
        room9 = new Room(9);
        room10 = new Room(10);
        room11 = new Room(11);
        room12 = new Room(12);
        room13 = new Room(13);
        room14 = new Room(14);

        setRoomSection();
        addRoomToSection();
        addSectionToService();
        addToRoomList();
    }

    private void addToRoomList() {
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
        roomList.add(room11);
        roomList.add(room12);
        roomList.add(room13);
        roomList.add(room14);
    }

    private void setRoomSection() {
        room1.setSection(1);
        room2.setSection(1);
        room3.setSection(1);
        room4.setSection(1);
        room5.setSection(2);
        room6.setSection(2);
        room7.setSection(2);
        room8.setSection(2);
        room9.setSection(3);
        room10.setSection(3);
        room11.setSection(3);
        room12.setSection(4);
        room13.setSection(4);
        room14.setSection(4);
    }

    private void addSectionToService() {
        sectionList.add(section1);
        sectionList.add(section2);
        sectionList.add(section3);
        sectionList.add(section4);
    }

    private void addRoomToSection() {
        roomList1.add(room1);
        roomList1.add(room2);
        roomList1.add(room3);
        roomList1.add(room4);

        roomList2.add(room5);
        roomList2.add(room6);
        roomList2.add(room7);
        roomList2.add(room8);

        roomList3.add(room9);
        roomList3.add(room10);
        roomList3.add(room11);

        roomList4.add(room12);
        roomList4.add(room13);
        roomList4.add(room14);
    }

    public Section getSectionId(int num) {
        return sectionList.get(num);
    }


    public int getServiceID() {
        return serviceID;
    }

    public Room getRoomId(int num) {
        return roomList.get(num);
    }

    public List<Room> getRoomList1() {
        return roomList1;
    }

    public List<Room> getRoomList2() {
        return roomList2;
    }

    public List<Room> getRoomList3() {
        return roomList3;
    }

    public List<Room> getRoomList4() {
        return roomList4;
    }

    public void displayServiceInfo(){
        System.out.println("Service ID: "+this.getServiceID()+" Service Type: "+this.getServiceType());
    }

}
