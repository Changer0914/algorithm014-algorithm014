## 一、实战

周日上午9:00 - 9:45

入学考试：https://time.geekbang.org/quiz/intro?act_id=198&exam_id=527


| #       |   题目名   |   难度  |  思路关键字   |  已过遍数   |   目的  |  其他    |
| :-------   | :-----  | :-----  | :-----  | :-----  | :-----  | :-----  |
| 283 |  [移动零](https://leetcode-cn.com/problems/move-zeroes/)  |   简单❤   |   双指针、循环、快排  | 2 | 作业 |       |
| 11 |  [盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/)  | 中等❤❤ | 数组的嵌套循环、左右夹逼 | 2 |       | 第一遍：0814 直接看视频<br />第二遍：流利地默写出来 |
| 70 |  [爬楼梯](https://leetcode-cn.com/problems/climbing-stairs)  | 简单❤ |   动态规划、滚动数组、斐波那契数列、数学公式、边界  | 2 | 每日一题 |   每一步都有2种选择：爬1级，或2级。如果爬1级，则剩下4级要爬。如果爬2级，则剩下3级要爬。 f(5) = f(3) + f(4)    |
| 15 |  [三数之和](https://leetcode-cn.com/problems/3sum)  | 中等 | 排序+双指针左右夹逼 |   | 每日一题、超哥解析 | 第一遍：暴力解法，提交超时，看题解<br />采用空间换时间，hash+两遍循环，依然提交不了。<br />看题解后采用排序+左右夹逼后，提交通过。<br />这个写法很巧妙  while (i < j && nums[i] == nums[++i]); |
| 1 |  [两数之和](https://leetcode-cn.com/problems/two-sum)  | 简单 | 暴力法、用空间换时间 | 2 | 作业<br />每日一题 | 第一遍：0812<br />第二遍：0816 |
| 66 |  [加一](https://leetcode-cn.com/problems/plus-one/)  | 简单 |     | 1 | 作业<br />每日一题 |        |
| 206 |  [反转链表](https://leetcode-cn.com/problems/reverse-linked-list)  | 简单 |     |   |        |        |
| 24 |  [两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)  | 中等 | 递归、哨兵+迭代 | 1 | 每日一题 | 第一遍：08.13 看题解后，写了  递归解法和 迭代解法，递归解法看明白了，迭代解法憋了1个多小时去理解。<br />第二遍：08.14晚又写不出来了 |
| 141 |  [环形链表](https://leetcode-cn.com/problems/linked-list-cycle)  | 简单 |     |   | 超哥解析 |        |
| 142 |  [环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii)  | 中等 |     |   |       |        |
| 25 |  [K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group)  | 困难 |     |   |        |        |
| 20 |  [有效的括号](https://leetcode-cn.com/problems/valid-parentheses)  | 简单 | 栈 | 1 | 超哥解析 | 第一遍：2020.08.16 ，直接看解析，看过之后，自己默写第一遍，OK，解法1：使用map存数据字典，提交后，用时较长。<br />解法2：看国际版的，找到一个最少代码，学习后，自己默写一遍，提交后，用时超过90%<br /> |
| 155 |  [最小栈](https://leetcode-cn.com/problems/min-stack)  | 简单 | 数据栈+辅助栈、 | 1 | 超哥解析 | 第一遍：08.16，以为是用数组实现栈。直接看解析，解法1：两个栈stack   1, -1, 0, 3, 2, 5<br />min_stack    1, -1 |
| 84 |  [柱状图中最大的矩形](https://leetcode-cn.com/problems/largest-rectangle-in-histogram)  | 困难 |     |   |       |        |
| 239 |  [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum)  | 困难 |     |   |       |        |
| 641 |  [设计循环双端队列](https://leetcode-cn.com/problems/design-circular-deque)  | 中等 |     |   | 作业<br />每日一题 |        |
| 42 |  [接雨水](https://leetcode-cn.com/problems/trapping-rain-water)  | 困难 |     |   | 作业 |        |
| 26 |  [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array)  | 简单 |     |   | 作业 |        |
| 189 |  [旋转数组](https://leetcode-cn.com/problems/rotate-array)  | 简单 | 旋转 (i + k) % nums.length 、数组交换、旋转法、暴力法 | 2 | 作业 | 第一遍，做不出来，一种方法都想不到。 理解不了环状替换。  环装替换 思想理解了，但写不出来<br />第二遍，用了旋转法，快而简单。 |
| 21 |  [合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists)  | 简单 | 递归、哨兵+迭代 | 1 | 作业<br />每日一题 | 第一遍，看答案，理解后，马上用递归写出来了，感谢那张图，花的太好了。 |
| 88 |  [合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array)  | 简单 |     |   | 作业 |        |
| 299 | [猜数字游戏](https://leetcode-cn.com/problems/bulls-and-cows/) | 简单 | | 1 | 每日一题 | 第一遍，自己试着写，花了1个多小时，写的不对，到23.20了，直接将答案复制过去，提交了。<br />浪费时间了，不该死磕的。 桶解法没看懂，用两个数组记录出现的次数，然后取最小值，这种方法计算母牛次数，看懂了。 |

这样记录的话，第二周怎么记录呢？



## 二、精选代码

> 优秀代码三问：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度



## 三、作业

### 1、绘制自己的数据结构和算法脑图

### 2、用 add first 或 add last 这套新的 API 改写 Deque 的代码

### 3、分析 Queue 和 Priority Queue 的源码



## 四、总结

### 1、笔记

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
    工程实践：redis的zset
栈	
    后进先出，先进后出。
    熟悉Java中Stack的实现：http://developer.classpath.org/doc/java/util/Stack-source.html
	自己简单实现下
    工程实践：
队列 
    先进先出
    熟悉Java中的Queue的实现：http://fuseyism.com/classpath/doc/java/util/Queue-source.html
    双端队列Deque的实现
    熟悉优先级队列 PriorityQueue    https://docs.oracle.com/javase/10/docs/api/java/util/PriorityQueue.html
    自己简单实现下
    工程实践：
```

### 2、如何轻松写出正确的链表代码

看争哥的文章： https://time.geekbang.org/column/article/41149

1. ​	理解指针或引用的含义
2. ​	警惕指针丢失和内存泄漏

3. ​	利用哨兵简化实现难度

4. ​	重点留意边界条件处理

5. ​	举例画图、辅助思考

6. ​	多写多练


### 3、周总结

1、算法很有意思，旋转数组的环状替换解法很有意思，还有旋转法。  环状替换理解了，但写不出来，看答案看不懂。 

2、【视频心得】 实战题目解析：盛水最多的容器、爬楼梯

以为就单纯地讲两道算法题，没想到非常精彩，有很多解题的精彩思想，让人拍案叫绝。

最懵逼的时候，怎么办？

- ​	用暴力法。
- ​	最简单的问题，泛化，找最近重复子问题

程序就是一堆  if else  for  while  recursion 。计算机擅长做重复的事情。

所有算法的解决思路：找重复性。

最大的误区：题只做一遍，不会还死磕。  

优化的思想：用空间换时间，升维法。

熟练使用数组的循环嵌套。

记住左右夹逼思想，用的比较多。

5）【视频心得】 实战题目解析：3数之和、环形链表

链表题，没有多么复杂的算法，就是多练。

【视频心得】实战题目解析：有效的括号、最小栈等问题，柱状图中最大的矩形、滑动窗口最大值

最近相关性问题  想到 栈

只能用栈做队列，想到两个栈。

只能用队列来做栈，想到用两个队列。

指针i和指针j的各种移动方式：向中间、向两边、固定一个移动另一个，还有移动速度，这样的代码，要写的熟练。

5、反思总结

第一周，题挺多的，很多题没有刷第二遍，现在心里不踏实。如果周六不加班，还能刷至少5道题。

模拟考试，忘记在9点进行了，改期到下周日08.23

按照五毒神掌，下周每天要做4道题：至少1个新题，至少2个旧题。

[这个哥们，完成的不错]: https://github.com/yzsever/algorithm014-algorithm014/tree/master/Week_01

多看看他的，激励自己做得更好。