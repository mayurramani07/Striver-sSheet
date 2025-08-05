package DAY24GRAPHS;
import java.util.*;
public class FindIfPathExistsInGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static Boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if(src == dest) {
            return true;
        }
        vis[src] = true;
        for(int i=0 ; i<graph[src].size() ; i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph,e.dest,dest,vis)) {
                return true;
            }
        }
        return false;
    }
}