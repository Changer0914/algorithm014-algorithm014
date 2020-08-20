package base;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    public int val;
    public List<TreeNode> children = new ArrayList<>();

    public TreeNode() {}

    public TreeNode(int _val) {
        val = _val;
    }

    public TreeNode(int _val, List<TreeNode> _children) {
        val = _val;
        children = _children;
    }

    // 创建一棵树
    public static TreeNode createTree() {
        List<TreeNode> first_children = new ArrayList<>();
        TreeNode first_node01 = new TreeNode(3);
        TreeNode first_node02 = new TreeNode(2);
        TreeNode first_node03 = new TreeNode(4);
        first_children.add(first_node01);
        first_children.add(first_node02);
        first_children.add(first_node03);

        List<TreeNode> second_children = new ArrayList<>();
        TreeNode second_node01 = new TreeNode(5);
        TreeNode second_node02 = new TreeNode(6);
        second_children.add(second_node01);
        second_children.add(second_node02);
        first_node01.children = second_children;

        TreeNode root = new TreeNode(1);
        root.children = first_children;
        return root;
    }

}
