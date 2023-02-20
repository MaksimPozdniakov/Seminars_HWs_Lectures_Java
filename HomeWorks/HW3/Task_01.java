package HomeWorks.HW3;

// Реализовать алгоритм сортировки слиянием


import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] our_array = new int[10];
        for (int i = 0; i < our_array.length; i++) {
            our_array[i] = rnd.nextInt(-100,100);
        }
        System.out.println("Наш изначальный массив:");
        System.out.println(Arrays.toString(our_array));
        System.out.println("Наш отсортированный массив:");
        merge_sort(our_array);
        for (int i = 0; i < our_array.length; i++) {
            System.out.print(our_array[i] + " ");
        }
    }
    private static void merge_sort(int[] our_array) {
        int arr_length = our_array.length;
        if (arr_length == 1) return;

        int mind = arr_length / 2;
        int[] left_part = new int[mind];
        int[] right_part = new int[arr_length - mind];

        for (int i = 0; i < mind; i++) {
            left_part[i] = our_array[i];
        }
        for (int i = mind; i < arr_length; i++) {
            right_part[i - mind] = our_array[i];
        }
        merge_sort(left_part);
        merge_sort(right_part);
        merge(our_array, left_part, right_part);
    }
    private static void merge(int[] our_array, int[] left_part, int[] right_part) {
        int left_length = left_part.length;
        int rigth_length = right_part.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left_length && j < rigth_length) {
            if (left_part[i] < right_part[j]) {
                our_array[index] = left_part[i];
                i++;
                index++;
            }else {
                our_array[index] = right_part[j];
                j++;
                index++;
            }
        }
        for (int ll = i; ll < left_length; ll++) {
            our_array[index++] = left_part[ll];
        }
        for (int rr = j; rr < rigth_length; rr++) {
            our_array[index++] = right_part[rr];
        }
    }
}
