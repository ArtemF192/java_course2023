package lr6.Example7;

public class Main {
    public static void main(String[] args) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Example7.convertCharArray(alphabet);
        Example7.viewArray();

    }
    private static class Example7 {
        static int[] IntArray;

        private static void convertCharArray(char[] ChArray) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = ChArray[i];
            }

        }

        private static void viewArray() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("IntArray[" + i + "] = " + IntArray[i]);
            }
        }
    }


}

//    Напишите программу со статическим методом, аргументом которому передастся символьный массив,
//    а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из
//    массива- аргумента.
