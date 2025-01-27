public class Main4 {
    public static void main(String args[]){
        Person p = new Person();

        p.setFirstName("Tim");
        p.setLastName("");
        p.setAge(25);

        System.out.println("The first name is: " + p.getFirstName());
        System.out.println("The last name is: " + p.getLastName());
        System.out.println("The Age is: " + p.getAge());
        if(p.isTeen()){
            System.out.println(p.getFirstName() + "is a teenager");
        }
        else
            System.out.println(p.getFirstName() + " is not a teenager");

        System.out.println(p.getFullName());
    }
}
