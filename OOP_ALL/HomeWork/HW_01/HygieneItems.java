package OOP_ALL.HomeWork.HW_01;

public class HygieneItems extends Goods{
    protected Integer numberOfPiecesPerPack;
    public HygieneItems(String nameGoods, Integer price, Integer quantity, String unit, Integer numberOfPiecesPerPack) {
        super(nameGoods, price, quantity, unit);
        this.numberOfPiecesPerPack = numberOfPiecesPerPack;
    }

    @Override
    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", количество штук в упаковке: " + numberOfPiecesPerPack;
    }

}
