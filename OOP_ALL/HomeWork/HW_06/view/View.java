package OOP_ALL.HomeWork.HW_06.view;

import OOP_ALL.HomeWork.HW_06.presenter.Presenter;

import java.io.FileNotFoundException;

public interface View {
    void start() throws FileNotFoundException;
    void setPresenter(Presenter presenter);
    void print();
}
