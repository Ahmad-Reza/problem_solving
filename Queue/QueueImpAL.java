package Queue;

import java.util.ArrayList;

public class QueueImpAL {
    ArrayList<Integer> list = new ArrayList<>();
    int front;
    
    void add(int data) { 
        list.add(data);
    }

    public int deque() {
        if(isEmpty()) return -1;       

        front = list.get(0);
        list.remove(0);
        
        return front;
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        QueueImpAL queue = new QueueImpAL();
        queue.add(8);
        queue.add(5);
        queue.add(3);
        queue.add(7);
        queue.add(1);
        
        while(!queue.isEmpty()) {
            System.out.print(queue.deque() + " ");            
        }
    }
}