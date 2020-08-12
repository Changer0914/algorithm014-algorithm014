package second;

import java.util.Arrays;

public class MoveZero {

    public static void moveZero(int[] arr) {
        int nonZeroNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroNum] = arr[i];
                nonZeroNum += 1;
            }
        }
        for (int i = nonZeroNum; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            // 当前元素!=0，就把其交换到左边，i++ j++
            // 当前元素==0，i++ j不变
            if (arr[i] != 0) {
                // 交换
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 0, 1, 0  };
        moveZero2(arr);
    }

}
