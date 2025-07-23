package DAY19STACKS;
import java.util.*;
public class ImplementStackUsingQueues {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public MyStack() {

        }
        public void Push(int x) {
            if(q1.isEmpty()) {
                q1.add(x);
                while(!q2.isEmpty()) {
                    q1.add(q2.poll());
                }
            }
            else {
                q2.add(x);
                while(!q1.isEmpty()) {
                    q2.add(q1.poll());
                }
            }
        }
        public int pop() {
            if(!q1.isEmpty()) {
                return q1.poll();
            }
            else {
                return q2.poll();
            }
        }
        public int top() {
            if (!q1.isEmpty()) {
                return q1.peek();
            } else {
                return q2.peek();
            }
        }
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }
}