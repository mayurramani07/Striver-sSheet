package DAY8BINARYTREE;
import java.util.*;

public class MaxWidthBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Pair class to hold node and its horizontal index
    static class Pair {
        Node node;
        int index;

        public Pair(Node node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public static int widthOfBinaryTree(Node root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            int minIndex = q.remove().index;
            int first = 0, last = 0;

            for (int i = 0; i < levelSize; i++) {
                Pair curr = q.poll();
                int currIndex = curr.index - minIndex;

                if (i == 0) first = currIndex;
                if (i == levelSize - 1) last = currIndex;

                if (curr.node.left != null)
                    q.add(new Pair(curr.node.left, currIndex * 2 + 1));
                if (curr.node.right != null)
                    q.add(new Pair(curr.node.right, currIndex * 2 + 2));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        int maxWidth = widthOfBinaryTree(root);
        System.out.println("Maximum Width: " + maxWidth);
    }
}
