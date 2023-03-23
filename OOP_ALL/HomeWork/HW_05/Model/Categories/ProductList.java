package OOP_ALL.HomeWork.HW_05.Model.Categories;

import OOP_ALL.HomeWork.HW_05.Model.BaseClass.Notes;

public class ProductList extends Notes {
    public ProductList(String date, String nameThing, String text) {
        super(date, nameThing, text);
    }

    public String toString(){
        return date + nameThing + text;
    }

}
