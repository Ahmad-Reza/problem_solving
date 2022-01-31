package LinkedList;

public class DeletingLL {
    Node head;
    
    static class Node {
        int data;
        Node next;

        public Node(int data) { this.data = data; }

    }

    private void deletedNode(int key) {
        Node temp = head, prev = null;

        //if head is itself key
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

         // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        //key was not present is LL
        if(temp == null) return;

        //unlike the node from ll
        prev.next = temp.next;

    }

    private void showLinkedlistData() {
        Node n = head;
 
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println();
    }

    private void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        DeletingLL ll = new DeletingLL();

        ll.push(12);
        ll.push(9);
        ll.push(6);
        ll.push(22);
        ll.push(2);

        System.out.print("Before deleted: ");
        ll.showLinkedlistData();

        ll.deletedNode(6);
        System.out.print("After deleted: ");
        ll.showLinkedlistData();


    }
}
