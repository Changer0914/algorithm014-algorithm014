package day05;

import java.util.*;

public class Solution5 {

    /**
     * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
     *
     * 注意：
     *
     * 答案中不可以包含重复的四元组。
     *
     * 示例：
     *
     * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
     *
     * 满足要求的四元组集合为：
     * [
     *   [-1,  0, 0, 1],
     *   [-2, -1, 1, 2],
     *   [-2,  0, 0, 2]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/4sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        // nums[i] + nums[j] + nums[p] + nums[q] = sum     sum与target进行比较
        for (int i = 0; i < nums.length - 3; i++) {

            for(int j = i + 1; j < nums.length - 2; j++) {

                int p = j + 1;
                int q = nums.length - 1;
                while (p < q) {
                    int sum = nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum == target) {
                        // 添加
                        set.add(Arrays.asList(nums[i], nums[j], nums[p++], nums[q--]));
                    } else if (sum > target) {
                        q--;
                    } else {
                        p++;
                    }
                }

            }

        }
        return new ArrayList<>(set);
    }

    /**
     *
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *  
     *
     * 示例：
     *
     * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     *
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        // nums[i] + nums[j] + nums[p] + nums[q] = sum     sum与target进行比较
        for (int i = 0; i < nums.length - 3; i++) {

            // 优化1  最小值 大于 target 直接跳出循环
            if (nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;

            // 优化3  最大值 小于 target ， 继续下一层 i+1
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target) continue;

            // 优化2 跳过重复
            if (i > 0 && nums[i] == nums[i-1]) continue;


            for(int j = i + 1; j < nums.length - 2; j++) {

                // 优化1
                if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;

                // 优化3  最大值 小于 target ， 继续下一层 i+1
                if (nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2] < target) continue;

                // 优化2 跳过重复
                if (j > i + 1 && nums[j] == nums[j-1]) continue;

                int p = j + 1;
                int q = nums.length - 1;
                while (p < q) {
                    int sum = nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum == target) {
                        // 添加
                        set.add(Arrays.asList(nums[i], nums[j], nums[p++], nums[q--]));
                    } else if (sum > target) {
                        q--;
                    } else {
                        p++;
                    }
                }

            }

        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(nums, 0));
    }

}
