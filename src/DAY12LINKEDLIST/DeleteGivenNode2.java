package DAY12LINKEDLIST;
import java.util.*;
public class DeleteGivenNode2 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void DeleteNode(Node head, Node nodeToDlelete) {
        if(head == null || nodeToDlelete == null) {
            return;
        }
        Node curr = head;
        while(curr.next != null && curr.next != nodeToDlelete) {
            curr = curr.next;
        }
        if(curr.next == nodeToDlelete) {
            curr.next = nodeToDlelete.next;
        }
    }
}
