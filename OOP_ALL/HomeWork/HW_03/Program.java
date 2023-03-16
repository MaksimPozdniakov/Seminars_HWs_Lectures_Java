package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.Circle.Circle;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Rectangle;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Square;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Triangle;

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

//        figures.showAll();
    }

    public static void mainMenu(Scanner scanner, FiguresAll figures){
        String textMenu =
                """
                        1 - Показать информацию обо всех фигурах имеющихся в списке
                        2 - Добавления новой фигуры
                        3 - Удаления фигуры
                        4 - Изменения фигуры по ндексу
                        """;
        System.out.println(textMenu);
        System.out.print("\tСделайте выбор: ");
        int choice = scanner.nextInt();
        nextMenu(figures, choice);
    }

    public static void nextMenu(FiguresAll figures, int choice){
        switch (choice){
            case 1:
                figures.showAll();
        }
    }

}
