import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String[] courses;

    public Student(String name, int age, String[] courses){
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}