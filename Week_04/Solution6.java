import java.util.Arrays;

public class Solution6 {

    /**
     * 860. 柠檬水找零
     *
     * 暴力法：遍历+记录5和10的个数
     *
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveNum++;
            } else if (bill == 10) {
                // 需要找5
                if (fiveNum < 1) {
                    // 没有一张5元
                    return false;
                }
                fiveNum--;
                tenNum++;
            } else {
                // 20元
                if (fiveNum > 0 && tenNum > 0) {
                    fiveNum--;
                    tenNum--;
                } else if (fiveNum > 2) {
                    fiveNum -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean lemonadeChange2(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        for (int bill : bills) {
           if (bill == 5) {
               fiveNum++;
           } else if (bill == 10) {
               tenNum++;
               fiveNum--;
           } else {
               if (tenNum > 0) {
                   tenNum--;
                   fiveNum--;
               } else {
                   fiveNum -= 3;
               }
           }
           if (fiveNum < 0) {
               return false;
           }
        }
        return true;
    }

    /**
     * 455. 分发饼干
     *     贪心：每次都用最小的饼干去满足贪心值最小的孩子
     *
     * 输入: [1,2,3], [1,1]
     *
     * 输出: 1
     *
     * 解释:
     * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
     * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
     * 所以你应该输出1。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/assign-cookies
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        // 孩子指针
        int child = 0;
        // 饼干指针
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }

}
