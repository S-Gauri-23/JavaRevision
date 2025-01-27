public class Dog extends Animal{
    private boolean isIndoor;

    Dog(String name, int age, String color){
        super(name, age, color);
        this.isIndoor = true;
    }

    public void bark(){
        System.out.println("Dog " + name +" barks");
    }

    public void Fetch(){
        System.out.println("Dog fetches");
    }
}
