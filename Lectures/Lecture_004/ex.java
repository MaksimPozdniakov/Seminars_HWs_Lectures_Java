package Lectures.Lecture_004;

import java.util.*;
public class ex {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
//        System.out.println(item);
//        item = queue.poll();
//        System.out.println(queue);
//        queue.remove(2809); // зачем очередь??
//        queue.element();
//        queue.peek();
    }
    static void ex_02() {
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        deque.addFirst(1); deque.addLast(2);
//        deque.removeLast(); deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst(); deque.pollLast();
//        deque.getFirst(); deque.getLast();
//        deque.peekFirst(); deque.peekLast();
    }
    static void ex_03() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}
