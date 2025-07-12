package DAY12LINKEDLIST;
import java.util.*;
public class RemoveNthFromLL {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node RemoveNth(Node head, int n) {
        if(head == null) {
            return null;
        }
        int size = 0;
        Node temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }
        if(n == size) {
            return head.next;
        }
        int iToFind = size - n;
        int i = 1;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}
