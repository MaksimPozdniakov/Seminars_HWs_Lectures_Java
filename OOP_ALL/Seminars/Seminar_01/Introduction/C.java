package OOP_ALL.Seminars.Seminar_01.Introduction;

public class C extends A {
    private String data;
    @Override
    public void printName(){
        System.out.println("C");
    }

    /**
     * такой метод называется селектором. Селекторы отвечают за получение данных без изменения.
     * getData()
     */
    public String getData(){
        return data;
    }

    /**
     * такой метод называется модификатором. Модификатыры отвечают за изменения данных без получения.
     * setData
     */
    public void setData(String data){
        this.data = data;
    }
}
