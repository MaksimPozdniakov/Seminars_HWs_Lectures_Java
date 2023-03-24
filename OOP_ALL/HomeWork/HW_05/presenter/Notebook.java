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
            helpString.append(ourTask);
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\dataBase\\notebook.txt", false)) {
            fw.append(helpString);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public StringBuilder readFile() throws IOException {
        StringBuilder helpString = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PMPav\\Desktop\\" +
                "Second block of study\\Seminars\\Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\" +
                "dataBase\\notebook.txt"));
        String str;
        while ((str = br.readLine()) != null) {
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
