package OOP_ALL.HomeWork.HW_01;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Goods> goods = new HashSet<>();
        Goods goods1 = new Milk("Молоко",100,50,"шт","1 литр",
                3.2,"2 недели");
        Goods goods2 = new Lemonade("Дюшес",210,100,"шт","2 литра");
        Goods goods3 = new Bread("Хлеб",40,10,"шт","5 дней",
                "пшеничная");
        Goods goods4 = new Eggs("Яйца",130,40,"шт","1 неделя",
                10);
        Goods goods5 = new Masks("Маски",304,50,"шт",100);
        Goods goods6 = new ToiletPaper("Туалетная бумага",250,10,"шт",12,
                3);
        Goods goods7 = new Diapers("Подгузники", 1320,10,"шт",5,"да",
                "l",6,9,"премиум");
        Goods goods8 = new Nipple("Соска", 750,10,"шт",6,"Да");

        goods.add(goods1);
        goods.add(goods2);
        goods.add(goods3);
        goods.add(goods4);
        goods.add(goods5);
        goods.add(goods6);
        goods.add(goods7);
        goods.add(goods8);

        Program.showAll(goods);

    }
}
