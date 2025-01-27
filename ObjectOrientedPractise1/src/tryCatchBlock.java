import java.util.Scanner;
public class tryCatchBlock {

    public void doDivide(int num, int dem) {
        try {
             System.out.println("The Result of division is "+ num / dem);
        } catch (ArithmeticException e) {
            System.out.println("The exception is handled : " + e);
        }
    }



    public static void main(String args[]){
        int numerator, denominator;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number(numerator): ");
        numerator = s.nextInt();
        System.out.print("Enter the second number(denominator): ");
        denominator = s.nextInt();
        tryCatchBlock d1 = new tryCatchBlock();
        d1.doDivide(numerator, denominator);
    }
}
