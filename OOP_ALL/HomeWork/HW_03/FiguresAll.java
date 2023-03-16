package OOP_ALL.HomeWork.HW_03;

import OOP_ALL.HomeWork.HW_03.Figures.BaseClass.Figure;

import java.util.ArrayList;

public class FiguresAll {
    private ArrayList<Figure> figures;

    public FiguresAll() {
        this.figures = new ArrayList<>();
    }

    public void addNewFigure(Figure figure) {
        this.figures.add(figure);
    }

    public void showAll() {
        int number = 1;
        for (Figure el: figures) {
            System.out.printf("%d) Фигура %s: %s",number, el.getClass().getSimpleName(), el);
        }
    }
}
