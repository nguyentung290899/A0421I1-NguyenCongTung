package bai_1_introduction_to_java.bai_tap;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money USD: ");
        int usd = scanner.nextInt();
        int vnd = usd*23000;
        System.out.println(usd + "USD = " + vnd + "VND");
    }
}