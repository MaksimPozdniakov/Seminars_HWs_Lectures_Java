package OOP_ALL.HomeWork.HW_05.presenter;

import OOP_ALL.HomeWork.HW_05.model.baseClass.Notes;

import java.io.*;
import java.util.ArrayList;

public class Notebook {
    protected ArrayList<Notes> ourTasks;

    public Notebook(){
        this.ourTasks = new ArrayList<>();
    }

    public void addNote(Notes newEl){
        this.ourTasks.add(newEl);
    }

    public void write(){
        StringBuilder helpString = new StringBuilder();
        for (int i = 0; i < ourTasks.size(); i++) {
            helpString.append(ourTasks.get(i));
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\Study\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\DataBase\\notebook.txt", false)) {
            fw.append(helpString);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\" +
                "Study\\Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\DataBase\\notebook.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }


}
