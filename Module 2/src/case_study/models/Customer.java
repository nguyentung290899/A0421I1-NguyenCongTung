package case_study.models;

import java.io.Serializable;
import java.util.Arrays;

public class Customer extends Person  {
    private int customerCode;
    private final String[] customerTypeArray = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int customerCode, int customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerTypeArray[customerType];
        this.address = address;
    }

    public Customer(String name, String dateOfBirth, String sex, int identityCardNumber, String telephoneNumber, String email, int customerCode, int customerType, String address) {
        super(name, dateOfBirth, sex, identityCardNumber, telephoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerTypeArray[customerType];
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String[] getCustomerTypeArray() {
        return customerTypeArray;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerTypeArray[customerType];
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
