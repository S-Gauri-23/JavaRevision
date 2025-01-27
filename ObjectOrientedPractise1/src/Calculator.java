import java.util.Scanner;

public class Calculator {
    private double Number1, Number2;

    Scanner s = new Scanner(System.in);

    public void setNumber1(){
        System.out.print("Enter value of First Number: ");
        this.Number1 = s.nextDouble();

    }

    public void setNumber2(){
        System.out.print("Enter value of Second Number: ");
        this.Number2 = s.nextDouble();
    }

    public double getNumber1(){

        return Number1;
    }

    public double getNumber2(){
        return Number2;
    }

    public double getAdditionResult(){
        return Number1 + Number2;
    }

    public double getSubtractionResult(){
        return Number2 - Number1;
    }

    public double getMultiplicationResult(){
        return Number1 * Number2;
    }

    public double getDivisionResult(){
        if(Number2 == 0){
            return 0;
        }
        else {
            return Number1 / Number2;
        }
    }
}
