import java.util.*;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *      排序后    -4  -1  -1  0  1   2
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
 *
 */
public class ThreeSum {

    // 暴力法  时间 o(n的三次方)
    // 超出时间限制，无法提交
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        // 排序的时间复杂度是 o(n*logn)
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
                        set.add(value);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    // 两重循环 + hash
    public static List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        int len = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len - 2; i++) {
            int target = 0 - nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < len; j++) {
                Integer existNum = map.get(target - nums[j]);
                if (existNum != null) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], existNum);
                    list.sort(Comparator.naturalOrder());
                    set.add(list);
                } else {
                    map.put(nums[j], nums[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    // 排序 + 双指针左右夹逼
    // nums[k] + nums[i] + nums[j] = sum      sum 与 0 比较
    // nums[k] <= nums[i] <= nums[j]
    public static List<List<Integer>> threeSum3(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> returnList = new ArrayList<>();
        for (int k = 0; k < len - 2; k++) {
            // 结束循环
            if (nums[k] > 0) break;
            // 跳过重复的
            if (k > 0 && nums[k] == nums[k -1]) continue;
            int i = k + 1, j = len - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    // i向右移动 i++   j不变
                    // 并且 跳过 重复的
                    // 巧妙的写法
                    // while (i < j && nums[i] == nums[++i]);
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                } else if (sum > 0) {
                    // j向左移动 j--   i不变
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    // i 向右  j 向左
                    returnList.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return returnList;
    }


    public static void main(String[] args) {
        int[] nums =  { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> lists = threeSum2(nums);
        System.out.println(lists);
    }

}
