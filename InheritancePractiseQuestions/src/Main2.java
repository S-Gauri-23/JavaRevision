public class Main2 {
    public static void main(String args[]){
        Circle c= new Circle(2.0);
        System.out.println("Circle radius: " + c.getRadius());
        System.out.println("Circle area: " + c.getArea());

        Cylinder c1 = new Cylinder(3.0, 5.0);
        System.out.println("\nCylinder radius: " + c1.getRadius());
        System.out.println("Cylinder area: " + c1.getArea());
        System.out.println("Cylinder height: " + c1.getHeight());
        System.out.println("Cylinder volume: " + c1.getVolume());
    }
}
