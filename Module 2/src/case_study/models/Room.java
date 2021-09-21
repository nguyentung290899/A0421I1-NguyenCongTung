package case_study.models;

import java.time.LocalDate;

public class Room extends Facility {
    private String serviceFree;
    private static int value = 0;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public static int valueRoom() {
        return ++value;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                "} " + super.toString();
    }
}
