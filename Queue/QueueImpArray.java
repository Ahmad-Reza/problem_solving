package Queue;

public class QueueImpArray {
    int capacity;
    int[] arr;
    int front, rear = -1;

    public QueueImpArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    private void enque(int data) {
        if(isFull()) {
            System.out.println("Queue is fulled");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    private int denque() {
        if(isEmpty()) return -1;
        front = arr[0];
        for(int i=0; i<rear; i++) arr[0] = arr[i+1]; 
        rear--;

        return front;
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull() {
        return rear == capacity-1;
    }

    public static void main(String[] args) {
        QueueImpArray queue = new QueueImpArray(10);
        queue.enque(5);
        queue.enque(3);
        queue.enque(7);
        queue.enque(9);
        queue.enque(11);

        while(!queue.isEmpty()) {
            System.out.print(queue.denque() + " ");
        }
    }
}
