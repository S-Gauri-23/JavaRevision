import java.util.Scanner;
import java.util.Arrays;
public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = InputArray();
        System.out.println("Current Array   : " + Arrays.toString(arr));
        System.out.println("Reversed array  : " + Arrays.toString(reverseArray(arr)));
    }

    public static int[] InputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the elements for position " + (i+1) + ": ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr){
        int[] copiedArray = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            copiedArray[i] = arr[arr.length - 1 - i];
        }

        return copiedArray;
    }
}
