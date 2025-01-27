public class Holden extends Car{
    public Holden(int cylinder, String name){
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "The engine of car " + getName() + " Holden is starting.";
    }

    @Override
    public String brake() {
        return "The Car " + getName() + " Holden is braking.";
    }

    @Override
    public String accelerate() {
        return "The Car " + getName() + " Holden is accelerating.";
    }
}
