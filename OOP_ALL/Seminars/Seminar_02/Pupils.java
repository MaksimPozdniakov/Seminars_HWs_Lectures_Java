package OOP_ALL.Seminars.Seminar_02;


public abstract class Pupils {
    protected String  firstName;
    protected String lastName;
    protected String birthDay;
    protected String className;

    public Pupils(String firstName, String lastName, String birthDay, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.className = className;
    }

    public abstract void learn();

}
