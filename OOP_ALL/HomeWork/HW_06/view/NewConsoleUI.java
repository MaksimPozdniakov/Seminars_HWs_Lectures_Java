package OOP_ALL.HomeWork.HW_06.view;

import OOP_ALL.HomeWork.HW_06.model.categories.ImportantThings;
import OOP_ALL.HomeWork.HW_06.model.categories.ProductList;
import OOP_ALL.HomeWork.HW_06.model.categories.UnimportantThings;
import OOP_ALL.HomeWork.HW_06.presenter.Presenter;
import OOP_ALL.HomeWork.HW_06.presenter.commands.MainMenu;
import OOP_ALL.HomeWork.HW_06.presenter.commands.Validator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewConsoleUI implements View {

    protected Scanner scanner;
    protected Presenter presenter;
    protected MainMenu menu;
    private final Validator validator = new Validator();
    private boolean workNotebook;


    public NewConsoleUI(){
        scanner = new Scanner(System.in);
    }


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() throws FileNotFoundException {
        menu = new MainMenu(this);
        do {
            printMenu();
            System.out.print("Выберите пункт меню: ");
            String text = scanner.next();
            int choice = validator.checkInput(text, menu.getSizeMenu());
            if (choice != -1) {
                menu.execute(choice - 1);
            } else {
                System.out.printf("\nВведите число от 1 до %d!\n", menu.getSizeMenu());
            }
        } while (workNotebook);
    }

    public void printMenu(){
        System.out.println(menu.printMenu());
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
}
