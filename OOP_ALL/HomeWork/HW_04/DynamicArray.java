package OOP_ALL.HomeWork.HW_04;

import OOP_ALL.Seminars.Seminar_01.Introduction.A;

import java.util.Arrays;

public class DynamicArray<T extends Comparable<T>> {
    private T[] array;
    private int length;

    public DynamicArray(){
        this.array = (T[]) new Comparable[0];
        this.length = 0;
    }
    public DynamicArray(T[] newArray){
        this.array = Arrays.copyOf(newArray, newArray.length);
        this.length = newArray.length;
    }
    public void addInArr(T digit){
        if (this.length == this.array.length){
            this.array = Arrays.copyOf(array, array.length + 1);
        }
        array[length] = digit;
        length++;
    }

    public void removeEl(int num){
        for (int i = num; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        length--;
        array = Arrays.copyOf(array,length);
    }

    public void removeAllSpecDig(int num){
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i].equals(num)){
                count++;
            } else {
                array[i - count] = array[i];
            }
        }
        length -= count;
        array = Arrays.copyOf(array,length);
    }

    public void print(){
        System.out.println(Arrays.toString(this.array));
        System.out.println(this.length);
    }

}
