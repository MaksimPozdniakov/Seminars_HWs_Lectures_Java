package OOP_ALL.Seminars.Seminar_01.Task_01;

// На языке Java реализовать следующий набор классов, при этом должна быть выделена их иерархия:
// 2.1.Транспортное средство
// 2.2.Автомобиль
// 2.3.Мотоцикл
// 2.4.Грузовик
// 2.5.Велосипед
// Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
// В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем,
// то есть показать значение всех его публичных свойств и вызвать метод ехать.

public class Program {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Truck("Kamaz", "Orange", 10, 5000, 120),
                new Bicycle("Aist", "Blue", 2, 25, 30),
                new Car("Lada", "Baclazhan", 4, 1100, 180),
                new Motorcycle("Java", "Red", 2, 250, 240)
        };

        workWithAnyHeir(vehicles);
    }

    static void workWithAnyHeir(Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles) {
            System.out.printf("Модель: %s\n", vehicle.getModel());
            System.out.printf("Цвет: %s\n", vehicle.getColor());
            System.out.printf("Колёс: %d\n", vehicle.getWheels());
            System.out.printf("Вес: %.2f\n", vehicle.getWeight());
            System.out.printf("Макс. скорость: %d\n", vehicle.getSpeed());
            vehicle.ride();
            System.out.println();
        }
    }
}
