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

    public void write() throws IOException {
        StringBuilder helpString = new StringBuilder();
        for (Notes ourTask : ourTasks) {
            helpString.append(readFile());
//            helpString.append("\n");
            helpString.append(ourTask);
//            helpString.append("\n");
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\Study\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\DataBase\\notebook.txt", false)) {
            fw.append(helpString);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public StringBuilder readFile() throws IOException {
        StringBuilder helpString = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\" +
                "Study\\Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\DataBase\\notebook.txt"));
        String str;
        while ((str = br.readLine()) != null) {
//            System.out.println(str);
            helpString.append(str);
            helpString.append("\n");
        }
        br.close();
        return helpString;
    }

    public void showAllNotes() throws IOException {
//        for (int i = 0; i < readFile().length(); i++) {
//            System.out.printf("\t%s\n",readFile());
//        }
        System.out.println(readFile());
    }


}
