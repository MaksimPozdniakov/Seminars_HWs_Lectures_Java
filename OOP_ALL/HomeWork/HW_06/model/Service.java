package OOP_ALL.HomeWork.HW_06.model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Service {
    void getNote(ArrayList<String> ourTasks);

    void showAll();

    ArrayList<String> read() throws FileNotFoundException;

    void write();

    ArrayList<String> removeNote(int index);
}
