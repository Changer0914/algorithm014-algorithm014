import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
 *
 *
 * 双端队列
 */
public class DequeDemo {

    public static void main(String[] args) {
        test02();
    }

    // poll
    // push
    // peek
    public static void test01(){
        Deque<Integer> integerDeque = new ArrayDeque<>();
        // 添加
        integerDeque.push(1);
        integerDeque.push(2);
        integerDeque.push(3);
        integerDeque.push(4);

        // push 等同于 addFirst
        // integerDeque.addFirst(6);

        System.out.println(integerDeque);

        // 删除 pop
        Integer pop = integerDeque.pop();
        System.out.println("pop: " + pop);
        System.out.println(integerDeque);

        // peek  不删除
        Integer peek = integerDeque.peek();
        System.out.println("peek: " + peek);
        System.out.println(integerDeque);
    }

    public static void test02() {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        // 添加
        integerDeque.addFirst(1);
        integerDeque.addLast(7);
        integerDeque.addFirst(3);


        // 3  1  7
        System.out.println(integerDeque);

        integerDeque.removeFirst();
        System.out.println(integerDeque);

        Integer integer = integerDeque.pollFirst();
        System.out.println(integer);
        System.out.println(integerDeque);

    }


}
