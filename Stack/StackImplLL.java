package Stack;

public class StackImplLL {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void pop() {
        if(!isEmpty()) {
            peek();
            head = head.next;
        } 
    }

    void peek() {
        if(!isEmpty())
          System.out.print(head.data + " ");
    }

    boolean isEmpty() {
        if(head == null) 
            return true;
        return false;
    }

    private void pritnStack() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        StackImplLL sll = new StackImplLL();

        sll.push(7);
        sll.push(12);
        sll.push(8);
        sll.push(5);
        sll.push(32);

        sll.pritnStack();

        sll.pop();
        sll.pop(); 
    }
}
