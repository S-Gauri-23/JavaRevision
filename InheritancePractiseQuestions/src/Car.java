public class Car extends Animal{
    private String breed;

    Car(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = "Labrador";
    }

    public void Purr(){
        System.out.println("Cat makes Purr Sound");
    }

    public void Scratch(){
        System.out.println("Cat Scrathes");
    }
}
