package day01;

public class MoveZero {

    public static void moveZero(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }
        int nonZeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroNum++] = nums[i];
            }
        }
        for (int i = nonZeroNum; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // 如果数组中的第一个元素为0，这种接法好理解
    public static void moveZero2(int[] nums){
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }

    public static void main(String[] args) {

    }

}
