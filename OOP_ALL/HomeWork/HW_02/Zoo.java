package OOP_ALL.HomeWork.HW_02;


import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Iterable<Animal>{
    private ArrayList<Animal> animals;
    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimals(Animal animal){
        this.animals.add(animal);
    }

    public void showAllAnimal(){
        for (Animal animal : this.animals) {
            System.out.printf("%s: %s \n", animal.getClass().getSimpleName(),animal);
        }
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
