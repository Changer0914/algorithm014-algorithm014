import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // 暴力求解  时间 o(n的平方)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // 用空间换时间  时间 o(n)
    public static int[] twoSum2(int[] nums, int target) {
        // key放值，value放下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        return new int[0];
    }

    // 用空间换时间  时间 o(n)  可否使用一次循环做出来
    public static int[] twoSum3(int[] nums, int target) {
        // key放值，value放下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                if (i < index) {
                    return new int[]{i, index};
                }
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 11, 15};
        int target = 6;
        int[] newArr = twoSum3(nums, target);
        System.out.println(Arrays.toString(newArr));
    }

}
