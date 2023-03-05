package HomeWorks.HW5.Task_01;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Task_01 {
    public static void main(String[] args) throws IOException {
        List<HashMap<String, Object>> jsonString = Read_and_Pars("C:\\Users\\PMPav\\Desktop\\" +
                "Second block of study\\Seminars\\Seminars_HWs_Lectures_Java\\HomeWorks\\HW5\\Task_01\\" +
                "FileToTask_01.json");

       StringHashMap(jsonString);

    }
    static List<HashMap<String, Object>> Read_and_Pars(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = Files.readString(Paths.get(path), StandardCharsets.UTF_8);
        return mapper.readValue(jsonString, new TypeReference<>(){});
    }

    static void StringHashMap (List<HashMap<String, Object>> jsonString) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Что вы ищите? ");
        Scanner iScanner = new Scanner(System.in);
        String search_word = iScanner.next();
        iScanner.close();

        boolean flag = true;
        for (HashMap<String, Object> el: jsonString) {
            String[] keys = el.keySet().toArray(new String[0]);
            for (int i = 0; i < keys.length; i++) {
                String str_key = keys[i];
                Object value = el.get(str_key);
                if (value.equals(search_word)) {
                    System.out.printf("%s %s %s", el.get("Фамилия"),el.get("Имя"), el.get("Телефон"));
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Такого контакта нет!");
        }
    }
}

