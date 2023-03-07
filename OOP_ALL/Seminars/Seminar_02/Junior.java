package OOP_ALL.Seminars.Seminar_02;

public class Junior extends Pupils implements Play{
    public Junior(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }

    @Override
    public void learn() {
        System.out.println("Я люблю учиться");;
    }

    public void play() {
        System.out.println("Я играю в игрушки");
    }

    public void goExtension() {
        System.out.println("Я хожу в продленку");
    }
}
