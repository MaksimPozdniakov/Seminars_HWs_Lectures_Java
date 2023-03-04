package OOP_ALL.Seminars.Seminar_01.Task_01;

/*
цвет, модель, количество колёс, вес и скорость а так же метод ехать
 */
public class Vehicle {
    protected String model;
    protected String color;
    protected int wheels;
    protected double weight;
    protected int speed;

    public Vehicle(String model, String color, int wheels, double weight, int speed) {
        this.color = color;
        this.model = model;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void ride(){
        System.out.printf("Я %s, я поехал!\n", this.toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
