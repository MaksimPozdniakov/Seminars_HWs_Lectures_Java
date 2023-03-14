package OOP_ALL.HomeWork.HW_02;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner ourScanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cat(20,7,"Grey", "Pups", "Cats", "Yes",
                "Red", "12.09.2020","Yes"));
        zoo.addAnimals(new Chicken(30,2,"Green",0));
        zoo.addAnimals(new Dog(40,10,"Brown","Nik","Dogs","Yes",
                "White","12.09.2020","Yes"));
        zoo.addAnimals(new Stork(60,10,"Blue",2000));
        zoo.addAnimals(new Tiger(1,250,"Grey","India","Two years ago"));
        zoo.addAnimals(new Wolf(90,12,"Green", "Norway","Many years ago",
                "Yes"));

//        int ourSelection = navigationMenu(ourScanner);
//        choiceMenu(ourSelection, zoo, ourScanner);
        navigationMenu(zoo,ourScanner);
    }


    public static void navigationMenu(Zoo zoo,Scanner ourScanner) {
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Показать всех животных в зоопарке");
        menu.put(2, "Добавить новое животное в зоопарк");
        menu.put(3, "Удалить животное из зоопарка");
        menu.put(4, "Заставить всех животных издать звук");
        for (Map.Entry <Integer, String> el: menu.entrySet()) {
            System.out.println(el);
        }
        System.out.print("\tСделайте выбор: ");
        int ourSelection = ourScanner.nextInt();
        choiceMenu(ourSelection, zoo, ourScanner);
//        return ourScanner.nextInt();
    }




    public static void choiceMenu(int ourSelection, Zoo zoo, Scanner ourScanner) {
        switch (ourSelection){
            case 1:
                zoo.showAllAnimal();
                System.out.print("\tВыберите животное или птицу, чтобы получить больше информации: ");
                int newSelection = ourScanner.nextInt();
                informationAboutAnimal(zoo, ourScanner, newSelection);
            case 2:
                addNewAnimals(zoo,ourScanner);
        }
    }




    public static void informationAboutAnimal(Zoo zoo, Scanner ourScanner, int newSelection){

        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Показать информацию о животном");
        menu.put(2, "Издать звук");

        if (zoo.checkClass(newSelection).equals("Cat")){
            menu.put(3, "Проявить ласку");
        } else if (zoo.checkClass(newSelection).equals("Chicken") || zoo.checkClass(newSelection).equals("Stork")){
            menu.put(3, "Полетать");
        } else if (zoo.checkClass(newSelection).equals("Dog")){
            menu.put(3, "Проявить ласку");
            menu.put(4, "Дрессировать");
        }

        for (Map.Entry<Integer, String> el : menu.entrySet()) {
            System.out.println(el);
        }
        System.out.print("\tЧто хотите узнать? ");
        int selection = ourScanner.nextInt();

        switch (selection) {
            case 1:
                zoo.showInformation(newSelection);
                break;
            case 2:
                zoo.makeSoundAnimal(newSelection);
                break;
            case 3:
                zoo.communication(newSelection);
                break;
            case 4:
                zoo.trainingAnimal(newSelection);
                break;
        }
        System.out.print("На этом все? (Да/Нет) ");
        String answer = ourScanner.next();
        if (answer.equals("Нет")) {
            navigationMenu(zoo,ourScanner);
        } else{
            System.exit(0);
        }
    }

    public static void addNewAnimals(Zoo zoo,Scanner ourScanner){
//        Zoo zoo = new Zoo();
        HashMap<Integer, String> menu = new HashMap<>();
        System.out.println("Кого вы хотите добавить?");
        menu.put(1, "Кота");
        menu.put(2, "Курицу");
        menu.put(3, "Собаку");
        menu.put(4, "Аиста");
        menu.put(5, "Тигра");
        menu.put(6, "Волка");
        for (Map.Entry <Integer, String> el: menu.entrySet()) {
            System.out.println(el);
        }
        int selection = ourScanner.nextInt();
        System.out.print("Рост: ");
        Integer height = ourScanner.nextInt();
        System.out.print("Вес: ");
        Integer weight = ourScanner.nextInt();
        System.out.print("Цвет глаз: ");
        String eyeColor = ourScanner.next();



        switch (selection){
            case 1:
                System.out.print("Кличка: ");
                String nickname = ourScanner.nextLine();
                System.out.print("Порода: ");
                String species = ourScanner.nextLine();
                System.out.print("Наличие прививок (Да/Нет): ");
                String vaccinations = ourScanner.nextLine();
                System.out.print("Цвет шерсти: ");
                String woolColor = ourScanner.nextLine();
                System.out.print("Дата рождения: ");
                String dateBirth = ourScanner.nextLine();
                System.out.print("Наличие шерсти (Да/Нет): ");
                String presenceWool = ourScanner.nextLine();
                zoo.addAnimals(new Cat(height,weight,eyeColor, nickname, species, vaccinations,
                        woolColor, dateBirth,presenceWool));
                break;
            case 2:
                System.out.print("Высота полёта: ");
                double flightAltitude = ourScanner.nextDouble();
                zoo.addAnimals(new Chicken(height,weight,eyeColor,flightAltitude));
                break;
            case 3:
                System.out.print("Кличка: ");
                String nickname2 = ourScanner.nextLine();
                System.out.print("Порода: ");
                String species2 = ourScanner.nextLine();
                System.out.print("Наличие прививок (Да/Нет): ");
                String vaccinations2 = ourScanner.nextLine();
                System.out.print("Цвет шерсти: ");
                String woolColor2 = ourScanner.nextLine();
                System.out.print("Дата рождения: ");
                String dateBirth2 = ourScanner.nextLine();
                System.out.print("Наличие дрессировки (Да/Нет): ");
                String presenceTraining = ourScanner.nextLine();
                zoo.addAnimals(new Dog(height,weight,eyeColor,nickname2,species2,vaccinations2,
                        woolColor2,dateBirth2,presenceTraining));
                break;
            case 4:
                System.out.print("Высота полёта: ");
                double flightAltitude2 = ourScanner.nextDouble();
                zoo.addAnimals(new Stork(height,weight,eyeColor,flightAltitude2));
                break;
            case 5:
                System.out.print("Место обитания: ");
                String habitat = ourScanner.nextLine();
                System.out.print("Дата нахождения: ");
                String dateFound = ourScanner.nextLine();
                zoo.addAnimals(new Tiger(height,weight,eyeColor,habitat,dateFound));
                break;
            case 6:
                System.out.print("Место обитания: ");
                String habitat2 = ourScanner.nextLine();
                System.out.print("Дата нахождения: ");
                String dateFound2 = ourScanner.nextLine();
                System.out.println("Вожак стаи? (Да/Нет): ");
                String leaderPack = ourScanner.nextLine();
                zoo.addAnimals(new Wolf(height,weight,eyeColor, habitat2,dateFound2,
                        leaderPack));
                break;
        }
        System.out.print("На этом все? (Да/Нет) ");
        String answer = ourScanner.next();
        if (answer.equals("Нет")) {
            navigationMenu(zoo,ourScanner);
        }
    }


}

