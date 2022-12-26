package com.rsk.rsk.java;

public class Organizer {
    boolean closeMeeting (Meeting meeting) {
        if (meeting.canClose) return meeting.close();
        return false;
    }

    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.closeMeeting(null);
    }

}

class Meeting {
    public boolean canClose;
    public boolean close() {
        return false;
    }
}