public class EnhanceSwitch {
    public static void main(String[] args) {
        String type;
        char ch = 'z';

        type = switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U'->"Vowel";
            default -> "Consonant";
        };
        System.out.println(ch + " is a " + type);
    }
}
