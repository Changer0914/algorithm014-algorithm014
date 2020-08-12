package second;

public class ClimbStairs {

    // 分析：n阶 ， 最后一步不是走 2步， 就是走 1步， 所以 f(n) = f(n-1) + f(n-1)
    // 利用动态规划，自底向上
    public static long climbStairs(int n){
        // 定义数组，存放每阶数
        // 第一个 存 0 阶
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // 压缩空间，只关心 n-1阶 和 n-2阶 ，用3个数字存放。
    //  0   1     2
    // n-2  n-1   n
    // 往前移
    public static long climbStairs2(int n){
        if(n == 1 || n == 2){
            return n;
        }
        long[] arr = new long[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 3; i < n; i++) {
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] =  arr[0] + arr[1];
        }
        return arr[2];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(9));
    }

}
