package HomeWorks.HW4.Task_02;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> ll = new LinkedList<>();

    void enqueue(int el) {  // enqueue() - помещает элемент в конец очереди
        ll.addLast(el);
    }

    Integer dequeue() {    // dequeue() - возвращает первый элемент из очереди и удаляет его
        return ll.pollFirst();
    }

    Integer first() {      // first() - возвращает первый элемент из очереди, не удаляя
        return ll.peekFirst();
    }
    String show_result() {  // печатает результат
        return ll.toString();
    }
}
