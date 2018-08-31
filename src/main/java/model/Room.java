package model;

import javax.swing.*;

public class Room {
    private Section section;
    private int roomId;
    private int sectionId;
    public boolean isSelected;

    public Room(int roomId){
        this.roomId = roomId;
        setSensorRoom();
    }
    void setSection(int sectionId) {
        this.sectionId = sectionId;
    }

    int getSectionId() {
        return sectionId;
    }

    private void setSensorRoom() {
    }

    public int getRoomId() {
        return roomId;
    }
}

