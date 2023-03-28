package OOP_ALL.HomeWork.HW_06.model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Notebook implements Service{
    protected ArrayList<String> modelArrayList = new ArrayList<>();


    @Override
    public void getNote(ArrayList<String> ourTask) {
        modelArrayList.addAll(ourTask);
    }

    public void showAll(){
        int num = 1;
        for (String el: modelArrayList) {
            System.out.printf("\t%d) %s\n",num,el);
            num++;
        }
    }

    public ArrayList<String> read() throws FileNotFoundException {
        ReadFile ourDb = new ReadFile("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_06\\db\\file.txt");
        ourDb.read(modelArrayList);
        return modelArrayList;
    }

    public void write(){
        WriteFile ourDb = new WriteFile("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_06\\db\\file.txt");
        ourDb.write(modelArrayList);
    }

    public ArrayList<String> removeNote(int index){
        modelArrayList.remove(index-1);
        return modelArrayList;
    }

}
