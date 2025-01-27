public class parseInt {
    public static void main(String[] args) {
//        int currentYear = 2024;
//        String birthYear = "2001";
//
//        int myBirthYear = Integer.parseInt(birthYear);
////        System.out.println(myBirthYear);
//        System.out.println("Age is: "+(currentYear-myBirthYear));

        int currentYear = Integer.parseInt(System.console().readLine("Enter current year: "));
        int BirthYear = Integer.parseInt(System.console().readLine("Enter your birth year: "));
        System.out.println("Age is: "+(currentYear-BirthYear));
    }
}
