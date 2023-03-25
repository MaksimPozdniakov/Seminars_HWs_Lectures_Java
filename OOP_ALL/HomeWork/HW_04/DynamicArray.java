package OOP_ALL.HomeWork.HW_04;

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

    public T  minEl(){
       T min = array[0];
        for (int i = 0; i < length; i++) {
            if (this.array[i].compareTo(min) < 0){
                min = array[i];
            }
        }
        return min;
    }

    public T  maxEl(){
        T max = array[0];
        for (int i = 0; i < length; i++) {
            if (this.array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }

    public int sumEl(){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] instanceof Number) {
                sum += ((Number) array[i]).intValue();
            }
        }
        return sum;
    }

    public Object productElements(){
        if (length == 0) throw new IllegalArgumentException("Переданный массив пустой");
        if (array[0] instanceof Number) {
            Number product = 1;
            for (int i = 0; i < length; i++) {
                product = product.doubleValue() * ((Number) array[i]).doubleValue();
            }
            return product;
        }
        return null;
    }

//    Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public int indexOf(T value) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }
//    Получение элемента массива по индексу
    public T getDig(int index){
        return array[index];
    }
//    Задание значения элементу массива с заданным индексом
    public T changeDig(int index, T num){
//        array[index] = array[num];
        return array[index] = num;
    }

//    Пузырьковая сортировка
    public void bubbleSorting(){
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (this.array[j].compareTo(this.array[j + 1]) > 0){
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

//Сортировка простыми вставками
    public void insertionSort() {
        for (int i = 1; i < length; i++) {
            T temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(temp) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

//Сортировка простым выбором
    public void selectionSort() {
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }


    public void print(){
        System.out.println(Arrays.toString(this.array));
//        System.out.println(this.length);
    }
}
