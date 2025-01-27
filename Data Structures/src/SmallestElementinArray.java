import java.util.Scanner;

public class SmallestElementinArray {
    int[] arr;
    int limit;
    Scanner sc;
    SmallestElementinArray(){
        sc = new Scanner(System.in);
    }
    public void populateArray(){
        System.out.print("Enter the size of the array: ");
        limit = sc.nextInt();
        arr = new int[limit];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < limit; i++) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }
    }

    public void displayArray(){
        System.out.println("The array elements are as follows: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int findSmallestNumber(){
        int small = 10000;
        for(int i=0; i<limit; i++){
            if(small > arr[i]){
                small = arr[i];
            }
        }
        return small;
    }
}

class Main3{
    public static void main(String[] args) {
        SmallestElementinArray s = new SmallestElementinArray();
        s.populateArray();
        s.displayArray();
        System.out.println("\nSmallest element in the array is: " + s.findSmallestNumber());
    }
}