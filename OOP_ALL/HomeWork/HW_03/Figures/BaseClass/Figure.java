package OOP_ALL.HomeWork.HW_03.Figures.BaseClass;

public abstract class Figure implements Comparable<Figure>{
    public abstract double figureArea();

    public String toString(){
        return String.format("Площадь %.2f см^2", figureArea());
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.figureArea(), o.figureArea());
    }

}
