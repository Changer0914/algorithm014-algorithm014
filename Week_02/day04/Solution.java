package day04;

import base.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {

    /**
     * 589. N叉树的前序遍历
     * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preDfs(root, list);
        return list;
    }

    private static void preDfs(TreeNode root, List<Integer> list) {
        // 终止条件
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (TreeNode children : root.children) {
            preDfs(children, list);
        }
    }

    // 使用栈
    public static List<Integer> preOrder2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        // 初始化
        stack.push(root);
        while (!stack.isEmpty()) {
            // 重复单元：出栈、往list添加值、入栈
            TreeNode pop = stack.pop();
            list.add(pop.val);
            // 从右往左将孩子节点入栈
            List<TreeNode> childrenList = pop.children;
            for (int i = childrenList.size() - 1; i >= 0; i--) {
                stack.push(childrenList.get(i));
            }
            // Collections.reverse(childrenList);
            // childrenList.forEach(child -> stack.push(child));
        }
        return list;
    }

    /**
     * 590. N叉树的后序遍历
     * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
     * @param root
     * @return
     */
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postDfs(root, list);
        return list;
    }

    private void postDfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        // 遍历孩子
        for (TreeNode children : root.children) {
            postDfs(children, list);
        }
        // 根
        list.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createTree();
        List<Integer> list = preOrder2(root);
        System.out.println(list);
    }

}
