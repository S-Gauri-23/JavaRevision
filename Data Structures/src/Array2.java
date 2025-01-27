import java.util.Scanner;
public class Array2 {
    int[] arr;
    int size;
    private Scanner sc;

    Array2(){
    sc = new Scanner(System.in);
    }

    public void populateArray() {
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the value of element "+(i+1) + ": ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        sc.close();
    }

    public void displayArray(){
    System.out.println("The Array elements are as follows: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverseDisplayArray(){
        System.out.println("The Array elements in the reverse order are as follows: ");
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main2{
    public static void main(String[] args){
        Array2 arr2 = new Array2();
        arr2.populateArray();
        arr2.displayArray();
        arr2.reverseDisplayArray();
    }
}