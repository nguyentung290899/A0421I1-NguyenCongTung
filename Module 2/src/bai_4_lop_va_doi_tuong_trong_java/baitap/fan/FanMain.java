package bai_4_lop_va_doi_tuong_trong_java.bai_tap.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.medium);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

