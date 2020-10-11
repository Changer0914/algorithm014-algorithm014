public class Solution702 {

    public static void main(String[] args) {
        Trie2 trie = new Trie2();

        trie.insert2("apple");
        System.out.println(trie.search("apple"));// 返回 true

        System.out.println(trie.search("app"));     // 返回 false

        System.out.println(trie.startWith("app")); // 返回 true

        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 true
    }

}
