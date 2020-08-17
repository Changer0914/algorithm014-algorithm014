public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                // 重复工作：算面积，比较取最大值
                int currArea = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }

    // 左右夹逼
    public static int maxArea2(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int width = j - i;
            // i 左指针，向中间移动
            // j 右指针，向中间移动
            int high = height[i] < height[j] ? height[i++] : height[j--];
            int currArea = width * high;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

}
