package Seminars.Seminar_006_HashSet;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        Integer[] arr = getArray(0, 25, 1000);
//        System.out.println(Arrays.toString(arr));
        System.out.println(unicValue(arr));
    }
    static Integer[] getArray(int minn, int maxx, int size) {
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(minn, maxx);
        }
        return array;
    }
    static Double unicValue(Integer[] someArray) {
        double unVal = 0;
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(someArray));
        unVal = mySet.size() * 100.0/ someArray.length;
        return unVal;
    }
}

