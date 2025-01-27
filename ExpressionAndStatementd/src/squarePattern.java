public class squarePattern {
    public static void main(String[] args) {
        createSquarePattern(11);
    }

    public static void createSquarePattern(int number){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if(i == 1 || i == number || j == 1 || j == number || i == j ||
                    j == (number - i + 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}