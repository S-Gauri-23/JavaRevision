import java.util.Random;

enum Status{
    Running, Failed, Pending, Success
}

public class EnumDemo {

    public static void main(String[] args) {
        Status s = Status.Pending;

        switch(s){
            case Failed -> {
                System.out.println("Try Again");
                break;
            }
            case Running -> {
                System.out.println("Running");
                break;
            }
            case Success -> {
                System.out.println("Done");
                break;
            }
            case Pending -> {
                System.out.println("Please wait");
                break;
            }
        }
    }
}
