package OOP_ALL.HomeWork.HW_06.model;

import OOP_ALL.HomeWork.HW_06.model.baseClass.Notes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Notebook implements Service{
//    private Presenter presenter;
//    public void setPresenter(Presenter presenter) {
//        this.presenter = presenter;
//    }

//    protected ArrayList<Notes> ourTasks;
//    public Notebook(){
//        ourTasks = new ArrayList<>();
//    }


    protected ArrayList<String> modelArrayList = new ArrayList<>();


    @Override
    public void getNote(ArrayList<String> ourTask) {
        modelArrayList.addAll(ourTask);
    }

    public void showAll(){
        System.out.println(modelArrayList);
    }

    public ArrayList<String> read() throws FileNotFoundException {
        ReadFile ourDb = new ReadFile("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Seminars_HWs_Lectures_Java\\OOP_ALL\\HomeWork\\HW_06\\db\\file.txt");
        ourDb.read(modelArrayList);
        return modelArrayList;
    }

}
