package DAY7BINARYTREE;
import java.util.*;
public class FindBottomLeftTreeValue {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int FindBottomLeft(Node root) {
        if(root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node current = null;

        while(!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                current = q.remove();

                if (current.right != null) {
                    q.add(current.right);
                }
                if (current.left != null) {
                    q.add(current.left);
                }
            }
        }
        return current.data;
    }
}