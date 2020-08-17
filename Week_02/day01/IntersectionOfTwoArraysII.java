package day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    // 使用 map 记录 次数
    public static int[] intersect(int[] nums1, int[] nums2) {
        // 左边的数组 小
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
        }
        int[] newArr = new int[nums1.length];
        int index = 0;
        for (int j : nums2) {
            int count = map.getOrDefault(j, 0);
            if (count > 0) {
                // 找到了
                newArr[index++] = j;
                count--;
                map.put(j, count > 0 ? count : 0);
            }
        }
        // 截取数组。 否则会将0输出
        return Arrays.copyOfRange(newArr, 0, index);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] newArr = intersect(nums1, nums2);
        System.out.println(Arrays.toString(newArr));
    }

}
