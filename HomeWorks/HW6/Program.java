package HomeWorks.HW6;

import java.util.*;

/**
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        1) Создать множество ноутбуков.
        2) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
        ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
        Например: “Введите цифру, соответствующую необходимому критерию:

        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …

        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
        можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Params> set_params = new HashSet<>();
        Params laptop1 = new Params("8 гигабайт", "256 гигабайт", "Windows 10 Home",
                "1920x1080", "серый", "Hiper");
        Params laptop2 = new Params("16 гигабайт", "512 гигабайт", "Free DOS",
                "1920x1080", "черный", "Msi");
        Params laptop3 = new Params("8 гигабайт", "256 гигабайт", "Windows 11 Home",
                "1920x1080", "серый", "Huawei");
        Params laptop4 = new Params("8 гигабайт", "512 гигабайт", "без операционной системы",
                "1920x1080", "серый", "Asus");
        Params laptop5 = new Params("32 гигабайт", "1024 гигабайт", "Windows 11 Professional",
                "3840x2160", "черный", "Asus");
        Params laptop6 = new Params("32 гигабайт", "1024 гигабайт", "Mac OS",
                "3456x2234", "серый космос", "Apple");
        set_params.add(laptop1);
        set_params.add(laptop2);
        set_params.add(laptop3);
        set_params.add(laptop4);
        set_params.add(laptop5);
        set_params.add(laptop6);

        menu(set_params, scanner);
    }


    public static void menu(Set<Params> set_params, Scanner scanner) {

        Map<Integer, String> navigation = new TreeMap<>();
        navigation.put(1,"Показать все");
        navigation.put(2, "Поиск устройства");
        navigation.put(3, "Добавить новое устройство");

        for (Map.Entry<Integer, String> elem: navigation.entrySet()) {
            System.out.println(elem);
        }

        System.out.print("\tСделайте свой выбор : ");
        String selection = scanner.nextLine();

        Map<Integer, String> nextPage = new TreeMap<>();
        nextPage.put(1, "Оперативная память");
        nextPage.put(2, "Объем SSD");
        nextPage.put(3, "Операционная система");
        nextPage.put(4, "Разрешение экрана");
        nextPage.put(5, "Цвет");
        nextPage.put(6, "Производитель");

        if (selection.equals("1")) {
            showAll(set_params, scanner);
        } else if (selection.equals("2")) {
            for (Map.Entry<Integer, String> elem: nextPage.entrySet()) {
                System.out.println(elem);
            }
            System.out.print("\tКак будем искать? : ");
            String newSelection = scanner.nextLine();

            if (newSelection.equals("1")) {
                System.out.print("\tКакой объем оперативной памяти интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection + " гигабайт";
                search(set_params, newSelection, scanner);
            } else if (newSelection.equals("2")) {
                System.out.print("\tКакой объем оперативной SSD интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection + " гигабайт";
                search(set_params, newSelection, scanner);
            } else if (newSelection.equals("3")) {
                System.out.print("\tКакая операционная система интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection.substring(0, 1).toUpperCase() + newSelection.substring(1);
                search(set_params, newSelection, scanner);
            } else if (newSelection.equals("4")) {
                System.out.print("\tПример поиска: 1920х1080");
                System.out.print("\tКакое разрешение экрана интересует? : ");
                newSelection = scanner.nextLine();
                search(set_params, newSelection, scanner);
            } else if (newSelection.equals("5")) {
                System.out.print("\tКакой цвет интересует? : ");
                newSelection = scanner.nextLine();
                search(set_params, newSelection, scanner);
            } else if (newSelection.equals("6")) {
                System.out.print("\tКакой производитель интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection.substring(0, 1).toUpperCase() + newSelection.substring(1);
                search(set_params, newSelection, scanner);
            }
        } else if (selection.equals("3")) {
            addNewDev(set_params, scanner);
        }
    }


    public static void showAll(Set<Params> set_params, Scanner scanner) {
        StringBuilder new_list = new StringBuilder();
        int num = 1;
        for (Params item: set_params) {
            new_list.append(String.format("Ноутбук %d : %s", num, item + "\n"));
            num++;
        }
        System.out.println(new_list + "\n");

        System.out.print("Есть еще вопросы? (Да/Нет) : ");
        String answer = scanner.nextLine();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
        if (answer.equals("Да")) {menu(set_params, scanner);}
    }


    public static void search(Set<Params> set_params, String selection, Scanner scanner) {
        HashMap<Integer, ArrayList<Object>> ourLaptopsMap = new HashMap<>();

        int num = 1;
        for (Params item: set_params) {
            ArrayList <Object> ourLaptops = new ArrayList<>(List.of(item.toString().split(",")));
            ourLaptopsMap.put(num, ourLaptops);
            num++;
        }

        num = 1;
        for (ArrayList<Object> el: ourLaptopsMap.values()) {
            if (el.toString().contains(selection)) {
                System.out.printf("Ноутбук %d : %s", num, el + "\n");
                num++;
            }
        }
        System.out.print("Есть еще вопросы? (Да/Нет) : ");
        String answer = scanner.nextLine();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
        if (answer.equals("Да")) {menu(set_params, scanner);}
    }


    public static void addNewDev(Set<Params> set_params, Scanner scanner) {
        System.out.print("Какой объем оперативной памяти? : ");
        String ram = scanner.nextLine();
        ram = ram + " гигабайт";
        System.out.print("Какой объем оперативной SSD? : ");
        String hard_disk = scanner.nextLine();
        hard_disk = hard_disk + " гигабайт";
        System.out.print("Какая операционная система? : ");
        String operating_system = scanner.nextLine();
        operating_system = operating_system.substring(0, 1).toUpperCase() + operating_system.substring(1);
        System.out.print("Какое разрешение экрана? : ");
        String screen_resolution = scanner.nextLine();
        System.out.print("Какой цвет? : ");
        String color = scanner.nextLine();
        System.out.print("Какой производитель? : ");
        String brand_name = scanner.nextLine();
        brand_name = brand_name.substring(0, 1).toUpperCase() + brand_name.substring(1);

        Params laptop = new Params(ram,hard_disk,operating_system,screen_resolution,color,brand_name);
        set_params.add(laptop);

        System.out.print("Есть еще вопросы? (Да/Нет) : ");
        String answer = scanner.nextLine();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
        if (answer.equals("Да")) {menu(set_params, scanner);}
    }
}






