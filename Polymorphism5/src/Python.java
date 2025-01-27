public class Python extends ProgrammingLanguages{
    private String verion;

    public Python(String name, int year, Developer developer, String version){
        super(name, year, developer);
        this.verion = version;
    }

    public void compile(){
        System.out.println("The CPP language uses a compiler");
    }


    @Override
    public void printInfo() {
        super.printInfo();
    }
}
