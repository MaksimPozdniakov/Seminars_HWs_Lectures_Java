package OOP_ALL.Seminars.Seminar_02;

public class Program {
    public static void main(String[] args) {
        Pupils junior_1 = new Junior("Иван", "Иванов", "12.09.2014", "2a");
        Pupils middle_1 = new Middle("Иван", "Иванов", "12.09.2009", "7a");
        Pupils senior_1 = new SeniorPupil("Иван", "Иванов", "12.09.2004", "11a");

        Pupils[] pupils = {junior_1,middle_1,senior_1};
        showAll(pupils);
    }


    static void showAll(Pupils[] pupils) {
        for (Pupils elem: pupils) {
            System.out.println(elem.getClass().getSimpleName());
            elem.learn();
            if (elem instanceof Play) {
                ((Play) elem).play();
            }
            if (elem instanceof Smoke) {
                ((Smoke) elem).smoke();
            }
        }
    }

}
