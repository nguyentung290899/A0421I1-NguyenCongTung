package case_study.services;

import case_study.models.Customer;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    private static ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    static {
        customerArrayList.add(new Customer("Nguyen Van A", "23/04/1994", "Nam", 184654768, "0971367456", "nguyenvana@gmail.com", 106170011, 2, "Quan Hai Chau, Da Nang" ));
        customerArrayList.add(new Customer("Pham Thi B", "23/5/1994", "Nu", 184465876, "0971365876", "phamthib@gmail.com", 106170012, 1, "Quan thanh khe, Da Nang"));
    }
    static Scanner input = new Scanner(System.in);
    public void displayListCustomer() {
        customerArrayList = (ArrayList<Customer>) ReadAndWrite.read("D:\\codegym\\Module2\\src\\case_study\\data\\customer.csv");
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }
    }
    public void addNewCustomer() {
        System.out.println("Enter name :");
        String name = input.nextLine();
        System.out.println("Enter dateOfBirth :");
        String dateOfBirth = input.nextLine();
        System.out.println("Enter sex :");
        String sex = input.nextLine();
        System.out.println("Enter identityCardNumber :");
        int identityCardNumber = 0;
        try {
            identityCardNumber = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter telephoneNumber :");
        String telephoneNumber = input.nextLine();
        System.out.println("Enter email :");
        String email = input.nextLine();
        System.out.println("Enter customerCode :");
        int customerCode = 0;
        try {
            customerCode = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter customerType :");
        int customerType = 0;
        try {
            customerType = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter address :");
        String address = input.nextLine();

        customerArrayList.add(new Customer(name,dateOfBirth,sex,identityCardNumber,telephoneNumber,email,customerCode,customerType,address));
        ReadAndWrite.write(customerArrayList, "D:\\codegym\\Module2\\src\\case_study\\data\\customer.csv");
    }
    public Customer isCustomer(int customerCode) {
        for (Customer customer : customerArrayList) {
            if (customer.getCustomerCode() == customerCode) {
                return customer;
            }
        }
        return null;
    }
    public void editCustomer() {
        System.out.println("Enter customerCode:");
        int customerCode= 0;
        try {
            customerCode = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        Customer customer = isCustomer(customerCode);
        if (customer != null) {
            System.out.println("Enter choice: ");
            System.out.println("1. TelephoneNumber:  ");
            System.out.println("2. Email: ");
            System.out.println("3. customerType: ");
            System.out.println("4. address: ");
            System.out.println("5. displayListCustomer: ");
            int choice = 1;
            String telephoneNumber;
            String email;
            int customerType;
            String address;
            while (choice != 0) {
                choice = 0;
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter new TelephoneNumber:");
                        telephoneNumber = input.nextLine();
                        customer.setTelephoneNumber(telephoneNumber);
                        displayListCustomer();
                        break;
                    case 2:
                        System.out.println("Enter new email:");
                        email = input.nextLine();
                        customer.setEmail(email);
                        displayListCustomer();
                        break;
                    case 3:
                        System.out.println("Enter new degree:");
                        customerType = 0;
                        try {
                            customerType = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        customer.setCustomerType(customerType);
                        displayListCustomer();
                        break;
                    case 4:
                        System.out.println("Enter new position:");
                        address = input.nextLine();
                        customer.setAddress(address);
                        displayListCustomer();
                        break;
                    case 6:
                        displayListCustomer();
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            editCustomer();
        }
        ReadAndWrite.write(customerArrayList, "D:\\codegym\\Module2\\src\\case_study\\data\\customer.csv");
    }

    @Override
    public void deleteCustomer() {
        System.out.println("Enter customerCode:");
        int customerCode= 0;
        try {
            customerCode = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        Customer customer = isCustomer(customerCode);
        customerArrayList.remove(customer);
        ReadAndWrite.write(customerArrayList, "D:\\codegym\\Module2\\src\\case_study\\data\\customer.csv");
    }

}
