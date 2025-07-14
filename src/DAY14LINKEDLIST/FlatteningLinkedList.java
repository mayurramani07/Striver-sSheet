package DAY14LINKEDLIST;
import java.util.*;

public class FlatteningLinkedList {
    static class Node {
        int data;
        Node next;
        Node child;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }    public static Node flattenList(Node head) {
        if (head == null) return null;

        Queue<Node> queue = new LinkedList<>();
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                queue.add(curr.child);
                curr.child = null;
            }

            if (curr.next == null && !queue.isEmpty()) {
                curr.next = queue.poll();
            }

            curr = curr.next;
        }

        return head;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
