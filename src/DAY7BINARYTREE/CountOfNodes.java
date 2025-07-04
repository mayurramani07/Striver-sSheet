package DAY7BINARYTREE;
import java.util.*;
public class CountOfNodes {
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
    public static int count(Node root) {
        if(root == null) {
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);

        return lc + rc + 1;
    }
    public static void main(String[] args) {

    }
}
