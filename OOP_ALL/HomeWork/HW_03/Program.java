package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.Circle.Circle;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Rectangle;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Square;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        FiguresAll figures = new FiguresAll();
        figures.addNewFigure(new Triangle(4,6,7));
        figures.addNewFigure(new Rectangle(2,4,2,4));
        figures.addNewFigure(new Square(2,2,2,2));
        figures.addNewFigure(new Circle(5));

        mainMenu(scanner, figures);

    }

    public static void mainMenu(Scanner scanner, FiguresAll figures) throws Exception {
        String textMenu =
                """
                        1 - Показать информацию обо всех фигурах имеющихся в списке
                        2 - Добавить новую фигуру
                        3 - Удалить фигуру
                        4 - Изменить фигуру
                        5 - Показать только те фигуры у которых есть периметр
                        6 - Показать только те фигуры у которых есть длина окружности
                        7 - Выйти из меню
                        """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int choice = scanner.nextInt();
        nextMenu(scanner,figures, choice);
    }

    public static void nextMenu(Scanner scanner, FiguresAll figures, int choice) throws Exception {
        switch (choice){
            case 1:
                figures.showAll();
                System.out.print("Отсортировать все фигуры по площади от меньшего к большему? (Да/Нет): ");
                String answer = scanner.next();
                answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
                if (answer.equals("Да")){
                    figures.sortFigureArea();
                    figures.showAll();
                }
                break;
            case 2:
                addFigure(scanner, figures);
            case 3:
                figures.showAll();
                System.out.print("\tВыберите фигуру которую хотите удалить: ");
                int ourChoice = scanner.nextInt();
                figures.removeFigure(ourChoice);
                break;
            case 4:
                changeOurFigure(scanner,figures);
                break;
            case 5:
                figures.perimeter();
                break;
            case 6:
                figures.circumference();
                break;
            case 7:
                System.exit(0);
        }
        choiceMenu(scanner,figures);
    }

    public static void addFigure(Scanner scanner, FiguresAll figures) throws Exception {
        String textMenu =
                """
                        Какую фигуру вы собираетесь добавить?
                        1 - Треугольник
                        2 - Прямоугольник
                        3 - Квадрат
                        4 - Круг
                        5 - Вернуться обратно
                        """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Укажите сторону А: ");
                double sideA = scanner.nextInt();
                System.out.print("Укажите сторону B: ");
                double sideB = scanner.nextInt();
                System.out.print("Укажите сторону C: ");
                double sideC = scanner.nextInt();
                figures.addNewFigure(new Triangle(sideA,sideB,sideC));
                break;
            case 2:
                System.out.print("Укажите сторону А и C: ");
                double sideAC = scanner.nextInt();
                System.out.print("Укажите сторону B и D: ");
                double sideBD = scanner.nextInt();
                figures.addNewFigure(new Rectangle(sideAC,sideBD,sideAC,sideBD));
                break;
            case 3:
                System.out.print("Укажите сторону А, остальные заполняться сами: ");
                double side = scanner.nextInt();
                figures.addNewFigure(new Square(side,side,side,side));
                break;
            case 4:
                System.out.print("Укажите радиус: ");
                double radius = scanner.nextInt();
                figures.addNewFigure(new Circle(radius));
                break;

        }
        choiceMenu(scanner,figures);
    }

    public static void choiceMenu(Scanner scanner, FiguresAll figures) throws Exception {
        System.out.print("\tНа этом все? (Да/Нет): ");
        String choice = scanner.next();
        choice = choice.substring(0, 1).toUpperCase() + choice.substring(1);

        if (choice.equals("Нет")) {
            mainMenu(scanner, figures);
        } else {
            System.exit(0);
        }
    }

    public static void changeOurFigure(Scanner scanner, FiguresAll figures) throws Exception{
        figures.showAll();
        System.out.print("Какую фигуру хотите изменить? ");
        int answer = scanner.nextInt();

        if (figures.checkClass(answer).equals("Circle")){
            System.out.print("Введите новый радиус: ");
            double radius = scanner.nextInt();
            figures.changeFigure(answer,new Circle(radius));
        }
        else if (figures.checkClass(answer).equals("Rectangle")) {
            System.out.print("Укажите новую сторону А и C: ");
            double sideAC = scanner.nextInt();
            System.out.print("Укажите новую сторону B и D: ");
            double sideBD = scanner.nextInt();
            figures.changeFigure(answer,new Rectangle(sideAC,sideBD,sideAC,sideBD));
        }
        else if (figures.checkClass(answer).equals("Square")) {
            System.out.print("Укажите сторону А, остальные заполняться сами: ");
            double side = scanner.nextInt();
            figures.changeFigure(answer, new Square(side,side,side,side));
        }
        else if (figures.checkClass(answer).equals("Triangle")) {
            System.out.print("Укажите сторону А: ");
            double sideA = scanner.nextInt();
            System.out.print("Укажите сторону B: ");
            double sideB = scanner.nextInt();
            System.out.println("Укажите сторону C: ");
            double sideC = scanner.nextInt();
            figures.changeFigure(answer, new Triangle(sideA,sideB,sideC));
        }
    }

}
