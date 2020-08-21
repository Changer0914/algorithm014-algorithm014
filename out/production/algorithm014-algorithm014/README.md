## 一、实战

如果第一周每天做1道题，按照五毒神掌，从第二周开始，每天至少3道题。（第八天3道：第一天的1道，第七天的1道，第八天的1道）

如果第一周每天做2道题，按照五毒神掌，从第二周开始，每天至少6道题。

如果第一周每天做3道题，按照五毒神掌，从第二周开始，每天至少9道题。

| 题目                                                         | 难度           | 关键字                                                       | 想法                                                         | 第一 | 第二 | 第三 | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | -------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| [350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/) | 简单           | 排序双指针<br />哈希计数                                     |                                                              | 0817 |      |      |      |      |      |      |
| [283. 移动零](https://leetcode-cn.com/problems/move-zeroes/) | 简单           | 解法一：双指针i和j，指针j记录非零个数<br />解法二：双指针i和j，数据交换，说是快排思想，没理解。无论是否是0，指针i都移动；非0，指针j才移动 | 第三遍还是有点吃力，一遍for循环的解法写不出来。<br /><br />解法二，如果没有非0元素，存在原地交换，如何解决呢？<br /><br /><br />指针的移动形式：从两边往中间，从中间往两边。<br />指针的移动速度：每个指针的移动步数不一样 |      |      | 0817 |      |      |      |      |
| [11. 盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/) | 中等           | 双指针左右夹逼：一个不动，一个移动                           | 可以顺利写出来                                               |      |      | 0817 |      |      |      |      |
| [15. 三数之和](https://leetcode-cn.com/problems/3sum/)       | 中等           |                                                              |                                                              | 0816 | 0816 | 0817 |      |      |      |      |
| [1021. 删除最外层的括号](https://leetcode-cn.com/problems/remove-outermost-parentheses/) | 简单           |                                                              | 第一遍，其实是08.19凌晨做的。终于做对了一道，思路是正确的，不过代码行数过多。<br />第二遍，直接看题解 | 0818 | 0818 |      |      |      |      |      |
| [剑指 Offer 59 - I. 滑动窗口的最大值](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/)<br /><br />[239. 滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | 简单<br />困难 | 解法2：优化暴力解法<br />解法3：单向的双端队列               | 第一遍：使用暴力法，超过20%<br />然后看了两个解法，没去敲第二遍。<br />反思下，这道题弄了快2个小时了，晚上效率太低，还有点困。<br />早起做，在公司休息的时候做。<br />其实，对于题解看不懂的，或抄或记。 | 0819 |      |      |      |      |      |      |
| [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | 简单           |                                                              |                                                              |      |      |      |      |      |      |      |
| [49. 字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [剑指 Offer 49. 丑数](https://leetcode-cn.com/problems/chou-shu-lcof/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [590. N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/) | 简单           | 递归、迭代                                                   | 先序遍历：根左右<br />后序遍历：左右根 （先序遍历的变形：根右左，再翻转下，就是后序遍历） | 0820 | 0821 |      |      |      |      |      |
| [589. N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/) | 简单           | 递归、栈+迭代                                                | 第一遍：递归<br />第二遍：栈+迭代                            | 0820 | 0820 | 0821 |      |      |      |      |
| [429. N叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/) | 简单           |                                                              |                                                              |      |      |      |      |      |      |      |
| [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)     | 简单           |                                                              |                                                              |      |      |      |      |      |      |      |
| [258. 各位相加](https://leetcode-cn.com/problems/add-digits/) | 简单           | 递归法、迭代法、数学法                                       | 第一遍：太困了，没写出来                                     | 0821 |      |      |      |      |      |      |



## 二、精选代码

> 优秀代码三问法：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度

[350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
            return nums1;
        if (nums2.length == 0)
            return nums2;
        // 排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums2[j] < nums1[i])
                j++;
            else if(nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;            
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
```

[11. 盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/)

```java
// 时间 o(n) 空间 o(1)
// 双指针左右夹逼，i向右，j向左。如果height[i]小于height[j]，i向右移动，j不变
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int w = j - i;
            int h = height[i] < height[j] ? height[i++] : height[j--];
            area = Math.max(area, w * h);
        }
        return area;
    }
}
```

[15. 三数之和](https://leetcode-cn.com/problems/3sum/)

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        // 使用左右夹逼时，先对数组进行排序
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        // 遍历  指针i循环， 指针j和k左右夹逼
        for (int i = 0; i < nums.length - 2; i++) {
            // nums[i] + nums[j] + nums[k] = 0
            // 升序后，如果 nums[i] 大于 0 ，直接结束 。 因为  nums[i] <= nums[j] <= nums[k]
            if (nums[i] > 0) break;
            // 如果 nums[i] 与 前一个数 相等，直接 跳过
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    // j不变， k向左移
                    k--;
                    // 优化，跳过重复的
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    // while (j < k && nums[k] == nums[--k]);  // 跳过重复的，很巧妙的写法
                } else if (sum < 0) {
                    // j向右移， k不变
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    // while (j < k && nums[j] == nums[++j]);
                } else {
                    // 符合条件
                    // j 向右  k 向左
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // 跳过重复的元素
                    while (j < k && nums[j] == nums[++j]);
                    while (j < k && nums[k] == nums[--k]);
                }
            }
        }
        return list;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>(); 
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
```

[1021. 删除最外层的括号](https://leetcode-cn.com/problems/remove-outermost-parentheses/)

```java
class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : str.toCharArray()) {
            // 好巧妙的重复单元，这三个顺序不能颠倒
            if (c == ')') --level;
            // 第一个不放进去，最后一个也不放进去
            if (level >= 1) sb.append(c);
            if (c == '(') ++level;
        }
        return sb.toString();
    }
}
```

[589. N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/)

```java
class Solution {
	
    // 解法一：递归
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preDfs(root, list);
        return list;
    }
	
    private void preDfs(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node children : root.children) {
            preDfs(children, list);
        }
    }
    
    // 解法二：栈 + 遍历
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        // 初始化
        stack.push(root);
        while (!stack.isEmpty()) {
            // 重复单元：出栈、往list添加值、入栈
            Node pop = stack.pop();
            list.add(pop.val);
            // 从右往左将孩子节点入栈
            List<Node> childrenList = pop.children;
            for (int i = childrenList.size() - 1; i >= 0; i--) {
                stack.push(childrenList.get(i));
            }
            // Collections.reverse(childrenList);
            // childrenList.forEach(child -> stack.push(child));
        }
        return list;
    }
    
}
```



## 三、作业

### 1、写一个关于 HashMap 的小总结。

### 2、HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/

### 3、自己画一下有向有权图

### 4、递归如何转为迭代

### 5、做上周未完成的

总结栈、队列的Java API



## 四、总结反思

反思：
	追求一遍理解，理解不了，也不去抄，不去记。
	遍数不够，1道题花了太长时间。
	晚上练习，效率不太高，这周经常0点睡。
	有点怕，因为自己1道题花了太长时间，如果1天6道的话，那时间更长了。
改进：
	不追求一遍理解，第一遍理解不了，那就多遍，总会理解的。
	早起练习、闲暇时间练习、晚上在公司练习、睡前练习。
	思考5分钟，没想法，直接看题解，或抄，或背。

