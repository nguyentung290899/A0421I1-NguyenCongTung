package case_study.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner input = new Scanner(System.in);
    public static String regexStr(String temp, String regex, String error){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            }else {
                System.out.println(error);
                temp = input.nextLine();
            }
        }while (check);
        return temp;
    }
}
