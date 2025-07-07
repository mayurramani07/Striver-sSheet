package DAY9BINARYTREE;
import java.util.*;
public class BalanceBinaryTree {
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
    public static boolean isBalanced(Node root) {
        int height = getHeight(root);
        if(height == -1) {
            return false;
        }
        return true;
    }
    public static int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSubtreeHeight = getHeight(root.left);
        int rightSubtreeHeight = getHeight(root.right);

        if(leftSubtreeHeight == -1 || rightSubtreeHeight == -1) {
            return -1;
        }
        if(Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)