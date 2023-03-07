package OOP_ALL.HomeWork.HW_01;

public class Eggs extends FoodProducts{
    protected Integer quantityInThePackage;
    public Eggs(String nameGoods, Integer price, Integer quantity, String unit,
                String expirationDate, Integer quantityInThePackage) {
        super(nameGoods, price, quantity, unit, expirationDate);
        this.quantityInThePackage = quantityInThePackage;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", срок годности: " + expirationDate + ", количество в упаковке: " + quantityInThePackage + " шт";
    }

}
