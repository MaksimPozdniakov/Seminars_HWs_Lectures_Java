package HomeWorks.HW3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = create_list(10);
        System.out.printf("Наш первоначальный список %s", my_list);
        dell_even_numbers(my_list);
        System.out.println();
        System.out.printf("Наш измененный список %s", my_list);
    }
    public static ArrayList<Integer> create_list(int size) {
        ArrayList<Integer> my_list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            my_list.add(rnd.nextInt(10,25));
        }
        return my_list;
    }
    public static void dell_even_numbers(ArrayList<Integer> my_list) {
        my_list.removeIf(item -> item % 2 == 0);
    }
}
