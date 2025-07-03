package DAY6BINARYTREE;
import java.util.*;
public class InOrderTraversal {
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
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int[] nodes) {
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }
    public static void InOrder(Node root) {
        if(root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }
    public static void main(String[] args) {

    }
}
