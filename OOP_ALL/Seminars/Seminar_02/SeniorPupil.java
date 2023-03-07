package OOP_ALL.Seminars.Seminar_02;

public class SeniorPupil extends Pupils implements Smoke{
    public SeniorPupil(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }
    @Override
    public void learn() {
        System.out.println("Я должен учиться");;
    }

    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    public void love() {
        System.out.println("Я ищу любовь");
    }
}
