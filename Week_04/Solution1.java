import base.BinaryTreeNode;

import java.util.*;

public class Solution1 {

    public List<List<Integer>> levelOrder(BinaryTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode treeNode = queue.removeFirst();
                levelList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.addLast(treeNode.right);
                }
            }
            res.add(levelList);
        }
        return res;
    }

}
