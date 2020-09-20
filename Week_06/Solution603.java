import java.util.List;

public class Solution603 {

    /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     *
     * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
     *
     *  
     *
     * 例如，给定三角形：
     *
     *[
     * [2],
     * [3,4],
     * [6,5,7],
     * [4,1,8,3]
     * ]
     * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
     *
     * 说明：
     *
     * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/triangle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        return min(0, 0, triangle);
    }

    /**
     * 求第i层第j个元素的最小路径。
     *  如果到最后一层，就是  i = size - 1     min = triangle.get(i).get(j)
     *
     * @param i 层数
     * @param j 第i层的第j个元素
     * @param triangle
     * @return
     */
    private int min(int i, int j, List<List<Integer>> triangle){
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        int left = min(i+1, j, triangle);
        int right = min(i+1, j+1, triangle);
        return Math.min(left, right) + triangle.get(i).get(j);
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        Integer[][] memo = new Integer[triangle.size()][triangle.size()];
        return min2(0, 0, triangle, memo);
    }

    private int min2(int i, int j, List<List<Integer>> triangle, Integer[][] memo){
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int left = min2(i+1, j, triangle, memo);
        int right = min2(i+1, j+1, triangle, memo);
        memo[i][j] = Math.min(left, right) + triangle.get(i).get(j);
        return memo[i][j];
    }

    /**
     * 使用动态规划：自底向上
     *  重复性
     *  状态数组  dp[i][j]
     *  dp方程   dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
     *
     *  空间复杂度  o(N * N)
     *
     * @param triangle
     * @return
     */
    public int minimumTotal3(List<List<Integer>> triangle) {
        int size = triangle.size();
        // 如果是 i = size - 1 最后一层， dp[i+1]为最后一层还要加一，所以数组的长度为 size + 1;
        int[][] dp = new int[size+1][size+1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    /**
     * 动态规划，再优化。 使用一维数组
     *
     *  在实际递推中我们发现，计算 dp[i][j] 时，只用到了下一行的 dp[i+1][j] 和 dp[i+1][j+1]
     *
     *  空间复杂度  o(N)
     *
     *      *[
     *      * [2],
     *      * [3,4],
     *      * [6,5,7],
     *      * [4,1,8,3]
     *      * ]
     *
     * @param triangle
     * @return
     */
    public int minimumTotal4(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size+1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }


}
