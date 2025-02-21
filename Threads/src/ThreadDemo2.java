public class ThreadDemo2 {
    public static void main(String[] args) {

        //using lambda expression to define run() method instead of implementing in using
        // a separate class or anonymous class
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi " + i);
            }
        };

        //using lambda expression to define run() method instead of implementing in using
        // a separate class or anonymous class
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello " + i);
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
