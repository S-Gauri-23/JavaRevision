public class FirstAndLastDigit {
    public static void main(String[] args) {
        int number = 12345;
        calculateFirstAndLastDigit(number);
    }
    public static void calculateFirstAndLastDigit(int number){
        int firstDigit = -1, lastDigit = -1;
        lastDigit = number % 10;
        while(number > 10){
            number = number / 10;
        }
        firstDigit = number;
        System.out.println("Sum of First digit "+firstDigit+" and last digit "+lastDigit+" is: "+(firstDigit+lastDigit));
    }
}
