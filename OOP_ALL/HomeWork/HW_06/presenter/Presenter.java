package OOP_ALL.HomeWork.HW_06.presenter;

import OOP_ALL.HomeWork.HW_06.model.Service;
import OOP_ALL.HomeWork.HW_06.model.baseClass.Notes;
import OOP_ALL.HomeWork.HW_06.view.View;
import java.util.ArrayList;


public class Presenter{

    private View view;
    private Service service;

    public Presenter(View view,Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }


    public void addNote(Notes newEl){
        ArrayList<String> ourTasks = new ArrayList<>();
        ourTasks.add(newEl.toString());
        service.getNote(ourTasks);
    }

    public readBook(){

    }


    public void print(){
        service.showAll();
    }






}
