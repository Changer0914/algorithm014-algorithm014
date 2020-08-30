package day07;

import base.BinaryTreeNode;
import base.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution7 {

    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     *
     * 注意:
     * 你可以假设树中没有重复的元素。
     *
     * 例如，给出
     *
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     * 返回如下的二叉树：
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *      根据前序遍历构造一颗树，然后对这棵树进行遍历，看是否与中序遍历相同。如果相同，则返回。
     *          如果不同，继续根据前序遍历构造树。
     *      代码写不出来。 前序遍历确定树 也忘了。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public BinaryTreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        BinaryTreeNode root = myBuildTree(preorder,0, len - 1, inorder, 0, len - 1);
        return root;
    }

    /**
     *
     * @param preorder 前序遍历的数组
     * @param pre_start  前序 - 子树的开始位置
     * @param pre_end    前序 - 子树的结束位置
     * @param inorder 中序遍历的数组
     * @param in_start   中序 - 子树的开始位置
     * @param in_end     中序- 子树的结束位置
     * @return
     */
    private BinaryTreeNode myBuildTree(int[] preorder, int pre_start, int pre_end, int[] inorder, int in_start, int in_end) {
        // 终止条件
        if (pre_start > pre_end) {
            return null;
        }
        // 在前序遍历终找到根节点
        int pre_root_value = preorder[pre_start];
        // 从中序遍历终找到根节点的位置
        int in_root_index = findRootIndex(inorder, pre_root_value);
        // 左子树的数量
        int left_num = in_root_index - in_start;
        BinaryTreeNode root = new BinaryTreeNode(pre_root_value);
        // 左子树
        root.left = myBuildTree(preorder, pre_start + 1, pre_start + left_num, inorder, in_start, in_root_index - 1);
        // 右子树
        root.right = myBuildTree(preorder, pre_start + left_num + 1, pre_end, inorder, in_root_index + 1, in_end);
        return root;
    }

    private Map<Integer, Integer> map = new HashMap<>();

    /**
     * 从中序遍历终找到根节点的位置
     *   根据值在数组中找下标
     * @param inorder
     * @param pre_root_value
     * @return
     */
    private int findRootIndex(int[] inorder, int pre_root_value) {
//        for (int i = 0; i < inorder.length; i++) {
//            if (inorder[i] == pre_root_value) {
//                return i;
//            }
//        }
//        return -1;
        return map.get(pre_root_value);
    }

    /**
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
     *
     * 示例:
     *
     * 输入: n = 4, k = 2
     * 输出:
     * [
     *   [2,4],
     *   [3,4],
     *   [2,3],
     *   [1,2],
     *   [1,3],
     *   [1,4],
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/combinations
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *      递归 之 回溯
     *
     * @param n
     * @param k
     * @return
     */
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        myCombine(list, n, k, 1, innerList);
        return list;
    }

    private static void myCombine(List<List<Integer>> list, int n, int k, int start, List<Integer> innerList) {
        // 终止条件
        if (k == innerList.size()) {
            // 为何是  list.add(new ArrayList<>(innerList)); 而不是 list.add(innerList);
            list.add(new ArrayList<>(innerList));
            return;
        }
        // 注意 i 从 start 开始递增
        for (int i = start; i <= n; i++) {
            // 做选择：当前层 [1, 2, 3]
            innerList.add(i);
            // 下一层 [2, 3]
            myCombine(list, n, k, i + 1, innerList);
            // 撤销选择
            innerList.remove(innerList.size() - 1);
        }
    }

    private static List<Integer> toList(String s){
        List<Integer> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c - 48);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

}
