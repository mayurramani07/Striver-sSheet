package DAY24GRAPHS;
import java.util.*;
public class DepthFirstSearch {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt= w;
        }
    }
    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        System.out.println(curr + " ");
        vis[curr] = true;

        for(int i=0 ; i<graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                DFS(graph, e.dest , vis);
            }
        }
    }

}
