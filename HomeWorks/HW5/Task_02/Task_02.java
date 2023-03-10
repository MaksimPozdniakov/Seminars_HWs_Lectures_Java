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
        String[] book = s.split(",");
        int count = 1;
        ArrayList<String> names = new ArrayList<>();

        // формируем список имен
        for(String s2: book) {
            String[] newBooks = s2.split(" ");

            for (int i = 0; i < newBooks.length; i+=2) {
                names.add(newBooks[i]);
            }
        }

        // считаем повторения
        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (String firstName: names) {
            if (map.containsKey(firstName)) {
                map.put(firstName, map.get(firstName) + 1);
            } else {
                map.put(firstName, 1);
            }
        }

        Map<Integer, List<String>> TreeMap = new TreeMap<>(Comparator.reverseOrder());
        // формируем итоговый мап с сортировкой
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (TreeMap.containsKey(entry.getValue())) {
                List<String> list1 = TreeMap.get(entry.getValue());
                list1.add(entry.getKey());
            } else {
                List<String> list1 = new ArrayList<>();
                list1.add(entry.getKey());
                TreeMap.put(entry.getValue(), list1);
            }
        }

        for (Map.Entry entry: TreeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
