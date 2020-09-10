## 一、实战

| 题目                                                         | 难度 | 关键字                                                       | 想法                                                         | 第一  | 第二  | 第三  | 四    | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ------------------------------------------------------------ | ------------------------------------------------------------ | ----- | ----- | ----- | ----- | ---- | ---- | ---- |
| [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | 中等 | 队列<br />广度优先搜索                                       | <br />深度优先搜索DFS也是可以写的，深度你是知道的，可以放在深度所在的数组里。 | 0831  | 0831  |       |       |      |      |      |
| [455. 分发饼干](https://leetcode-cn.com/problems/assign-cookies/) | 简单 | 贪心算法<br />每次都将最小的饼干分给胃口最小的孩子，这样可以满足更多的孩子。 | 作业<br />[贪心解法](https://leetcode-cn.com/problems/assign-cookies/solution/tan-xin-jie-fa-by-cyc2018/)<br />while + 双指针 | 0902  | 0902  | 0905  |       |      |      |      |
| [122. 买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 | 贪心算法、回溯、动态规划                                     | 作业<br />典型题。可以用回溯、动态规划、贪心算法。<br />9.10补卡9.9号的 | 0910  | 0910  |       |       |      |      |      |
| [55. 跳跃游戏](https://leetcode-cn.com/problems/jump-game/)  | 中等 |                                                              | 作业<br />看了视频讲解，又看了20分钟题解，终于有点理解了，贪心算法代码量少，而且执行效率很高（每次都选择最优解，不会选择其他次优解）。 | 0902  | 0902  |       |       |      |      |      |
| [45. 跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/) | 困难 |                                                              | 作业                                                         |       |       |       |       |      |      |      |
| [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)    | 简单 | 二分查找法、牛顿迭代法                                       | 直接看题解。<br />二分查找看这篇文章：[写对二分查找不能靠模板，需要理解加练习](https://leetcode-cn.com/problems/search-insert-position/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/) | 0903  | 0903  | 0907  |       |      |      |      |
| [874. 模拟行走机器人](https://leetcode-cn.com/problems/walking-robot-simulation/) | 简单 |                                                              | 作业<br />第二遍，磕磕绊绊下来的，不过理解了，第三遍，我可以写出来。 | 0910  | 0910  |       |       |      |      |      |
| [367. 有效的完全平方数](https://leetcode-cn.com/problems/valid-perfect-square/) | 简单 | 二分查找法                                                   | 同  [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/) <br />哈哈，第一遍很快写出来了 | 0907  |       |       |       |      |      |      |
| [433. 最小基因变化](https://leetcode-cn.com/problems/minimum-genetic-mutation/) | 中等 |                                                              |                                                              |       |       |       |       |      |      |      |
| [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | 中等 | DFS                                                          |                                                              |       |       | 09.01 | 09.10 |      |      |      |
| [515. 在每个树行中找最大值](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/) | 中等 |                                                              |                                                              |       |       |       |       |      |      |      |
| [127. 单词接龙](https://leetcode-cn.com/problems/word-ladder/) | 中等 | 构建图+图的BFS（不是分两步，而是在BFS的过程种构建图）        | 作业<br />树结构 我为啥画不出来？？？ 没分析出是BFS还是DFS，怎么套用模板呢？<br />谁说数据结构是树？能够用BFS做的，也能用DFS去做，是吗?<br />看题解：[广度优先遍历、双向广度优先遍历（Java）](https://leetcode-cn.com/problems/word-ladder/solution/yan-du-you-xian-bian-li-shuang-xiang-yan-du-you-2/),这道题干货真多，多看几遍。<br />第一遍看完后，先把单向的BFS熟练写出来，双向BFS视频讲解还没看。<br />干货1：何时用双向BFS？明确起点和终点的情况下。 |       |       |       |       |      |      |      |
| [126. 单词接龙 II](https://leetcode-cn.com/problems/word-ladder-ii/) | 困难 |                                                              | 作业                                                         |       |       |       |       |      |      |      |
| [200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | 中等 |                                                              | 作业<br />将网格问题讲的非常清楚，收藏了。<br />[岛屿类问题的通用解法、DFS 遍历框架](https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-lei-wen-ti-de-tong-yong-jie-fa-dfs-bian-li-/) | 09.01 | 09.01 |       |       |      |      |      |
| [529. 扫雷游戏](https://leetcode-cn.com/problems/minesweeper/) | 中等 |                                                              | 作业                                                         |       |       |       |       |      |      |      |
| [322. 零钱兑换](https://leetcode-cn.com/problems/coin-change/) | 中等 |                                                              |                                                              |       |       |       |       |      |      |      |
| [860. 柠檬水找零](https://leetcode-cn.com/problems/lemonade-change/) | 简单 | 迭代+记录5和10的张数                                         | 作业<br />怎么没想到在遍历的时候，记录下5和10元的张数呢？这道题很简单的。<br />去国际站上看更简洁的代码 | 09.05 | 09.05 |       |       |      |      |      |
| [33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/) | 中等 | 二分查找+分段考虑                                            | 作业<br />暴力法：找到第一个无序的地方，将其变为升序，然后使用二分查找。<br />第一遍看题解，没完全懂，跌跌撞撞地写出来。<br />[多思路完全攻略，🤷‍♀️必须秒懂！](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/duo-si-lu-wan-quan-gong-lue-bi-xu-miao-dong-by-swe/) | 09.07 | 09.07 | 09.08 |       |      |      |      |
| [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/) | 中等 |                                                              | 作业                                                         |       |       |       |       |      |      |      |
| [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/) | 中等 | 二分查找                                                     | 作业<br />寻找循环数组中的最大值或最小值，可以采用二分法解决。<br />看题解[一文解决 4 道「搜索旋转排序数组」题！](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/solution/yi-wen-jie-jue-4-dao-sou-suo-xuan-zhuan-pai-xu-s-3/) | 09.08 |       |       |       |      |      |      |



## 二、精选代码

> 优秀代码三问：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度

[33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)

```java
public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
        int middle = low + ((high - low) >> 2);
        if (nums[middle] == target) {
            return middle;
        }
        // 分段去看
        if (nums[low] <= nums[middle]) {
            if (nums[low] <= target && target < nums[middle]) {
                // 向前找
                high = middle - 1;
            } else {
                // 向后找
                low = middle + 1;
            }
        } else {
            if (nums[middle] < target && target <= nums[high]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }

        }
    }
    return -1;
}
```

[153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)

```java
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + ((high - low) >> 2);
            // 与高位进行比较，如果与低位进行比较，可以做出来吗？
            if (nums[mid] <= nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[high];
    }
}
```

[874. 模拟行走机器人](https://leetcode-cn.com/problems/walking-robot-simulation/)

```java
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int max = 0;

        // 表示 北一步、东一步、南一步、西一步
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        // 0 朝北 ，向右转 0 + 1 ，向左转 0 + 3
        // 抽象一下，向右转  (dir_index + 1) % 4  向左转   (dir_index + 3) % 4
        int dir_index = 0;

        // 使用Set存障碍物坐标
        Set<String> obstacleSet = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            // 第i个一维数组。一维数组就两个值  0 和 1
            obstacleSet.add(obstacles[i][0] + "," + obstacles[i][1]);
        }

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1) {
                // 右转
                dir_index = (dir_index + 1) % 4;
            } else if (commands[i] == -2) {
                // 左转
                dir_index = (dir_index + 3) % 4;
            } else if (commands[i] >= 1 && commands[i] >= 9) {
                // 走
                // 没走一步，都要判断是否遇到障碍物
                for (int j = 0; j < commands[i]; j++) {
                    int next_x = x + dir[dir_index][0];
                    int next_y = y + dir[dir_index][1];
                    if (isObstacle(obstacleSet, next_x, next_y)) {
                        break;
                    } else {
                        x = next_x;
                        y = next_y;
                        max = Math.max(max, count(x, y));
                    }
                }
            }
        }
        return max;
    }

    // 是否遇到障碍物
    private boolean isObstacle(Set<String> obstacleSet, int next_x, int next_y){
        return obstacleSet.contains(next_x + "," + next_y);
    }

    // 每次走，都算下。 x * x + y * y
    private int count(int x, int y){
        return x * x + y * y;
    }
    
}
```



## 三、作业



## 四、总结

> 1、课堂笔记
> 2、实战心得
> 3、周总结

1、这道题[33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)，这个人的解法[极简 Solution](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/ji-jian-solution-by-lukelee/)真的花了我好长时间（3个多小时），代码是简洁，但可读性真的差，放弃。

还是秒懂这个人的解法 https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/duo-si-lu-wan-quan-gong-lue-bi-xu-miao-dong-by-swe/

追求更优的时间复杂度，不追求简洁，有些人的解法是简洁，但可读性不好，不容易理解，这时去看看其他人的解法。



2、

int dir_index = 0;  // 向右转  (dir_index + 1) % 4  向左转   (dir_index + 3) % 4       取模就是轮回，在环形数组上走。

回溯和分治是一种思想，这种思想在编码上都是用递归实现的。