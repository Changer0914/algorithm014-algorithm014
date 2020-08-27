## 一、实战

- 看到一道题，想到切题四件套，想到五毒神掌。
- 自顶向下编程。
- 最大的误区：题只做一遍，追求一遍理解。
- 懵逼时怎么办？暴力求解，找最近重复子问题。
- 优化的思想：用空间换时间，升维法（一维升二维）。

| 题目                                                         | 难度 | 关键字                                                       | 想法                                                         | 第一 | 第二 | 第三 | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | 中等 | 递归                                                         | 记住递归模板                                                 | 0824 | 0825 |      |      |      |      |      |
| [70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/) | 简单 | [ 斐波那契数列](https://zh.wikipedia.org/zh-hans/斐波那契数列)<br />递归、动态规划 | 题解：[从递归到动态规划](https://leetcode-cn.com/problems/climbing-stairs/solution/cong-zhi-jue-si-wei-fen-xi-dong-tai-gui-hua-si-lu-/)<br />1、使用递归，提交超时。<br />可引入map优化下。<br />2、使用普通的动态规划，空间O(n)<br />加滚动数组优化下。<br /> |      |      | 0825 |      |      |      |      |
| [226. 翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/) | 简单 |                                                              |                                                              |      |      |      |      |      |      |      |
| [98. 验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/) | 中等 |                                                              |                                                              |      |      |      |      |      |      |      |
| [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | 简单 |                                                              |                                                              |      |      |      |      |      |      |      |
| [111. 二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) | 简单 |                                                              |                                                              |      |      |      |      |      |      |      |
| [297. 二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/) | 困难 |                                                              |                                                              |      |      |      |      |      |      |      |
| [236. 二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/) | 中等 |                                                              | **作业**                                                     |      |      |      |      |      |      |      |
| [105. 从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 中等 |                                                              | 作业                                                         |      |      |      |      |      |      |      |
| [77. 组合](https://leetcode-cn.com/problems/combinations/)   | 中等 |                                                              | **作业**                                                     |      |      |      |      |      |      |      |
| [46. 全排列](https://leetcode-cn.com/problems/permutations/) | 中等 |                                                              | 作业                                                         |      |      |      |      |      |      |      |
| [47. 全排列 II](https://leetcode-cn.com/problems/permutations-ii/) | 中等 |                                                              | 作业                                                         |      |      |      |      |      |      |      |
| [50. Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)    | 中等 |                                                              |                                                              |      |      |      |      |      |      |      |
| [78. 子集](https://leetcode-cn.com/problems/subsets/)        | 中等 |                                                              |                                                              |      |      |      |      |      |      |      |
| [169. 多数元素](https://leetcode-cn.com/problems/majority-element/) | 简单 |                                                              |                                                              |      |      |      |      |      |      |      |
| [17. 电话号码的字母组合](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/) | 中等 |                                                              |                                                              |      |      |      |      |      |      |      |
| [51. N皇后](https://leetcode-cn.com/problems/n-queens/)      | 困难 |                                                              |                                                              |      |      |      |      |      |      |      |
| [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | 中等 |                                                              |                                                              | 0822 | 0822 | 0826 |      |      |      |      |
| [剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/) | 简单 | 链表的反转                                                   | 简单，可以快速写出来，用list、stack都可以，不过这种方式没超过50%，看题解，有个递归的写法，学习下。<br />解法二：链表的反转，然后遍历输出<br />解法三：遍历链表，将值从数组尾部不断加入 | 0824 | 0824 |      |      |      |      |      |
| [429. N叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | 中等 |                                                              | 第一遍：背诵递归代码<br />第二遍：默写递归代码<br />         | 0826 | 0826 |      |      |      |      |      |



## 二、精选代码

> 优秀代码三问法：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度



## 三、作业

[22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/)

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }
    private void generate(int leftNum, int rightNum, int maxNum, String s, List<String> res) {
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
}
```

[70. 爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)

```java
// 递归 。 引入 map 解决重复计算问题
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
       if (n == 1 || n == 2) {
           return n;
       }
       if (map.containsKey(n)) {
           return map.get(n);
       }
       int steps = climbStairs(n-1) + climbStairs(n-2);
       map.put(n, steps);
       return steps;
    }
}

// 动态规划 O(n)
public int climbStairs(int n) {
     if (n == 1 || n == 2) {
         return n;
     }
     int[] dp = new int[n];
     dp[0] = 1;
     dp[1] = 2;
     for (int i = 2; i < n; i++) {
         dp[i] = dp[i-1] + dp[i-2];
     }
     return dp[n-1];
 }

// 动态规划 O(1)
public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
}
```

[剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public int[] reversePrint(ListNode head) {
        int length = getListNodeLength(head);
        int[] arr = new int[length];
        while (head != null) {
            arr[length-- - 1] = head.val;
            head = head.next;
        }
        return arr;
    }
    
    /**
     * 获取链表的长度
     *
     * @return
     */
    public int getListNodeLength(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    /**
     * 链表反转
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 终止条件
        if (head == null || head.next == null) {
            return head;
        }
        // 下探到 下一层
        ListNode newNode = reverseList(head.next);
        // 交换
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    
}
```



## 四、总结

> 1、课堂笔记
> 2、实战心得
> 3、周总结

### 1、递归

思维：不要人肉递归、找最近重复子问题、数学归纳法

```java
// Java 模板
public void recur(int level, int param) { 
  // terminator 终止条件 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param);
  
  // drill down 下探到下一层
  recur( level: level + 1, newParam);
  
  // restore current status 
}
```

### 2、分治

```java
private static int divide_conquer(Problem problem, int params) {
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```

### 666、周总结

这周没有学习新的数据结构，学的都是算法。