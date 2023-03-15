package Seminars.Seminar_004_LinkedList;

// Задача №1.
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// 3) Сравните с предыдущим.

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Seminar_004 {
//    public static void main(String[] args) {
//        ArrayList<Integer> myArrList = new ArrayList<>();
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//
//        long timeStart1 = System.currentTimeMillis();
//        fillList(myArrList);
//        System.out.println(System.currentTimeMillis() - timeStart1);
//
//        long timeStart2 = System.currentTimeMillis();
//        addToFirst(myLinkedList);
//        System.out.println(System.currentTimeMillis() - timeStart2);
//    }
//    public static void fillList(List<Integer> arrList) {
//        for (int i = 0; i < 100_000; i++) {
//            arrList.add(0, i);
//        }
//    }
//    public static void addToFirst(LinkedList<Integer> arrList) {
//        for (int i = 0; i < 100_000; i++) {
//            arrList.addFirst(i);
//        }
//    }
//}

// Задача №2.
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text.txt~num
// Нужно рассплитить строку по ~, сохранить text.txt в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

//import java.util.LinkedList;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class Seminar_004 {
//    public static void main(String[] args) {
//        programm();
//    }
//    public static void programm() {
//        Scanner scanner = new Scanner(System.in);
//        LinkedList<String> myLinkedList = new LinkedList<>();
//        while (true) {
//            System.out.println("Введите >: ");
//            String data = scanner.next();
//            String[] stringArr = data.split("~");
//            if (Objects.equals(stringArr[0], "print")) {
//                System.out.println(myLinkedList.remove(Integer.parseInt(stringArr[1])));
//            }else {
//                myLinkedList.add(Integer.parseInt(stringArr[1]), stringArr[0]);
//            }
//        }
//    }
//}

// Задача №3.
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

//import java.util.LinkedList;
//import java.util.Stack;
//
//public class Seminar_004 {
//    public static void main(String[] args) {
//        int[] array = createArray();
//        showStack(addToStack(array));
//        showQueue(addToQueue(array));
//
//    }
//    public static Stack<Integer> addToStack(int[] array) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < array.length; i++) {
//            stack.push(array[i]);
//        }
//        return stack;
//    }
//    static void showStack(Stack<Integer> stack) {
//        for (Integer item: stack) {
//            System.out.print(item + "/");
//        }
//        System.out.println();
//
//        System.out.println(stack);
//
//        while (stack.size() > 0){
//            System.out.print(stack.pop() + " ");
//        }
//        System.out.println();
//        System.out.println();
//    }
//    static int[] createArray() {
//        int[] myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i;
//        }
//        return myArray;
//    }
//    static LinkedList<Integer> addToQueue(int[] array) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int item: array) {
//            linkedList.addLast(item);
//        }
//        return linkedList;
//    }
//    static void showQueue(LinkedList<Integer> linkedList) {
//        for (Integer item: linkedList) {
//            System.out.print(item + "/");
//        }
//        System.out.println();
//
//        System.out.println(linkedList);
//
//        while (linkedList.size() > 0){
//            System.out.print(linkedList.poll() + " ");
//        }
//    }
//}

// Задача №4.
// Реализовать стек с помощью массива.
// Нужно реализовать методы: size(), empty(), push(), peek(), pop().

//public class Seminar_004 {
//    public static void main(String[] args) {
//        MyStack stack = new MyStack();
//        System.out.println(stack.size());
//        stack.push(5);
//        System.out.println(stack.pop());
//    }
//}
