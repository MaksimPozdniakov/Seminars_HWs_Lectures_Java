package OOP_ALL.HomeWork.HW_01;

public class Nipple extends ChildrenProducts{
    public Nipple(String nameGoods, Integer price, Integer quantity, String unit,
                  Integer minimumAge, String hypoallergenic) {
        super(nameGoods, price, quantity, unit, minimumAge, hypoallergenic);
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", минимальный возраст: " + minimumAge + " месяцев, " + "гипоалергенные? " + hypoallergenic;
    }

}
