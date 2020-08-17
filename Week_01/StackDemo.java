import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(1);

        System.out.println(stack);

        // 获取栈顶元素，但不出栈
        Integer peek = stack.peek();
        System.out.println("peek: " + peek);
        System.out.println(stack);

        // 删除栈顶元素
        stack.pop();
        System.out.println(stack);

        int search = stack.search(8);
        // 找不到，返回 -1
        System.out.println("search: " + search);

    }

}
