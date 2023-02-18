package HomeWorks.HW2;

// К калькулятору из предыдущего дз добавить логирование.

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task_04 {
    public static void main(String[] args) throws IOException {
        System.out.println("Данный калькулятор умеет работать с | + | - | / | * | и только с двумя числами");
        System.out.println("Введите выражение полностью через пробел: ");
        Scanner iScanner = new Scanner(System.in);
        String expression = iScanner.nextLine();
        Logger log = logResult();

        String[] new_expression = expression.split(" ");
        System.out.println(Arrays.toString(new_expression));
        double result = 0;

        if (new_expression[1].equals("+")){
            result = Integer.parseInt(new_expression[0]) + Integer.parseInt(new_expression[2]);
        }
        if (new_expression[1].equals("-")){
            result = Integer.parseInt(new_expression[0]) - Integer.parseInt(new_expression[2]);
        }
        if (new_expression[1].equals("/")){
            result = Double.parseDouble(new_expression[0]) / Double.parseDouble(new_expression[2]);
        }
        if (new_expression[1].equals("*")){
            result = Integer.parseInt(new_expression[0]) * Integer.parseInt(new_expression[2]);
        }
        if (result % 1 == 0) {
            System.out.printf("%.0f",result);
            String result2 = String.format("%.0f",result);
            log.log(Level.INFO, expression + " = " + result2 + "\n");
        }else {
            System.out.printf("%.2f",result);
            String result2 = String.format("%.2f",result);
            log.log(Level.INFO, expression + " = " + result2 + "\n");
        }
    }
    static Logger logResult() throws IOException {
        Logger log = Logger.getLogger(Task_04.class.getName());
        FileHandler fh = new FileHandler("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\Seminars_HWs_Lectures_Java\\HomeWorks\\HW2\\logToTask4.txt", true);
        log.addHandler(fh);
        log.setUseParentHandlers(false);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        return log;
    }
}
