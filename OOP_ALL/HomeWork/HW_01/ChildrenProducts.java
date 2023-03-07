package OOP_ALL.HomeWork.HW_01;

public class ChildrenProducts extends Goods{
    protected Integer minimumAge;
    protected String hypoallergenic;
    public ChildrenProducts(String nameGoods, Integer price, Integer quantity, String unit,
                            Integer minimumAge, String hypoallergenic) {
        super(nameGoods, price, quantity, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", минимальный возраст: " + minimumAge + " лет, " + "Гипоаллергенность: " + hypoallergenic;
    }

}
