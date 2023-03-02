package OOP_ALL.Lectures.Introduction;

public class Worker {
    int id;
    int salary;
    String firstName;
    String secondName;

    @Override
    public String toString() {    // тут мы переделали функционал метода, так как нам это нужно
        String res = String.format("%s %s %d %d", firstName, secondName, salary, id);
        return res;
    }

    @Override
    public boolean equals(Object obj) {   // тут мы переделали функционал метода, так как нам это нужно
        Worker t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {   // тут мы переделали функционал метода, так как нам это нужно
        return id;
    }
}
