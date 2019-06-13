public class Cylinder extends Circle {
    private double height;

    Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getVolumeCylinder() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder\n fill:" + getColor() + " ; radius: "
                + getRadius()
                + " ; Area: " + getArea() + " ; Volume: " + this.getVolumeCylinder();
    }
}