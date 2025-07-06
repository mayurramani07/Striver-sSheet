package DAY8BINARYTREE;
import java.util.*;
public class BinaryTreeLevelOrder {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currNode = q.poll();
                currentLevel.add(currNode.data);

                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }

            result.add(currentLevel);
        }

        return result;
    }
}
