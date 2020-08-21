package day05;

import base.BinaryTreeNode;
import base.TreeNode;

import java.util.*;

public class Solution {

    /**
     *  给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
     *
     *     示例:
     *
     *     输入: 38
     *     输出: 2
     *     解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
     *     进阶:
     *     你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
     *
     *  来源：力扣（LeetCode）
     *     链接：https://leetcode-cn.com/problems/add-digits
     *     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param num
     * @return
     */
    public static int addDigits(int num) {
        if (num >= 0 && num <= 9) {
            return num;
        }
        // 误区：一直在想 这个数字有几位， 如何算出 每位， 然后 相加， 然后继续算。
        return 1;
    }

    // 递归  写不出来
    public static int addDigits2(int num) {
        if (num < 10) {
            return num;
        }

        return 1;
    }

    // 如果是 387    38 + 7 = 45   4 + 5 = 9
    public static int addDigits3(int num) {
        while (num >= 10) {
            num = num / 10 + num % 10;
        }
        return num;
    }

    /**
     * 589. N叉树的前序遍历
     *      递归法
     * @param root
     * @return
     */
    public List<Integer> preorder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        // 孩子节点 得到的值
        preDG(root.children, list);
        return list;
    }

    private void preDG(List<TreeNode> children, List<Integer> list) {
        for (TreeNode child : children) {
            list.add(child.val);
            preDG(child.children, list);
        }
    }

    /**
     * 迭代法
     * @param root
     * @return
     */
    public List<Integer> preorder2(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            list.add(pop.val);
            List<TreeNode> children = pop.children;
            // 将最右边的孩子先进栈
            Collections.reverse(children);
            for (TreeNode child : children) {
                stack.push(child);
            }
        }
        return list;
    }

    public List<Integer> postorder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        postDG(root.children, list);
        list.add(root.val);
        return list;
    }

    private void postDG(List<TreeNode> children, List<Integer> list) {
        for (TreeNode child : children) {
            postDG(child.children, list);
            list.add(child.val);
        }
    }
    public static List<Integer> postorder2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);
            if (node.children != null) {
                for (TreeNode child : node.children) {
                    stack.push(child);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    /**
     * [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)
     *      使用 递归法
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalDG(root, list);
        return list;
    }

    private void preorderTraversalDG(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        // 根
        list.add(root.val);
        // 左
        preorderTraversalDG(root.left, list);
        // 右
        preorderTraversalDG(root.right, list);
    }

    public static void main(String[] args) {
//        System.out.println(addDigits2(389));
        System.out.println(postorder2(TreeNode.createTree()));
    }

}
