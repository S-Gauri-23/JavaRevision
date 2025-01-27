import java.util.Scanner;

public class Array1{
    private int[] myArray;
    private int size;
    Scanner sc;

    public void populateArray(){
        System.out.print("Enter the size of the array: ");
        sc = new Scanner(System.in);
        size = sc.nextInt();
        myArray = new int[size];

        for(int i=0; i<size; i++){
        System.out.print("Enter the array element at index " + i +": ");
            myArray[i] = sc.nextInt();
        }
    }

    public void displayArray(){
        System.out.println("The array elements are as follows: ");
        for(int i=0; i<size; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    public int sumOfArrayElements(){
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public double calculateAverage(){
        return (double)sumOfArrayElements()/size;
    }

    public void closeScanner(){
        if(sc != null) sc.close();
    }
}

class Main1{
    public static void main(String[] args) {
        Array1 arr = new Array1();
        arr.populateArray();
        arr.displayArray();
        System.out.println("Sum of array elements: " + arr.sumOfArrayElements());
        System.out.println("Average of array elements: " + arr.calculateAverage());
        arr.closeScanner();
    }
}