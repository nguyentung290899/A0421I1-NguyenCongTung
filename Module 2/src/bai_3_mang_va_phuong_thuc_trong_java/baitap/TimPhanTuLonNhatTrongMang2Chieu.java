package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row");
        int row = input.nextInt();
        System.out.println("Enter column");
        int column = input.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print("Enter array[" + i + "][" + j + "]= ");
                array[i][j] = input.nextInt();
            }
        }
        int max = array[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        System.out.println("element max is array[" + indexRow + "][" + indexColumn + "]= " + max);

    }
}

