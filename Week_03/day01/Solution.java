package day01;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }
    private static void generate(int leftNum, int rightNum, int maxNum, String s, List<String> res) {
        // terminator
        if (leftNum == maxNum && rightNum == maxNum) {
            res.add(s);
            return;
        }
        // process current logic

        // drill down
        if (leftNum < maxNum)
            generate(leftNum + 1, rightNum, maxNum, s + '(', res);
        if (leftNum > rightNum && rightNum < maxNum)
            generate(leftNum, rightNum + 1, maxNum, s + ')', res);

        // restore current status
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
