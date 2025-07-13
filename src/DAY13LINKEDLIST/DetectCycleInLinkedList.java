package DAY13LINKEDLIST;
import java.util.*;
public class DetectCycleInLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean DetectCycle(Node head, int pos) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    }
}