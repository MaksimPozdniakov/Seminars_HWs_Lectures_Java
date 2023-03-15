package OOP_ALL.Seminars.Seminar_03;

public class Circle extends Figure {

    protected double radius;

    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius < 0) {
            throw new Exception(String.format("Круг с радиусом %f не может существовать", radius));
        }
    }

    @Override
    protected double area() {
        return Math.PI * radius * radius;
    }

    @Override
    protected double perimeter() {
        return 2 * Math.PI * radius;
    }
}
