import base.BinaryTreeNode;

import java.util.*;

public class Solution601 {

    /**
     * 四数之和，考试时，
     *  1）这种想法没想到    while (m < n && nums[n] == nums[--n]);
     *  2）性能不优， 还可以继续优化。 没想到  第一层循环和第二层循环内的 最小值和最大值 优化。
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // 优化
            if (i > 0 && nums[i] == nums[i-1]) continue;
            // 获取最小值
            int min = nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if (min > target) break;
            // i固定后的最大值 与 target 比较
            int max = nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
            if (max < target) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // 优化
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                // 获取最小值
                int min2 = nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if (min2 > target) break;
                // i j 固定后的最大值 与 target 比较
                int max2 = nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2];
                if (max2 < target) continue;

                int m = j + 1, n = nums.length - 1;
                while (m < n) {
                    int sum = nums[i] + nums[j] + nums[m] + nums[n];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        while (m < n && nums[n] == nums[--n]);
                        while (m < n && nums[m] == nums[++m]);
                    } else if (sum > target) {
                        while (m < n && nums[n] == nums[--n]);
                    } else {
                        while (m < n && nums[m] == nums[++m]);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    /**
     * 二叉树的中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(BinaryTreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderDFS(res, root);
        return res;
    }

    private void inorderDFS(List<Integer> res, BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        inorderDFS(res, root.left);
        res.add(root.val);
        inorderDFS(res, root.right);
    }

    /**
     * 每次都选择最大的步数。
     *  如果当前位置是 i
     *      for i + 1,  i + nums[i]   选出最大的 下标
     *
     *    0  选择最大的下标1
     *    1  选择最大的下标4
     *    4 数组最大，到头了
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        // reach是当前需要进行跳跃的右界限
        int reach = 0;
        // nextReach是下一次跳跃的右界限，nextReach的值一直动态更新，以保证每次跳跃都是最远的
        int nextReach = 0;
        int steps = 0;
        for (int i = 0; i< nums.length; i++) {
            nextReach = Math.max(i + nums[i], nextReach);
            if(nextReach >= nums.length - 1) return steps + 1;
            // 遇到边界，就更新边界，并且步数加一
            if (i == reach) {
                steps++;
                reach = nextReach;
            }
        }
        return steps;
    }

    public static int jump2(int[] nums) {
        int steps = 0;
        int start = 0;
        int end = 1;
        for (int i = 0; i < nums.length; i++) {
            int maxPos = choose(nums, start, end);
            start = end;      // 下一次起跳点范围开始的格子
            end = maxPos + 1; // 下一次起跳点范围结束的格子
            steps++;          // 跳跃次数
        }
        return steps;
    }

    private static int choose(int[] nums, int start, int end) {
        int maxPos = 0;
        for (int i = start; i < end; i++) {
            // 能跳到最远的距离
            maxPos = Math.max(maxPos, i + nums[i]);
        }
        return maxPos;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump2(nums));
    }


}
