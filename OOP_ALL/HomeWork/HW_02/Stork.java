package OOP_ALL.HomeWork.HW_02;

public class Stork extends Bird implements AnimalInformation,Fly,MakeSound {
    protected Stork(Integer height, Integer weight, String eyeColor, double flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    public void showInformation(){
        System.out.println("Аист - это птица");
    }
    public void makeSoundAnimal(){
        System.out.println("Громкое щелканье");
    }
    public void fly(){
        System.out.println("Я лечу");
    }

    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Высота полета: " +
                getFlightAltitude() + "метров";
    }

}
