package OOP_ALL.HomeWork.HW_02;

public class Wolf extends WildAnimal implements MakeSound,AnimalInformation {

    private String leaderPack;

    public Wolf(Integer height, Integer weight, String eyeColor, String habitat, String dateFound,
                String leaderPack) {
        super(height, weight, eyeColor, habitat, dateFound);
        this.leaderPack = leaderPack;
    }

    public String getLeaderPack(){
        return leaderPack;
    }
    public void showInformation(){
        System.out.println("Волк - это дикое животное");;
    }
    public void makeSoundAnimal(){
        System.out.println("Уууууу");
    }

    @Override
    public String toString() {
        return "Рост: " + height + "см" + "Вес: " + weight + "кг" + "Цвет глаз: " + eyeColor + "Место обитания: " +
                habitat + "Дата нахождения: " + dateFound + "Вожак стаи: " + leaderPack;
    }
}
