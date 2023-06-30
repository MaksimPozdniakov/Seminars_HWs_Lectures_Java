package Tests.Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProbabilityTheory {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<String[]> toys = new ArrayList<>();
        toys.add(new String[]{"Doll", "50"});
        toys.add(new String[]{"Car", "6"});
        toys.add(new String[]{"Teddy bear", "30"});


        // Выбираем случайную игрушку по заданным вероятностям
        int totalPercentage = 0;
        for (String[] toy : toys) {
            totalPercentage += Integer.parseInt(toy[1]);
        }
        int randomNumber = random.nextInt(totalPercentage);

        int currentPercentage = 0;
        for (String[] toy : toys) {
            currentPercentage += Integer.parseInt(toy[1]);
            if (randomNumber < currentPercentage) {
                System.out.println("You won a " + Arrays.toString(toy) + "!");
                return;
            }
        }


        throw new IllegalStateException("Could not pick a toy");
    }
}


//public class ProbabilityTheory {
//    private static final Random random = new Random();
//
//    public static void main(String[] args) {
//        List<String[]> toys = new ArrayList<>();
//        toys.add(new String[]{"Doll", "50"});
//        toys.add(new String[]{"Car", "6"});
//        toys.add(new String[]{"Teddy bear", "7"});
//
//        String[] toy = pickToy(toys);
//        System.out.println("You won a " + toy[0] + "!");
//
//
//
//
//    }
//
//    private static String[] pickToy(List<String[]> toys) {
//        int totalPercentage = 0;
//        for (String[] toy : toys) {
//            totalPercentage += Integer.parseInt(toy[1]);
//        }
//        int randomNumber = random.nextInt(totalPercentage);
//        System.out.println(randomNumber);
//        int currentPercentage = 0;
//        for (String[] toy : toys) {
//            currentPercentage += Integer.parseInt(toy[1]);
//            if (randomNumber < currentPercentage) {
//                return toy;
//            }
//        }
//
//        throw new IllegalStateException("Could not pick a toy");
//    }
//}
