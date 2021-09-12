package bai_12_java_collection_frameword.bai_tap.luyen_tap_su_dung_array_list_va_linked_list_trong_java_collection_framework;

import java.util.*;

public class ProductManager {
    private static List<Product> products = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    static {
        products.add(new Product(1,"HP pavilion gaming 15",20000000));
        products.add(new Product(3,"Dell latitude e6540",10000000));
        products.add(new Product(2,"Macbook pro 2021",40000000));
        products.add(new Product(4,"Acer swift 3",18000000));
    }
    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.println("Menu");
            System.out.println("1. Display product");
            System.out.println("2. Add product");
            System.out.println("3. Edit product");
            System.out.println("4. Delete product");
            System.out.println("5. Search product");
            System.out.println("6. Sort product");
            System.out.println("7. Display menu");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    displayMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }

    public static void displayProduct() {

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        int id;
        do {
            System.out.println("Enter id: ");
            id = input.nextInt();
            input.nextLine();
        }
        while (findById(id) != null);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        products.add(new Product(id, name, price));

    }

    public static Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static void editProduct() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        input.nextLine();
        Product product = findById(id);
        if (product != null) {
            System.out.println("Enter choice: ");
            System.out.println("1. Name  ");
            System.out.println("2. Price: ");
            System.out.println("3. Name and price: ");
            System.out.println("4. Display menu ");
            int choice = 1;
            String name;
            double price;
            while (choice != 0) {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new name:");
                        name = input.nextLine();
                        product.setNameProduct(name);
                        displayMenu();
                        break;
                    case 2:
                        System.out.println("Enter new price:");
                        price = input.nextDouble();
                        product.setPrice(price);
                        displayMenu();
                        break;
                    case 3:
                        System.out.println("Enter new price:");
                        price = input.nextDouble();
                        input.nextLine();
                        product.setPrice(price);
                        System.out.println("Enter new name:");
                        name = input.nextLine();
                        product.setNameProduct(name);
                        displayMenu();
                        break;
                    case 4:
                        displayMenu();
                        break;
                }
            }
        } else {
            System.out.println("id not found");
            editProduct();
        }
    }
    public static void deleteProduct() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        products.remove(findById(id));
    }
    public static void searchProduct() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        System.out.println(findById(id));
    }
    public static void sortProduct() {
        Collections.sort(products);
    }
    public static ArrayList<Product> getProducts() {
        return (ArrayList<Product>) products;
    }
}
