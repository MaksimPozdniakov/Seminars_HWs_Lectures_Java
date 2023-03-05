package Seminars.Seminar_006_HashSet.Task_03;

import java.time.LocalDate;

public class Cat {
    String name;
    String color;
    LocalDate datef;

//    Cat () {
//        name = "defolt";
//        color = "red";
//        datef = LocalDate.of(2010,1,20);
//    }


    public Cat(String name, String color, LocalDate datef) {
        this.name = name;
        this.color = color.toLowerCase(); // toLowerCase() - конвертирует
        this.datef = datef;
    }

    int getAge() {
        LocalDate date = LocalDate.now();
        int age = date.getYear() - datef.getYear();
        return age;
    }

    @Override
    public String toString() {
//        return super.toString(); // super - обращение к родительскому классу
        return name + " цвет: " + color + " возраста " + getAge() + " лет";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj; // делаем явное преобразование к классу Cat
        if (this.name.equals(cat.name) && color.equals(cat.color) && datef.equals(cat.datef)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*color.hashCode() + 13*datef.hashCode(); // чтобы не было кализии домножают на простые числа
    }
}
