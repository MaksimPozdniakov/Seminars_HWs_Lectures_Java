package OOP_ALL.HomeWork.HW_05.Model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class ReadJson {
    protected String path;

    public ReadJson(String path) {
        this.path = path;
    }

    public static List<HashMap<String, Object>> readAndPars(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = Files.readString(Paths.get(path), StandardCharsets.UTF_8);
        return mapper.readValue(jsonString, new TypeReference<>(){});
    }

}
