package HomeWorks.HW6;

/**
 *   1 - ОЗУ
 *   2 - Объем ЖД
 *   3 - Операционная система
 *   4 - Цвет …
 */

public class Params {
    String ram;
    String hard_disk;
    String operating_system;
    String screen_resolution;
    String color;
    String brand_name;


    public Params(String ram, String hard_disk, String operating_system, String screen_resolution, String color,
                  String brand_name) {

        this.ram = ram;
        this.hard_disk = hard_disk;
        this.operating_system = operating_system;
        this.screen_resolution = screen_resolution;
        this.color = color;
        this.brand_name = brand_name;
    }

    @Override
    public String toString() {
        return  "Оперативная память: " + ram  +
                ", Объем SSD: " + hard_disk  +
                ", Операционная система: " + operating_system +
                ", Разрешение экрана: " + screen_resolution +
                ", Цвет: " + color +
                ", Производитель: " + brand_name;
    }
}
