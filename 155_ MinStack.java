import java.util.Stack;

public class MinStack {
    private Stack<Long> stack;
    private long minValue;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push((long) val);
            minValue = val;
        } else {
            if (val < minValue) {
                // Push encoded value
                stack.push(2L * val - minValue);
                minValue = val;
            } else {
                stack.push((long) val);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long top = stack.pop();
        if (top < minValue) {
            // Recover previous minValue
            minValue = 2 * minValue - top;
        }
    }

    public int top() {
        long top = stack.peek();
        if (top < minValue) {
            return (int) minValue;
        } else {
            return (int) top;
        }
    }

    public int getMin() {
        return (int) minValue;
    }

    // 🧪 Main method to demonstrate usage
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        System.out.println("Pushing 5");
        minStack.push(5);
        System.out.println("Min: " + minStack.getMin());

        System.out.println("Pushing 3");
        minStack.push(3);
        System.out.println("Min: " + minStack.getMin());

        System.out.println("Pushing 7");
        minStack.push(7);
        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());

        System.out.println("Popping");
        minStack.pop();
        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());

        System.out.println("Popping");
        minStack.pop();
        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());
    }
}



// output

// Pushing 5
// Min: 5
// Pushing 3
// Min: 3
// Pushing 7
// Top: 7
// Min: 3
// Popping
// Top: 3
// Min: 3
// Popping
// Top: 5
// Min: 5
