package OOP_ALL.HomeWork.HW_06.presenter.commands;

import OOP_ALL.HomeWork.HW_06.view.NewConsoleUI;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    protected List<Command> commandList;

    public MainMenu(NewConsoleUI console){
        commandList = new ArrayList<>();
        commandList.add(new Add(console));
    }

    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n======== Главное меню ========\n");
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append("\t");
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public int getSizeMenu(){
        return commandList.size();
    }

    public void execute(int num) throws FileNotFoundException {
        Command option = commandList.get(num);
        option.execute();
    }

}
