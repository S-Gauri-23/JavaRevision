public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name){
        this.cylinder = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "The " + getName() + " car's engine is starting";
    }

    public String brake(){
        return "The " + getName() + " car is braking";
    }

    public String accelerate(){
        return "The " + getName() + " car is accelerating";
    }

    public int getCylinder() {
        return cylinder;
    }

    public void displayCyclinder(){
        System.out.println("The No. of cylinders in " + getName() + " are " + getCylinder());
    }

    public String getName(){
        return name;
    }
}


class Main1{
    public static void main(String args[]){
        Car c = new Car(2, "Star");
        Mitsubishi m = new Mitsubishi(4, "moon");
        Holden h = new Holden(6, "shine");

        System.out.println(c.startEngine());
        System.out.println(c.accelerate());
        System.out.println(c.brake());
        c.displayCyclinder();

        System.out.println("-------------------------");

        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());
        m.displayCyclinder();

        System.out.println("-------------------------");

        System.out.println(h.startEngine());
        System.out.println(h.accelerate());
        System.out.println(h.brake());
        h.displayCyclinder();
    }
}
