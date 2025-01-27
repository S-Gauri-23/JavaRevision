public class Main1 {
    public static void main(String[] args) {
        Animal a = new Animal("Animal", 5, "Golden");
        a.eat();
        a.sleep();

        Dog d = new Dog("Beagle", 6, "Brown");
        d.bark();
    }
}
