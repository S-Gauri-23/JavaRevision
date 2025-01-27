public class conacateStrings {
    public static void main(String[] args) {
        System.out.println("string Concate: " + stringConcate("Hello", "World"));
        System.out.println("string Concate with Separator: " + stringConcate("Hello", "-", "world"));
    }

    public static String stringConcate(String s1, String s2){
        return s1+s2;
    }

    public static String stringConcate(String s1, String separator, String s2){
        return s1+separator+s2;
    }
}
