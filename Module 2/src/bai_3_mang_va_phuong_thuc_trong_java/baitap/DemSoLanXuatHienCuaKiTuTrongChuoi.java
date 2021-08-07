package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "co cong mai sat co ngay nen kim";
        System.out.print("Enter char need of search: ");
        char check = input.next().charAt(0);
        int count = 0;
        for (int i=0; i<string.length();i++) {
            if (check == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("string has " + count +" char " + check);
    }
}
