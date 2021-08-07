package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1;
        do {
            System.out.println("Enter a size array 1: ");
            size1 = input.nextInt();
            if (size1 > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size1 > 20);
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = input.nextInt();
        }
        int size2;
        do {
            System.out.println("Enter a size array 2: ");
            size2 = input.nextInt();
            if (size2 > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size2 > 20);
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array2[i] = input.nextInt();
        }
        System.out.print("Property list array 1: ");
        for (int a : array1) {
            System.out.print(a + "\t");
        }
        System.out.println("");
        System.out.print("Property list array 2: ");
        for (int a : array2) {
            System.out.print(a + "\t");
        }
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1+i] = array2[i];
        }
        System.out.println("");
        System.out.print("Property list to array: ");
        for (int a: array3) {
            System.out.print(a+ "\t");
        }
    }
}
