package DAY7BINARYTREE;
import java.util.*;
public class BinaryTreeRightSideView {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();

                if (i == levelSize - 1) {
                    result.add(current.data);
                }

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        List<Integer> rightView = rightSideView(root);
        System.out.println("Right Side View: " + rightView);
    }
}
