package DAY9BINARYTREE;
import java.util.*;
public class DiameterOfBinaryTree {
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
    static int diameter = 0;
    public static int diameterOfBinaryTree(Node root) {
        height(root);
        return diameter;
    }
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh+rh);

        return Math.max(lh,rh) + 1;
    }
}
