@FunctionalInterface
interface A{
    void show(int i);
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args){
        A obj = i -> {
            System.out.println("in show A " + i);
        };
        obj.show(100);
    }
}