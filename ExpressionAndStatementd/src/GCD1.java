public class GCD1 {
    public static void main(String[] args) {
        System.out.println("The GCD of two numbers is this: "+FindGreatestCommonDivisor(60, 48));
    }

    public static int FindGreatestCommonDivisor(int largerNumber, int smallerNumber){
        if(largerNumber < 10 || smallerNumber < 10) return -1;
        while(smallerNumber != 0){
            int temp = smallerNumber;
            smallerNumber = largerNumber % smallerNumber;
            largerNumber = temp;
        }
        return largerNumber;
    }
}
