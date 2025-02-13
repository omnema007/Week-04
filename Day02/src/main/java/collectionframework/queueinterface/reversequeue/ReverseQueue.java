package collectionframework.queueinterface.reversequeue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> s = new Stack<>();
      while (!queue.isEmpty()) {
          s.push(queue.poll());
      }

      while(!s.isEmpty()) {
          queue.add(s.pop());
      }

      return queue;
    }
}
