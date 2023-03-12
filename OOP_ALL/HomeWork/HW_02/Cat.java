package OOP_ALL.HomeWork.HW_02;

public class Cat extends Pets implements MakeSound,ShowAffection,AnimalInformation {

    private String presenceWool;

    public Cat(Integer height, Integer weight, String eyeColor, String nickname, String species, String vaccinations,
               String woolColor, Integer dateBirth, String presenceWool) {
        super(height, weight, eyeColor, nickname, species, vaccinations, woolColor, dateBirth);
        this.presenceWool = presenceWool;
    }

    public String getPresenceWool(){
        return presenceWool;
    }
    public void showInformation(){
        System.out.println("Кот - это домашнее животное");
    }
    public void makeSoundAnimal(){
        System.out.println("Мяу");
    }

    public void showAffection() {
        System.out.println("Проявляю ласку");
    }
    public String toString(){
        return "Рост: " + height + ", Вес: " + weight + ", Цвет глаз: " + eyeColor + ", Кличка: " + nickname + ", Порода: "
                + species + ", Наличие прививок: " + vaccinations + ", Цвет шерсти: " + woolColor + ", Дата рождения: "
                + dateBirth + ", Наличие шерсти: " + presenceWool;
    }
}
