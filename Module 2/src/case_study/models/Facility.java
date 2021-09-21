package case_study.models;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Facility implements Serializable {
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maximumNumberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCost, int maximumNumberPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
