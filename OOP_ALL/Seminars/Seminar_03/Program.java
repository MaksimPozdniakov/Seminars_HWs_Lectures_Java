package OOP_ALL.Seminars.Seminar_03;

public class Program {
    public static void main(String[] args) throws Exception {
        Figure[] figures = new Figure[]{
                new Rectangle(4,5),
                new Square(5),
                new Triangle(7,14,10),
        };
        System.out.printf("Периметр прямоугольника со сторонами %.2f и %.2f = %.2f",((Rectangle)figures[0]).getSideA(),
                ((Rectangle)figures[0]).getSideB(), figures[0].perimeter());
        System.out.println();
//        System.out.printf("Площадь прямоугольника со сторонами %f и %f = %f",figures[0].area());
        System.out.println(figures[1].perimeter());
        System.out.println(figures[1].area());
        System.out.println(figures[2].perimeter());
        System.out.println(figures[2].area());
    }
}
