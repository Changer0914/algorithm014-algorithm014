package day06;

public class Solution6 {

    /**
     * 分治
     *
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? fastPow(x, N) : 1.0 / fastPow(x, -N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        // 子问题
        double subResult = fastPow(x, n / 2);
        if (n % 2 == 1) {
            // 奇数
            // 合并
            return subResult * subResult * x;
        }
        return subResult * subResult;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 3));
        System.out.println(Math.pow(2, -3));
    }

}
