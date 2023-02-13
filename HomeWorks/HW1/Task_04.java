package HomeWorks.HW1;

// Задача №4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//восстановить выражение до верного равенства. Предложить хотя бы
//одно решение или сообщить, что его нет.

public class Task_04 {
    public static void main(String[] args) {
        String str = "2? + ?5 = 69";
        String [] expression = str.split(" ");
        String q = expression[0];
        String w = expression[2];
        String z = expression[expression.length - 1];

        boolean b = true;
        for (int i = 0; i < 10; i++) {
            int q_num = Integer.parseInt(q.replace("?", Integer.toString(i)));
            for (int j =0; j < 10; j++) {
                int w_num = Integer.parseInt(w.replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) { // на случай, если в результате будут тоже вопросы
                    int z_num = Integer.parseInt(z.replace("?", Integer.toString(k)));
                    if (q_num + w_num == z_num) {
                        System.out.printf("Решение есть: %d + %d = %d\n", q_num, w_num, z_num);
                        b = false;
                        break;
                    }
                }
                if (!b){
                    break;
                }
            }
            if (!b){
                break;
            }
        }
        if (b) System.out.println("Решений нет!");
    }
}
