public class Student extends Person{
    private int rollno;

    Student(String name, String city, String state, int rollno){
        super(name, city, state);
        this.rollno = rollno;
    }

    public int getRollno(){
        return rollno;
    }
}
