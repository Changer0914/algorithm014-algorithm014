package base;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 遍历
    public static void loopPrint(ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        System.out.println(list);
    }

    // 递归打印
    public static void recursionPrint(ListNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        recursionPrint(node.next);
    }

    // 添加
    public void addFirst(){
    }

    public void addLast(){

    }

    public void add(ListNode l1, ListNode head){
        int value = head.val;

    }

    // 删除

}
