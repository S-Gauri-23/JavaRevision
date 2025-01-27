public class oddSum {
    public static void main(String args[]){
        int startNumber = 1, endNumber = 100;

        if(calculateSum(startNumber, endNumber) == -1){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("The sum of odd numbers from "+startNumber+"to "+endNumber+"is: "
                    +calculateSum(startNumber, endNumber));
        }
    }

    public static boolean checkOdd(int num){
        return ((num % 2) != 0);
    }

    public static int calculateSum(int startNumber, int endNumber){
        int sum = 0;

        if(startNumber <= 0 || endNumber <= 0 || endNumber < startNumber){
            return -1;
        }

        for(int i = startNumber; i <= endNumber; i++) {
            if(checkOdd(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
}
