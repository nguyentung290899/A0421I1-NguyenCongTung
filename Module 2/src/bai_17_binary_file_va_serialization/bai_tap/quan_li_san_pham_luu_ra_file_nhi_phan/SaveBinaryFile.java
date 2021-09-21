package bai_17_binary_file_va_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

public class SaveBinaryFile {
    import bai_12_java_collection_frameword.bai_tap.luyen_tap_su_dung_array_list_va_linked_list_trong_java_collection_framework.Product;
import bai_12_java_collection_frameword.bai_tap.luyen_tap_su_dung_array_list_va_linked_list_trong_java_collection_framework.ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class SaveBinaryFile {
        public static void outputProduct(File outputProduct) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(outputProduct);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(ProductManager.getProducts());
                objectOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void inputProduct(File outputProduct) {
            try {
                FileInputStream fileInputStream = new FileInputStream(outputProduct);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ArrayList<Product> products = (ArrayList<Product>) objectInputStream.readObject();
                for (Product product : products) {
                    System.out.println(product);
                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            File file = new File("src\\bai_17_binary_file_va_serialization\\bai_tap\\quan_li_san_pham_luu_ra_file_nhi_phan\\SaveFile");
            outputProduct(file);
            inputProduct(file);
        }

    }
}
