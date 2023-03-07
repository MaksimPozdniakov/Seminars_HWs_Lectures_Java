package OOP_ALL.HomeWork.HW_01;

import java.util.HashSet;

public class Program {
    public static void showAll(HashSet<Goods> goods) {
        int num = 1;
        for (Goods item : goods) {
            System.out.printf("Продукт %d : %s \n", num, item);
            num++;
        }
    }
}
