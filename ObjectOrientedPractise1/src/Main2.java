public class Main2 {
    public static void main(String args[]){
        Car c = new Car("Mercedes", "0025", 2025);

        System.out.println("The Car make is: "+ c.getMake()+"\n The Car model is: "+c.getModel()+
                "\nThe Car manufacturing year is: "+ c.getYear());
        c.setYear(2027);
        System.out.println("The Car make is: "+ c.getMake()+"\n The Car model is: "+c.getModel()+
                "\nThe Car manufacturing year is: "+ c.getYear());
    }
}

