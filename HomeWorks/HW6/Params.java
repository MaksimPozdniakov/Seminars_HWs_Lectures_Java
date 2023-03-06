package HomeWorks.HW6;

/**
 *   1 - ОЗУ
 *   2 - Объем ЖД
 *   3 - Операционная система
 *   4 - Цвет …
 */

public class Params {
    private String ram;
    private String hard_disk;
    private String operating_system;
    private String screen_resolution;
    private String color;
    private String brand_name;


    public Params(String ram, String hard_disk, String operating_system, String screen_resolution, String color,
                  String brand_name) {

        this.ram = ram;
        this.hard_disk = hard_disk;
        this.operating_system = operating_system;
        this.screen_resolution = screen_resolution;
        this.color = color;
        this.brand_name = brand_name;
    }
//    public String getRam() {
//        return ram;
//    }
//
//    public String getHard_disk() {
//        return hard_disk;
//    }
//
//    public String getOperating_system() {
//        return operating_system;
//    }
//
//    public String getScreen_resolution() {
//        return screen_resolution;
//    }
//    public String getColor() {
//        return color;
//    }
//    public String getBrand_name() {
//        return brand_name;
//    }

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
