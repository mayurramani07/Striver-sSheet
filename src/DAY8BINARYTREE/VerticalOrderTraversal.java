package DAY8BINARYTREE;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        dfs(root, 0, 0);

        for (Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> entry : map.entrySet()) {
            TreeMap<Integer, ArrayList<Integer>> levelMap = entry.getValue();
            ArrayList<Integer> list = new ArrayList<>();

            for (Map.Entry<Integer, ArrayList<Integer>> subEntry : levelMap.entrySet()) {
                ArrayList<Integer> sublist = subEntry.getValue();
                Collections.sort(sublist); // Sort to handle multiple nodes at same position
                list.addAll(sublist);
            }
            res.add(list);
        }

        return res;
    }

    public void dfs(TreeNode root, int col, int level) {
        if (root == null) {
            return;
        }

        map.putIfAbsent(col, new TreeMap<>());
        map.get(col).putIfAbsent(level, new ArrayList<>());
        map.get(col).get(level).add(root.val);

        dfs(root.left, col - 1, level + 1);
        dfs(root.right, col + 1, level + 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.verticalTraversal(root);

        System.out.println("Vertical Order Traversal:");
        for (List<Integer> col : result) {
            System.out.println(col);
        }
    }
}
