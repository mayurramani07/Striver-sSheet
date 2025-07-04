package DAY7BINARYTREE;
import java.util.*;
public class BinaryTreeRightSideView {
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
    public static int RightSideView(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()) {
            Node newNode = q.remove();

            System.out.println(newNode.data);

            if (newNode.left != null) {
                q.add(root.left);
            }
            if(newNode.left != null) {
                q.add(root.right);
            }
        }
    }
}