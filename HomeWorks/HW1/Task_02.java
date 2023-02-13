package HomeWorks.HW1;

//Задача №2. Вывести все простые числа от 1 до 1000

public class Task_02 {
    public static void main(String[] args) {
        int max_value = 1000;
        boolean f = true;
        for (int i = 2; i <= max_value; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    f = false;
                    break;
                }
            }
            if (f) System.out.println(i);
            else f = true;
        }
    }
}
