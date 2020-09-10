import base.BinaryTreeNode;
import sun.security.mscapi.KeyStore;

import java.util.*;

public class Solution504 {

    /**
     * 怎么表示方向？
     * 怎么表示遇到障碍物？ 判断向前一步的坐标 是否与 障碍物 相同。  我们用字符串表示。
     *
     * @param commands
     * @param obstacles
     * @return
     */
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int max = 0;

        // 表示 北一步、东一步、南一步、西一步
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        // 0 朝北 ，向右转 0 + 1 ，向左转 0 + 3
        // 抽象一下，向右转  (dir_index + 1) % 4  向左转   (dir_index + 3) % 4
        int dir_index = 0;


        // 使用Set存障碍物坐标
        Set<String> obstacleSet = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            // 第i个一维数组。一维数组就 0 和 1
            obstacleSet.add(obstacles[i][0] + "," + obstacles[i][1]);
        }

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1) {
                // 右转
                dir_index = (dir_index + 1) % 4;
            } else if (commands[i] == -2) {
                // 左转
                dir_index = (dir_index + 3) % 4;
            } else if (commands[i] > 0) {
                // 走
                // 没走一步，都要判断是否遇到障碍物
                for (int j = 0; j < commands[i]; j++) {
                    int next_x = x + dir[dir_index][0];
                    int next_y = y + dir[dir_index][1];
                    if (isObstacle(obstacleSet, next_x, next_y)) {
                        break;
                    } else {
                        x = next_x;
                        y = next_y;
                        max = Math.max(max, count(x, y));
                    }
                }
            }
        }
        return max;
    }

    // 是否遇到障碍物
    private boolean isObstacle(Set<String> obstacleSet, int next_x, int next_y){
        return obstacleSet.contains(next_x + "," + next_y);
    }

    // 每次走，都算下。 x * x + y * y
    private int count(int x, int y){
        return x * x + y * y;
    }

    /**
     * 122. 买卖股票的最佳时机 II
     *
     *  因为 买之前，必须卖掉之前的 。 这个条件很重要。
     *  贪心：只要后一天比前一天大，就在前一天买，后一天卖。
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        // 开天眼了，知道未来股票的价格。
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int currPrice = prices[i];
            int nextPrice = prices[i + 1];
            // 贪心：只要后一天比前一天大，就在前一天买，后一天卖
            if (nextPrice > currPrice) {
                max += (nextPrice - currPrice);
            }
        }
        return max;
    }

    /**
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     *
     *  
     *
     * 示例：
     *
     * 输入：n = 3
     * 输出：[
     *        "((()))",
     *        "(()())",
     *        "(())()",
     *        "()(())",
     *        "()()()"
     *      ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/generate-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        // 是一个非常典型的二叉树。二叉树的解法都是用递归的。
        // 要么左括号，要么右括号。先不考虑合法性。
        List<String> res = new ArrayList<>();
        dfs(res, "", 0, 0, n);
        return res;
    }

    private static void dfs(List<String> res, String s, int leftNum, int rightNum, int n) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        // 要么在放的时候，直接放对。要么在结果上判断合法性。
        if (leftNum < n) {
            dfs(res, s + '(', leftNum + 1, rightNum, n);
        }
        if(rightNum < n && rightNum < leftNum)
        dfs(res, s + ')', leftNum, rightNum + 1, n);
    }

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
     *
     *  
     *
     * 示例：
     * 二叉树：[3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回其层次遍历结果：
     *
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(BinaryTreeNode root) {
        // 一层一层的，用 BFS 实现。
        List<List<Integer>> res = new ArrayList<>();

        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.addFirst(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                BinaryTreeNode treeNode = queue.removeLast();
                list.add(treeNode.val);
                queue.addFirst(treeNode.left);
                queue.addFirst(treeNode.right);
            }

            res.add(list);
        }

        return res;
    }

}
