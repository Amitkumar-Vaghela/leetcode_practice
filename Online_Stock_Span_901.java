import java.util.Stack;

class StockSpanner {
    // stack will store {price, index}
    private Stack<int[]> stack;
    private int index;

    public StockSpanner() {
        stack = new Stack<>();
        index = -1; // initial index set to -1
    }

    public int next(int price) {
        index++; // increase day index

        // Pop prices <= current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            stack.pop();
        }

        int span;
        if (stack.isEmpty()) {
            span = index - (-1); // all before are smaller
        } else {
            span = index - stack.peek()[1];
        }

        // Push current price with its index
        stack.push(new int[]{price, index});

        return span;
    }
}
