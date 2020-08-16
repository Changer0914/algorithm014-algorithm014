import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(8);

        // 为何是  [1, 4, 3, 8]
        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
//            1
//            3
//            4
//            8
        }

    }

}
