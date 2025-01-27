public class ProgrammingLanguages {
    private String name;
    private int year;
    private Developer developer;

    public ProgrammingLanguages(String name, int year, Developer developer){
        this.name = name;
        this.year = year;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public int getYear(){
        return year;
    }

    public void printInfo(){
        System.out.println("Developer " + developer.getName() + " specialized in " + developer.getSpecialization() +
                " is working since " + getYear() + " years.");
    }
}