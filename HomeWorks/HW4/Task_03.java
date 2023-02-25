package HomeWorks.HW4;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.Iterator;
import java.util.LinkedList;

public class Task_03 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = create_LinkedList();
        System.out.println(myLinkedList);
        System.out.println(sumElements(myLinkedList));
    }
    static LinkedList<Integer> create_LinkedList() {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        int length = 10;
        for (int i = 0; i < length; i++) {
            myLinkedList.add(i);
        }
        return myLinkedList;
    }
    static int sumElements(LinkedList<Integer> myLinkedList) {
        Iterator<Integer> iteratorList = myLinkedList.iterator();
        int sum = 0;
        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            sum += item;
        }
        return sum;
    }
}
