import base.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoSortedLists21 {

    // 找位置 ， 单链表添加节点 ， 删除节点
    // 这样想，走偏了
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while (l2 != null) {
            int value2 = l2.val;

        }
        return null;
    }

    // 递归解法
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoLists2(l1, l2.next);
        return l2;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node01 = new ListNode(5);
        ListNode node02 = new ListNode(6);
        head.next = node01;
        node01.next = node02;
        ListNode.loopPrint(head);

        ListNode tom = new ListNode(4);

    }

}
