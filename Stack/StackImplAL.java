package Stack;

import java.util.ArrayList;
import java.util.List;

public class StackImplAL {
    List<Integer> list = new ArrayList<>();

    private void push(int element) {
        list.add(element);
    }

    private int peek() {
        if(isEmpty()) 
            return -1;

        return list.get(list.size()-1);       
    }

    private int pop() {
        if(list.isEmpty()) 
            return -1;
        
        return list.remove(list.size()-1);
    }

    private boolean isEmpty() {
        return list.size() == 0;
    }

    public static void main(String[] args) {
        StackImplAL stack = new StackImplAL();
        stack.push(7);
        stack.push(23);
        stack.push(11);
        stack.push(5);
        stack.push(33);

        while(!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }  
    }
}
