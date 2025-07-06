package DAY8BINARYTREE;
import java.util.*;
public class BinaryTreePaths {
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
    public static List<String> BinaryTreePath(Node root) {
        List<String> paths = new ArrayList<>();
        if(root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }
    public static void dfs(Node root, String path , List<String> paths) {
        if(root.left == null && root.right == null) {
            paths.add(path + root.data);
        }
        if(root.left != null) {
            dfs(root.left, path + root.data + "->", paths);
        }
        if(root.right != null) {
            dfs(root.right, path + root.data + "->", paths);
        }
    }
}
