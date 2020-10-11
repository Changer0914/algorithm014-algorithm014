public class Trie2 {

    boolean isEnd;

    // 每个节点可以存放26个下一节点的地址，所以用数组
    Trie2[] next;

    public Trie2() {
        isEnd = false;
        next = new Trie2[26];
    }

    public void insert(String word) {
        // 参数校验
        if (word == null || word.length() == 0) return;
        // 当前指针 指向 this
        Trie2 current = this;
        for (char c : word.toCharArray()) {
            int n = c - 'a';
            if (current.next[n] == null) {
                // 为空，则 创建
                current.next[n] = new Trie2();
            }
            // 当前指针 移动
            current = current.next[n];
        }
        // 插入完成后 isEnd = true;
        current.isEnd = true;
    }

    // 错误的示范 为何是错误的
    public void insert2(String word) {
        // 参数校验
        if (word == null || word.length() == 0) return;
        // 当前指针 指向 this
        Trie2 current = this;
        for (char c : word.toCharArray()) {
            Trie2 nextNode = current.next[c - 'a'];
            if (nextNode == null) {
                nextNode = new Trie2();
            }
            current = nextNode;
        }
        // 插入完成后 isEnd = true;
        current.isEnd = true;
    }

    // isEnd 必须是 true
    public boolean search(String word) {
//        Trie2 node = searchPrefix(word);
//        return node != null && node.isEnd;
        Trie2 current = this;
        for (char c: word.toCharArray()) {
            Trie2 nextNode = current.next[c - 'a'];
            if (nextNode == null) {
                return false;
            }
            current = nextNode;
        }
        return current.isEnd;

    }

    public boolean startWith(String prefix) {
//        Trie2 node = searchPrefix(prefix);
//        return node != null;
        Trie2 current = this;
        for (char c : prefix.toCharArray()) {
            Trie2 nextNode = current.next[c - 'a'];
            if (nextNode == null) {
                return false;
            }
            current = nextNode;
        }
        return true;

    }

    private Trie2 searchPrefix(String word) {
        Trie2 node = this;
        for (char c : word.toCharArray()) {
            node = node.next[c - 'a'];
            if (node == null) return null;
        }
        return node;
    }

}
