package OOP_ALL.HomeWork.HW_02;

public class Tiger extends WildAnimal implements MakeSound,AnimalInformation {
    public Tiger(Integer height, Integer weight, String eyeColor, String habitat, Integer dateFound) {
        super(height, weight, eyeColor, habitat, dateFound);
    }

    public void showInformation(){
        System.out.println("Тигр - это дикое животное");;
    }
    public void makeSoundAnimal(){
        System.out.println("Рррр");
    }

    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Место обитания: " +
                habitat + "Дата нахождения: " + dateFound;
    }

}
