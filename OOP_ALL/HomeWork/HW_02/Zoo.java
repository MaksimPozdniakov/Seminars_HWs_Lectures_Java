package OOP_ALL.HomeWork.HW_02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;


public class Zoo implements Iterable<Animal>{
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }


    public void addAnimals(Animal animal){
        this.animals.add(animal);
    }

    public void showAllAnimal(){
        for (Animal animal : this.animals) {
            System.out.printf("%s: %s \n", animal.getClass().getSimpleName(),animal);
        }
    }

    public String checkClass(int num){
        return this.animals.get(num - 1).getClass().getSimpleName();
    }

    public void showInformation(int num){
        this.animals.get(num - 1).showInformation();
        System.out.println();
    }

    public void makeSoundAnimal(int num) {
        this.animals.get(num - 1).makeSoundAnimal();
        System.out.println();
    }



//    public void showAffection(int num) {
//        for (Animal animal : this.animals) {
//            if (animal instanceof ShowAffection) {
//                ((ShowAffection) animal).showAffection();
//            }
//        }
//        this.animals.get(num - 1).showAffection();
//        System.out.println();
//    }

    public Iterator<Animal> iterator() {
        return animals.iterator();
    }


}
