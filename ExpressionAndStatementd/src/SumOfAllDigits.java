public class SumOfAllDigits{
    public static void main(String[] args) {
        int number = 12345, sum = 0, rem = 0;
        int num = number;
        while(num > 0){
            System.out.println("Remainder: " + (rem = num % 10));
            sum = sum + rem;
            System.out.println("Divisor: " + (num = num / 10));
        }
        System.out.println(sum);
    }
}
