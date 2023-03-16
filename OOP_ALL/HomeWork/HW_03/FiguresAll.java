package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.BaseClass.Figure;
import OOP_ALL.HomeWork.HW_03.Figures.Circle.Circumference;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.FigurePerimeter;

import java.util.ArrayList;

public class FiguresAll {
    private ArrayList<Figure> figures;

    public FiguresAll() {
        this.figures = new ArrayList<>();
    }

    public void addNewFigure(Figure figure) {
        this.figures.add(figure);
    }

    public void removeFigure(int num) {
        this.figures.remove(num - 1);
    }

    public void circumference() {
        for (Figure figure: figures) {
            System.out.println(figure.getClass().getSimpleName());
            if (figure instanceof Circumference) {
                ((Circumference) figure).circumference();
            }
        }
    }

    public void perimeter() {
        for (Figure figure: figures) {
            System.out.println(figure.getClass().getSimpleName());
            if (figure instanceof FigurePerimeter) {
                ((FigurePerimeter) figure).figurePerimeter();
            }
        }
    }

    public void showAll() {
        int number = 1;
        for (Figure el: figures) {
            System.out.printf("%d) Фигура %s: %s\n",number, el.getClass().getSimpleName(), el);
            number++;
        }
    }
}
