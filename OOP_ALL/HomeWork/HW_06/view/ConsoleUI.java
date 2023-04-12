package OOP_ALL.HomeWork.HW_06.view;

import OOP_ALL.HomeWork.HW_06.model.categories.ImportantThings;
import OOP_ALL.HomeWork.HW_06.model.categories.ProductList;
import OOP_ALL.HomeWork.HW_06.model.categories.UnimportantThings;
import OOP_ALL.HomeWork.HW_06.presenter.Presenter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleUI implements View{

    protected Scanner scanner;
    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }


    private Presenter presenter;
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void start() throws FileNotFoundException {
        while (true) {
            String textMenu = """
                    1. Открыть блакнот
                    2. Показать все записи
                    3. Добавить новую запись
                    4. Удалить запись
                    5. Сохранить изменения
                    6. Поиск
                    7. Закрыть блакнот
                    """;
            System.out.println(textMenu);
            System.out.print("\tСделайте выбор: ");
            int ourChoice = scanner.nextInt();
            switch (ourChoice) {
                case 1 -> {
                    presenter.readBook();
                    System.out.println();
                    System.out.println("\tБлокнот открыт!");
                    System.out.println();
                }
                case 2 -> {
                    presenter.print();
                    System.out.println();
                }
                case 3 -> addNewNote();
                case 4 -> deleteNote();
                case 5 -> presenter.writeBook();
                case 6 -> search();
                case 7 -> {
                    System.out.println("Блокнот закрыт");
                    System.exit(0);
                }
            }
        }
    }

    public void addNewNote() throws FileNotFoundException {
        boolean flag = true;
        while (true) {
            String textMenu = """
                1. Добавить важную задачу
                2. Добавить неважную задачу
                3. Добавить новый элемент в список покупок
                4. Вернуться в главное меню
                """;
            System.out.println(textMenu);
            System.out.print("\tСделайте выбор: ");
            int ourChoice = scanner.nextInt();
            scanner.nextLine();

            switch (ourChoice) {
                case 1 -> {
                    System.out.print("\tУкажите дату добавления: ");
                    String date1 = scanner.nextLine();
                    System.out.print("\tУкажите дедлайн: ");
                    String deadline1 = scanner.nextLine();
                    System.out.print("\tУкажите название задачи: ");
                    String nameThing1 = scanner.nextLine();
                    System.out.print("\tНапишите описание задачи: ");
                    String text1 = scanner.nextLine();
                    presenter.addNote(new ImportantThings(date1, deadline1, nameThing1, text1));

                }
                case 2 -> {
                    System.out.print("\tУкажите дату добавления: ");
                    String date2 = scanner.nextLine();
                    System.out.print("\tУкажите название задачи: ");
                    String nameThing2 = scanner.nextLine();
                    System.out.print("\tНапишите описание задачи: ");
                    String text2 = scanner.nextLine();
                    presenter.addNote(new UnimportantThings(date2, nameThing2, text2));

                }
                case 3 -> {
                    System.out.print("\tУкажите дату добавления: ");
                    String date3 = scanner.nextLine();
                    System.out.print("\tУкажите название задачи: ");
                    String nameThing3 = scanner.nextLine();
                    System.out.print("\tНапишите описание задачи: ");
                    String text3 = scanner.nextLine();
                    presenter.addNote(new ProductList(date3, nameThing3, text3));
                }
                case 4 -> flag = false;
            }
            if (!flag){
                break;
            }
        }
        start();
    }

    public void deleteNote(){
        presenter.print();
        System.out.print("Какою запись будем удалять? ");
        int choice = scanner.nextInt();
        presenter.remove(choice);
    }

    public void search(){
        System.out.print("Что ищем? ");
        String choice = scanner.next();
//        scanner.nextLine();
        presenter.searchStr(choice);
    }
}
