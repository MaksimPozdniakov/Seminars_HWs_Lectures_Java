package OOP_ALL.HomeWork.HW_03.Figures.Polygon;

public class Triangle extends Polygon{
    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);

        if (!((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB)) {
            throw new Exception("Треугольник с такими сторонами не может существовать");
        }
    }

    @Override
    public double figureArea() {
        double halfP = this.figurePerimeter() / 2;
        double sideA = this.sides.get(0);
        double sideB = this.sides.get(1);
        double sideC = this.sides.get(2);
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }

    @Override
    public double figurePerimeter() {
        return sides.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String toString(){
        return String.format("Периметр %.2f см, Площадь %.2f см^2 ", figurePerimeter(), figureArea());
    }
}
