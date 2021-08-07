package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
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
        int push;
        System.out.print("Enter push: ");
        push = input.nextInt();
        System.out.print("Enter index: ");
        int index = input.nextInt();
        boolean check = false;
        if (index <= size) {
            check = true;
        }
        int[] newArray = new int[size + 1];
        if (check) {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = push;
            for (int i = index; i < size; i++) {
                newArray[i+1] = array[i];
            }
            for (int b : newArray) {
                System.out.print(b + "\t");
            }
        } else {
            System.out.println("Couldn't find the element to be deleted");
        }
    }
}
