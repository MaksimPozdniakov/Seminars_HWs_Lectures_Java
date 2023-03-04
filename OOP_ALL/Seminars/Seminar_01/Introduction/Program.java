package OOP_ALL.Seminars.Seminar_01.Introduction;

public class Program {
    private static void doSomething(A a) {
        a.printName();
    }
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        C c = new C();
        doSomething(a);
        doSomething(b);
        A[] array = new A[] {a,b,c};
        for (A element: array) {
            doSomething(element);
        }
    }
}
