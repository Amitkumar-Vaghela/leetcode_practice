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


public class Main {
    public static void main(String[] args) {
        StockSpanner ss = new StockSpanner();
        System.out.println(ss.next(100)); // 1
        System.out.println(ss.next(80));  // 1
        System.out.println(ss.next(60));  // 1
        System.out.println(ss.next(70));  // 2
        System.out.println(ss.next(60));  // 1
        System.out.println(ss.next(75));  // 4
        System.out.println(ss.next(85));  // 6
    }
}

