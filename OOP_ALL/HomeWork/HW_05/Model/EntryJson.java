//package OOP_ALL.HomeWork.HW_05.Model;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.List;
//
//public class EntryJson {
//    protected String firstName;
//    protected String secondName;
//    protected int phoneNumber;
//
//    public EntryJson(String firstName, String secondName, int phoneNumber) {
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public static List<HashMap<String, Object>> entryAndPars(String path) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonString = Files.readString(Paths.get(path), StandardCharsets.UTF_8);
//        return mapper.readValue(jsonString, new TypeReference<>(){});
//    }
//
//}
