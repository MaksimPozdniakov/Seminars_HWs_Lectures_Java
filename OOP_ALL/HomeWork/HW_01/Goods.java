package OOP_ALL.HomeWork.HW_01;

public class Goods {
    protected String nameGoods;
    protected Integer price;
    protected Integer quantity;
    protected String unit;

    public Goods(String nameGoods, Integer price, Integer quantity, String unit) {
        this.nameGoods = nameGoods;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String toString() {
            return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit;
    }

}
