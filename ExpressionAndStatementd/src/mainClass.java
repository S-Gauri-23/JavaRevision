public class mainClass {
    public static void main(String args[]){
        Employee e = new Employee();
        e.setemployeeName("Mark");
        e.setemployeeCompany("Adobe Inc.");
        e.setemployeeDesignation("Software Developer");
        e.setemployeeID(41335);

        System.out.println(e.makeString());
    }
}
