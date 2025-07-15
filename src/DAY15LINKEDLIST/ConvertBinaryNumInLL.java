package DAY15LINKEDLIST;
import java.util.*;
public class ConvertBinaryNumInLL {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int getDecimal(Node head) {
        int result = 0;
        while(head != null) {
            result = result * 2 + head.data;
            head = head.next;
        }
        return result;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)