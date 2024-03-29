package OOP_ALL.HomeWork.HW_03.Figures.Circle;

import OOP_ALL.HomeWork.HW_03.Figures.BaseClass.Figure;

public class Circle extends Figure implements Circumference {

    protected double radius;

    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius<1){
            throw new Exception("Такого круга не может быть!");
        }
    }

    @Override
    public double figureArea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Длина окружности %.2f см, Площадь %.2f см^2 ", circumference(), figureArea());
    }
}
