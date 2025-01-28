public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            System.out.println(newNode);
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        Node curr = head;
        System.out.println("The Elements of the Linked List are: ");
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


class MainClass{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        list.display();
    }
}