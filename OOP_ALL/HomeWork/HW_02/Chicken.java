package OOP_ALL.HomeWork.HW_02;

public class Chicken extends Bird implements AnimalInformation,Fly,MakeSound {

    protected Chicken(Integer height, Integer weight, String eyeColor, double flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    public void showInformation(){
        System.out.println("Курица - это птица");
    }
    public void makeSoundAnimal(){
        System.out.println("Коко");
    }
    public void fly(){
        System.out.println("Я хочу летать, но не умею");
    }
    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Высота полета: " +
                getFlightAltitude() + "метров";
    }
}
