package DAY13LINKEDLIST;
import java.util.*;
public class ReverseNodeInKGroups {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node ReverseNode(Node head, int k) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        int c = k;

        while (curr != null && c > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c--;
        }
        if (curr == null && c > 0) {
            curr = prev;
            prev = null;
            next = null;
            while(curr != null && c>0) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }
        if(c > 0) {
            return prev;
        }
        head.next = ReverseNode(head, k);
        return prev;
    }
    public static void main(String[] args) {

    }
}
