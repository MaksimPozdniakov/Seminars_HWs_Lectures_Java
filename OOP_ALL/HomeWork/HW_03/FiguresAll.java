package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.BaseClass.Figure;
import OOP_ALL.HomeWork.HW_03.Figures.Circle.Circumference;
import OOP_ALL.HomeWork.HW_03.Figures.Polygon.FigurePerimeter;

import java.util.ArrayList;
import java.util.Collections;

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
            if (figure instanceof Circumference) {
                ((Circumference) figure).circumference();
                System.out.printf("Длина окружности есть у - %s:%s\n",figure.getClass().getSimpleName(),figure);
            }
        }
    }

    public void perimeter() {
        for (Figure figure: figures) {
            if (figure instanceof FigurePerimeter) {
                ((FigurePerimeter) figure).figurePerimeter();
                System.out.printf("Периметр есть у - %s:%s\n",figure.getClass().getSimpleName(),figure);
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

    public void sortFigureArea(){
        Collections.sort(this.figures);
    }

    public Figure changeFigure(int num){
        return this.figures.get(num-1);
    }

}
