package LinkedList;

public class InsertionLL {
    Node head;
    
    static class Node {
        int data;
        Node next;

        public Node(int data) { this.data = data; }

    }

    private void insertAtFront(int data) {
        Node frontNode = new Node(data);
        frontNode.next = head;
        head = frontNode;
    }

    private void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        
        ll.push(13);
        ll.push(22);
        ll.push(6);
        ll.push(9);
        ll.push(5);
    
        System.out.print("Given Linked list: ");
        ll.showLinkedlistData();
    
        ll.insertAtFront(4);
        System.out.print("Insert at the front: ");
        ll.showLinkedlistData();
 
        ll.insertAfterNode(ll.head.next, 7);
        System.out.print("Insert after given node: ");
        ll.showLinkedlistData();

        ll.insertAtEnd(14);
        System.out.print("Insert at the end: ");
        ll.showLinkedlistData();
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);

        Node end = head, prev = null;
        if(end.next == null) {
            newNode.next = end;
            end = newNode;
            return;
        }

        while(end != null) {
            prev = end;
            end = end.next;
        } 

        prev.next = newNode;
    }

    private void insertAfterNode(Node prev, int data) {
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }
}
