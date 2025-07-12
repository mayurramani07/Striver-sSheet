package DAY12LINKEDLIST;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node  tail;
    public static void Print() {
        if(head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void ReverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
