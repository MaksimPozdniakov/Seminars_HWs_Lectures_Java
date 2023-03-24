package OOP_ALL.HomeWork.HW_05.presenter;

import OOP_ALL.HomeWork.HW_05.model.baseClass.Notes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    protected ArrayList<Notes> ourTasks;

    public Notebook(){
        this.ourTasks = new ArrayList<>();
    }

    public void addNote(Notes newEl){
        this.ourTasks.add(newEl);
    }

    ArrayList<String> ourFile = new ArrayList<>();

    public ArrayList<String> readFile() throws IOException {

        Scanner s = new Scanner(new File("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\dataBase\\notebook.txt"));
        while (s.hasNextLine()){
            ourFile.add(s.nextLine());
        }
        s.close();
        return ourFile;
    }

    public ArrayList<String> updateDb(){
        StringBuilder helpString = new StringBuilder();
        for (Notes ourTask : ourTasks) {
            helpString.append(ourTask);
        }
        ourFile.add(helpString.toString());
        return ourFile;
    }

    public ArrayList<String> remove(int num){
        ourFile.remove(num-1);
        return ourFile;
    }

    public void showAllNotes(){
        int num = 1;
        for (String el: ourFile) {
            System.out.printf("%d) %s\n",num, el);
        }
        System.out.println();
    }

    public void write(){
        StringBuilder helpString2 = new StringBuilder();
        for (String s : ourFile) {
            if (helpString2.length()>0) helpString2.append("\n");
            helpString2.append(s);
        }

        try (FileWriter fw = new FileWriter("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_05\\dataBase\\notebook.txt", false)) {
            fw.append(helpString2);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}