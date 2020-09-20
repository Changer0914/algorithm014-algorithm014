## 一、实战

| 题目                                                         | 难度 | 关键字               | 想法                                                         | 第一  | 第二  | 第三  | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | -------------------- | ------------------------------------------------------------ | ----- | ----- | ----- | ---- | ---- | ---- | ---- |
| [1143. 最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/) | 中等 |                      |                                                              |       |       |       |      |      |      |      |
| [120. 三角形最小路径和](https://leetcode-cn.com/problems/triangle/) | 中等 |                      |                                                              |       |       |       |      |      |      |      |
| [53. 最大子序和](https://leetcode-cn.com/problems/maximum-subarray/) | 简单 |                      |                                                              |       |       |       |      |      |      |      |
| [198. 打家劫舍](https://leetcode-cn.com/problems/house-robber/) | 简单 |                      | 看老师如何一步一步演进的<br />解法一<br />解法二：二维数组变一维<br />解法三：不需要状态数组了 | 0920  | 0920  |       |      |      |      |      |
| [64. 最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/) | 中等 |                      | 递推公式写出来了，但这个题没做出来，着急了。                 | 0911  |       |       |      |      |      |      |
| [200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/) | 中等 | DFS模板、BFS、并查集 | 隔了11天，再次写，忘了，这次，做了个图片记录下。<br />再看下BFS和并查集。 | 09.01 | 09.01 | 09.12 |      |      |      |      |
| [695. 岛屿的最大面积](https://leetcode-cn.com/problems/max-area-of-island/) | 中等 | DFS模板、BFS、并查集 | 第一遍，做出来了，好吧，之前看过题解。                       | 09.12 |       |       |      |      |      |      |
| [45. 跳跃游戏 II](https://leetcode-cn.com/problems/jump-game-ii/) | 困难 |                      | 妈蛋，第二遍理解，又花了我1个多小时。<br />怎么就是理解不了。 |       |       |       |      |      |      |      |
| [62. 不同路径](https://leetcode-cn.com/problems/unique-paths/) | 中等 |                      |                                                              | 09.16 | 09.16 |       |      |      |      |      |
|                                                              |      |                      |                                                              |       |       |       |      |      |      |      |



## 二、精选代码

> 优秀代码三问：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度

[64. 最小路径和](https://leetcode-cn.com/problems/minimum-path-sum/)

```java
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m < 1) {
            return 0;
        }
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 双层循环、这几个条件 没想到
                if (i == 0 && j == 0) continue;
                if (i == 0) grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if (j == 0) grid[i][j] = grid[i - 1][j] + grid[i][j];
                // 递推公式想到了
                else grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[m-1][n-1];
    }
}
```



## 三、作业



## 四、总结

> 1、课堂笔记
> 2、实战心得
> 3、周总结

1、课堂笔记

一般动态规划会让你求一个**最优解**（求最大值或者最少的方式）

正因为有最优子结构，所以不需要把每一步的所有状态保存下来，

只需要保存最优的状态。

引入两个：

1）缓存、状态的存储数组

2） 淘汰次优解，只保留最优解

记在脑子里：

动态规划和递归或者分治没有根本上的区别，关键在于看动态规划有无最优的子结构。

共性：找到重复子问题

差异性：最优子结构（DP方程），中途可以淘汰次优解

![](../doc/dp.png)

对于初学者或面试者，第2步比较难，学会定义状态。

对于难的动态规划，第3步的递推公式比较难找。



2、将所有解题思路放在一张图片上，今天开始做了，明天再多放几个，哈哈， 有趣。

![](..\doc\gird.png)

