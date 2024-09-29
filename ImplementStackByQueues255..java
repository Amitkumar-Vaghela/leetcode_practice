import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    // Constructor
    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    // Push element onto the stack
    public void push(int x) {
        // Move all elements from main to helper
        while (!main.isEmpty()) {
            helper.add(main.remove());
        }
        
        // Add the new element to the main queue
        main.add(x);
        
        // Move all elements back from helper to main
        while (!helper.isEmpty()) {
            main.add(helper.remove());
        }
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        return main.remove(); // Removes and returns the first element
    }

    // Get the top element
    public int top() {
        return main.peek(); // Returns the first element without removing it
    }

    // Return whether the stack is empty
    public boolean empty() {
        return main.isEmpty();
    }
}

/*
Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
