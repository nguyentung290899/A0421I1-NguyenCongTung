package case_study.controllers;

import case_study.services.*;

import java.util.Properties;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            FacilityServiceImpl facilityService = new FacilityServiceImpl();
            BookingServiceImpl bookingService = new BookingServiceImpl();
            ContactServiceImpl contactService = new ContactServiceImpl();
            PromotionServiceImpl promotionService = new PromotionServiceImpl();
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice = 0;
            while (true) {
                System.out.println("Enter your choice: ");
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
                if (choice == 1) {
                    int choice1 = 1;
                    while (choice1 != 4) {
                        System.out.println("1 Display list employees");
                        System.out.println("2 Add new employee");
                        System.out.println("3 Edit employee");
                        System.out.println("4 Return main menu");
                        System.out.println("Enter your choice employees: ");
                        try {
                            choice1 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        if (choice1 == 1) {
                            employeeService.displayListEmployees();
                        } else if (choice1 == 2) {
                            employeeService.addNewEmployee();
                        } else if (choice1 == 3) {
                            employeeService.editEmployee();
                        } else if (choice1 == 4) {
                            break;
                        } else System.out.println("No choice!");
                    }
                } else if (choice == 2) {
                    int choice2 = 1;
                    while (choice2 != 4) {
                        System.out.println("1 Display list customers");
                        System.out.println("2 Add new customer");
                        System.out.println("3 Edit customer");
                        System.out.println("4 Delete customer");
                        System.out.println("5 Return main menu");
                        System.out.println("Enter your choice customers: ");
                        try {
                            choice2 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        if (choice2 == 1) {
                            customerService.displayListCustomer();
                        } else if (choice2 == 2) {
                            customerService.addNewCustomer();
                        } else if (choice2 == 3) {
                            customerService.editCustomer();
                        } else if (choice2 == 4) {
                            customerService.deleteCustomer();
                        }   else if (choice2 == 5) {
                            break;
                        } else System.out.println("No choice!");
                    }
                } else if (choice == 3) {
                    int choice3 = 1;
                    while (choice3 != 4) {
                        System.out.println("1 Display list facility");
                        System.out.println("2 Add new facility");
                        System.out.println("3 Display list facility maintenance");
                        System.out.println("4 Return main menu");
                        System.out.println("Enter your choice facility: ");
                        try {
                            choice3 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        if (choice3 == 1) {
                            facilityService.displayListFacility();
                        } else if (choice3 == 2) {
                            facilityService.addNewFacility();
                        } else if (choice3 == 3) {
                            facilityService.displayListFacilityMaintenance();
                        } else if (choice3 == 4) {
                            break;
                        } else System.out.println("No choice!");
                    }
                } else if (choice == 4) {
                    int choice4 = 1;
                    while (choice4 != 6) {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        System.out.println("Enter your choice booking: ");
                        try {
                            choice4 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        if (choice4 == 1) {
                            bookingService.addNewBooking();
                        } else if (choice4 == 2) {
                            bookingService.displayListBooking();
                        } else if (choice4 == 3) {
                            contactService.createNewContracts();
                        } else if (choice4 == 4) {
                            contactService.displayListContracts();
                        } else if (choice4 == 5) {
                            contactService.editContracts();
                        } else if (choice4 == 6) {
                            break;
                        } else System.out.println("No choice!");
                    }
                } else if (choice == 5) {
                    int choice5 = 1;
                    while (choice5 != 3) {
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        System.out.println("Enter your choice promotion: ");
                        try {
                            choice5 = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Import bad format, please enter back");
                        }
                        if (choice5 == 1) {
                            promotionService.displayListCustomersUseService();
                        } else if (choice5 == 2) {
                            promotionService.displayListCustomersGetVoucher();
                        } else if (choice5 == 3) {
                            break;
                        } else System.out.println("No choice!");
                    }
                } else if (choice == 6) {
                    System.exit(6);
                } else {
                    System.out.println("No choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
