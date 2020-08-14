package second;
// 两两交换其中相邻的节点
// 给定 1->2->3->4  你应该返回 2->1->4->3.
// 给定 1->2->3   你应该返回  2->1->3

import base.ListNode;

public class SwapNodesInPairs {

    // 递归写法
    // 1）重复单元 2）终止条件 3）返回值
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head 和 head.next 交换
        ListNode next = head.next;

        // 交换
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }

    // 迭代写法  第二遍
    // 命名很重要，方便理解
    // 引入哨兵节点
    public static ListNode swapPairs2(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;

        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;

            // 交换，修改节点指针
            temp.next = end;
            start.next = end.next;
            end.next = start;

            temp = start;
        }

        return pre.next;
    }

}





