package bai_5_access_modifier_static_method_static_property.bai_tap.access_modifier;

import javax.crypto.Cipher;

public class TestCircle {
    public static void main(String[] args) {
//        Circle cipher = new Circle(5);
//        System.out.println(cipher.getRadius());
//        System.out.println(cipher.getArea());
        System.out.println(Circle.getArea());
        System.out.println(Circle.getRadius());
    }
}
