public class shapes {
    public static void main(String[] args) {
        System.out.println("The area of Rectangle: " + area(2.0,4.0));
        System.out.println("The area of Square: " + area(4));
        System.out.println("The area of Triangle: " + area(2.0,4.0,2));
        System.out.println("The area of Circle: " + area(2.0));
    }
    public static double area(double length, double breadth){
        return length * breadth;
    }

    public static double area(int side){
        return side * side;
    }

    public static double area(double base, double height, double shape){
        return 0.5 * base * height;
    }

    public static double area (double radius){
        return 3.14 * radius * radius;
    }
}
