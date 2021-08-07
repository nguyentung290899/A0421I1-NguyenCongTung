package bai_6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(5.0);
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(5.0,"yellow",6.0);
        System.out.println(cylinder2);
    }
}
