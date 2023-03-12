package OOP_ALL.HomeWork.HW_02;

public abstract class Animal {
    protected Integer height;
    protected Integer weight;
    protected String eyeColor;

    public Animal(Integer height,Integer weight,String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void makeSoundAnimal();

    public abstract void showInformation();

    public String toString(){
        return "Рост: " + height + "Вес: " + weight + "Цвет глаз: " + eyeColor;
    }

}
