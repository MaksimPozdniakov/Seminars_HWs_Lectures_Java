package Seminars;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Arrays;

//public class Seminar_001 {
//    public static void main(String[] args) {
//
//        System.out.println(LocalDateTime.now());
//
//        Scanner iScanner = new Scanner(System.in);
//        String name = iScanner.nextLine(); // работа с пользователем
//        System.out.printf("Привет, %s ", name);
//        iScanner.close();
//        System.out.println();
//
//        int[] arr1 = new int[10]; // массивы
//        int[] arr2 = new int[] {1,2,3,4,5};
//        System.out.printf("Вывод на консоль по индексу %d, %d", arr1[3], arr2[0]);
//    }
//}

//public class Seminar_001 {
//    public static void main(String[] args) {
////Задача №1. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
////Мой вариант:
//
//        int[] arr1 = new int[] {0,0,0,0,1,1,1};
//        int count = 0;
//        for (int i = 0; i < arr1.length; i++){
//            if (arr1[i] == 1){
//                count ++;
//            } else{
//                count = 0;
//            }
//        }
//        System.out.println(count);

// Вариант ребят:
//     int[] arr = new int[]{1,1, 0, 0, 0, 0, 1,1,1, 0,0, 1, 1};
//     int count = 0;
//     int temp = 0;
//     for (int i = 0; i < arr.length; i++){
//         if (arr[i] == 1){
//             count += 1;
//         } else {
//             if (temp < count){
//                 temp = count;
//             }
//             count = 0;
//             }
//         if (temp < count){
//                 temp = count;
//         }
//         }
//     System.out.println(temp);
//    }
//}

//public class Seminar_001 {
//    public static void main(String[] args) {
//Задача №2. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// Мой вариант:
//        int[] arr1 = new int[] {3,3,3,2,3,4,3,2,2,3,5};
//        int val = 3;
//
//        for (int i = 0; i < arr1.length; i++){
//            for (int j = 0; j < arr1.length - 1; j++){
//                if (arr1[j] == val){
//                    int temp2 = arr1[j + 1];
//                    arr1[j + 1] = arr1[j];
//                    arr1[j] = temp2;
//                }
//            }
//        }
//        System.out.print(Arrays.toString(arr1));

// вариант ребят:
//        int[] arr = new int[] {3, 3, 3, 2, 3, 4, 3, 2, 2, 3, 5};
//        int temp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == 3) {
//                temp = arr[i];
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] != 3) {
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//public class Seminar_001 {
//    public static void main(String[] args) {
// Задача №3. Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку ""

//        String[] arr= new String[] {"abc", "abcde", "lkjadldjabck", "abcdefg", "acvbd", "abcdf", "vbabckfl"};
//        String temp = "";
//        String pref = "abc";
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i].contains(pref)){
//                if (temp.length() < arr[i].length()){
//                    temp = arr[i];
//                }
//            }
//        }
//        System.out.println(temp);
//    }
//}

//import java.util.Random;
//public class Seminar_001 {
//    public static void main(String[] args) {
// Дополнительная задача. Задать целочисленный массив состоящий из элементов 0 и 1.
// С помощью цикла и условия заменить 0 на 1 и 1 на 0. Эту задачу надо дорешать!!!
//        int[] arr = new int[10];
//        Random rnd = new Random();
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = rnd.nextInt(0,2);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//public class Seminar_001 {
//    public static void main(String[] args) {
//// Задача №4. Во фрвзе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//        String str = "Добро пожаловать на курс по Java";
//        String[] words = str.split(" ");
//        for(int i = 0; i < words.length / 2; i++) {
//            String temp = words[i];
//            words[i] = words[words.length - i - 1];
//            words[words.length - i - 1] = temp;
//        }
//        str = String.join(" ",words);
//        System.out.println(str);
//
//    }
//}

