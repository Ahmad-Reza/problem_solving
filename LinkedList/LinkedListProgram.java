package LinkedList;

public class LinkedListProgram {
    Node head;

    //This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; //its not neccessary bcoz it will be null defaultly
        }
    }

    private void showLinkedlistData() {
        Node n = head;
 
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListProgram ll = new LinkedListProgram();

        ll.head = new Node(5);
        Node second = new Node(9);
        Node third = new Node(6);
        Node fourth = new Node(22);
        Node fifth = new Node(13);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    
        ll.showLinkedlistData();
    }
}
