package bai_4_lop_va_doi_tuong_trong_java.bai_tap.fan;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int Speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public boolean getOn() {
        return this.on;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.Speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    public String toString() {
        System.out.println(this.getOn());
        if (this.on) {
            return "speed: " + this.getSpeed() + "\tcolor: " + this.getColor() + "\tradius: " + this.getRadius() + "\nfan is on";
        } else {
            return "color: " + this.getColor() + "\tradius: " + this.getRadius() + "\nfan is off";
        }
    }
}
