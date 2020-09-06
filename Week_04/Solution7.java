import java.util.*;

public class Solution7 {

    /**
     *
     * 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
     *
     * 每次转换只能改变一个字母。
     * 转换过程中的中间单词必须是字典中的单词。
     * 说明:
     *
     * 如果不存在这样的转换序列，返回 0。
     * 所有单词具有相同的长度。
     * 所有单词只由小写字母组成。
     * 字典中不存在重复的单词。
     * 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
     * 示例 1:
     *
     * 输入:
     * beginWord = "hit",
     * endWord = "cog",
     * wordList = ["hot","dot","dog","lot","log","cog"]
     *
     * 输出: 5
     *
     * 解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     *      返回它的长度 5。
     * 示例 2:
     *
     * 输入:
     * beginWord = "hit"
     * endWord = "cog"
     * wordList = ["hot","dot","dog","lot","log"]
     *
     * 输出: 0
     *
     * 解释: endWord "cog" 不在字典中，所以无法进行转换。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/word-ladder
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 审题：返回最短转换序列的长度
     *
     * 树结构 我为啥画不出来？？？
     *  没分析出是BFS还是DFS，怎么套用模板呢？
     *      记录上一次变化的下标
     *
     *
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
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
            // 广度优先遍历，当前层。
            for (int i = 0; i < queueSize; i++) {
                // 出队：当前层元素出队后，需要将下层元素都入队。
                String word = queue.poll();
                char[] charArray = word.toCharArray();
                // 修改每一个字符
                for (int j = 0; j < wordLen; j++) {
                    // hit  先变换第一位，h从a->z走完后，再 i 从a->z 。 所以变换后需要恢复。。。
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
                                // 没访问过，入队 并且标记为 已访问
                                visitedHash.add(changeWord);
                                queue.offer(changeWord);
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

}
