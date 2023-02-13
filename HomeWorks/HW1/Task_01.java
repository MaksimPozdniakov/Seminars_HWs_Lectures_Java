package HomeWorks.HW1;

// Задача №1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
//(произведение чисел от 1 до n).

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        iScanner.close();

//        n-ое треугольного число:
        int triangular_number;
        triangular_number = (number*(number+1))/2;
        System.out.printf("Треугольное число %d = %d\n", number, triangular_number);

//        находим факториал:
        int fact = 1;
        if (number == 1 || number == 0){
            fact  = 1;
        } else{
            for (int i = 1; i <= number; i++){
                fact *= i;
            }
        }
        System.out.printf("Факториал числа %d = %d\n", number, fact);
    }
}
