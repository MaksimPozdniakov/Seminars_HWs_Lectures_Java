//package Seminars;

// Задача №1. Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

//public class Seminar_002 {
//    public static void main(String[] args) {
//        String s1 = "c1";
//        String s2 = "c2";
//        StringBuilder s3 = new StringBuilder();
//        int num = 6;
//        while (s3.length() <= num/2){
//            s3.append(s1);
//            s3.append(s2);
//        }
//        if (s3.length() < num){
//            s3.append(s1);
//        }
//        System.out.println(s3);
//    }
//}

// Задача №2. Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.

//public class Seminar_002 {
//    public static void main(String[] args) {
//        String s1 = "aaaabbbcddf";
//        StringBuilder s2 = new StringBuilder();
//        int count = 1;
//        for (int i = 1; i < s1.length(); i++){
//            var temp = s1.charAt(i-1);
//            if (temp == s1.charAt(i)){
//                count++;
//            }else {
//                s2.append(count);
//                s2.append(temp);
//                count = 1;
//            }
//            if (i == s1.length() - 1){
//                s2.append(count);
//                s2.append(s1.charAt(i));
//            }
//        }
//        System.out.print(s2);
//    }
//}

// Задача №3. Напишите метод, который принимает на вход строку (String) и определяет является ли строка
// палиндромом (возвращает boolean значение).
//import java.util.Scanner;
//public class Seminar_002 {
//    public static void main(String[] args) {
//        System.out.println("Введите строку: ");
//        Scanner iScaner = new Scanner(System.in);
//        String pl = iScaner.nextLine();
//        iScaner.close();
//
//        boolean flag = false;
//        StringBuilder plp = new StringBuilder(pl); // переводим нашу строку в тип StringBuilder, чтобы перевернуть
//        plp.reverse();                             // переворачиваем
//        String plp2 = new String(plp);             // возвращаем обратно в тип String
//
//        if (plp2.equals(pl)){
//            flag = true;
//        }
//        System.out.println(flag);
//    }
//}

//    Задача №4. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.
//import java.io.FileWriter;
//import java.io.IOException;
//public class Seminar_002 {
//    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < 100; i++){
//            s.append("TEST ");
//        }
//        try (FileWriter fw = new FileWriter("file.txt", false)) {
//            fw.append(s);
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}

// 4 задача от Ёды
//import java.io.File;
//import java.io.FileWriter;
//
//public class Seminar_002 {
//    public static void main(String[] args) {
//        String myString = "TEST";
//        String data = getString(myString);
//        writeToFile(data);
//    }
//
//    public static String getString(String template){
//        return template.repeat(1000);
//    }
//
//    public static void writeToFile(String data){
//        try{
//            String pathProdject = System.getProperty("user.dir");
//            String pathFile = pathProdject.concat("\\file4.txt");
//            File file = new File(pathFile);
//
//            FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write(data);
//            fileWriter.flush();
//            fileWriter.close();
//        }
//        catch (Exception e){
//            System.out.println("Вот исключение.");
//            e.printStackTrace();
//        }
//    }
//}


//    Задача №5.
//    1) Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    2) Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    3) Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно
//    записаться в лог-файл.

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//import java.util.logging.Logger;
//import java.util.logging.FileHandler.encoding=UTF-8
//
//public class Seminar_002 {
//    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger(Seminar_002.class.getName());
//        FileHandler fh = new FileHandler("log.txt");
//        logger.addHandler(fh);
//
//
//        String startDir = System.getProperty("user.dir");
//        String[] data = getDirArr(startDir);
//        writeToFile(data);
//    }
//
//    public static String[] getDirArr(String dirPath) {
//        try {
////            String pathProject = System.getProperty("user.dir");
//            File dir = new File(dirPath);
//            return dir.list();
//        }catch (Exception e) {
//            System.out.println("Тут какое-то исключение");
//            return new String[0];
//        }
//    }
//    public static void writeToFile(String[] data){
//        String result = String.join(", ", data);
//        try{
//            String pathProdject = System.getProperty("user.dir");
//            String pathFile = pathProdject.concat("\\file3.txt");
//            File file = new File(pathFile);
//
//            FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write(result);
//            fileWriter.flush();
//            fileWriter.close();
//        }
//        catch (Exception e){
//            System.out.println("Вот исключение.");
//            e.printStackTrace();
//        }
//    }
//}
