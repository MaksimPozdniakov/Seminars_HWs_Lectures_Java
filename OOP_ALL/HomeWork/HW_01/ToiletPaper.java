package OOP_ALL.HomeWork.HW_01;

public class ToiletPaper extends HygieneItems{
    protected Integer numberOfLayers;

    public ToiletPaper(String nameGoods, Integer price, Integer quantity, String unit,
                       Integer numberOfPiecesPerPack, Integer numberOfLayers) {
        super(nameGoods, price, quantity, unit, numberOfPiecesPerPack);
        this.numberOfLayers = numberOfLayers;
    }

    public String toString() {
        return nameGoods + ", цена: " + price + " руб" + ", количество: " + quantity + " " + unit +
                ", количество штук в упаковке: " + numberOfPiecesPerPack + ", " + numberOfLayers + " слоя";
    }

}
