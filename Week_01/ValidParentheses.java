import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class ValidParentheses {

    // {}  []  ()
    public static boolean isValid(String s) {
        // 维护一个字典
        Map<Character, Character> dicMap = new HashMap<>();
        dicMap.put('{', '}');
        dicMap.put('[', ']');
        dicMap.put('(', ')');
        dicMap.put('?', '?');
        if (s.length() > 0 && !dicMap.containsKey(s.charAt(0))) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        for (char c : s.toCharArray()) {
            // 如何判断是左括号还是右括号
            if (dicMap.containsKey(c)) {
                // 左括号 入栈
                stack.push(c);
            } else {
                // c 是右括号  ， 看与栈顶元素 是否匹配
                // 为了防止 stack.pop() 报 EmptyStackException ， 所以 栈中加上 ? 辅助
                if (c != dicMap.get(stack.pop())) return false;
            }
        }
        return stack.size() == 1;
    }

    public static boolean isValid2(String s) {
      Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

      return stack.isEmpty();
    }

    public static void main(String[] args) {
        // System.out.println(isValid2("([]{})"));
        System.out.println(isValid2("]"));
    }

}
