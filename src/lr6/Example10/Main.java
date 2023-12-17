package lr6.Example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = getMaxAndMinValue(12310,22310,331240,2221230,500);
        System.out.println(Arrays.toString(arrayInt));

    }

    public static int[] getMaxAndMinValue(int ... v) {
        Arrays.sort(v);

        int[] arrayInt = new int[2];

        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length - 1];

        return arrayInt;
    }
}

//    Напишите программу со статическим методом, аргументом которому передается произвольное количество
//        целочисленных аргументов. Результатом метод возвращает массив из двух элементов: это значения
//        наибольшего и наименьшего значений среди аргументов, переданных методу.
