package OOP_ALL.HomeWork.HW_02;

public abstract class WildAnimal extends Animal implements MakeSound {

    protected String habitat;
    protected Integer dateFound;
    public WildAnimal(Integer height, Integer weight, String eyeColor,String habitat,Integer dateFound) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }

    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Место обитания: " +
                habitat + "Дата нахождения: " + dateFound;
    }

}
