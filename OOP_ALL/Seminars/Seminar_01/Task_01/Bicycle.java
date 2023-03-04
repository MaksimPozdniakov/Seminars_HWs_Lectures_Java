package OOP_ALL.Seminars.Seminar_01.Task_01;

public class Bicycle extends Vehicle{
    public Bicycle(String model, String color, int wheels, double weight, int speed) {
        super(model, color, wheels, weight, speed);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
