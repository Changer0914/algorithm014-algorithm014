package day06;

import base.BinaryTreeNode;

import java.util.*;

public class Solution {

    // 144. 二叉树的前序遍历  根 左 右
    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalDG(root, list);
        return list;
    }

    private void preorderTraversalDG(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        // 左
        preorderTraversalDG(root.left, list);
        preorderTraversalDG(root.right, list);
    }

    /**
     * 94. 二叉树的中序遍历
     *
     * 输入: [1,null,2,3]
     *    1
     *     \
     *      2
     *     /
     *    3
     *
     * 输出: [1,3,2]
     *
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
        // 左
        inorderTraversalDG(root.left, list);
        // 根
        list.add(root.val);
        // 右
        inorderTraversalDG(root.right, list);
    }

    public List<Integer> postorderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversalDG(root, list);
        return list;
    }

    private void postorderTraversalDG(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        // 左
        postorderTraversalDG(root.left, list);
        // 右
        postorderTraversalDG(root.right, list);
        // 根
        list.add(root.val);
    }

    //////////////////////////////// 迭代法
    public List<Integer> preorderTraversal2(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode pop = stack.pop();
            if (pop == null) continue;
            list.add(pop.val);
            stack.push(pop.right);
            stack.push(pop.left);
        }
        return list;
    }

    // 后序遍历
    public List<Integer> postorderTraversal2(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<BinaryTreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode topElement = stack.pop();
            if (topElement == null) continue;
            list.add(topElement.val);
            stack.push(topElement.left);
            stack.push(topElement.right);
        }
        Collections.reverse(stack);
        return list;
    }

    // 中序遍历
    // 思想： 如果有根、有左、有右， 将左边的放入栈顶
    // 不断往左边走，当左边走不下去了，就打印节点，并转向右边，然后右边继续这个过程。
    public List<Integer> inorderTraversal2(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            // 不断往左子树方向走，每走一次就将当前节点保存到栈中
            // 这是模拟递归的调用
            if (current != null) {
                stack.push(current);
                current = current.left;
                continue;
            }
            // 当前节点为空，说明左边走到头了，从栈中弹出节点并保存
            // 然后转向右边节点，继续上面整个过程
            BinaryTreeNode tmp = stack.pop();
            list.add(tmp.val);
            current = tmp.right;
        }
        return list;
    }

    public static void main(String[] args) {
    }

}
