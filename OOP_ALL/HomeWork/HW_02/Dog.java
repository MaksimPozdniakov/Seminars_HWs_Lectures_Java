package OOP_ALL.HomeWork.HW_02;

public class Dog extends Pets implements AnimalInformation,MakeSound,ShowAffection{

    private String presenceTraining;

    public Dog(Integer height, Integer weight, String eyeColor, String nickname, String species, String vaccinations,
               String woolColor, Integer dateBirth,String presenceTraining) {
        super(height, weight, eyeColor, nickname, species, vaccinations, woolColor, dateBirth);
        this.presenceTraining = presenceTraining;
    }

    public String getPresenceTraining(){
        return presenceTraining;
    }
    public void showInformation(){
        System.out.println("Собака - это домашнее животное");
    }
    public void makeSoundAnimal(){
        System.out.println("Гав");
    }

    public void showAffection() {
        System.out.println("Проявляю ласку");
    }

    public void training(){
        System.out.println("Прохожу дрессировку");
    }
    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Кличка: " + nickname + "Порода: "
                + species + "Наличие прививок: " + vaccinations + "Цвет шерсти: " + woolColor + "Дата рождения: "
                + dateBirth + "Наличие дрессировки: " + presenceTraining;
    }
}
