import java.util.Iterator;
import java.util.LinkedList;

public class MinStack {

    LinkedList<Integer>newStack ;
    public MinStack() {
        newStack = new LinkedList<>();
    }

    public void push(int x) {
        newStack.add(x);
    }

    public void pop() {
        newStack.pollLast();
    }

    public int top() {
        return newStack.peekLast();
    }

    public int getMin() {
        int min_val = Integer.MAX_VALUE;
        Iterator itr = newStack.iterator();
        while (itr.hasNext()){
            int value = (int)itr.next();
            if(value<min_val)
                min_val = value;
        }
        return min_val;
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}
