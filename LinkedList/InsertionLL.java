package LinkedList;

public class InsertionLL {
    Node head;
    
    static class Node {
        int data;
        Node next;

        public Node(int data) { this.data = data; }

    }

    private void showLinkedlistData() {
        Node n = head;
 
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        InsertionLL ll = new InsertionLL();
        
        ll.head = new Node(5);
        Node second = new Node(9);
        Node third = new Node(6);
        Node fourth = new Node(22);
        Node fifth = new Node(13);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    
        System.out.print("Given Linked list: ");
        ll.showLinkedlistData();
    
        Node front_node = new Node(4);
        front_node.next = ll.head;
        ll.head = front_node;

        System.out.print("Insert at the front: ");
        ll.showLinkedlistData();
 
        //suppose we will insert node after third
        Node after_node = new Node(7);
        after_node.next = third.next;
        third.next = after_node;

        System.out.print("Insert after given node: ");
        ll.showLinkedlistData();

        Node end_node = new Node(14);

        Node last = ll.head;
        while(last != null) last = last.next;
            
        last = end_node;   
        end_node.next = null;
        
        System.out.print("Insert at the end: ");
        ll.showLinkedlistData();
    }
}
