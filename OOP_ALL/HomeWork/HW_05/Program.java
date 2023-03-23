package OOP_ALL.HomeWork.HW_05;

import OOP_ALL.HomeWork.HW_05.model.categories.ImportantThings;
import OOP_ALL.HomeWork.HW_05.presenter.Notebook;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Notebook notes = new Notebook();
        notes.addNote(new ImportantThings("21.02.2023", "23.02.2023", "Помыть собаку",
                "Жена просила помыть собаку"));


        notes.write();
        notes.read();
    }
}
