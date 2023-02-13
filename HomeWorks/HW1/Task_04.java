//package HomeWorks.HW1;
import java.util.Arrays;
// Задача №4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//восстановить выражение до верного равенства. Предложить хотя бы
//одно решение или сообщить, что его нет.

//public class Task_04 {
//    public static void main(String[] args) {
//        String str = "2? + 51 = ?9";
//        String [] expression = str.split(" ");
//        String q = expression[0];
//        String w = expression[2];
//        String z = expression[expression.length - 1];
//
//        boolean b = true;
//        for (int i = 0; i < 10; i++) {
//            int qNum = Integer.parseInt(q.replace("?", Integer.toString(i)));
//            for (int j =0; j < 10; j++) {
//                int wNum = Integer.parseInt(w.replace("?", Integer.toString(j)));
//                for (int k = 0; k < 10; k++) {
//                    int zNum = Integer.parseInt(z.replace("?", Integer.toString(k)));
//                    if (qNum + wNum == zNum) {
//                        System.out.printf("Решение уравнения %s => %d + %d = %d\n",
//                                str, qNum, wNum, zNum);
//                        b = false;
//                        break;
//                    }
//                }
//                if (b == false) break;
//            }
//            if (b == false) break;
//        }
//        if (b) System.out.println("Решений нет!");
//    }
//}
