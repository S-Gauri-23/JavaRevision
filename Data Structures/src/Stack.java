import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> list;

    public Stack(){
        list = new LinkedList<Integer>();
    }

    public void push(int value){
        list.addLast(value);
    }

    public int pop(){
        if(list.isEmpty()){
            System.out.println("The list is empty");
            return -1;
        }
        else{
            return list.removeLast();
        }
    }
}

class mainClass{
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("The popped element is: " + st.pop());
        System.out.println("The popped element is: " + st.pop());
    }
 }
