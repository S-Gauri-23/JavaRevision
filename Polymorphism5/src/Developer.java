public class Developer {
    private String name;
    private int age;
    private String specialization;

    public Developer(String name, int age, String specialization){
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName(){
        return name;
    }

    public String getSpecialization(){
        return specialization;
    }

    public int age(){
        return age;
    }
}
