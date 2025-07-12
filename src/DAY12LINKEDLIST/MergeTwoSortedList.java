package DAY12LINKEDLIST;
import java.util.*;
public class MergeTwoSortedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node MergeSorted(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }

        return dummy.next;
    }
}

//TIME COMPLEXITY : O(m+n)
//SPACE COMPLEXITY : O(1)