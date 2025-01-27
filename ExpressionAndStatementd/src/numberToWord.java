public class numberToWord {
    public static void main(String[] args) {
        numberToWordConversion(12345);
    }

    public static void numberToWordConversion(int number){
        if(number < 0){
            System.out.println("Invalid Number");
        }

        int num;
        String numberInWords = "";
        while(number > 0){
            num = number % 10;
            number = number / 10;

            switch (num){
                case 1-> numberInWords += "One \t";
                case 2-> numberInWords += "Two \t";
                case 3-> numberInWords += "Three \t";
                case 4-> numberInWords += "Four \t";
                case 5-> numberInWords += "Five \t";
                case 6-> numberInWords += "Six \t";
                case 7-> numberInWords += "Seven \t";
                case 8-> numberInWords += "Eight \t";
                case 9-> numberInWords += "Nine \t";
            }
        }
        System.out.println(numberInWords);

    }
}
