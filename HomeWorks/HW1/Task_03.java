package HomeWorks.HW1;

//Задача №3. Реализовать простой калькулятор

import java.util.Scanner;
import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Данный калькулятор умеет работать с | + | - | / | * | и только с двумя числами");
        System.out.println("Введите выражение полностью через пробел: ");
        Scanner iScanner = new Scanner(System.in);
        String expression = iScanner.nextLine();

        String[] new_expression = expression.split(" ");
        System.out.println(Arrays.toString(new_expression));
        int result = 0;

        if (new_expression[1].equals("+")){
            result = Integer.parseInt(new_expression[0]) + Integer.parseInt(new_expression[2]);
        }
        if (new_expression[1].equals("-")){
            result = Integer.parseInt(new_expression[0]) - Integer.parseInt(new_expression[2]);
        }
        if (new_expression[1].equals("/")){
            result = Integer.parseInt(new_expression[0]) / Integer.parseInt(new_expression[2]);
        }
        if (new_expression[1].equals("*")){
            result = Integer.parseInt(new_expression[0]) * Integer.parseInt(new_expression[2]);
        }
        System.out.println(result);
    }
}
