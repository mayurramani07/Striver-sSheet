package DAY24GRAPHS;
import java.util.*;
public class BreadthFirstSearch {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void BFS(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr + " ");

            for(int i=0 ; i<graph[curr].size() ; i++) {
                Edge e = graph[curr].get(i);

                if(!vis[e.dest]) {
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }
    }
}
