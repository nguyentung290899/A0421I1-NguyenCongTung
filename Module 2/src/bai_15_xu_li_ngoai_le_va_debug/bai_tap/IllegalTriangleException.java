package bai_15_xu_li_ngoai_le_va_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {
        super("not a triangle");
    }
}
