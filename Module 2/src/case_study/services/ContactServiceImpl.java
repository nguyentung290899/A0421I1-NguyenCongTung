package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.utils.ReadAndWrite;

import java.io.Reader;
import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    @Override
    public void createNewContracts() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = BookingServiceImpl.sendBooking();
        bookingQueue.addAll(bookingSet);
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("creating a contract for " + booking);
            System.out.println("Enter contract code");
            int contractCode = 0;
            while (contractCode!=0) {
                try {
                    contractCode = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
            }
            System.out.println("Enter money paid");
            int moneyPaid = 0;
            while (moneyPaid !=0) {
                try {
                    moneyPaid = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
            }
            System.out.println("Enter total money");
            int totalMoney = 0;
            while (totalMoney !=0) {
                try {
                    totalMoney = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
            }
            Contract contract = new Contract(booking, contractCode, moneyPaid, totalMoney);
            contractList.add(contract);
            System.out.println("create a successful contract");
            ReadAndWrite.write(contractList, "D:\\codegym\\Module2\\src\\case_study\\data\\contracts.csv");
        }
    }

    @Override
    public void displayListContracts() {
        contractList = (List<Contract>) ReadAndWrite.read("D:\\codegym\\Module2\\src\\case_study\\data\\contracts.csv");
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    public Contract isContract(int contractCode) {
        for (Contract contract : contractList) {
            if (contract.getContractCode() == contractCode) {
                return contract;
            }
        }
        return null;
    }

    @Override
    public void editContracts() {
        System.out.println("Enter contract code:");
        int contractCode = Integer.parseInt(input.nextLine());
        Contract contract = isContract(contractCode);
        if (contract != null) {
            System.out.println("1. edit  money paid: ");
            System.out.println("2. edit total money: ");
            System.out.println("3. display list contracts: ");
            System.out.println("Enter choice: ");
            int choice = 1;
            Booking booking;
            int moneyPaid;
            int totalMoney;
            while (choice != 0) {
                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Import bad format, please enter back");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Enter new email:");
                        moneyPaid = Integer.parseInt(input.nextLine());
                        contract.setMoneyPaid(moneyPaid);
                        displayListContracts();
                        break;
                    case 2:
                        System.out.println("Enter new degree:");
                        totalMoney = Integer.parseInt(input.nextLine());
                        input.nextLine();
                        contract.setTotalMoney(totalMoney);
                        displayListContracts();
                        break;

                    case 3:
                        displayListContracts();
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            editContracts();
        }
        ReadAndWrite.write(contractList, "D:\\codegym\\Module2\\src\\case_study\\data\\contracts.csv");
    }
}
