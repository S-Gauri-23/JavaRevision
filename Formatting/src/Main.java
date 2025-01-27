public class Main{
    public static void main(String args[]){
        Student s = new Student("John", "LA", "LA", 41335);
        System.out.println("Name: "+ s.getName()+"\n City: "+s.getCity()
                + "\n State: "+ s.getState() + "\n Roll. No.: "+ s.getRollno());
        System.out.println("------------------");

        Employee e = new Employee("Claire", "LA", "LA", "300000");
        System.out.println("Name: "+ e.getName()+"\n City: "+e.getCity()
                + "\n State: "+ e.getState() + "\n Salary: "+ e.getSalary());
    }
}