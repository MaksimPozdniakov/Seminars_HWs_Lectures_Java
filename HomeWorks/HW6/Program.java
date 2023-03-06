package HomeWorks.HW6;

import OOP_ALL.Seminars.Seminar_01.Task_01.Vehicle;

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
            showAll(set_params);
        } else {
            for (Map.Entry<Integer, String> elem: nextPage.entrySet()) {
                System.out.println(elem);
            }
            System.out.print("\tКак будем искать? : ");
            String newSelection = scanner.nextLine();

            if (newSelection.equals("1")) {
                System.out.print("\tКакой объем оперативной памяти интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection + " гигабайт";
                search(set_params, newSelection);
            } else if (newSelection.equals("2")) {
                System.out.print("\tКакой объем оперативной SSD интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection + " гигабайт";
                search(set_params, newSelection);
            } else if (newSelection.equals("3")) {
                System.out.print("\tКакая операционная система интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection.substring(0, 1).toUpperCase() + newSelection.substring(1);
                search(set_params, newSelection);
            } else if (newSelection.equals("4")) {
                System.out.print("\tПример поиска: 1920х1080");
                System.out.print("\tКакое разрешение экрана интересует? : ");
                newSelection = scanner.nextLine();
                search(set_params, newSelection);
            } else if (newSelection.equals("5")) {
                System.out.print("\tКакой цвет интересует? : ");
                newSelection = scanner.nextLine();
                search(set_params, newSelection);
            } else if (newSelection.equals("6")) {
                System.out.print("\tКакой производитель интересует? : ");
                newSelection = scanner.nextLine();
                newSelection = newSelection.substring(0, 1).toUpperCase() + newSelection.substring(1);
                search(set_params, newSelection);
            }
        }

        scanner.close();
    }


    public static void showAll(Set<Params> set_params) {
        StringBuilder new_list = new StringBuilder();
        int num = 1;
        for (Params item: set_params) {
            new_list.append(String.format("Ноутбук %d : %s", num, item + "\n"));
            num++;
        }
        System.out.println(new_list + "\n");
    }


    public static void search(Set<Params> set_params, String selection) {
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
    }

}






