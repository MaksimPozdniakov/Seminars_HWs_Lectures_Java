package OOP_ALL.HomeWork.HW_02;

public abstract class Pets extends Animal implements MakeSound,ShowAffection {

    protected String nickname;
    protected String species;
    protected String vaccinations;
    protected String woolColor;
    protected Integer dateBirth;


    public Pets(Integer height,Integer weight,String eyeColor,String nickname,String species,String vaccinations,
                String woolColor,Integer dateBirth) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.species = species;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.dateBirth = dateBirth;
    }

    public abstract void showAffection();

    public String toString() {
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Кличка: " + nickname + "Порода: "
                + species + "Наличие прививок: " + vaccinations + "Цвет шерсти: " + woolColor + "Дата рождения: "
                + dateBirth;
    }
}
