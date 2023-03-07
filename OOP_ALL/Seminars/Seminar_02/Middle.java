package OOP_ALL.Seminars.Seminar_02;

public class Middle extends Pupils implements Play,Smoke{

    public Middle(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }
    @Override
    public void learn() {
        System.out.println("Я не люблю учиться");;
    }

    public void play() {
        System.out.println("Я играю в Mincraft");
    }

    public void smoke() {
        System.out.println("Я начинаю курить");
    }
}
