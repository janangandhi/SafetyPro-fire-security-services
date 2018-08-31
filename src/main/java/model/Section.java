package model;

import java.util.List;

public class Section {

    private int sectionId;
    private List<Room> rooms;
    public Section(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getSectionId() {
        return sectionId;
    }

    private void addRoom() {

    }
}
