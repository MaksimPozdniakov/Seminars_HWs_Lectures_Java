package OOP_ALL.HomeWork.HW_01;

public class Diapers extends ChildrenProducts{
    protected String size;
    protected Integer minimumWeight;
    protected Integer maximumWeight;
    protected String type;
    public Diapers(String nameGoods, Integer price, Integer quantity, String unit,
                   Integer minimumAge, String hypoallergenic, String size, Integer minimumWeight,
                   Integer maximumWeight, String type) {
        super(nameGoods, price, quantity, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.type = type;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", минимальный возраст: " + minimumAge + " месяцев, " + "гипоалергенные?: " + hypoallergenic +
                ", размер: " + size + ", минимальный вес: " + minimumWeight + " кг, " + "максимальный вес: " +
                maximumWeight + " кг, " + "тип: " + type;
    }

}
