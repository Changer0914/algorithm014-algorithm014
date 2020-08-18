package day02;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 1021. 删除最外层的括号
     *
     * 输入："(()())(())"
     * 输出："()()()"
     * 解释：
     * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
     * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param str
     * @return
     */
    public static String removeOuterParentheses(String str) {
        // 遍历，记录左括号和右括号的个数。如果左括号个数和右括号个数相同，输出它，并去掉外层括号
        List<String> list = new ArrayList<>();
        StringBuilder newStr = new StringBuilder();
        int leftNum = 0, rightNum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            newStr.append(c);
            if (c == '(') {
                leftNum++;
            } else if (c == ')') {
                rightNum++;
            }
            if(leftNum == rightNum){
                list.add(newStr.toString());
                newStr = new StringBuilder();
                leftNum = 0;
                rightNum = 0;
            }
        }
        newStr = new StringBuilder();
        for (String s : list) {
            if (s.length() > 0) {
                String substring = s.substring(1, s.length() - 1);
                newStr.append(substring);
            }
        }
        return newStr.toString();
    }

    // 输入："(()())(())"
    public static String removeOuterParentheses2(String str) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : str.toCharArray()) {
            if (c == ')') --level;
            if (level >= 1) sb.append(c);
            if (c == '(') ++level;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses2("(()())(())"));
    }

}
