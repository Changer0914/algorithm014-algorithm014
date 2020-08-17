package day01;

public class ContainerWithMostWater {

    // 重复：算 高、宽 ，求面积
    public static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int w = j - i;
            int h = height[i] < height[j] ? height[i++] : height[j--];
            area = Math.max(area, w * h);
        }
        return area;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

}
