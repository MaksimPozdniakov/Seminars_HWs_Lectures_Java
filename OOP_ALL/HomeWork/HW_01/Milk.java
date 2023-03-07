package OOP_ALL.HomeWork.HW_01;

public class Milk extends Drinks{
    protected double percentageOfFatContent;
    protected String expirationDate;
    public Milk(String nameGoods, Integer price, Integer quantity, String unit,
                String volume, double percentageOfFatContent, String expirationDate) {
        super(nameGoods, price, quantity, unit, volume);
        this.expirationDate = expirationDate;
        this.percentageOfFatContent = percentageOfFatContent;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", объём: " + volume + ", процент жирности: " + percentageOfFatContent + ", срок годности: " +
                expirationDate;
    }

}
