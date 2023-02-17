//package Seminars;

// Задача №1. Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//public class Seminar_003 {
//    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//        if (s1.equals(s2)){
//            System.out.println("Равны");
//        }else {
//            System.out.println("Не равны");
//        }
//        if (s1.equals(s5)){
//            System.out.println("Равны");
//        }else {
//            System.out.println("Не равны");
//        }
//    }
//}

// Задача №2. Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//
//public class Seminar_003 {
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        ArrayList<Integer> list_1 = new ArrayList<Integer>();
//
//        for (int i = 0; i < 10; i++) {
//            list_1.add(rnd.nextInt(10,20));
//        }
//        System.out.println(list_1);
//
//        Collections.sort(list_1);
//        System.out.println(list_1);
//
//    }
//}

// Задача №3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

//import java.util.ArrayList;
//import java.util.Arrays;

//public class Seminar_003 {
//    public static void main(String[] args) {
//        String[] arr = new String[] {"Марс", "Нептун", "Плутон", "Земля", "Нептун", "Земля", "Марс"};
//        System.out.println(Arrays.toString(arr));
//        int count = 1;
//
//        StringBuilder s2 = new StringBuilder();
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i].equals(arr[i + 1])) {
//                count++;
//                System.out.println(count);
//            }else {
//                s2.append(count);
//                s2.append(arr[i]);
//                count = 1;
//            }
//        }
//        System.out.println(s2);

//        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Марс", "Марс", "Нептун", "Плутон", "Земля", "Нептун", "Земля", "Марс"));
//        int count = 1;
//        for (int i = 0; i < planets.size() - 1; i++) {
//            count = 1;
//            for (int j = i+1; j < planets.size() - 1; j++) {
//                if (planets.get(i).equals(planets.get(j))) {
//                    planets.remove(planets.get(j));
//                    count ++;
//                }
//            }
//            System.out.printf("Планета %s повторяется %d раз \n", planets.get(i), count);
//        }

// от Еды


//    }
//}
