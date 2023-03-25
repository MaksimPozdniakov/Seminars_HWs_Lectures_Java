package OOP_ALL.HomeWork.HW_04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] ourArray = {10,25,11,32,34,23,59,29,49,11,222,999,11};

        DynamicArray<Integer> dynArray = new DynamicArray<>(ourArray);

        System.out.print("Наш изначальный массив: ");
        dynArray.print();

//        System.out.print("Укажите новый эелемент массива: ");
//        int newElem = scanner.nextInt();
//        dynArray.addInArr(newElem);
//        System.out.print("Наш массив после добавления нового элемента: ");
//        dynArray.print();
//
//        System.out.print("Укажите индекс элемента, который необходимо удалить: ");
//        int removeElem = scanner.nextInt();
//        dynArray.removeEl(removeElem);
//        System.out.print("Наш массив после удаления элемента: ");
//        dynArray.print();
//
//        System.out.print("Укажите каких значений не должно быть в нашем массиве: ");
//        int removeSpecDig = scanner.nextInt();
//        dynArray.removeAllSpecDig(removeSpecDig);
//        System.out.print("Наш массив после удаления элементов: ");
//        dynArray.print();

//        int minDig = dynArray.minEl();
//        System.out.printf("Минимальный элемент нашего массива: %d", minDig);
//        System.out.println();
//
//        int maxDig = dynArray.maxEl();
//        System.out.printf("Максимальный элемент нашего массива: %d", maxDig);
//        System.out.println();

//        int sumDig = dynArray.sumEl();
//        System.out.printf("Сумма элементов нашего массива: %d", sumDig);

//        System.out.println("Произведение элементов массива: " + dynArray.productElements());

//        System.out.println(dynArray.indexOf(23));
//        System.out.println(dynArray.contains(23));

//        System.out.println(dynArray.getDig(5));

//        dynArray.bubbleSorting();
//        System.out.print("Массив после сортировки пузырьком: ");
//        dynArray.print();

//        dynArray.insertionSort();
//        System.out.print("Массив после сортировки вставками: ");
//        dynArray.print();
//
//        dynArray.insertionSort();
//        System.out.print("Массив после сортировки выбором: ");
//        dynArray.print();

//        System.out.println(dynArray.changeDig(0,123));
//        dynArray.print();

    }
}
