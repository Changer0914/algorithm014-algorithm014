package day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     *
     *  
     * 示例:
     *
     * 输入: n = 10
     * 输出: 12
     * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
     * 说明:  
     *
     * 1 是丑数。
     * n 不超过1690。
     * 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/chou-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        // 用一个数组记录所有的丑数
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            // 找出最小的那个
            dp[i] = Math.min(Math.min(n2, n3), n5);
            // 如果相等的话，向前移动
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;
        }
        return dp[n-1];
    }

    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     *
     * 示例 1:
     *
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     *
     * 输入: s = "rat", t = "car"
     * 输出: false
     * 说明:
     * 你可以假设字符串只包含小写字母。
     *
     * 进阶:
     * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
     *
     *  切题四件套。
     *      1、什么是 字母异位词
     *           两个单词包含相同的字母，但是次序不同
     *      2、解法
     *        1）排序， 比对
     *        2）使用hash 记录每个字母出现的次数
     *
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            Integer count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }
        for (Character c : t.toCharArray()) {
            boolean existKey = map.containsKey(c);
            if (!existKey) return false;
            Integer count = map.get(c);
            if (count == 1) map.remove(c);
            else map.put(c, --count);
        }
        return map.size() == 0;
    }

    public static boolean isAnagram2(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        return String.valueOf(ss).equalsIgnoreCase(String.valueOf(tt));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

}
