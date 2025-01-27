
import java.util.Arrays;
import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args){
        int[] numbers = readNumbers();
        System.out.println(Arrays.toString(numbers));
        int minimum = findMinimum(numbers);
        System.out.println("The minimum number is: " + minimum);
    }

    public static int[] readNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values, comma separated: ");
        String inputLine = sc.nextLine();

        String[] splits = inputLine.split(",");
        int[] numbers = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            numbers[i] = Integer.parseInt(splits[i].trim());
        }
        System.out.println();
        return numbers;
    }

    public static int findMinimum(int[] numbers){
        int  minimum = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++){
            if(numbers[i] < minimum){
                minimum = numbers[i];
            }
        }
        return minimum;
    }
}
