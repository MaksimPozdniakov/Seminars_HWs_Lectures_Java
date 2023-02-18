package HomeWorks.HW2;

// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


import java.util.List;
import java.util.Map;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import com.fasterxml.jackson.core.type.TypeReference;


public class Task_03 {
    public static void main(String[] args) throws Exception {
        List<Map<String, Object>> jsonString = Read_and_Pars("C:\\Users\\PMPav\\Desktop\\Second block of study\\" +
                "Seminars\\Seminars_HWs_Lectures_Java\\HomeWorks\\HW2\\FileToTask3.json");
        Show_result(jsonString);
    }

    public static List<Map<String, Object>> Read_and_Pars(String path) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = Files.readString(Paths.get(path), StandardCharsets.UTF_8);
        return mapper.readValue(jsonString, new TypeReference<>() {
        });
    }

    public static void Show_result(List<Map<String, Object>> jsonString) {
        StringBuilder str = new StringBuilder();
        for (Map<String, Object> entry : jsonString) {
            str.append(String.format("Студент %s получил %s по предмету %s.\n", entry.get("фамилия"),
                    entry.get("оценка"), entry.get("предмет")));
        }
        System.out.println(str);
    }
}

