package Seminars.Seminar_005;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;

public class Task_02 {
    public static void main(String[] args) {
        String a = "foo";
        String b = "bar";
        System.out.println(izomorf(a, b));
    }
    static boolean izomorf (String a, String b) {
        Map<Character, Character> map = new HashMap<>();

        if (a.length() != b.length()) {
            return false;
        }
        char[] somea = a.toCharArray();    // создаем массив чаров для строки а
        char[] someb = b.toCharArray();    // создаем массив чаров для строки b

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(somea[i])) {
                if (map.get(somea[i]) != someb[i]) {
                    return false;
                }
            } else {
                map.put(somea[i], someb[i]);
            }
        }
        return true;
    }
}
