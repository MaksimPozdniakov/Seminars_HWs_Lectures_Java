package OOP_ALL.HomeWork.HW_02;


import java.util.ArrayList;
import java.util.Iterator;


public class Zoo implements Iterable<Animal>{
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal){
        this.animals.add(animal);
    }

    public void removeAnimal(int num){
        this.animals.remove(num-1);
    }

    public void showAllAnimal(){
        int number = 1;
        for (Animal animal : this.animals) {
            System.out.printf("%d) %s: %s \n",number, animal.getClass().getSimpleName(),animal);
            number++;
        }
    }

    public String checkClass(int num){
        return this.animals.get(num - 1).getClass().getSimpleName();
    }

    public void showInformation(int num){
        this.animals.get(num - 1).showInformation();
        System.out.println(this.animals.get(num - 1));
        System.out.println();
    }

    public void makeSoundAnimal(int num) {
        this.animals.get(num - 1).makeSoundAnimal();
        System.out.println();
    }

    public void soundAllAnimal(){
        for (Animal elem: this.animals) {
            if (elem instanceof MakeSound){
                System.out.print(elem.getClass().getSimpleName() + ": ");
                ((MakeSound) elem).makeSoundAnimal();
            }
        }
    }

    public void communication(int num) {
        Animal animal = this.animals.get(num - 1);
        if (animal instanceof ShowAffection) {
            ((ShowAffection) animal).showAffection();
        } else if (animal instanceof Fly) {
            ((Fly) animal).fly();
        }
    }

    public void trainingAnimal(int num) {
        Animal animal = this.animals.get(num - 1);
        if (animal instanceof Training) {
            ((Training) animal).training();
        }
    }

    public Iterator<Animal> iterator() {
        return animals.iterator();
    }


}
