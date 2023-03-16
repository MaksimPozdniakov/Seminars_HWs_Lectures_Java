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

        mainMenu();

//        figures.showAll();
    }
    public static void mainMenu(){
        String textMenu =
                """
                        1 - Показать информацию обо всех фигурах имеющихся в списке \n
                        2 - Добавления новой фигуры \n
                        3 - Удаления фигуры \n
                        4 - Изменения фигуры по ндексу
                        """;
        System.out.println(textMenu);
    }
}
