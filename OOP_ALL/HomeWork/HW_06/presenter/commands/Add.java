package OOP_ALL.HomeWork.HW_06.presenter.commands;

import OOP_ALL.HomeWork.HW_06.view.NewConsoleUI;
import java.io.FileNotFoundException;

public class Add extends Command {


    public Add(NewConsoleUI console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить заметку";
    }

    @Override
    public void execute() throws FileNotFoundException {
        getConsole().addNewNote();
    }
}
