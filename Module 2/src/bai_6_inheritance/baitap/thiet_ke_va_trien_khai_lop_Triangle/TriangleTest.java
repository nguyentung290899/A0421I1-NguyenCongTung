package bai_6_inheritance.bai_tap.thiet_ke_va_trien_khai_lop_Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle(4,5,6);
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle("red",false,5,6,7);
        System.out.println(triangle2);
    }

}