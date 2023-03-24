package OOP_ALL.HomeWork.HW_05.view;

import OOP_ALL.HomeWork.HW_05.model.categories.ImportantThings;
import OOP_ALL.HomeWork.HW_05.model.categories.ProductList;
import OOP_ALL.HomeWork.HW_05.model.categories.UnimportantThings;
import OOP_ALL.HomeWork.HW_05.presenter.Notebook;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUI {

    protected Scanner scanner;
    Notebook notes = new Notebook();

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() throws IOException {
        while (true) {
            String textMenu = """
                    1. Открыть блакнот
                    2. Показать все записи
                    3. Добавить новую запись
                    4. Удалить запись
                    5. Сохранить изменения
                    6. Закрыть блакнот
                    """;
            System.out.println(textMenu);
            System.out.print("\tСделайте выбор: ");
            int ourChoice = scanner.nextInt();
            switch (ourChoice) {
                case 1 -> notes.readFile();
                case 2 -> notes.showAllNotes();
                case 3 -> addNewNote();
                case 4 -> removeNote();
                case 5 -> notes.write();
                case 6 -> System.exit(0);
            }

        }
    }


    public void addNewNote() throws IOException {
//        boolean flag = true;
        int flag = 1;
        while (flag == 1) {
            String textMenu = """
                1. Добавить важную задачу
                2. Добавить неважную задачу
                3. Дополнить новый элемент в список покупок
                4. Вернуться в главное меню
                """;
            System.out.println(textMenu);
            System.out.print("\tСделайте выбор: ");
            int ourChoice = scanner.nextInt();
            scanner.nextLine();
//            boolean flag = true;
//            String flag = "+";

            System.out.print("Укажите дату добавления: ");
            String date = scanner.nextLine();
            System.out.print("Укажите название задачи: ");
            String nameThing = scanner.nextLine();
            System.out.print("Напишите описание задачи: ");
            String text = scanner.nextLine();

            switch (ourChoice){
                case 1:
                    System.out.print("Укажите дедлайн: ");
                    String deadline = scanner.nextLine();
                    notes.addNote(new ImportantThings(date,deadline,nameThing,text));
                    break;
                case 2:
                    notes.addNote(new UnimportantThings(date,nameThing,text));
                    break;
                case 3:
                    notes.addNote(new ProductList(date,nameThing,text));
                    break;
                case 4:
                    flag = 0;
                    break;
            }
        }
        notes.updateDb();
        showMenu();
    }

    public void removeNote(){
        notes.showAllNotes();
        System.out.print("Какою запись будем удалять? ");
        int choice = scanner.nextInt();
        notes.remove(choice);
    }
}
