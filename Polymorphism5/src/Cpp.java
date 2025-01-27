public class Cpp extends ProgrammingLanguages{
    private String extension;

    public Cpp(String name, int year, Developer developer, String extension){
        super(name, year, developer);
        this.extension = extension;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    public void compile(){
        System.out.println("The CPP language uses a compiler");
    }
}