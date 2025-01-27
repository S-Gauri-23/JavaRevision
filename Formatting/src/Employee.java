public class Employee extends Person{
    private String salary;

    Employee(String name, String city, String state, String salary){
        super(name, city, state);
        this.salary = salary;
    }

    public String getSalary(){
        return salary;
    }
}
