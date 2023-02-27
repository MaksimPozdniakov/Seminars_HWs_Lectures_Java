package Seminars.Seminar_005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("asdaasd");
        map.put(1, list);
        map.get(1).add("sadads");
        System.out.println(map);
    }
}
