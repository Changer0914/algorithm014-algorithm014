package day03;

import java.util.Arrays;

public class Solution {

    /**
     * 剑指 Offer 59 - I. 滑动窗口的最大值
     *   输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
     *   输出: [3,3,5,5,6,7]
     *
     *   在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
     *
     *  1、 暴力法  外层循环次数  0, len - k + 1   内层循环  0, k
     *      时间 O(n^2)
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k < 1 || nums.length < k) {
            return new int[0];
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = nums[i];
            for (int j = 0; j < k; j++) {
                max = Math.max(max, nums[i + j]);
            }
            nums[i] = max;
        }
        return Arrays.copyOf(nums, nums.length - k + 1);
    }

    // 解法2：用空间换时间，单调双端队列

    // 解法3： nums[-1] 不会越界吗？
    // 优化暴力解法
    public static int[] maxSlidingWindow3(int[] nums, int k) {
        int len = nums.length;
        if (len == 0){
            return new int[0];
        }
        //定义结果数组
        int[] res = new int[len - k + 1];
        //maxInd记录每次最大值的下标，max记录最大值
        int maxInd = -1, max = Integer.MIN_VALUE;

        for (int i = 0; i < len - k + 1; i++) {
            // 判断最大值下标是否在滑动窗口的范围内
            if (maxInd >= i){
                //存在就只需要比较最后面的值是否大于上一个窗口最大值
                if (nums[i + k - 1] > max){
                    max = nums[i + k - 1];
                    // 更新最大值下标
                    maxInd = i + k - 1;
                }
            }
            // 如果不在就重新寻找当前窗口最大值
            else {
                max = nums[i];
                for (int j = i; j < i + k; j++) {
                    if (max < nums[j]) {
                        max = nums[j];
                        maxInd = j;
                    }
                }
            }
            res[i] = max;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] newArr = maxSlidingWindow(nums, 1);
        System.out.println(Arrays.toString(newArr));
    }

}
