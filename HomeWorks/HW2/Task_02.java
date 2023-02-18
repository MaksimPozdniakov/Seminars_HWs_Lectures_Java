package HomeWorks.HW2;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.logging.*;

public class Task_02 {
    public static void main(String[] args) throws IOException {
        Logger log = logResult();
        int[] digit_arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < digit_arr.length; i++) {
            digit_arr[i] = random.nextInt(5, 25);
        }
        System.out.println("Наш изначальный массив: ");
        System.out.println(Arrays.toString(digit_arr));

        for (int i = 0; i < digit_arr.length; i++) {
            for (int j = i+1; j < digit_arr.length; j++) {
                if (digit_arr[j] < digit_arr[i]) {
                    int temp = digit_arr[j];
                    digit_arr[j] = digit_arr[i];
                    digit_arr[i] = temp;
                }
            }
            log.log(Level.INFO, Arrays.toString(digit_arr) + "\n");
        }
        System.out.println("Наш отсортированный массив: ");
        System.out.println(Arrays.toString(digit_arr));
    }
    static Logger logResult() throws IOException {
        Logger log = Logger.getLogger(Task_02.class.getName());
        FileHandler fh = new FileHandler("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\Seminars_HWs_Lectures_Java\\HomeWorks\\HW2\\logToTask2.txt", true);
        log.addHandler(fh);
        log.setUseParentHandlers(false);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        return log;
    }
}
