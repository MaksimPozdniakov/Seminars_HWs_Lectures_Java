package OOP_ALL.HomeWork.HW_05.view;

import OOP_ALL.HomeWork.HW_05.model.categories.ImportantThings;
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
                4. Сохранить изменения
                5. Выйти из программы
                """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int ourChoice = scanner.nextInt();
        menu(ourChoice);
    }

    public void menu(int ourChoice) throws IOException {
        switch (ourChoice) {
            case 1 -> notes.read();
            case 2 -> addNewNote();
            case 4 -> notes.write();
            case 5 -> System.exit(0);
        }
    }

    public void addNewNote(){
        String textMenu = """
                1. Добавить важную задачу
                2. Добавить неважную задачу
                3. Дополнить список покупок
                4. Выйти из программы
                """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int ourChoice = scanner.nextInt();

        System.out.print("Укажите дату добавления: ");
        String date = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Укажите название задачи: ");
        String nameThing = scanner.nextLine();
        System.out.print("Напишите описание задачи: ");
        String text = scanner.nextLine();

        switch (ourChoice){
            case 1:
                System.out.print("Укажите дедлайн: ");
                String deadline = scanner.nextLine();
                notes.addNote(new ImportantThings(date,deadline,nameThing,text));
        }
    }

}
