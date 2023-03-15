package OOP_ALL.Seminars.Seminar_03;

public class Triangle extends Figure {

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if (!((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB)) {
            throw new Exception("Треугольник с такими сторонами не может существовать");
        }
    }

    @Override
    protected double area() {
        double halfP = this.perimeter() / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    @Override
    protected double perimeter() {
        return sideA + sideB + sideC;
    }
}
