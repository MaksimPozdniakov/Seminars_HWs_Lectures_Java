package OOP_ALL.HomeWork.HW_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ourScanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cat(20,7,"Grey", "Pups", "Cats", "Yes",
                "Red", "12.09.2020","Yes"));
        zoo.addAnimals(new Chicken(30,2,"Green",0));

        int ourSelection = navigationMenu(ourScanner);
        choiceMenu(ourSelection, zoo,ourScanner);
    }

    public static int navigationMenu(Scanner ourScanner) {
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Показать всех животных в зоопарке");
        menu.put(2, "Добавить новое животное в зоопарк");
        menu.put(3, "Удалить животное из зоопарка");
        menu.put(4, "Заставить всех животных издать звук");
        for (Map.Entry <Integer, String> el: menu.entrySet()) {
            System.out.println(el);
        }
        System.out.print("\tСделайте выбор: ");
        return ourScanner.nextInt();
    }

    public static void choiceMenu(int ourSelection, Zoo zoo, Scanner ourScanner) {
        switch (ourSelection){
            case 1:
                zoo.showAllAnimal();
                System.out.print("\tВыберите животное или птицу, чтобы получить больше информации: ");
                int newSelection = ourScanner.nextInt();
                informationAboutAnimal(zoo, ourScanner, newSelection);
            case 2:
//                zoo.addAnimals(new Chicken(5,5,"Green", 0));
        }
    }
    public static void informationAboutAnimal(Zoo zoo, Scanner ourScanner, int newSelection){

        switch (newSelection) {
            case 1:
                HashMap<Integer, String> menu = new HashMap<>();
                menu.put(1, "Показать информацию о животном");
                menu.put(2, "Издать звук");
                menu.put(3, "Проявить ласку");

                for (Map.Entry<Integer, String> el : menu.entrySet()) {
                    System.out.println(el);
                }
                System.out.print("\tЧто хотите узнать? ");
                int newSelection2 = ourScanner.nextInt();
                switch (newSelection2) {
                    case 1:
                        zoo.showInformation(newSelection);
                        break;
                    case 2:
                        zoo.makeSoundAnimal(newSelection);
                        break;
                    case 3:
//                        zoo.showAffection();
                }
            case 2:
                HashMap<Integer, String> menu2 = new HashMap<>();
                menu2.put(1, "Показать информацию о животном");
                menu2.put(2, "Издать звук");
                menu2.put(3, "Полетать");

        }
    }
}
