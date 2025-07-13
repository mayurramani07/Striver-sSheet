package DAY13LINKEDLIST;
import java.util.*;
public class IntersectionOfTwoLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node IntersectionOfTwoLL(Node headA, Node headB) {
        if(headA == null || headB == null) {
            return null;
        }
        Node a = headA;
        Node b = headB;

        while(a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}

//TIME COMPLEXITY : O(n+m)
//SPACE COMPLEXITY : O(1)