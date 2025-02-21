public class ThreadDemo1 {
    Runnable obj1 = new Runnable(){

        //using anonymous class to define run() method instead of implementing in using a separate class
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
            }
        }
    };

    Runnable obj2 = new Runnable(){
        //using anonymous class to define run() method instead of implementing in using a separate class
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
            }
        }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
}
