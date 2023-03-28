package OOP_ALL.HomeWork.HW_06.model.categories;

import OOP_ALL.HomeWork.HW_06.model.baseClass.Notes;

public class UnimportantThings extends Notes {
    public UnimportantThings(String date, String nameThing, String text) {
        super(date, nameThing, text);
    }

    public String toString(){
        return "Неважная - " + "Задача поставлена: " + date + ", Название задачи: " + nameThing +
                ", Содержание: " + text;
    }
}
