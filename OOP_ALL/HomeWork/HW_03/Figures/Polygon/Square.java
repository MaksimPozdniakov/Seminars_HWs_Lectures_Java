package OOP_ALL.HomeWork.HW_03.Figures.Polygon;

public class Square extends Polygon implements FigurePerimeter{
    public Square(double sideA, double sideB, double sideC, double sideD) throws Exception {
        super(sideA, sideB, sideC, sideD);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);
        this.sides.add(sideD);
        if (sideA<sideB && sideA<sideC && sideA<sideD){
            throw new Exception("Такого квадрата не может быть!");
        }
    }

    public double figureArea() {
        return this.sides.get(0) * this.sides.get(0);
    }

    public double figurePerimeter() {
//        double sum = 0;
//        for (double side : this.sides) {
//            sum += side;
//        }
//        return sum;
        return sides.stream().mapToDouble(Double::doubleValue).sum();
    }

    public String toString() {
        return String.format("Периметр %.2f см, Площадь %.2f см^2 ", figurePerimeter(), figureArea());
    }

}
