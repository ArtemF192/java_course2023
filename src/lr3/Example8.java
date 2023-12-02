//        8. Напишите программу, в которой создается символьный массив из
//        10 элементов. Массив заполнить большими (прописными) буквами
//        английского алфавита. Буквы берутся подряд, но только согласные (то есть
//        гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//        нужно пропустить). Отобразите содержимое созданного массива в консольном
//        окне.

package lr3;

public class Example8 {

    public static void main(String[] args) {

        int Size = 10;
        char[] chars = new char[Size];                              // Создание массива с размером 10
        char i = 'A';
        char[] ExChars = {'A', 'E', 'I', 'O', 'U', 'Y'};           //создание массива гласных
        for (int x = 0; x < chars.length; i++)                      //заполнение массива
        {
            for (char exChar : ExChars) {                           //проверка на соответсвие массива гласных
                if (i == exChar) {
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("Элемент массива ["+x+"] = " + chars[x]);
            x++;
        }
        System.out.println("конец массива\n");
    }
}


