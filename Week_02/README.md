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
| [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | 简单           | 排序法、哈希法（记录次数）、字母桶法                         | 第一遍：写出两种解法                                         | 0823 |      |      |      |      |      |      |
| [49. 字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [剑指 Offer 49. 丑数](https://leetcode-cn.com/problems/chou-shu-lcof/) | 中等           |                                                              | 第一遍：没看懂，默写下来<br />第二遍：写下来，继续理解。维护三个指针a、b、c，第i个丑数dp[i]一定是dp[a]×*2、dp[b]*×3、dp[c]×5中最小的那个，如果选中其中一个，那个指针进行加一操作。 | 0823 | 0823 |      |      |      |      |      |
| [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [590. N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/) | 简单           | 递归、栈+迭代（前序的变形+翻转）                             | 先序遍历：根左右<br />后序遍历：左右根 （先序遍历的变形：根右左，再翻转下，就是后序遍历） | 0820 | 0821 |      |      |      |      |      |
| [589. N叉树的前序遍历](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/) | 简单           | 递归、栈+迭代                                                | 第一遍：递归<br />第二遍：栈+迭代                            | 0820 | 0820 | 0821 |      |      |      |      |
| [429. N叉树的层序遍历](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |
| [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | 中等           | 递归、栈+迭代                                                | 第二遍：有个解法是莫里斯遍历，还未学习。<br />递归的调用过程是不断往左边走，当左边走不下去了，就打印节点，并转向右边，然后右边继续这个过程，引入栈，模拟这个过程。 | 0822 | 0822 |      |      |      |      |      |
| [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) | 中等           | 递归                                                         |                                                              | 0821 | 0822 |      |      |      |      |      |
| [剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/) | 简单           |                                                              |                                                              |      |      |      |      |      |      |      |
| [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)     | 简单           |                                                              |                                                              |      |      |      |      |      |      |      |
| [258. 各位相加](https://leetcode-cn.com/problems/add-digits/) | 简单           | 递归法、迭代法、数学法                                       | 第一遍：太困了，没写出来                                     | 0821 |      |      |      |      |      |      |
| [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | 简单           | 递归、广度优先BFS、深度优先DFS                               | 第一遍：竟然写出来了，哈哈。此时是2020年8月23日 0:45<br />第二遍，打算学习下广度优先和深度优先。 | 0823 |      |      |      |      |      |      |
| [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) | 困难           | 递归、栈+迭代（前序的变形+翻转）                             |                                                              | 0822 | 0822 |      |      |      |      |      |
| [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) | 中等           |                                                              |                                                              |      |      |      |      |      |      |      |



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

[144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)

```java
class Solution {
    
    // 解法一：迭代 + 栈（右节点先进栈，左节点后进栈）
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            if (pop == null) continue;
            list.add(pop.val);
            stack.push(pop.right);
            stack.push(pop.left);
        }
        return list;
    }
    
    // 解法二：递归
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalDG(root, list);
        return list;
    }
    private void preorderTraversalDG(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        // 左
        preorderTraversalDG(root.left, list);
        preorderTraversalDG(root.right, list);
    }
    
}
```

[145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/)

```java
class Solution {
	// 会写前序遍历，就会写后序的
    // 后序：根左右（前序） 变形成  根右左  再翻转得  左右根（后序）
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode topElement = stack.pop();
            if (topElement == null) continue;
            list.add(topElement.val);
            stack.push(topElement.left);
            stack.push(topElement.right);
        }
        Collections.reverse(list);
        return list;
    }
}
```

[94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            // 模拟递归过程：不断往左子树方向走，每走一次就将当前节点保存到栈中
            if (current != null) {
                stack.push(current);
                current = current.left;
                continue;
            }
            // 当前节点为空，说明左边走到头了，从栈中弹出节点并保存
            // 然后转向右边节点，继续上面整个过程
            TreeNode tmp = stack.pop();
            list.add(tmp.val);
            current = tmp.right;
        }
        return list;
    }
}
```

[104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftD = maxDepth(root.left);
        int rightD = maxDepth(root.right);
        return leftD < rightD ? rightD + 1 : leftD + 1;
    }
}
```



## 三、作业

### 1、写一个关于 HashMap 的小总结

做过几道题，都是引入了HashMap，用空间换时间，使得查找的效率变成 O(1) 。

面试时，经常考察HashMap，现在认真地学习下。

参考文章：https://tech.meituan.com/2016/06/24/java-hashmap.html

#### 1.1 存储结构 - 字段 1.8

数组 + 链表 + 红黑树（1.8引入红黑树），链表长度大于8时会转换成红黑树。

![结构图](https://awps-assets.meituan.net/mit-x/blog-images-bundle-2016/e4a19398.png)

```java
// 哈希桶数组，table.length  区分 size
transient Node<K,V>[] table;

static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;  // key的hash值，数组的索引位置
        final K key;
        V value;
        Node<K,V> next; // 链表上的下一个节点位置
        
}

// 默认容量为16个（可存储key-value的个数）
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
static final int MAXIMUM_CAPACITY = 1 << 30;
// 默认的负载因子，计算链表长度用的
static final float DEFAULT_LOAD_FACTOR = 0.75f;
// 变成红黑树的那个值。  The bin count threshold for using a tree rather than list for a bin.
static final int TREEIFY_THRESHOLD = 8;
static final int UNTREEIFY_THRESHOLD = 6;
static final int MIN_TREEIFY_CAPACITY = 64;

// 记录 K-V 个数
transient int size;
// 用来记录HashMap内部结构发生变化的次数，主要用于迭代的快速失败。强调一点，内部结构发生变化指的是结构发生变化，例如put新键值对，但是某个key对应的value值被覆盖不属于结构变化。
transient int modCount;
// HashMap所能容纳的Node个数（K-V个数） threshold = length * Load factor，也就是说，在数组定义好长度之后，负载因子越大，所能容纳的键值对个数越多。
int threshold;
final float loadFactor;

// 红黑树Node
static final class TreeNode<K,V> extends LinkedHashMap.Entry<K,V> {
        TreeNode<K,V> parent;  // red-black tree links
        TreeNode<K,V> left;
        TreeNode<K,V> right;
        TreeNode<K,V> prev;    // needed to unlink next upon deletion
        boolean red;
}
```

结合负载因子的定义公式可知，threshold就是在此Load factor和length(数组长度)对应下允许的最大元素数目，超过这个数目就重新resize(扩容)，扩容后的HashMap容量是之前容量的两倍。默认的负载因子0.75是对空间和时间效率的一个平衡选择，建议大家不要修改，除非在时间和空间比较特殊的情况下，如果内存空间很多而又对时间效率要求很高，可以降低负载因子Load factor的值；相反，如果内存空间紧张而对时间效率要求不高，可以增加负载因子loadFactor的值，这个值可以大于1。

如果哈希桶数组很大，即使较差的Hash算法也会比较分散，如果哈希桶数组数组很小，即使好的Hash算法也会出现较多碰撞，所以就需要**在空间成本和时间成本之间权衡**，其实就是在根据实际情况确定哈希桶数组的大小，并在此基础上设计好的Hash算法减少Hash碰撞。那么通过什么方式来控制map使得Hash碰撞的概率又小，哈希桶数组（Node[] table）占用空间又少呢？答案就是**好的Hash算法和扩容机制。**

拉链过长，影响查找性能的优化：
即使负载因子和Hash算法设计的再合理，也免不了会出现拉链过长的情况，一旦出现拉链过长，则会严重影响HashMap的性能。于是，在JDK1.8版本中，对数据结构做了进一步的优化，引入了红黑树。而当链表长度太长（默认超过8）时，链表就转换为红黑树，利用红黑树快速增删改查的特点提高HashMap的性能。

#### 1.2 确定哈希桶数组索引位置 1.8

取 get(Object key) 就不分析了。

```java
// 1.8 哈希算法 
static final int hash(Object key) {
        int h;
    	// h = key.hashCode()
        // h >>> 16   右移16位
        // h ^ (h >>> 16)   
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}

// 对比1.7  哈希算法
static int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
}


// 1.7和1.8 计算数组的索引位置  
// int hash = hash(key.hashCode());
// table[indexFor(hash, table.length)]; 
// 这段巧妙：我们一般想到的是模运算，这里采用了与运算。  与运算比模运算具有更高的效率。
static int indexFor(int h, int length) {
    	// 与运算。“与”操作的结果就是散列值的高位全部归零，只保留低位值，用来做数组下标访问。
        return h & (length-1);
}    
```

<img src="https://awps-assets.meituan.net/mit-x/blog-images-bundle-2016/45205ec2.png" alt="hash计算" style="zoom:50%;" />



#### 1.3 存 put(K key, V value) 1.8

![](https://awps-assets.meituan.net/mit-x/blog-images-bundle-2016/d669d29c.png)

```java
   /**
     * Implements Map.put and related methods
     *
     * @param hash hash for key
     * @param key the key
     * @param value the value to put
     * @param onlyIfAbsent if true, don't change existing value
     * @param evict if false, the table is in creation mode.
     * @return previous value, or null if none
     */
final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    // 步骤①：tab为空则创建
    if ((tab = table) == null || (n = tab.length) == 0)
        // 扩容
        n = (tab = resize()).length;
    // 步骤②：计算出位置tab[index]之后，看当前位置有没有元素，没有的话，创建节点，添加进去
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        // 当前位置已经有元素了，看是替换，还是新添加在链表上，还是添加到红黑树上。
        Node<K,V> e; K k;
        // 步骤③：节点key存在，直接覆盖value
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        // 步骤④：判断该链为红黑树
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        else {
            // 步骤⑤：该链为链表
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    // 链表长度大于8转换为红黑树进行处理
                    if (binCount >= TREEIFY_THRESHOLD - 1)
                        treeifyBin(tab, hash);
                    break;
                }
                // key已经存在直接覆盖value
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
    ++modCount;
    // 步骤⑥：超过最大容量 就扩容
    if (++size > threshold)
        resize();
    afterNodeInsertion(evict);
    return null;
}
```

#### 1.4 扩容 1.8

待续。。。

### 2、HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/

### 3、自己画一下有向有权图



## 四、总结

1、哈希表、映射、集合



2、树、二叉树、二叉搜索树



Linked List 是特殊化的 Tree

Tree 是特殊化的 Graph



3、第六课：堆、二叉堆、图

堆有很多种实现，二叉堆只是一个常见且简单的实现，不是最优的实现。



4、反思与改进

```
反思：

​	追求一遍理解，理解不了，也不去抄，不去记。
​	遍数不够，1道题花了太长时间。
​	晚上练习，效率不太高，这周经常0点睡。
​	有点怕，因为自己1道题花了太长时间，如果1天6道的话，那时间更长了。

改进：

​	不追求一遍理解，第一遍理解不了，那就多遍，总会理解的。
​	早起练习、闲暇时间练习、晚上在公司练习、睡前练习。
​	思考5分钟，没想法，直接看题解，或抄，或背。
```





