public class Main1 {
    public static void main(String args[]){
        Library l1 = new Library("Readers Club",20,"Pune");
        System.out.println("The name of the Library is "+l1.getName()+" at "+
                l1.getAddress()+ " " +l1.getNumBox());

        l1.setAddress("Mumbai");
        l1.setName("Best Library");
        l1.setNumBox(25);

        System.out.println("The name of the Library is "+l1.getName()+" at "+
                l1.getAddress()+  " " + l1.getNumBox());
    }
}