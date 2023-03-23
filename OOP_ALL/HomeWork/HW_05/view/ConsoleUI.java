package OOP_ALL.HomeWork.HW_05.view;

import OOP_ALL.HomeWork.HW_05.presenter.Notebook;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUI {

    protected Scanner scanner;// = new Scanner(System.in);
    Notebook notes = new Notebook();

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() throws IOException {
        String textMenu = """
                1. Показать все записи
                2. Добавить новую запись
                3. Удалить запись
                4. Выйти из программы
                """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int ourChoice = scanner.nextInt();
        menu(ourChoice);
    }

    public void menu(int ourChoice) throws IOException {
        switch (ourChoice){
            case 1:
                notes.read();
            case 4:
                System.exit(0);

        }
    }


}
