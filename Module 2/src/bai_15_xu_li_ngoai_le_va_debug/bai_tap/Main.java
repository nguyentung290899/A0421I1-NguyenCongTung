package bai_15_xu_li_ngoai_le_va_debug.bai_tap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter triangleEdge1");
        int triangleEdge1 = input.nextInt();
        System.out.println("Enter triangleEdge1");
        int triangleEdge2 = input.nextInt();
        System.out.println("Enter triangleEdge1");
        int triangleEdge3 = input.nextInt();
        try {
            Triangle triangle = new Triangle(triangleEdge1,triangleEdge2,triangleEdge3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

}
