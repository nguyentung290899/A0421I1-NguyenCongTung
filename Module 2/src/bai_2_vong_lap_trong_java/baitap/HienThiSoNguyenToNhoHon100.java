package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        while (i < 100) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
            i++;
            check = true;
        }
    }
}
