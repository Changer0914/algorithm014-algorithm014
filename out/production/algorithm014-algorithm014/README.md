

周日  早9:00 - 9:45  
<br>
入学考试：https://time.geekbang.org/quiz/intro?act_id=198&exam_id=527


## 一、知识点

```java
数组
    {2, 9, 1, 8, 4, 5}
    添加或删除时，需要移动元素，时间复杂度 o(n)
    开头 的添加或删除
    末尾 的添加或删除
    查询时，时间复杂度为 o(1) ，为什么？ 说的是 根据值查找的复杂度 还是 根据下标查找的复杂度 ？
        正确的表述：数组支持随机访问，根据下标随机访问的时间复杂度为 o(1)
    空间复杂度
    ArrayList
链表
    {2, 9, 1, 8, 4, 5}
    添加或删除时，不需要移动元素，直接修改节点的指针，时间复杂度 o(1)
    随机访问的时间复杂度 o(n)
    空间复杂度
    LinkedList
跳表
    目的：优化链表的查询速度
    用于元素有序的情况
    如何加速？进行升维，建立索引
    时间复杂度
    空间复杂度
    工程实践：redis
```

07 | 链表（下）：如何轻松写出正确的链表代码？ https://time.geekbang.org/column/article/41149
    理解指针或引用的含义、

​	警惕指针丢失和内存泄漏、

​	利用哨兵简化实现难度、

​	重点留意边界条件处理，

​	举例画图、辅助思考，

​	多写多练。


数组的交换 和 链表的交换


## 二、实战


| #       |   题目名   |   难度  |  思路关键字   |  已过遍数   |   目的  |  其他    |
| :-------   | :-----  | :-----  | :-----  | :-----  | :-----  | :-----  |
| 283 |  [移动零](https://leetcode-cn.com/problems/move-zeroes/)  |   简单❤   |   数组、双指针、循环、快排  | 2 | 作业 |       |
| 11 |  [盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/)  | 中等❤❤ |     |   |       |        |
| 70 |  [爬楼梯](https://leetcode-cn.com/problems/climbing-stairs)  | 简单❤ |   动态规划、滚动数组、斐波那契数列、数学公式、边界  | 2 |       |   每一步都有2种选择：爬1级，或2级。如果爬1级，则剩下4级要爬。如果爬2级，则剩下3级要爬。 f(5) = f(3) + f(4)    |
| 15 |  [三数之和](https://leetcode-cn.com/problems/3sum)  | 中等 |     |   |       |        |
| 1 |  [两数之和](https://leetcode-cn.com/problems/two-sum)  | 简单 |     | 1 | 作业 |        |
| 66 |  [加一](https://leetcode-cn.com/problems/plus-one/)  | 简单 |     | 1 | 作业 |        |
| 206 |  [反转链表](https://leetcode-cn.com/problems/reverse-linked-list)  | 简单 |     |   |        |        |
| 24 |  [两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)  | 中等 |     | 1 |       |        |
| 141 |  [环形链表](https://leetcode-cn.com/problems/linked-list-cycle)  | 简单 |     |   |        |        |
| 142 |  [环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii)  | 中等 |     |   |       |        |
| 25 |  [K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group)  | 困难 |     |   |        |        |
| 20 |  [有效的括号](https://leetcode-cn.com/problems/valid-parentheses)  | 简单 |     |   |        |        |
| 155 |  [最小栈](https://leetcode-cn.com/problems/min-stack)  | 简单 |     |   |        |        |
| 84 |  [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram)  | 困难 |     |   |       |        |
| 239 |  [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum)  | 困难 |     |   |       |        |
| 641 |  [设计循环双端队列](https://leetcode-cn.com/problems/design-circular-deque)  | 中等 |     |   | 作业 |        |
| 42 |  [接雨水](https://leetcode-cn.com/problems/trapping-rain-water)  | 困难 |     |   | 作业 |        |
| 26 |  [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array)  | 简单 |     |   | 作业 |        |
| 189 |  [旋转数组](https://leetcode-cn.com/problems/rotate-array)  | 简单 | 旋转 (i + k) % nums.length 、数组交换 | 1 | 作业 | 第一遍，做不出来，一种方法都想不到。 理解不了环状替换。 |
| 21 |  [合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists)  | 简单 |     |   | 作业 |        |
| 88 |  [合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array)  | 简单 |     |   | 作业 |        |


## 三、作业

1、绘制自己的数据结构和算法脑图

2、用 add first 或 add last 这套新的 API 改写 Deque 的代码、

3、分析 Queue 和 Priority Queue 的源码




​        


