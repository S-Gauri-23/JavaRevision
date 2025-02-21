interface A1{
    int add(int a, int b);
}

public class FunctionalInterfaceDemo1{
    public static void main(String[] args) {
        A1 obj = (a, b) -> a + b;

        int result = obj.add(10, 11);
        System.out.println(result);
    }
}