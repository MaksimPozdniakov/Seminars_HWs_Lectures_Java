package OOP_ALL.HomeWork.HW_06;

import OOP_ALL.HomeWork.HW_06.model.Notebook;
import OOP_ALL.HomeWork.HW_06.model.Service;
import OOP_ALL.HomeWork.HW_06.presenter.Presenter;
import OOP_ALL.HomeWork.HW_06.view.ConsoleUI;
import OOP_ALL.HomeWork.HW_06.view.View;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
//        ConsoleUI start = new ConsoleUI();
//        start.showMenu();
        View view = new ConsoleUI();
        Service service = new Notebook();
        new Presenter(view,service);
        view.start();


    }

}
