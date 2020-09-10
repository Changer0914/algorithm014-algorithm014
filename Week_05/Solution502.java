
public class Solution502 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) >> 2);
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[low] <= nums[middle]) {
                if (nums[low] <= target && target < nums[middle]) {
                    // 向前找
                    high = middle - 1;
                } else {
                    // 向后找
                    low = middle + 1;
                }
            } else {
                if (nums[middle] < target && target <= nums[high]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }

            }
        }
        return -1;
    }

    /**
     * 寻找中间无序的位置即寻找最小值所在位置
     *
     * @param nums
     * @return
     */
    public static int findMinIndex(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + ((high - low) >> 2);
            if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMinIndex(nums));
    }

}
