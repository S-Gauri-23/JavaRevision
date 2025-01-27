public class GCD {
    public static void main(String args[]){
         int largerNumber = 64, smallerNumber = 16;
        System.out.println("GCD of numbers is: "+((largerNumber < 10 || smallerNumber < 10)?"Invalid input":greatestCommonDivisor(largerNumber, smallerNumber)));
    }

    public static int greatestCommonDivisor(int largerNumber, int smallerNumber){
        int rem = -1;

        if(largerNumber % smallerNumber == 0) return smallerNumber;
        else{
                rem = largerNumber % smallerNumber;
                return greatestCommonDivisor(smallerNumber, rem);
        }
    }
}