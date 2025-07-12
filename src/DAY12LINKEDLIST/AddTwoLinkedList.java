package DAY12LINKEDLIST;
import java.util.*;
public class AddTwoLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node AddTwoLL(Node list1, Node list2) {
        Node newNode = new Node(-1);
        Node curr = newNode;
        int carry = 0;

        while(list1 != null || list2 != null || carry > 0) {
            int sum = carry;
            if(list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }

            if(list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return newNode.next;
    }
}

//TIME COMPLEXITY : O(m,n)
//SPACE COMPLEXITY : O(m,n)