package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWriteHouse;
import case_study.utils.ReadAndWriteRoom;
import case_study.utils.ReadAndWriteVilla;
import case_study.utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();
    private static Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
    static final String REGEX_NAME = "^[A-Z][a-z]+";
    static final String REGEX_PEOPLE = "^[1-9]|([1][0-9])|[20]&";
    static final String REGEX_AREA = "^[3-9][0-9]|[1-9][0-9]{2,}&";
    static {
        villaIntegerMap.put(new Villa("villa", 200, 3000000, 5, "ngay", "căn hộ cao cấp", 50, 2), Villa.valueVilla());
    }
    private static Scanner input = new Scanner(System.in);
    static  List<Facility> facilityList = new ArrayList<>();
    @Override
    public void displayListFacility() {
        try {
            villaIntegerMap = (Map<Villa, Integer>) ReadAndWriteVilla.read("D:\\codegym\\Module2\\src\\case_study\\data\\villa.csv");
            for (Map.Entry<Villa, Integer> villaIntegerEntry : villaIntegerMap.entrySet()) {
                System.out.println("Service : " + villaIntegerEntry.getKey() + "number of hires: " + villaIntegerEntry.getValue());
            }
            roomIntegerMap = (Map<Room, Integer>) ReadAndWriteRoom.read("D:\\codegym\\Module2\\src\\case_study\\data\\room.csv");
            for (Map.Entry<Room, Integer> roomIntegerEntry : roomIntegerMap.entrySet()) {
                System.out.println("Service : " + roomIntegerEntry.getKey() + "number of hires: " + roomIntegerEntry.getValue());
            }
            houseIntegerMap = (Map<House, Integer>) ReadAndWriteHouse.read("D:\\codegym\\Module2\\src\\case_study\\data\\house.csv");
            for (Map.Entry<House, Integer> houseIntegerEntry : houseIntegerMap.entrySet()) {
                System.out.println("Service : " + houseIntegerEntry.getKey() + "number of hires: " + houseIntegerEntry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addNewFacility() {
        int choice =0;
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back Facility Management");
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        switch (choice) {
            case 1: {
                addNewVilla();
                break;
            }
            case 2: {
                addNewHouse();
                break;
            }
            case 3: {
                addNewRoom();
                break;
            }
            case 4: {
                break;
            }
        }
    }

    @Override
    public void addNewVilla() {
        String serviceName = inputServiceName();
        System.out.println("Enter usableArea :");
        double usableArea = 0;
        try {
            usableArea = Double.parseDouble(inputUsableArea());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalCost :");
        double rentalCost = 0;
        try {
            rentalCost = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = 0;
        try {
            maximumNumberPeople = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter roomStandard :");
        String roomStandard = input.nextLine();
        System.out.println("Enter swimmingPoolArea :");
        double swimmingPoolArea = 0;
        try {
            swimmingPoolArea = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter numberOfFloors :");
        int numberOfFloors = 0;
        try {
            numberOfFloors = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        Villa villa = new Villa(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,roomStandard,swimmingPoolArea,numberOfFloors);
        villaIntegerMap.put(villa,Villa.valueVilla());
        System.out.println("successfully added new villa");
//        facilityList.addAll(facilityIntegerMap.keySet());
        ReadAndWriteVilla.write(villaIntegerMap, "D:\\codegym\\Module2\\src\\case_study\\data\\villa.csv");
    }
    public String inputServiceName() {
        System.out.println("Enter serviceName :");
        return RegexData.regexStr(input.nextLine(),REGEX_NAME,"Re-enter because of wrong format, first letter must be capitalized" );
    }
    public String inputUsableArea() {
        System.out.println("Enter usableArea :");
        return RegexData.regexStr(input.nextLine(),REGEX_AREA,"" );
    }
    @Override
    public void addNewRoom() {
        System.out.println("Enter serviceName :");
        String serviceName = input.nextLine();
        System.out.println("Enter usableArea :");
        double usableArea = 0;
        try {
            usableArea = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalCost :");
        double rentalCost = 0;
        try {
            rentalCost = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = 0;
        try {
            maximumNumberPeople = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter serviceFree :");
        String serviceFree = input.nextLine();
        Room room = new Room(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,serviceFree);
        roomIntegerMap.put(room, Room.valueRoom());
//        facilityList.addAll(facilityIntegerMap.keySet());
        ReadAndWriteRoom.write( roomIntegerMap, "D:\\codegym\\Module2\\src\\case_study\\data\\room.csv");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter serviceName :");
        String serviceName = input.nextLine();
        System.out.println("Enter usableArea :");
        double usableArea = 0;
        try {
            usableArea = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalCost :");
        double rentalCost = 0;
        try {
            rentalCost = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter maximumNumberPeople :");
        int maximumNumberPeople = 0;
        try {
            maximumNumberPeople = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        System.out.println("Enter rentalType :");
        String rentalType = input.nextLine();
        System.out.println("Enter roomStandard :");
        String roomStandard = input.nextLine();
        System.out.println("Enter numberOfFloors :");
        int numberOfFloors = 0;
        try {
            numberOfFloors = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Import bad format, please enter back");
        }
        House house = new House(serviceName,usableArea,rentalCost,maximumNumberPeople,rentalType,roomStandard,numberOfFloors);
        houseIntegerMap.put(house,House.valueHouse());
        System.out.println("successfully added new house");
//        facilityList.addAll(facilityIntegerMap.keySet());
        ReadAndWriteHouse.write(houseIntegerMap, "D:\\codegym\\Module2\\src\\case_study\\data\\house.csv");
    }


    @Override
    public void displayListFacilityMaintenance() {

    }
}
