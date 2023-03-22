package OOP_ALL.HomeWork.HW_05.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Notebook {
    protected List<HashMap<String, Object>> jsonList;

    public Notebook() throws IOException {
        this.jsonList = new ArrayList<>();
        this.jsonList = ReadJson.readAndPars("C:\\Users\\PMPav\\OneDrive\\" +
                "Рабочий стол\\Study\\Java\\OOP_ALL\\HomeWork\\HW_5\\DB\\OurDB.json");
    }

//    public void addNewNote()

    public void showAll(){
        int num = 1;
        for (HashMap<String, Object> el: jsonList) {
            System.out.printf("%d) %s %s %s \n",num, el.get("Фамилия"),el.get("Имя"), el.get("Телефон"));
            num++;
        }
    }




}
