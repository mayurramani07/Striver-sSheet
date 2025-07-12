package DAY12LINKEDLIST;
import java.util.*;
public class DeleteGivenNode {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void DeleteNthNode(Node head, Node node) {
        if(head == null || head.next == null) {
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }
}


//TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);