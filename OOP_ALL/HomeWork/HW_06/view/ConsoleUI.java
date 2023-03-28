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

    @Override
    public void print() {
        presenter.print();
    }

    public void start() throws FileNotFoundException {
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
                    presenter.readBook();
                    System.out.println();
                    System.out.println("\tБлакнот открыт!");
                    System.out.println();
                }
                case 2 -> {
                    print();
                    System.out.println();
                }
                case 3 -> addNewNote();
                case 4 -> deleteNote();
                case 5 -> presenter.writeBook();
                case 6 -> System.exit(0);
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
//                    notebook.addImportantNote(date1, deadline1, nameThing1, text1);
                    presenter.addNote(new ImportantThings(date1, deadline1, nameThing1, text1));

                }
                case 2 -> {
                    System.out.print("\tУкажите дату добавления: ");
                    String date2 = scanner.nextLine();
                    System.out.print("\tУкажите название задачи: ");
                    String nameThing2 = scanner.nextLine();
                    System.out.print("\tНапишите описание задачи: ");
                    String text2 = scanner.nextLine();
//                    notebook.addUnimportantNote(date2, nameThing2, text2);
                    presenter.addNote(new UnimportantThings(date2, nameThing2, text2));

                }
                case 3 -> {
                    System.out.print("\tУкажите дату добавления: ");
                    String date3 = scanner.nextLine();
                    System.out.print("\tУкажите название задачи: ");
                    String nameThing3 = scanner.nextLine();
                    System.out.print("\tНапишите описание задачи: ");
                    String text3 = scanner.nextLine();
//                    notebook.addProductListNote(date3, nameThing3, text3);
                    presenter.addNote(new ProductList(date3, nameThing3, text3));
                }
                case 4 -> flag = false;
            }
            if (!flag){
                break;
            }
        }
//        notebook.upModelArrayList();
        start();
    }

    public void deleteNote(){
        print();
        System.out.print("Какою запись будем удалять? ");
        int choice = scanner.nextInt();
        presenter.remove(choice);
    }
}
