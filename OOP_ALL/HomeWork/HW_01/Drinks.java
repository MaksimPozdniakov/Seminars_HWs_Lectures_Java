package OOP_ALL.HomeWork.HW_01;

public class Drinks extends Goods{
    protected String volume;
    public Drinks(String nameGoods, Integer price, Integer quantity, String unit, String volume) {
        super(nameGoods, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", объём: " + volume;
    }
}
