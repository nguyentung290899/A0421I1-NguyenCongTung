package case_study.models;

import java.time.LocalDate;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;
    private static int value = 0;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public static int valueHouse() {
        return ++value;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
}
