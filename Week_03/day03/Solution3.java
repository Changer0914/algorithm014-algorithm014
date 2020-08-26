package day03;

import base.BinaryTreeNode;
import base.ListNode;
import base.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution3 {

    /**
     * N叉树的层序遍历
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outerList = new ArrayList<>();
        levelOrderRecur(root, 0, outerList);
        return outerList;
    }

    private void levelOrderRecur(TreeNode root, int level, List<List<Integer>> outerList) {
        if (root == null) {
            return;
        }
        if (outerList.size() <= level) {
            // 第n层的第一个节点
            outerList.add(new ArrayList<>());
        }
        outerList.get(level).add(root.val);
        for (TreeNode child : root.children) {
            levelOrderRecur(child, level + 1, outerList);
        }
    }

    /**
     * 94. 二叉树的中序遍历
     *      递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalDG(root, list);
        return list;
    }

    private void inorderTraversalDG(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversalDG(root.left, list);
        list.add(root.val);
        inorderTraversalDG(root.right, list);
    }

    /**
     * 94. 二叉树的中序遍历
     *      迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            BinaryTreeNode temp = stack.pop();
            list.add(temp.val);
            current = temp.right; // 如果是叶子节点，这时current==null，这时栈中有元素
        }
        return list;
    }

    /**
     * 剑指 Offer 06. 从尾到头打印链表
     *
     * @param head
     * @return
     */
    public static int[] reversePrint(ListNode head) {
        // 对链表反转
        head = reverseList(head);
        int[] arr = new int[getListNodeLength(head)];
        int i = 0;
        while (head != null) {
            arr[i++] = head.val;
            head = head.next;
        }
        return arr;
    }

    public static int[] reversePrint2(ListNode head) {
        int length = getListNodeLength(head);
        int[] arr = new int[length];
        while (head != null) {
            arr[length-- -1] = head.val;
            head = head.next;
        }
        return arr;
    }

    /**
     * 获取链表的长度
     *
     * @return
     */
    public static int getListNodeLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    /**
     * 链表反转
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        // 终止条件
        if (head == null || head.next == null) {
            return head;
        }
        // 下探到 下一层
        ListNode newNode = reverseList(head.next);
        // 当前层 交换
        head.next.next = head;
        head.next = null;
        return newNode;
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
        System.out.println("===链表反转===");
        ListNode.loopPrint(reverseList(head));
    }

}
