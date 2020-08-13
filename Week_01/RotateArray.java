import java.util.Arrays;

/**
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */

public class RotateArray {

    // 交换
    // 暴力求解
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                // 数组交换的写法
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    // 忽略题目要求的空间o(1) 先做出来
    // 这个空间是 o(n)
    public static void rotate2(int[] nums, int k) {
        // 使用一个新数组
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // 为什么是  (i + k) % num.length  这个很巧妙地旋转了
            newNums[(i + k) % nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(newNums));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate2(nums, 3);
    }

}
