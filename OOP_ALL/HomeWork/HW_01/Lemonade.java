package OOP_ALL.HomeWork.HW_01;

public class Lemonade extends Drinks{

    public Lemonade(String nameGoods, Integer price, Integer quantity, String unit, String volume) {
        super(nameGoods, price, quantity, unit, volume);
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", объём: " + volume;
    }
}
