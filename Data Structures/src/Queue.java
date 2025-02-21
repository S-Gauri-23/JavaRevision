import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list;

    public Queue(){
        list = new LinkedList<Integer>();
    }

    public void enqueue(int value){
        list.addLast(value);
    }

    public int dequeue(){
        if(list.isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            return list.removeFirst();
        }
    }
}

class Main4{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
