
// 两两交换其中相邻的节点
// 给定 1->2->3->4  你应该返回 2->1->4->3.
// 给定 1->2->3   你应该返回  2->1->3

import base.ListNode;

public class SwapNodesInPairs {

    // 没些出来，草稿
    public ListNode swapPairs(ListNode head) {
        // 交换次数
        int swapCount = 0;

        ListNode firstNode = head;
        ListNode secondNode = head.next;
        if (secondNode == null) {
            return firstNode;
        }
        while (secondNode.next != null) {
            secondNode.next = firstNode;
        }
        return head;
    }

    // 递归写法
    // 1）重复单元 2）终止条件 3）返回值
    public static ListNode swapPairs2(ListNode head) {
        // 递归的终止条件
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;

        head.next = swapPairs2(next.next);
        next.next = head;

        return next;
    }

    // 迭代写法
    public static ListNode swapPairs3(ListNode head) {
        // tom指向头节点
        ListNode tom = new ListNode(-1);
        tom.next = head;

        ListNode pre = tom;
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // 交换
            pre.next = second;
            first.next = second.next;
            second.next = first;

            // 前驱节点
            pre = first;
            head = first.next;
        }

        return tom.next;
    }

    // 迭代写法  第二遍
    // 命名很重要，方便理解
    // 引入哨兵节点
    // 数组的交换 和  链表的交换
    public static ListNode swapPairs4(ListNode head) {
        ListNode sentry = new ListNode(-1);
        sentry.next = head;

        ListNode temp = sentry;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;

            // 交换
            temp.next = end;  // 修改temp节点的指针，从指向start改为指向end
            start.next = end.next;  // 修改start节点的指针，从指向end改为指向end的下一个节点
            end.next = start;  // 修改end节点的指针，从指向 end的下一个节点 改为 指向start

            temp = start; // 交换结束，temp重新设定
        }

        return sentry.next;
    }

    public static void main(String[] args) {
        // 单链表的创建
        ListNode head = new ListNode(-1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        // 单链表的遍历
        System.out.println("===循环遍历===");
        ListNode.loopPrint(head);
        System.out.println("===递归遍历===");
        ListNode.recursionPrint(head);

        // 两两交换
        System.out.println("===两两交换===");
        ListNode.loopPrint(swapPairs3(head));

        // 单链表的删除
    }

}





