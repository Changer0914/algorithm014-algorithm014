## 一、实战

| 题目                                                         | 难度 | 关键字                 | 想法                                                         | 第一  | 第二  | 第三  | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ---------------------- | ------------------------------------------------------------ | ----- | ----- | ----- | ---- | ---- | ---- | ---- |
| [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | 中等 | 队列<br />广度优先搜索 | <br />深度优先搜索DFS也是可以写的，深度你是知道的，可以放在深度所在的数组里。 | 0831  | 0831  |       |      |      |      |      |
| [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | 简单 |                        | 作业<br />https://leetcode-cn.com/problems/assign-cookies/solution/tan-xin-jie-fa-by-cyc2018/ | 0902  | 0902  |       |      |      |      |      |
| [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)  | 中等 |                        | 作业<br />看了视频讲解，又看了20分钟题解，终于有点理解了，贪心算法代码量少，而且执行效率很高（每次都选择最优解，不会选择其他次优解）。 | 0902  | 0902  |       |      |      |      |      |
| [45. 跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/) | 困难 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)    | 简单 |                        |                                                              |       |       |       |      |      |      |      |
| [874. 模拟行走机器人](https://leetcode-cn.com/problems/walking-robot-simulation/) | 简单 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [367. 有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/) | 简单 |                        |                                                              |       |       |       |      |      |      |      |
| [433. 最小基因变化](https://leetcode-cn.com/problems/minimum-genetic-mutation/) | 中等 |                        |                                                              |       |       |       |      |      |      |      |
| [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | 中等 | DFS                    |                                                              |       |       | 09.01 |      |      |      |      |
| [515. 在每个树行中找最大值](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/) | 中等 |                        |                                                              |       |       |       |      |      |      |      |
| [127. 单词接龙](https://leetcode-cn.com/problems/word-ladder/) | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [126. 单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/) | 困难 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | 中等 |                        | 作业<br />将网格问题讲的非常清楚，收藏了。<br />[岛屿类问题的通用解法、DFS 遍历框架](https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-lei-wen-ti-de-tong-yong-jie-fa-dfs-bian-li-/) | 09.01 | 09.01 |       |      |      |      |      |
| [529. 扫雷游戏](https://leetcode-cn.com/problems/minesweeper/) | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/) | 中等 |                        |                                                              |       |       |       |      |      |      |      |
| [860. 柠檬水找零](https://leetcode-cn.com/problems/lemonade-change/) | 简单 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/) | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |



## 二、精选代码

> 优秀代码三问法：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度

[200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/)

```java
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    // 可以和count++调整顺序吗？可以
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j) {
        // 不在网格里
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return;
        }
        // 不是1 ， 是 0 或 2
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2'; // 标记为已遍历过的陆地
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
```

[55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)

```java
public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0) {
        return false;
    }
    // pos表示需要到达的位置
    int pos = nums.length - 1;
    // 从倒数第二个位置开始
    for (int i = nums.length - 2; i >= 0; i--) {
        // i + nums[i] 表示 能够到达的最远距离
        if (i + nums[i] >= pos) {
            // 逐步向前移动
            pos = i;
        }
    }
    return pos == 0;
}
```

[455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/)

```java
public int findContentChildren(int[] g, int[] s) {
    if (g == null || s == null || g.length == 0 || s.length == 0) {
        return 0;
    }
    // 排序
    Arrays.sort(g);
    Arrays.sort(s);
    int child = 0;
    int cookie = 0;
    while (child < g.length && cookie < s.length) {
        // 每次都将小饼干分配给贪心小的孩子，满足的话，孩子数加一
        if (g[child] <= s[cookie]) {
            child++;
        }
        // 无论满足，还是不满足，cookie都需要加一
        // 如果小的饼干满足不了贪心指数小的小朋友，就放弃这个小的饼干。
        cookie++;
    }
    return child;
}
```



## 三、作业

1、使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

说明：同学们可以将自己的思路、代码写在第 4 周的学习总结中

2、[22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) ，使用BFS完成。



## 四、总结

> 1、课堂笔记
> 2、实战心得
> 3、周总结

### 1、深度优先搜索DFS

<img src="..\doc\DFS.BFS.png" style="zoom:75%;" />

**递归写法**

```java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    travel(root, 0, allResults);
    return allResults;
}

private void travel(TreeNode root, int level, List<List<Integer>> results){
    if (results.size() == level) {
        results.add(new ArrayList<>());
    }
    results.get(level).add(root.val);
    if (root.left != null) {
        travel(root.left, level + 1, results);
    }
    if (root.right != null) {
        travel(root.right, level + 1, results);
    }
}
```

迭代写法

```c++
void dfs(Node* root) {
  map<int, int> visited;
  if (!root) return;
  // 栈
  stack<Node*> stackNode;
  stackNode.push(root);

  while (!stackNode.empty()) {
    Node* node = stackNode.top();
    stackNode.pop();
    // 访问过，继续下一个循环
    if (visited.count(node->val)) continue;
    // 没访问过，放到visited中
    visited[node->val] = 1;
    // 从右往左依次放入栈中
    for (int i = node->children.size() - 1; i >= 0; --i) {
        stackNode.push(node->children[i]);
    }
  }
  return;
}
```

### 2、广度优先搜索BFS

二叉树的层序遍历

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        // 队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        // 从队尾进
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            // 循环，是为了取出这一层的数据
            for (int i = 0; i < size; i++) {
                // 从队头出
                TreeNode treeNode = queue.removeFirst();
                levelList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.addLast(treeNode.right);
                }
            }
            res.add(levelList);
        }
        return res;
    }
}
```

### 3、二分查找代码模板

```java
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}
```

4、【笔记】贪心的实现、特性及实战题目解析

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，**不能回退**。

动态规划则**会保存以前的运算结果**，并根据以前的结果对当前进行选择，**有回退功能。**

如何判断这道题可用贪心算法求解？

从前往后贪、从后往前贪、需要转化下才能贪、从局部开始贪。