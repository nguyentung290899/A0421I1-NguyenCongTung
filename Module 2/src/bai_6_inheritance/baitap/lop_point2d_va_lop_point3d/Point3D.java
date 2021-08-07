package bai_6_inheritance.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z;
    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] B = {getX(),getY(),getZ()};
        return B;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + ", " + super.toString() +
                '}';
    }
}
