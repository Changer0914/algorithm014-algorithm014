public class ClimbStair {

    // 这个时间复杂度是多少？  o(2的n次方)
    public static long climbStair(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStair(n - 1) + climbStair(n - 2);
    }

    // 这个时间复杂度是多少？  o(n)
    // 空间复杂度为  o(n)
    public static long climbStair2(int n) {
        // 将阶数用数组存下来，为何设置为 n+1 。如果从0开始，数组大小为n，那么下标最大为n-1，如果下标为n，数组大小就为 n+1
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // 时间 o(n)  空间 o(1)
    public static long climbStair3(int n) {
        long first = 0;
        long second = 0;
        long third = 1;
        for (int i = 1; i <= n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(climbStair2(5));
    }

}
