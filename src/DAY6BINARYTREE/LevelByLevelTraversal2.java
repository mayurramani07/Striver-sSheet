package DAY6BINARYTREE;
import java.util.*;
public class LevelByLevelTraversal2 {
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

    public static List<List<Integer>> LevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0 ; i<levelSize ; i++) {
                Node currNode = q.remove();
                currentLevel.add(currNode.data);

                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}