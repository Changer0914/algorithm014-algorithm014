## 一、实战

| 题目                                                         | 难度 | 关键字 | 想法         | 第一 | 第二 | 第三 | 四   | 五   | 六   | 七   |
| ------------------------------------------------------------ | ---- | ------ | ------------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| [22. 括号生成](https://leetcode-cn.com/problems/generate-parentheses/) | 中等 | 递归   | 记住递归模板 | 0824 |      |      |      |      |      |      |
|                                                              |      |        |              |      |      |      |      |      |      |      |
|                                                              |      |        |              |      |      |      |      |      |      |      |
|                                                              |      |        |              |      |      |      |      |      |      |      |
|                                                              |      |        |              |      |      |      |      |      |      |      |



## 二、精选代码

> 优秀代码三问法：
> 1、你学到了什么？
> 2、时间复杂度
> 3、空间复杂度



## 三、作业







## 四、总结

> 1、课堂笔记
> 2、实战心得
> 3、周总结

### 1、递归

思维：不要人肉递归、找最近重复问题、数学归纳法

```java
// Java 模板
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param);
  
  // drill down 
  recur( level: level + 1, newParam);
  
  // restore current status 
}
```



