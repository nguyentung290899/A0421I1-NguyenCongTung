package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i=0; i<array.length;i++) {
            if (min > array[i]) {
                min = array[i];
                index =i;
            }
        }

        return index;
    }
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
        int index = minValue(array);
        System.out.println("");
        System.out.println("Element max is array[" + index + "]= " + array[index]);
    }
}
