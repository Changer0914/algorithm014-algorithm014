import java.util.LinkedList;

public class Solution506 {

    /**
     * 200. 岛屿数量
     *
     * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
     *
     * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
     *
     * 此外，你可以假设该网格的四条边均被水包围。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-islands
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        // 深度优先搜索的次数
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    // dfs
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (notGrid(grid, i, j)){
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        // 标记过已访问
        grid[i][j] = '2';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

    private boolean notGrid(char[][] grid, int i, int j) {
        return i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length -1;
    }

    /**
     * 695. 岛屿的最大面积
     *
     * 给定一个包含了一些 0 和 1 的非空二维数组 grid 。
     *
     * 一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
     *
     * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。)
     *
     *  
     *
     * 示例 1:
     *
     * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
     *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
     *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
     *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
     *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
     *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
     *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
     *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
     * 对于上面这个给定矩阵应返回 6。注意答案不应该是 11 ，因为岛屿只能包含水平或垂直的四个方向的 1 。
     *
     * 示例 2:
     *
     * [[0,0,0,0,0,0,0,0]]
     * 对于上面这个给定的矩阵, 返回 0。
     *
     *  
     *
     * 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/max-area-of-island
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = countArea(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private int countArea(int[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length -1){
            return 0;
        }
        if (grid[i][j] != 1) {
            return 0;
        }
        // 标记过已访问
        grid[i][j] = 2;
        return 1
                + countArea(grid, i - 1, j)
                + countArea(grid, i + 1, j)
                + countArea(grid, i, j - 1)
                + countArea(grid, i, j + 1);
    }

    /**
     * 使用 BFS 解题
     *
     * @param grid
     * @return
     */
    public int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int i, int j) {
        // 队列中的元素 怎么表示呢？
        LinkedList<int[]> queue = new LinkedList<>();
        queue.addFirst(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] head = queue.removeLast();
            i = head[0];
            j = head[1];
            addFirst(grid, i - 1, j, queue);
            addFirst(grid, i + 1, j, queue);
            addFirst(grid, i, j - 1, queue);
            addFirst(grid, i, j + 1, queue);
        }
    }

    public void addFirst(char[][] grid, int i, int j, LinkedList<int[]> queue) {
        boolean isLand = (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1');
        if (isLand) {
            grid[i][j] = '2';
            queue.addFirst(new int[]{i, j});
        }
    }

}
