public class mainClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.setNumber1();
        c.setNumber2();

        System.out.println("-------------------------Calculations---------------------------------");
        System.out.println("Addition of "+c.getNumber1()+" and "+c.getNumber2()+": "+ c.getAdditionResult());
        System.out.println("Subtraction of "+c.getNumber2()+" and "+c.getNumber1()+": "+ c.getSubtractionResult());
        System.out.println("Division of "+c.getNumber1()+" and "+c.getNumber2()+": "+ c.getDivisionResult());
        System.out.println("Multiplication of "+c.getNumber1()+" and "+c.getNumber2()+": "+ c.getMultiplicationResult());
    }
}
