package OOP_ALL.HomeWork.HW_06.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    protected String path;

    public WriteFile(String path) {
        this.path = path;
    }

    public void write(ArrayList<String> modelArrayList){
        StringBuilder stringBuilder = new StringBuilder();
        for (String el: modelArrayList) {
            if (stringBuilder.length()>0) stringBuilder.append("\n");
            stringBuilder.append(el);
        }

        try (FileWriter fw = new FileWriter(path, false)) {
            fw.append(stringBuilder);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
