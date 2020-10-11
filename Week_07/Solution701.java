public class Solution701 {

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     *
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
     *  
     *
     * 示例 1：
     *
     * 输入：[1,2,3,1]
     * 输出：4
     * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     * 示例 2：
     *
     * 输入：[2,7,9,3,1]
     * 输出：12
     * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
     *  
     *
     * 提示：
     *
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 400
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/house-robber
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *  偷到的最大金额
     *
     *  a[i] 表示偷到第i个房间时的最大金额
     *
     *  a[i][0] = max(a[i-1][0], a[i-1][1])
     *  a[i][1] = a[i-1][0] + nums[i];
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[][] a = new int[n][2];
        a[0][0] = 0;
        a[0][1] = nums[0];
        for (int i = 1; i < n; i++) {
            a[i][0] = Math.max(a[i-1][0], a[i-1][1]);
            a[i][1] = a[i-1][0] + nums[i];
        }
        return Math.max(a[n-1][0], a[n-1][1]);
    }

    /**
     * a[i] 取 最大值
     *     转化为  i不偷，在i-1中取最大值
     *            i偷，i-1一定不偷，在i-2中取最大值
     *   dp方程
     *
     *   dp[i] = max(dp[i-1], nums[i] + dp[i-2])
     *
     *   做完，测试下
     *   [1,2,3,1]
     *
     * @param nums
     * @return
     */
    public static int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n];
        // 第1个房间
        dp[0] = nums[0];
        // 第2个房间
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[n-1];
    }

    /**
     * 从递推公式可知  dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
     *  i 之和 i-1 、 i-2 有关。
     *  和斐波那契公式很像，优化，只需要3个变量即可，空间变为 o(n)
     * @param nums
     * @return
     */
    public static int rob3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int pre = 0;
        int now = 0;
        // int temp = Math.max(now, nums[i] + pre);
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(now, nums[i] + pre);
            pre = now;
            now = temp;
        }
        return now;
    }

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，
     * 这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     *
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
     *
     * 示例 1:
     *
     * 输入: [2,3,2]
     * 输出: 3
     * 解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
     * 示例 2:
     *
     * 输入: [1,2,3,1]
     * 输出: 4
     * 解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     *      偷窃到的最高金额 = 1 + 3 = 4 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/house-robber-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *  和打家劫舍1的区别在于：第1个和最后一个不能同时偷了。
     *
     *      看了题解，知道，应该分成两个区间
     *      (0, n-2)
     *      (1, n-1)
     *
     */
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int pre1 = 0;
        int now1 = 0;
        for (int i = 0; i < n - 1; i++) {
            int temp = Math.max(now1, nums[i] + pre1);
            pre1 = now1;
            now1 = temp;
        }
        int pre2 = 0;
        int now2 = 0;
        for (int i = 1; i < n; i++) {
            int temp = Math.max(now2, nums[i] + pre2);
            pre2 = now2;
            now2 = temp;
        }
        return Math.max(now1, now2);
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));// 返回 true

        System.out.println(trie.search("app"));     // 返回 false

        System.out.println(trie.startsWith("app")); // 返回 true

        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 true

    }

}
