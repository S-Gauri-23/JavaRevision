public class Mitsubishi extends Car{

    public Mitsubishi(int cylinder, String name){
        //calls the constructor of parent class i.e. Car
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "The " + getName() + " Mitsubishi's engine is starting.";
    }

    @Override
    public String brake() {
        return "The " + getName() + " Mitsubishi is braking.";
    }

    @Override
    public String accelerate() {
        return "The " + getName() + " Mitsubishi is accelerating.";
    }
}
