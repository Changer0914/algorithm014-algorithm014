public class Solution4 {

    /**
     * 默认二分查找
     *
     * @param array
     * @param target
     * @return
     */
    public int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (high - low) / 2 + low;
            if (target == array[middle]) {
                return middle;
            }
            if (target > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    // y = x^2
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int low = 1;
        int high = x;
        while (low <= high) {
            int middle = (high - low) / 2 + low;
            if (middle * middle > x) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return high;
    }

    /**
     * 69. x 的平方根
     *
     *
     * @param y
     * @return
     */
    public int mySqrt2(int y) {
        long x = y;
        while (x * x > y) {
            // 减少x的值
            // x = (x + x) / 2;
            x = (x + y / x) / 2;
        }
        return (int)x;
    }

}
