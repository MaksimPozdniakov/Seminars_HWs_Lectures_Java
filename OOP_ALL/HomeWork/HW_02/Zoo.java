package OOP_ALL.HomeWork.HW_02;

import OOP_ALL.Seminars.Seminar_02.Play;

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
        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println(this.animals.get(i).getClass().getSimpleName());
            System.out.println(this.animals.get(i));
        }
    }


    public void makeSoundAnimal() {
        for (int i = 0; i < this.animals.size(); i++) {
            if (this.animals.get(i) instanceof MakeSound){
                ((MakeSound) this.animals.get(i)).makeSoundAnimal();
            }
        }
    }

    public Iterator<Animal> iterator() {
        return animals.iterator();
    }


}
