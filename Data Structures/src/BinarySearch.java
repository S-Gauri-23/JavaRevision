import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args){
    int size, key;

    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();

    int[] arr = new int[size];

    for(int i = 0; i < size; i++){
        System.out.print("Enter the value of element " + (i+1) + ": ");
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    System.out.print("Enter the target element to search for: ");
    key = sc.nextInt();
    int indexOfTargetElement = Arrays.binarySearch(arr, key);

    if(Arrays.binarySearch(arr, key) > 0){
        System.out.println("Target Element " + key + " found at index " + indexOfTargetElement);
    }
    else{
        System.out.println("Target Element " + key + " not found");
    }

    }
}