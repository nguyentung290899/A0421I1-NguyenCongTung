package bai_4_lop_va_doi_tuong_trong_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = input.nextFloat();
        System.out.println("Enter b: ");
        float b = input.nextFloat();
        System.out.println("Enter c: ");
        float c = input.nextFloat();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a == 0) {
            System.out.println("Phuong trinh co 1 nghiem: " + (-c / b));
        } else {
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phuong trinh co 1 nghiem kep: " + quadraticEquation.getRoot3());
            } else System.out.println("The equation has no roots");
        }
    }
}
