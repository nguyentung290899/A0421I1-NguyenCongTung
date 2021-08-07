package bai_6_inheritance.bai_tap.lop_point_va_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint moveablePoint = new MovablePoint();
        System.out.println(moveablePoint);
        MovablePoint moveablePoint1 = new MovablePoint(4,6);
        System.out.println(moveablePoint1);
        MovablePoint moveablePoint2 = new MovablePoint(4,6,7,8);
        System.out.println(moveablePoint2);
    }
}
