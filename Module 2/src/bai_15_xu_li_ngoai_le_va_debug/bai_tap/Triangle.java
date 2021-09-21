package bai_15_xu_li_ngoai_le_va_debug.bai_tap;

public class Triangle {
    private int triangleEdge1;
    private int triangleEdge2;
    private int triangleEdge3;

    public Triangle(int triangleEdge1, int triangleEdge2, int triangleEdge3) throws IllegalTriangleException {
        this.triangleEdge1 = triangleEdge1;
        this.triangleEdge2 = triangleEdge2;
        this.triangleEdge3 = triangleEdge3;
        if (triangleEdge1 <= 0 || triangleEdge2 <= 0 || triangleEdge3 <= 0 || (triangleEdge1 + triangleEdge2) <= triangleEdge3 || (triangleEdge1 + triangleEdge3) <= triangleEdge2 || (triangleEdge3 + triangleEdge2) <= triangleEdge1){
            throw new IllegalTriangleException();
        }
    }

    public Triangle() {
    }

    public int getTriangleEdge1() {
        return triangleEdge1;
    }

    public void setTriangleEdge1(int triangleEdge1) {
        this.triangleEdge1 = triangleEdge1;
    }

    public int getTriangleEdge2() {
        return triangleEdge2;
    }

    public void setTriangleEdge2(int triangleEdge2) {
        this.triangleEdge2 = triangleEdge2;
    }

    public int getTriangleEdge3() {
        return triangleEdge3;
    }

    public void setTriangleEdge3(int triangleEdge3) {
        this.triangleEdge3 = triangleEdge3;
    }
}
