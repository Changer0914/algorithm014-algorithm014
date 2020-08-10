import java.util.Arrays;

public class MoveZero {

    public static void moveZero(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }
        // j 记录非0的个数
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZero2(int[] nums) {
        int nonZeroNum = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroNum++] = num;
            }
        }
        while (nonZeroNum < nums.length) {
            nums[nonZeroNum++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZero2(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("==========");
        int i = 1;
        System.out.println(++i);
        System.out.println(i);
        System.out.println("==========");
        int j = 1;
        System.out.println(j++);
        System.out.println(j);
    }

}
