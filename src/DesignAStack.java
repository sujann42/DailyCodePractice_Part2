import java.util.Stack;

public class DesignAStack extends Stack {
    /**
     * initialize your data structure here.
     */
    Stack<Integer> myStack;
    Integer minimumElement;

    public DesignAStack() {
        myStack = new Stack<>();
    }

    public void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            myStack.push(x);
        } else {
            super.push(x);
            int y = myStack.pop();
            myStack.push(y);
            if (x < y) {
                myStack.push(x);
            } else {
                myStack.push(y);
            }
        }
    }

    public Object pop() {
        int x = (int) super.pop();
        myStack.pop();

        return x;
    }

    public int top() {
        int x = (int) super.peek();
        myStack.peek();
        return x;
    }

    public int getMin() {
        int x = myStack.pop();
        myStack.push(x);
        return x;
    }

    public static void main(String[] args) {
        DesignAStack obj = new DesignAStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.toString());
        System.out.println("Min Elem: "+obj.getMin());
        obj.pop();
        System.out.println("Top Element: "+obj.top());
        System.out.println("Min Element: "+obj.getMin());

    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
