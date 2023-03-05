package HomeWorks.HW6;

import Seminars.Seminar_006_HashSet.Task_03.Cat;

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
        Params laptop1 = new Params("8", "256", "Windows 10 Home",
                "1920х1080", "серый", "HIPER");
        Params laptop2 = new Params("16", "512", "Free DOS",
                "1920х1080", "черный", "MSI");
        Params laptop3 = new Params("8", "256", "Windows 11 Home",
                "1920х1080", "серый", "Huawei ");
        Params laptop4 = new Params("8", "512", "без операционной системы",
                "1920х1080", "серый", "ASUS ");
        Params laptop5 = new Params("32", "1024", "Windows 11 Professional",
                "3840х2160", "черный", "ASUS ");
        Params laptop6 = new Params("32", "1024", "Mac OS",
                "3456х2234", "серый космос", "Apple ");
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
        nextPage.put(4, "Цвет");
        nextPage.put(5, "Производитель");

        if (selection.equals("1")) {
            showAll(set_params);
        } else {
            for (Map.Entry<Integer, String> elem: nextPage.entrySet()) {
                System.out.println(elem);
            }
            System.out.print("\tКак будем искать? : ");
            String newSelection = scanner.nextLine();

            if (newSelection.equals("1")) {
                search(set_params);
//                System.out.print("\tКакой объем оперативной памяти интересует? : ");
//                newSelection = scanner.nextLine();

            } else if (newSelection.equals("2")) {
                System.out.print("\tКакой объем оперативной SSD интересует? : ");
                newSelection = scanner.nextLine();

            }else if (newSelection.equals("3")) {
                System.out.print("\tКакая операционная система интересует? : ");
                newSelection = scanner.nextLine();

            }else if (newSelection.equals("4")) {
                System.out.print("\tКакой цвет интересует? : ");
                newSelection = scanner.nextLine();

            }else if (newSelection.equals("5")) {
                System.out.print("\tКакой производитель интересует? : ");
                newSelection = scanner.nextLine();

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

    public static void search(Set<Params> set_params) {
        HashMap<Integer, ArrayList<Object>> ourLaptopsMap = new HashMap<>();
        int num = 1;

        for (Params item: set_params) {
            ArrayList <Object> ourLaptops = new ArrayList<>(List.of(item.toString().split(",")));
            ourLaptopsMap.put(num, ourLaptops);
            num++;
        }

//        HashMap<String,Object> map = new HashMap<String,Object>();
//        Collection<String> collection= map.keySet();
//
//        Object desiredObject = new Object();//что хотим найти
//
//        for (String key : collection) {
//            Object obj = map.get(key);
//            if (key != null) {
//                if (desiredObject.equals(obj)) {
//                    return key;// нашли наше значение и возвращаем  ключ
//                }
//            }
//        }

        for (Map.Entry<Integer, ArrayList<Object>> el: ourLaptopsMap.entrySet()) {
            System.out.println(el);
        }

//        return set_params;
    }

}
