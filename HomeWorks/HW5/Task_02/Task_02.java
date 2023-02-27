package HomeWorks.HW5.Task_02;

// Пусть дан список сотрудников:

// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
// Для сортировки использовать TreeMap.

import java.util.*;

public class Task_02 {
    public static void main(String[] args) {
        String text = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин," +
                "Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина," +
                "Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
        parsAndCount(text);
    }
    static void parsAndCount (String s){
        TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());
        String[] book = s.split(",");
        int count = 1;
        StringBuilder ss = new StringBuilder();
        ArrayList<String> names = new ArrayList<>();
        for(String s2: book) {
            String[] newBooks = s2.split(" ");

            for (int i = 0; i < newBooks.length; i+=2) {
                names.add(newBooks[i]);
            }
        }
        for (int i = 0; i < names.size(); i++) {
            count = 1;
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    names.remove(j);
                j--;
                count ++;
                }
            }
            System.out.printf("Имя %s повторяется %d раз", names.get(i), count);
            System.out.println();
            treeMap.put(count, names.get(i));
//            System.out.println(treeMap);
        }
//        System.out.println(treeMap);
//        for (Map.Entry<Integer, String> entry: treeMap.entrySet()) {
//            System.out.println(entry);
//        }
    }
}


