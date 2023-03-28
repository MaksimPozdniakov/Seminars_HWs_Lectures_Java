package OOP_ALL.HomeWork.HW_06.model.categories;

import OOP_ALL.HomeWork.HW_06.model.baseClass.Notes;

public class ProductList extends Notes {
    public ProductList(String date, String nameThing, String text) {
        super(date, nameThing, text);
    }

    public String toString(){
        return "Нужно купить - " + "Задача поставлена: " + date + ", Название задачи: " + nameThing +
                ", Содержание: " + text;
    }
}
