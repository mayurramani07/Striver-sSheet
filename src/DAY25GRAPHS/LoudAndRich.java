package DAY25GRAPHS;
import java.util.*;
public class LoudAndRich {
    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;

        List<List<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());

        for (int[] r : richer) {
            graph.get(r[1]).add(r[0]);
        }
        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        for (int i = 0; i < n; i++) {
            dfs(i, graph, quiet, answer);
        }
        return answer;
    }
    public static int dfs(int person, List<List<Integer>> graph, int[] quiet, int[] answer) {
        if (answer[person] != -1) return answer[person];
        answer[person] = person;

        for (int richerPerson : graph.get(person)) {
            int candidate = dfs(richerPerson, graph, quiet, answer);
            if (quiet[candidate] < quiet[answer[person]]) {
                answer[person] = candidate;
            }
        }

        return answer[person];
    }
}