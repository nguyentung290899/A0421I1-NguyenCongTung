package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.print("Property list: ");
        for (int a : array) {
            System.out.print(a + "\t");
        }
        int delete;
        System.out.print("Enter delete: ");
        delete = input.nextInt();
        boolean check = false;
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (delete == array[i]) {
                check = true;
                number = i;
                break;
            }
        }
        int[] newArray = new int[array.length - 1];
        if (check) {
            for (int j = 0; j < number; j++) {
                newArray[j] = array[j];
            }
            for (int k = number; k < (size - 1); k++) {
                newArray[k] = array[k + 1];
            }
            for (int b : newArray) {
                System.out.print(b +"\t");
            }
        } else {
            System.out.println("Couldn't find the element to be deleted");
        }
    }
}
