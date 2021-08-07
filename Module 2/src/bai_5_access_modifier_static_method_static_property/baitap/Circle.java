package bai_5_access_modifier_static_method_static_property.bai_tap.access_modifier;

import javax.crypto.Cipher;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }
    public static double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }
}
