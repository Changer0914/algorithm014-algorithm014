
public class Solution604 {

 /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     * 示例:
     *
     * 输入: [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     * 进阶:
     *
     * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/maximum-subarray
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *  求最大值。
     *      尝试用 动规 求解。
     *
     *      1）分治（子问题）
     *      2）状态数组
     *      3）DP方程
     *
     *          1 2  -8  6    （以正数开始，以正数结尾）
     *      连续子数组 最大和  为    当前元素最大（前面都是负数，直接丢掉） 或者  当前元素 + 当前元素之前最大。
     *
     *      dp[i] = Math.max(nums[i], nums[i] + dp[i-1])
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        // i 从 1 开始，如果 i = 0 ， dp方程中的 dp[i - 1] 不满足 ，所以 dp[0] = nums[0]
        for (int i = 1; i < nums.length; i++) {
            // 一看到 i -1 ，就想到 i 从 0 开始 怎么办  dp[0] = nums[0]
            dp[i] = Math.max(0, dp[i-1]) + nums[i];
            // 求数组的最大值
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

}
