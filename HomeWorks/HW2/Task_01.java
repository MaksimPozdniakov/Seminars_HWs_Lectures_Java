package HomeWorks.HW2;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


public class Task_01 {
    public static void main(String[] args) throws Exception {
        String str_data = "{\"name\":\"Ivanov\", \"country\":\"Russia\"," +
                " \"city\":\"Moscow\", \"age\": null }";
        processing_request(str_data);
    }

    public static void processing_request(String str) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder new_str = new StringBuilder("SELECT * FROM students WHERE");
        Map<String, Object> map_request = mapper.readValue(str, new TypeReference<>(){});
        String[] keys = map_request.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            String str_key = keys[i];
            Object value = map_request.get(str_key);

            if (value != null) {
                new_str.append(" ");
                new_str.append(str_key);
                new_str.append("=");
                new_str.append(value);
                new_str.append(" and");
            }
        }
        System.out.println(new_str.substring(0, new_str.toString().length() - 4));
    }
}

