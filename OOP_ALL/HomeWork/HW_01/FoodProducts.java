package OOP_ALL.HomeWork.HW_01;

public class FoodProducts extends Goods{

    protected String expirationDate;

    public FoodProducts(String nameGoods, Integer price, Integer quantity, String unit, String expirationDate) {
        super(nameGoods, price, quantity, unit);
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", срок годности: " + expirationDate;
    }
}
