package DAY14LINKEDLIST;
import java.util.*;
public class RotateALinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node RotateList(Node head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 1;
        Node tail = head;
        while(tail != null) {
            tail=tail.next;
            size++;
        }
        tail.next = head;

        k = k % size;
        int stepsTohead = size - k;

        Node newtail = head;
        for(int i=1 ; i<stepsTohead ; i++) {
            newtail = newtail.next;
        }
        Node newHead = newtail.next;
        newtail.next = null;

        return newHead;
    }
}
