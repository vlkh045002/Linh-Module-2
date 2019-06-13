public class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(2.5,"blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.4,"red", 8);
        System.out.println(cylinder);
    }
}