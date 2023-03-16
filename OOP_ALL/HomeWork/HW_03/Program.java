package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.Polygon.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FiguresAll figures = new FiguresAll();
        figures.addNewFigure(new Triangle(4,6,7));

        figures.showAll();


    }
}
