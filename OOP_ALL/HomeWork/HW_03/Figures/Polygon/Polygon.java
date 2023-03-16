package OOP_ALL.HomeWork.HW_03.Figures.Polygon;

import OOP_ALL.HomeWork.HW_03.Figures.BaseClass.Figure;

import java.util.ArrayList;

public abstract class Polygon extends Figure {
    protected ArrayList<Double> sides = new ArrayList<>();

    protected Polygon(double... sides) throws Exception{
        for (double side: sides) {
            if (side < 0) {
                throw new Exception("Стороны фигур должны быть больше 0!");
            }
        }
    }

    public abstract double figurePerimeter();

    @Override
    public String toString(){
        return String.format("Периметр %.2f см", figurePerimeter());
    }


}
