package OOP_ALL.HomeWork.HW_06.view;

import OOP_ALL.HomeWork.HW_06.presenter.Presenter;

public interface View {
    void start();
    void setPresenter(Presenter presenter);
    void print();
}
