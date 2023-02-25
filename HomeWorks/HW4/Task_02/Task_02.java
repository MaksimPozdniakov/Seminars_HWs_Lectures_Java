package HomeWorks.HW4.Task_02;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task_02 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(15);
        myQueue.enqueue(10);
        myQueue.enqueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(8);
        myQueue.enqueue(7);
        myQueue.enqueue(6);
        System.out.printf("Вот что получилось после добавления элементов = %s", myQueue.show_result());
        System.out.println();
        System.out.printf("Первый удаленный элемент = %d", myQueue.dequeue());
        System.out.println();
        System.out.printf("Следующий первый неудаленный элемент = %d", myQueue.first());
        System.out.println();
        System.out.printf("То, что осталось = %s", myQueue.show_result());
    }
}
