package OOP_ALL.HomeWork.HW_02;

public class Tiger extends WildAnimal implements MakeSound,AnimalInformation {
    public Tiger(Integer height, Integer weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor, habitat, dateFound);
    }

    public void showInformation(){
        System.out.println("Тигр - это дикое животное");;
    }
    public void makeSoundAnimal(){
        System.out.println("Рррр");
    }

    public String toString(){
        return "Рост: " + height + " метр" + ", Вес: " + weight + " кг" + ", Цвет глаз: " + eyeColor
                + ", Место обитания: " + habitat + ", Дата нахождения: " + dateFound;
    }

}
