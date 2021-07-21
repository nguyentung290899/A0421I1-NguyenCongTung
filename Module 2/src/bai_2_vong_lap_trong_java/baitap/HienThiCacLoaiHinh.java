package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        int choice = 1;
        int height = 0;
        while (choice != 0) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("Enter length");
                    int length = input.nextByte();
                    System.out.println("Enter width");
                    int width = input.nextByte();
                    for (int i = 0; i < width; i++) {
                        System.out.println("");
                        for (int j = 0; j < length; j++) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Enter height");
                    height = input.nextByte();
                    for (int i = height; i > 0; i--) {
                        System.out.println("");
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    for (int i = 1; i <= height; i++) {
                        System.out.println("");
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    for (int i = 1; i <= height; i++) {
                        System.out.println("");
                        for (int k = height - i; k > 0; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    for (int i = height; i > 0; i--) {
                        System.out.println("");
                        for (int k = 0; k < height - i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("Enter height");
                    height = input.nextByte();
                    for (int i = 1; i <= height; i++) {
                        System.out.println("");
                        for (int k = height - i; k > 0; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2-1; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}