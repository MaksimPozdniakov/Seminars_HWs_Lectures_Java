package OOP_ALL.HomeWork.HW_05.Model.Categories;

import OOP_ALL.HomeWork.HW_05.Model.BaseClass.Notes;

public class ImportantThings extends Notes {
    protected String deadline;
    public ImportantThings(String date, String deadline, String nameThing, String text) {
        super(date, nameThing, text);
        this.deadline = deadline;
    }

    public String toString(){
        return "Задача поставлена: " + date + ", Выполнить до: " + deadline + ", Название задачи: " + nameThing +
                ", Содержание: " + text;
    }

}
