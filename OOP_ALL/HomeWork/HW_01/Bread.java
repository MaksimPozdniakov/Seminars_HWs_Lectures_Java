package OOP_ALL.HomeWork.HW_01;

public class Bread extends FoodProducts{
    protected String typeOfFlour;
    public Bread(String nameGoods, Integer price, Integer quantity, String unit,
                 String expirationDate, String typeOfFlour) {
        super(nameGoods, price, quantity, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", срок годности: " + expirationDate + ", тип муки: " + typeOfFlour;
    }

}
