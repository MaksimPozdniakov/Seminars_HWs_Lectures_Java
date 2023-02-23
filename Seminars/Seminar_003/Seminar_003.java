//package Seminars;

// Задача №1. Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class Seminar_003 {
//    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//        ArrayList<String> arr = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//                System.out.printf("[i:%d, j:%d] (%s == %s) -> %s\n", i, j, arr.get(i), arr.get(j), arr.get(i) == arr.get(j));
//                System.out.printf("[i:%d, j:%d] (%s.equals(%s)) -> %s\n", i, j, arr.get(i), arr.get(j), Objects.equals(arr.get(i), arr.get(j)));
//                System.out.println("--------------");
//            }
//            System.out.println("==============");
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

//import java.util.*;
//
//public class Seminar_003 {
//    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Меркурий",
//                "Земля ", "Венера", "Нептун", "Юпитер", "Земля ", "Земля ", "Марс", "Венера",
//                "Юпитер", "Сатурн", "Меркурий", "Земля ", "Венера", "Марс", "Нептун"));
//        System.out.println("Изначальный список");
//        showCounts(arr);
//        delRepeats(arr);
//        System.out.println("После удаления");
//        showCounts(arr);
//    }
//
//    public static void showCounts(ArrayList<String> data){
//        Set<String> mySet = new HashSet<>(data);
//        for (String planet: mySet) {
//            int count = Collections.frequency(data, planet);
//            System.out.printf("Колличество %s -> %d\n", planet, count);
//        }
//    }
//
//    public static void delRepeats(ArrayList<String> data){
//        Iterator<String> iterator = data.iterator();
//        while (iterator.hasNext()){
//            if (Collections.frequency(data, iterator.next()) > 1){
//                iterator.remove();
//            }
//        }
//    }
//}

// Задача №4. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

// import java.util.ArrayList;
//import java.util.Iterator;

//public class Seminar_003 {
//    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Строка 1");
//        arr.add("1");
//        arr.add("Строка 2");
//        arr.add("2");
//        arr.add("Строка 3");
//        arr.add("3");
//        Iterator<String> iterator = arr.iterator();
//        System.out.println(arr);
//        while (iterator.hasNext()){
//            String current = iterator.next();
//            if (isParable(current)){
//                iterator.remove();
//            } else {
//                System.out.printf("\"%s\" - это было не число...\n", current);
//            }
//        }
//        System.out.println(arr);
//    }
//
//    public static Boolean isParable(String number){
//        try {
//            Integer.parseInt(number);
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//    }
//}

