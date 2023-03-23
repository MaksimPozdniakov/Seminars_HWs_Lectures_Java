package OOP_ALL.HomeWork.HW_05;

import OOP_ALL.HomeWork.HW_05.Model.Categories.ImportantThings;

public class Program {
    public static void main(String[] args) {
        Notebook notes = new Notebook();
        notes.addNote(new ImportantThings("21.02.2023", "23.02.2023", "Помыть собаку", "Жена просила помыть собаку"));

        notes.showAll();
        notes.write();

    }


}
