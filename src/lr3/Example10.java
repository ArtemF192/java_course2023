//        10. Напишите программу, в которой создается целочисленный
//        массив, заполняется случайными числами и после этого значения элементов в
//        массиве сортируются в порядке убывания значений.

package lr3;

public class Example10 {

    static int[] a = new int[10];

    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++)
            a[i] = new java.util.Random().nextInt(100);


        input();

        for(int i = 0; i < a.length - 1; i++)
            for(int j = 0; j < a.length - i - 1; j++)
                if(a[j] < a[j + 1]){
                    int b = a[j+1];
                    a[j+1] = a[j];
                    a[j] = b;
                }

        input();
    }

    static void input(){
        for (int j : a) System.out.print(j + " ");
        System.out.println();
    }
}


