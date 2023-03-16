package OOP_ALL.HomeWork.HW_03;

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

        figures.showAll();


    }
}
