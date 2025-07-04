package DAY7BINARYTREE;
import java.util.*;
public class TopViewOfBinaryTree {
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
    static class Pair {
        Node node;
        int horiDist;

        public Pair(Node node, int horiDist) {
            this.node = node;
            this.horiDist = horiDist;
        }
    }
    public static List<Integer> topView(Node root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Map<Integer, Integer> topMap = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()) {
            Pair current = q.poll();
            Node node = current.node;
            int horiDist = current.horiDist;

            if (!topMap.containsKey(horiDist)) {
                topMap.put(horiDist, node.data);
            }
            if (node.left != null) {
                q.add(new Pair(node.left, horiDist - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, horiDist + 1));
            }
        }
        for(int val : topMap.values()) {
            result.add(val);
        }
        return result;
    }
}

//WE CAN'T SOLVE THIS WITH DFS BECAUSE
//So while DFS can work if we handle level tracking manually,
// BFS is a more intuitive, cleaner, and safer approach for the Top View problem,
// because it naturally visits nodes in the required top-down order.