package OOP_ALL.HomeWork.HW_02;

public abstract class Bird extends Animal implements AnimalInformation,Fly,MakeSound {

    private double flightAltitude;

    protected Bird(Integer height, Integer weight, String eyeColor,double flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public double getFlightAltitude(){
        return flightAltitude;
    }
    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor + "Высота полета: " +
                flightAltitude + "метров";
    }

}
