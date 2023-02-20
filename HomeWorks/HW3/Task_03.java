package HomeWorks.HW3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = create_list(10);
        System.out.printf("Наш список: %s", my_list);
        System.out.println();
        System.out.printf("Минимальное значение списка: %s", min_digit(my_list));
        System.out.println();
        System.out.printf("Максимальное значение списка: %s", max_digit(my_list));
        System.out.println();
        System.out.printf("Среднее арифметическое значение списка: %s", midle_digit(my_list));
    }
    public static ArrayList<Integer> create_list(int size) {
        Random rnd = new Random();
        ArrayList<Integer> my_list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            my_list.add(rnd.nextInt(10, 25));
        }
        return my_list;
    }
    public static int min_digit(ArrayList<Integer> my_list) {
        return Collections.min(my_list);
    }
    public static int max_digit(ArrayList<Integer> my_list) {
        return Collections.max(my_list);
    }
    public static float midle_digit(ArrayList<Integer> my_list) {
        int len = my_list.size();
        float sum = 0;
        for (Integer integer : my_list) {
            sum += integer;
        }
        return sum / len;
    }
}
