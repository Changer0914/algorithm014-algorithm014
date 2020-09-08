public class Solution {

    // 二分查找：有序数组、无重复
    // 找到与目标值相同的元素下标
    // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]      target = 8
    public int getIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (arr[middle] < target) {
                low = middle + 1;
            } else if (arr[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    // 变形一：二分查找   有序数组、但有重复
    // 找到与目标值相同的 第一个元素的下标
    // [0, 1, 2, 3, 4, 5, 8, 8, 8, 9]      target = 8
     public static int getIndex2(int[] arr, int target) {
         int low = 0;
         int high = arr.length - 1;
         while (low <= high) {
             int middle = low + ((high - low) >> 1);
             if (arr[middle] < target) {
                 low = middle + 1;
             } else if (arr[middle] > target) {
                 high = middle - 1;
             } else {
                 // 找到相同的了，但这不是第一个相同的，如何确定它就是第一个相同的？
                 if (middle == 0 || arr[middle - 1] != target) return middle;
                 high = middle - 1;
             }
         }
        return -1;
    }


    // 变形二：二分查找   有序数组、但有重复
    // 找到与目标值相同的 最后一个元素的下标
    public static int getIndex3(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (arr[middle] < target) {
                low = middle + 1;
            } else if (arr[middle] > target) {
                high = middle - 1;
            } else {
                // 找到相同的了，但这不是第一个相同的，如何确定它就是第一个相同的？
                if (middle == arr.length - 1 || arr[middle + 1] != target) return middle;
                low = middle + 1;
            }
        }
        return -1;
    }

    // 变体三：查找第一个大于等于给定值的元素
    // [3，4，6，7，10]    5   答案是6
    public static int getIndex4(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (arr[middle] >= target) {
                // 如何确定是第一个？ 是第一个元素 或者 前一个元素 小于 target
                if (middle == 0 || arr[middle - 1] < target) return middle;
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

        // 变形四：查找最后一个小于等于给定值的元素
    // [3，5，6，8，9，10]    7     答案是 6
    public static int getIndex5(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (arr[middle] <= target) {
                // 如何确定是最后一个
                if (middle == arr.length - 1 || arr[middle + 1] > target) return middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     *
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     *
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     *
     * 你可以假设数组中不存在重复的元素。
     *
     * 你的算法时间复杂度必须是 O(log n) 级别。
     *
     * 示例 1:
     *
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     *
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 如果有序数组是一个循环有序数组，比如 4，5，6，1，2，3。针对这种情况，如何实现一个求“值等于给定值”的二分查找算法呢？
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        // 通过 nums[0] 与 target 比较 ，确定  target 在 middle左边 还是 middle右边
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[0] <= target) {
                // 左半段有序。右半段无序
                if (nums[middle] < nums[0]) {
                    nums[middle] = Integer.MAX_VALUE;
                }
            } else {
                // nums[0] > target
                // 右半段有序。将左半段元素 值为 最小值
                if (nums[middle] >= nums[0]) {
                    nums[middle] = Integer.MIN_VALUE;
                }
            }

            if (nums[middle] > target) {
                // 因为假定是有序， nums[middle - 1] < nums[middle]
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 1);
            if (nums[middle] == target) {
                return middle;
            }
            // 分段看 nums[middle] 与 target 的关系
            // 先根据 nums[low] 与 nums[middle] 的关系判断 middle 是在左段还是右段
            if (nums[low] <= nums[middle]) {
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
                if (nums[low] <= target && target < nums[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            } else {
                if (nums[high] >= target && target > nums[middle]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 8, 8, 8, 9};
        System.out.println(getIndex3(arr, 8));

        int[] arr2 = {3,5,6,8,9,10};
        System.out.println(getIndex5(arr2, 7));
    }

}
