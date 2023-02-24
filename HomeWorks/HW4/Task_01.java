package HomeWorks.HW4;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

import java.util.LinkedList;

public class Task_01 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = create_LinkedList();
        System.out.println(myLinkedList);
        System.out.println(revers_List(myLinkedList));
    }

    static LinkedList<Integer> create_LinkedList() {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        int length = 10;
        for (int i = 0; i < length; i++) {
            myLinkedList.add(i);
        }
        return myLinkedList;
    }

    static LinkedList<Integer> revers_List(LinkedList<Integer> myLinkedList) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        for (int i = myLinkedList.size() - 1; i >= 0 ; i--) {
            newLinkedList.add(myLinkedList.get(i));
        }
        return newLinkedList;
    }
}
