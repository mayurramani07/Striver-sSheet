package DAY21STACKS;
import java.util.*;
public class PathCrossing {
    public static boolean isPath(String path) {
        Set<String> visited = new HashSet<>();
        int x=0, y=0;
        visited.add("0,0");

        for(int i=0 ; i<path.length() ; i++) {
            char ch = path.charAt(i);
            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'E') x++;
            else if(ch == 'W') x--;

            String position = x + "," + y;
            if(visited.contains(position)) {
                return true;
            }
            visited.add(position);
        }
        return false;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)