package OOP_ALL.HomeWork.HW_06.presenter.commands;

import OOP_ALL.HomeWork.HW_06.view.NewConsoleUI;

import java.io.FileNotFoundException;

public abstract class Command {

    protected NewConsoleUI console;

    public Command(NewConsoleUI console){
        this.console = console;
    }

    public abstract String description();

    public NewConsoleUI getConsole(){
        return console;
    }

    public abstract void execute() throws FileNotFoundException;


}
