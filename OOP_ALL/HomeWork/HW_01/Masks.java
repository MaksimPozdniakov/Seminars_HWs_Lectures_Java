package OOP_ALL.HomeWork.HW_01;

public class Masks extends HygieneItems{
    public Masks(String nameGoods, Integer price, Integer quantity, String unit, Integer numberOfPiecesPerPack) {
        super(nameGoods, price, quantity, unit, numberOfPiecesPerPack);
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", количество штук в упаковке: " + numberOfPiecesPerPack;
    }

}
