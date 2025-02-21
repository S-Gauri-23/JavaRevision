// Interface
@FunctionalInterface
interface Animal {
    void animalSound(); // interface method (does not have a body)
}

class Main1 {
    public static void main(String[] args) {
        Animal myPig = () -> {
                System.out.println("The pig says: wee wee");
            };
        myPig.animalSound();
    }
}