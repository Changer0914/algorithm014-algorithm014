## 一、实战

| 题目                                                         | 难度 | 关键字                                                       | 想法                                                         | 第一  | 第二  | 第三  | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ | ----- | ----- | ----- | ---- | ---- | ---- | ---- |
| [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | 中等 | 队列<br />广度优先搜索                                       | <br />深度优先搜索DFS也是可以写的，深度你是知道的，可以放在深度所在的数组里。 | 0831  | 0831  |       |      |      |      |      |
| [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | 简单 | 贪心算法<br />每次都将最小的饼干分给胃口最小的孩子，这样可以满足更多的孩子。 | 作业<br />[贪心解法](https://leetcode-cn.com/problems/assign-cookies/solution/tan-xin-jie-fa-by-cyc2018/)<br />while + 双指针 | 0902  | 0902  | 0905  |      |      |      |      |
| [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)  | 中等 |                                                              | 作业<br />看了视频讲解，又看了20分钟题解，终于有点理解了，贪心算法代码量少，而且执行效率很高（每次都选择最优解，不会选择其他次优解）。 | 0902  | 0902  |       |      |      |      |      |
| [45. 跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/) | 困难 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)    | 简单 | 二分查找法、牛顿迭代法                                       | 直接看题解。<br />二分查找看这篇文章：[写对二分查找不能靠模板，需要理解加练习](https://leetcode-cn.com/problems/search-insert-position/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/) | 0903  | 0903  |       |      |      |      |      |
| [874. 模拟行走机器人](https://leetcode-cn.com/problems/walking-robot-simulation/) | 简单 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [367. 有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/) | 简单 |                                                              |                                                              |       |       |       |      |      |      |      |
| [433. 最小基因变化](https://leetcode-cn.com/problems/minimum-genetic-mutation/) | 中等 |                                                              |                                                              |       |       |       |      |      |      |      |
| [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | 中等 | DFS                                                          |                                                              |       |       | 09.01 |      |      |      |      |
| [515. 在每个树行中找最大值](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/) | 中等 |                                                              |                                                              |       |       |       |      |      |      |      |
| [127. 单词接龙](https://leetcode-cn.com/problems/word-ladder/) | 中等 | 构建图+图的BFS（不是分两步，而是在BFS的过程种构建图）        | 作业<br />树结构 我为啥画不出来？？？ 没分析出是BFS还是DFS，怎么套用模板呢？<br />谁说数据结构是树？能够用BFS做的，也能用DFS去做，是吗?<br />看题解：[广度优先遍历、双向广度优先遍历（Java）](https://leetcode-cn.com/problems/word-ladder/solution/yan-du-you-xian-bian-li-shuang-xiang-yan-du-you-2/),这道题干货真多，多看几遍。<br />第一遍看完后，先把单向的BFS熟练写出来，双向BFS视频讲解还没看。<br />干货1：何时用双向BFS？明确起点和终点的情况下。 |       |       |       |      |      |      |      |
| [126. 单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/) | 困难 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | 中等 |                                                              | 作业<br />将网格问题讲的非常清楚，收藏了。<br />[岛屿类问题的通用解法、DFS 遍历框架](https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-lei-wen-ti-de-tong-yong-jie-fa-dfs-bian-li-/) | 09.01 | 09.01 |       |      |      |      |      |
| [529. 扫雷游戏](https://leetcode-cn.com/problems/minesweeper/) | 中等 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/) | 中等 |                                                              |                                                              |       |       |       |      |      |      |      |
| [860. 柠檬水找零](https://leetcode-cn.com/problems/lemonade-change/) | 简单 | 迭代+记录5和10的张数                                         | 作业<br />怎么没想到在遍历的时候，记录下5和10元的张数呢？这道题很简单的。<br />去国际站上看更简洁的代码 | 09.05 | 09.05 |       |      |      |      |      |
| [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | 中等 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/) | 中等 |                                                              | 作业                                                         |       |       |       |      |      |      |      |
| [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | 中等 |                                                              | 作业                                                         |       |       |       |      |      |      |      |



## 二、精选代码

> 优秀代码三问：
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

[69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)

```java
// 二分查找法
public int mySqrt(int y) {
    if (y == 0 || y == 1) {
        return y;
    }
    long low = 1;
    long high = y;
    while (low <= high) {
        long middle = (high - low) / 2 + low;
        if (middle * middle > y) {
            high = middle - 1;
        } else {
            low = middle + 1;
        }
    }
    return (int)high;
}
// 牛顿迭代法
public int mySqrt(int y) {
    long x = y;
    while (x * x > y) {
        // 减少x的值   x = (x + x) / 2;
        x = (x + y / x) / 2;
    }
    return (int)x;
}
```

[127. 单词接龙](https://leetcode-cn.com/problems/word-ladder/)

![](/127单词接龙.png)

```java
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    // 第 1 步：先将 wordList 放到哈希表里，便于判断某个单词是否在 wordList 里
    Set<String> wordHash = new HashSet<>(wordList);
    if (!wordHash.contains(endWord)) {
        return 0;
    }
    wordHash.remove(beginWord);

    // 第 2 步：图的广度优先遍历，必须使用队列 和  表示是否访问过的 visited 哈希表
    Queue<String> queue = new LinkedList<>();
    queue.offer(beginWord);
    Set<String> visitedHash = new HashSet<>();
    visitedHash.add(beginWord);

    // 初始化的时候步数为 1
    int step = 1;
    int wordLen = beginWord.length();
    while (!queue.isEmpty()) {
        int queueSize = queue.size();
        // 广度优先遍历，当前层
        for (int i = 0; i < queueSize; i++) {
            // 出队：当前层元素出队后，需要将下层元素都入队。
            // 可以看到 第一轮结束后， hit 出队， hot 入队了。
            String word = queue.poll();
            char[] charArray = word.toCharArray();
            // 修改单词里的每一个字符
            // 比如 hit  先变换第一位，h从a->z走完后，再 i 从a->z 。 所以变换后需要恢复。。。
            for (int j = 0; j < wordLen; j++) {
                char originChar = charArray[j];
                for (char c = 'a'; c <= 'z'; c++) {
                    // 跳过原始的
                    if (c == originChar) continue;
                    // 变换后的单词
                    charArray[j] = c;
                    String changeWord = new String(charArray);
                    if (wordHash.contains(changeWord)) {
                        if (changeWord.equals(endWord)) {
                            return step + 1;
                        }
                        if (!visitedHash.contains(changeWord)) {
                            // 没访问过，入队
                            queue.offer(changeWord);
                            // 并且标记为 已访问
                            visitedHash.add(changeWord);
                        }
                    }
                }
                // 变换后需要恢复
                charArray[j] = originChar;
            }
        }
        // 当前层结束后，步数 + 1
        step++;
    }
    return 0;
}
```



## 三、作业

### 1、使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

说明：同学们可以将自己的思路、代码写在第 4 周的学习总结中。

二分查找的应用场景：有序的数组、数据量不太大、数据量不太小、处理静态数据（也就是没有频繁地插入或删除操作）

二分查找思想容易理解，但是要写好，是比较难的，要多练习。

这道题同 [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)  一样。

```java
// 寻找中间无序的位置即寻找最小值所在位置
public int findMinIndex(int[] nums) {
    int low = 0, high = nums.length - 1, mid;
    while (low < high) {
        mid = low + ((high - low) >> 2);
        if (nums[mid] <= nums[high]) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    // 返回 low 和 high 都可以
    return high;
}
```

### 2、[22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) ，使用BFS完成





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

**迭代写法**

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
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
        // 计算中间值
        int mid = (right - left) / 2 + left;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            // 目标值在mid左边
            right = mid - 1;
        } else {
			// 目标值在mid右边
            left = mid + 1;
        }
    }
    return -1;
}
```

使用二分查找的三个条件： 但是[33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)不满足有序，还是强行用了。

- 有序性（单调递增或递减）
- 存在上下界
- 数组（可以通过索引访问）

二分查找看这篇文章：https://leetcode-cn.com/problems/search-insert-position/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/

### 4、二分查找的几个变形

```java
// 二分查找：有序数组、无重复
// 找到与目标值相同的元素下标
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]      target = 8
public int getIndex(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 1);
        if (arr[middle] < target) {
            low = middle + 1;
        } else if (arr[middle] > target) {
            high = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}

// 变形一：二分查找   有序数组、但有重复
// 找到与目标值相同的 第一个元素的下标
// [0, 1, 2, 3, 4, 5, 8, 8, 8, 9]      target = 8
public int getIndex2(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 1);
        if (arr[middle] < target) {
            low = middle + 1;
        } else if (arr[middle] > target) {
            high = middle - 1;
        } else {
            // 找到相同的了，但这不是第一个相同的，如何确定它就是第一个相同的？
            if (middle == 0 || arr[middle - 1] != target) return middle;
            high = middle - 1;
        }
    }
    return -1;
}

// 变形二：二分查找   有序数组、但有重复
// 找到与目标值相同的 最后一个元素的下标
public int getIndex3(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 1);
        if (arr[middle] < target) {
            low = middle + 1;
        } else if (arr[middle] > target) {
            high = middle - 1;
        } else {
            // 找到相同的了，但这不是第一个相同的，如何确定它就是第一个相同的？
            if (middle == arr.length - 1 || arr[middle + 1] != target) return middle;
            low = middle + 1;
        }
    }
    return -1;
}

// 变体三：查找第一个大于等于给定值的元素
// [3，4，6，7，10]    5   答案是6
public int getIndex4(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 1);
        if (arr[middle] >= target) {
            // 如何确定是第一个？ 是第一个元素 或者 前一个元素 小于 target
            if (middle == 0 || arr[middle - 1] < target) return middle;
            high = middle - 1;
        } else {
            low = middle + 1;
        }
    }
    return -1;
}

// 变形四：查找最后一个小于等于给定值的元素
// [3，5，6，8，9，10]    7     答案是 6
public int getIndex5(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 1);
        if (arr[middle] <= target) {
            // 如何确定是最后一个
            if (middle == arr.length - 1 || arr[middle + 1] > target) return middle;
            low = middle + 1;
        } else {
            high = middle - 1;
        }
    }
    return -1;
}
```


### 5、【笔记】贪心的实现、特性及实战题目解析

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，**不能回退**。

动态规划则**会保存以前的运算结果**，并根据以前的结果对当前进行选择，**有回退功能。**

如何判断这道题可用贪心算法求解？

从前往后贪、从后往前贪、需要转化下才能贪、从局部开始贪。

### 6、总结

本周懈怠了，未按照五毒神掌进行刷题。

还是惧怕，在做[127. 单词接龙](https://leetcode-cn.com/problems/word-ladder/)时从做题、看题解、自己写出来，用时2小时。

现在想来，本周应该做到每天4道题，保证每种算法都练习一次。

第五周赶紧调整过来，工作忙的话，至少保证每天3道题。

这周没学新的数据结构，数据结构前两周就学完了，后面都是算法学习。

DFS和BFS：[31 | 深度和广度优先搜索：如何找出社交网络中的三度好友关系？](https://time.geekbang.org/column/article/70891)

贪心算法：[37 | 贪心算法：如何用贪心算法实现Huffman压缩编码？](https://time.geekbang.org/column/article/73188)

二分查找：[15 | 二分查找（上）：如何用最省内存的方式实现快速查找功能？](https://time.geekbang.org/column/article/42520)  [16 | 二分查找（下）：如何快速定位IP对应的省份地址？](https://time.geekbang.org/column/article/42733)