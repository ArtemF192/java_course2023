package lr6.Example8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int ArrayLength = 11;
        int[] intArray = new int[ArrayLength];
        for (int i = 0 ; i <ArrayLength; i++){
            intArray[i] = random.nextInt(1000);
            System.out.println("intArray["+i+"] = "+intArray[i]);
        }

        System.out.println("Среднее значение intArray["+ArrayLength+"] = "+Example8.ArrayAvg(intArray));
    }
    protected static class Example8{
        private static double ArrayAvg (int[] Array){
            int sum=0;
            for (int j : Array) {
                sum += j;
            }
            return (double)sum/Array.length;
        }
    }

}


//    Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
//        а результатом возвращается среднее значение для элементов массива (сумма значений элементов,
//        деленная на количество элементов в массиве).
