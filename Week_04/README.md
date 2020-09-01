## 一、实战

| 题目                                                         | 难度 | 关键字                 | 想法                                                         | 第一  | 第二  | 第三  | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ---------------------- | ------------------------------------------------------------ | ----- | ----- | ----- | ---- | ---- | ---- | ---- |
| [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | 中等 | 队列<br />广度优先搜索 | <br />深度优先搜索DFS也是可以写的，深度你是知道的，可以放在深度所在的数组里。 | 0831  | 0831  |       |      |      |      |      |
| [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | 简单 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 |                        | 作业                                                         |       |       |       |      |      |      |      |
| [55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)  | 中等 |                        | 作业                                                         |       |       |       |      |      |      |      |
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

