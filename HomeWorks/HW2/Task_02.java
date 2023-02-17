package HomeWorks.HW2;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        int[] digit_arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < digit_arr.length; i++) {
            digit_arr[i] = random.nextInt(5, 25);
        }
        System.out.println(Arrays.toString(digit_arr));

        for (int i = 0; i < digit_arr.length; i++) {
            for (int j = i+1; j < digit_arr.length; j++) {
                if (digit_arr[j] < digit_arr[i]) {
                    int temp = digit_arr[j];
                    digit_arr[j] = digit_arr[i];
                    digit_arr[i] = temp;
                }
            }
            System.out.println(Arrays.toString(digit_arr));
        }
//        System.out.println(Arrays.toString(digit_arr));

    }
}
