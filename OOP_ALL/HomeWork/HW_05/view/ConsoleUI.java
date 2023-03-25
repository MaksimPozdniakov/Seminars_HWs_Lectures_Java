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
                case 1 -> {
                    notes.readFile();
                    System.out.println("Блакнот открыт!");
                }
                case 2 -> notes.showAllNotes();
                case 3 -> addNewNote();
                case 4 -> removeNote();
                case 5 -> notes.write();
                case 6 -> System.exit(0);
            }
        }
    }


    public void addNewNote() throws IOException {
        boolean flag = true;
        while (true) {
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

//            System.out.print("Укажите дату добавления: ");
//            String date = scanner.nextLine();
//            System.out.print("Укажите название задачи: ");
//            String nameThing = scanner.nextLine();
//            System.out.print("Напишите описание задачи: ");
//            String text = scanner.nextLine();

            switch (ourChoice) {
                case 1 -> {
                    System.out.print("Укажите дату добавления: ");
                    String date1 = scanner.nextLine();
                    System.out.print("Укажите дедлайн: ");
                    String deadline1 = scanner.nextLine();
                    System.out.print("Укажите название задачи: ");
                    String nameThing1 = scanner.nextLine();
                    System.out.print("Напишите описание задачи: ");
                    String text1 = scanner.nextLine();
                    notes.addNote(new ImportantThings(date1, deadline1, nameThing1, text1));
                }
                case 2 -> {
                    System.out.print("Укажите дату добавления: ");
                    String date2 = scanner.nextLine();
                    System.out.print("Укажите название задачи: ");
                    String nameThing2 = scanner.nextLine();
                    System.out.print("Напишите описание задачи: ");
                    String text2 = scanner.nextLine();
                    notes.addNote(new UnimportantThings(date2, nameThing2, text2));
                }
                case 3 -> {
                    System.out.print("Укажите дату добавления: ");
                    String date3 = scanner.nextLine();
                    System.out.print("Укажите название задачи: ");
                    String nameThing3 = scanner.nextLine();
                    System.out.print("Напишите описание задачи: ");
                    String text3 = scanner.nextLine();
                    notes.addNote(new ProductList(date3, nameThing3, text3));
                }
                case 4 -> flag = false;
            }
            if (!flag){
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
