package Seminars.Seminar_004_LinkedList;

// size(), empty(), push(), peek(), pop()

public class MyStack {
    private int[] arr = new int[10]; // private - это область видимости только в нутри текущего класса
    // надо помнить, что int[] arr - это ссылка на наш объект
    // new int[10] - сам объект
    private int length = 0; // private - это область видимости только в нутри текущего класса
    int size() {
        // метод определяющий размер нашего массива
        return length;
    }
    boolean empty() {
        // метод проверяющий пустой наш массив или нет
        return length == 0;
    }
    void push(int item) {
        if (length >= arr.length) {
            int[] arr1 = new int[arr.length + 10];
            System.arraycopy(arr, 0, arr1,0, arr.length);
            // первый акргумент - это массив из которого копируем
            // второй аргумент - это индекс с которого начинается копирование
            // третий аргумент - это массив в который мы будем копировать
            // четвертый аргумент - это индекс с которого начнется вставка в новый массив
            // пятый аргумент - кол-во элементов которые мы собираемся скопировать
            arr = arr1;
            // далее нам надо переприсвоить так сказать ссылки, что пк знал, что в arr теперь лежить arr1
            // так сказать адрес arr теперь смотрит на новый участок памяти arr1
        }
        arr[length++] = item;
        // в скобках написанно ++ это постинкремент, и говорит о том, что после того, как запишется первый item
        // переменная length увеличится на 1
    }
    Integer peek() {
        // метод peek позволяет нам увидеть последний элемент в стеке, но не удалять его
        if (!empty()) {
            return arr[length-1];
        }
        return null;
    }
    Integer pop() {
        // метод pop позволяет нам увидеть последний элемент в стеке, и удалить его
        if (!empty()) {
            return arr[--length];
            // в скобках написанно -- это говорит о том, что мы сначала уменьшим length на 1, а только потом выполнется
            // return и length при этом поменяется
        }
        return null;
    }
}

