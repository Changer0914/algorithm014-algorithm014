package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    /**
     * 审题：
     *  答案要去重
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        // 使用左右夹逼时，先对数组进行排序
        Arrays.sort(nums);
        List<List<Integer>> returnList = new ArrayList<>();
        // 遍历  指针i循环， 指针j和k左右夹逼
        for (int i = 0; i < nums.length - 2; i++) {
            // nums[i] + nums[j] + nums[k] = 0
            // 升序后，如果 nums[i] 大于 0 ，直接结束 。 因为  nums[i] <= nums[j] <= nums[k]
            if (nums[i] > 0) break;
            // 如果 nums[i] 与 前一个数 相等，直接 跳过
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    // j不变， k向左移
                    k--;
                    // 优化，跳过重复的
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    // j向右移， k不变
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else {
                    // 符合条件
                    // j 向右  k 向左
                    returnList.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    // 跳过重复的元素
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                }
            }
        }
        return returnList;
    }

    public static void main(String[] args) {

    }

}
