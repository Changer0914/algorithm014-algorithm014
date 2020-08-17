import java.util.Stack;

/**
 * {@link java.util.Stack}
 */
public class MinStack155 {

    private Stack<Integer> stack;
    private Stack<Integer> min_stack;
    public MinStack155() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    // 将元素 x 推入栈中
    public void push(int x) {
        // 每次入栈时，当前值，与 min_stack 的栈顶元素 进行比较， 如果比其小， 也入 栈
        stack.push(x);
        if (min_stack.isEmpty() || x <= min_stack.peek())
            min_stack.push(x);
    }

    // 移除栈顶元素，同时维护 最小栈
    public void pop() {
        if (stack.pop() == min_stack.peek().intValue())
            min_stack.pop();
    }

    // 获取栈顶元素
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }

    public static void main(String[] args) {
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }

}
