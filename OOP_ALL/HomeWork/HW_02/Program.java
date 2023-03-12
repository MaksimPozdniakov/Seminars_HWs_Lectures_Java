package OOP_ALL.HomeWork.HW_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ourScanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cat(10,10,"Grey", "Pups", "Cats", "Yes",
                "Red", 2,"Yes"));

//        zoo.makeSoundAnimal();

//        zoo.showAllAnimal();
        int ourSelection = navigationMenu(ourScanner);
        choiceMenu(ourSelection, zoo);
    }

    public static int navigationMenu(Scanner ourScanner) {
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Показать всех животных в зоопарке");
        menu.put(2, "Добавить новое животное в зоопарк");
        menu.put(3, "Удалить животное из зоопарка");
        for (Map.Entry <Integer, String> el: menu.entrySet()) {
            System.out.println(el);
        }
        System.out.print("Сделайте выбор: ");
        return ourScanner.nextInt();
    }

    public static void choiceMenu(int ourSelection,Zoo zoo) {
        switch (ourSelection){
            case 1:
                zoo.showAllAnimal();
            case 2:
                zoo.addAnimals(new Chicken(5,5,"Green", 0));
        }
    }
}
