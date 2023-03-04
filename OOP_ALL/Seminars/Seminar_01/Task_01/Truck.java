package OOP_ALL.Seminars.Seminar_01.Task_01;

public class Truck extends Vehicle{
    public Truck(String model, String color, int wheels, double weight, int speed) {
        super(model, color, wheels, weight, speed);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
