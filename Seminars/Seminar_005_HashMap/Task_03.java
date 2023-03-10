package Seminars.Seminar_005_HashMap;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println(ex0("<{a}+{(d*3)}>"));
    }
    static boolean ex0(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        char[] chars = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                stack.push(chars[i]);
            }
            if (map.containsValue(chars[i])) {
                if (stack.isEmpty() || chars[i] != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
