class MyQueue {
    private Stack<Integer> main;   // Acts like input stack
    private Stack<Integer> helper; // Acts like output stack

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    // Push element x to the back of the queue
    public void push(int x) {
        main.push(x);
    }
    
    // Removes the element from in front of the queue and returns that element
    public int pop() {
        if (helper.isEmpty()) {
            // Move elements from main to helper if helper is empty
            while (!main.isEmpty()) {
                helper.push(main.pop());
            }
        }
        return helper.pop();
    }

    // Get the front element
    public int peek() {
        if (helper.isEmpty()) {
            while (!main.isEmpty()) {
                helper.push(main.pop());
            }
        }
        return helper.peek();
    }

    // Return whether the queue is empty
    public boolean empty() {
        return main.isEmpty() && helper.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
