package Seminars.Seminar_006;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.
// Распечатайте содержимое данного множества.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task_01 {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(mySet); // сортировка по Хешкоду
        LinkedHashSet<Integer> myLink = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(myLink); // добавлено так как было изначально
        TreeSet<Integer> myTree = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(myTree); // сортировка по возрастанию
    }
}
