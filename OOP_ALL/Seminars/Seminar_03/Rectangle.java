package OOP_ALL.Seminars.Seminar_03;

public class Rectangle extends Figure{

    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    protected double area() {
        return sideA * sideB;
    }

    @Override
    protected double perimeter() {
        return 2 * (sideA + sideB);
    }

}
