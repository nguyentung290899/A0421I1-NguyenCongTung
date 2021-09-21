package case_study.services;

import case_study.models.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static ArrayList<Employee> employeesList = new ArrayList<Employee>();
    static {
        employeesList.add(new Employee("Nguyen Cong  ", "1/1/1999", "Nam", 184288752, "0971645756", "lemanhhung1999@gmail.com", 106170091, 2, 5, 50000000 ));
        employeesList.add(new Employee("Nguyen ", "27/5/1999", "Nu", 184584935, "0971356478", "phamthiquynhnhu1999@gmail.com", 106170092, 2, 4, 30000000 ));
    }
    static Scanner input = new Scanner(System.in);
    public void displayListEmployees() {
        employeesList = (ArrayList<Employee>) ReadAndWrite.Hueread("D:\\codegym\\Module2\\src\\case_study\\data\\employee.csv");
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
    public void addNewEmployee() {
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
        System.out.println("Enter employeeCode :");
        int employeeCode = 0;
        try {
            employeeCode = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter degree :");
        int degree = 0;
        try {
            degree = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter position :");
        int position = 0;
        try {
            position = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter salary :");
        float salary = 0;
        try {
            salary = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        employeesList.add(new Employee(name,dateOfBirth,sex,identityCardNumber,telephoneNumber,email,employeeCode,degree,position,salary));
        ReadAndWrite.write(employeesList, "D:\\\\codegym\\\\Module2\\\\src\\\\case_study\\\\data\\\\employee.csv");
    }
    public Employee isEmployee(int employeeCode) {
        for (Employee employees : employeesList) {
            if (employees.getEmployeeCode() == employeeCode) {
                return employees;
            }
        }
        return null;
    }
    public void editEmployee() {
        System.out.println("Enter employeeCode:");
        int employeeCode = 0;
        try {
            employeeCode = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        Employee employee = isEmployee(employeeCode);
        if (employee != null) {
            System.out.println("Enter choice: ");
            System.out.println("1. TelephoneNumber:  ");
            System.out.println("2. Email: ");
            System.out.println("3. degree: ");
            System.out.println("4. position: ");
            System.out.println("5. salary: ");
            System.out.println("6. displayListEmployees: ");
            int choice = 1;
            String telephoneNumber;
            String email;
            int degree = 0;
            int position = 0;
            float salary = 0;
            while (choice != 0) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter new TelephoneNumber:");
                        telephoneNumber = input.nextLine();
                        employee.setTelephoneNumber(telephoneNumber);
                        displayListEmployees();
                        break;
                    case 2:
                        System.out.println("Enter new email:");
                        email = input.nextLine();
                        employee.setEmail(email);
                        displayListEmployees();
                        break;
                    case 3:
                        System.out.println("Enter new degree:");
                        try {
                            degree = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        employee.setDegree(degree);
                        displayListEmployees();
                        break;
                    case 4:
                        System.out.println("Enter new position:");
                        try {
                            position = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        employee.setPosition(position);
                        displayListEmployees();
                        break;
                    case 5:
                        System.out.println("Enter new salary:");
                        try {
                            salary = Float.parseFloat(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        employee.setSalary(salary);
                        displayListEmployees();
                        break;
                    case 6:
                        displayListEmployees();
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            editEmployee();
        }
        ReadAndWrite.write(employeesList, "D:\\\\codegym\\\\Module2\\\\src\\\\case_study\\\\data\\\\employee.csv");
    }
}
