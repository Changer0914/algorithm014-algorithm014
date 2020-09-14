import java.util.*;

public class Solution507 {

    /**
     *  四元组问题
     *      a + b + c + d = target
     *
     *      给定的数组：无序 有重复
     *          [-2, -1, 0, 0, 1, 2]
     *
     *     答案中 不允许有重复
     *
     *   给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
     *
     * 满足要求的四元组集合为：
     * [
     *   [-1,  0, 0, 1],
     *   [-2, -1, 1, 2],
     *   [-2,  0, 0, 2]
     * ]
     *
     *          // nums[i] <= nums[j] <= nums[m] <= nums[n]
     *         // nums[i] + nums[j] + nums[m] + nums[n] = sum  ,  sum 与 target 进行比较
     *
     *  暴力法：
     *  双指针法：
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // 优化
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                // 优化
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int m = j + 1, n = nums.length - 1;
                while (m < n) {
                    int sum = nums[i] + nums[j] + nums[m] + nums[n];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        while (m < n && nums[n] == nums[--n]);
                        while (m < n && nums[m] == nums[++m]);
                    } else if (sum > target) {
                        // 跳过重复的
                        while (m < n && nums[n] == nums[--n]);
                    } else {
                        while (m < n && nums[m] == nums[++m]);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    /**
     * 跳跃游戏。
     *  每次从可选范围中选择最大的那个。 因为题目已经说了，你总是可以到达数组的最后一个位置。
     *
     *  错误！！！
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int start = 0;
        int len = nums.length - 1;
        int count = 0;
        while (start < len) {
            start = start + nums[start];
            count++;
        }
        return count;
    }

    public static boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            // 不断更新最远的距离
            maxPos = Math.max(maxPos, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4} ;
        System.out.println(canJump(nums));
    }


}
