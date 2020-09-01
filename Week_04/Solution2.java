import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {

    /**
     * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
     *
     * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
     *
     * 此外，你可以假设该网格的四条边均被水包围。
     *  
     *
     * 示例 1:
     *
     * 输入:
     * [
     * ['1','1','1','1','0'],
     * ['1','1','0','1','0'],
     * ['1','1','0','0','0'],
     * ['0','0','0','0','0']
     * ]
     * 输出: 1
     * 示例 2:
     *
     * 输入:
     * [
     * ['1','1','0','0','0'],
     * ['1','1','0','0','0'],
     * ['0','0','1','0','0'],
     * ['0','0','0','1','1']
     * ]
     * 输出: 3
     * 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-islands
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    // 可以和count++调整顺序吗？可以
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        // 不在网格里
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return;
        }
        // 不是1 ， 是 0 或 2
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    /**
     * 22. 括号生成
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
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
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        generateDFS(result, 0, 0, "", n);
        return result;
    }

    private void generateDFS(List<String> result, int leftNum, int rightNum, String s, int n) {
        if (leftNum == n && rightNum == n) {
            result.add(s);
            return;
        }
        if (leftNum < n) {
            generateDFS(result, leftNum + 1, rightNum, s + '(', n);
        }
        // 前面必须有左括号
        if (rightNum < n && leftNum > rightNum) {
            generateDFS(result, leftNum, rightNum + 1, s + ')', n);
        }
    }


}
