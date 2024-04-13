package lr9.ComparisonCollections6;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        System.out.println("Время выполнения операции добавление элемента в начало коллекции arrayDeque = "
                + getRunningTimeStart(arrayDeque));
        System.out.println("Время выполнения операции добавление элемента в начало коллекции linkedList = "
                + getRunningTimeStart(linkedList));
        System.out.println("Время выполнения операции добавление элемента в начало коллекции arrayList = "
                + getRunningTimeStart(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции добавление элемента в конец коллекции arrayDeque = "
                + getRunningTimeEnd(arrayDeque));
        System.out.println("Время выполнения операции добавление элемента в конец коллекции linkedList = "
                + getRunningTimeEnd(linkedList));
        System.out.println("Время выполнения операции добавление элемента в конец коллекции arrayList = "
                + getRunningTimeEnd(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции добавление элемента в середину коллекции arrayDeque = "
                + getRunningTimeMiddle(arrayDeque));
        System.out.println("Время выполнения операции добавление элемента в середину коллекции linkedList = "
                + getRunningTimeMiddle(linkedList));
        System.out.println("Время выполнения операции добавление элемента в середину коллекции arrayList = "
                + getRunningTimeMiddle(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции удаления элемента в начале коллекции arrayDeque = "
                + getTimeRemoveStart(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента в начале коллекции linkedList = "
                + getTimeRemoveStart(linkedList));
        System.out.println("Время выполнения операции удаления элемента в начале коллекции arrayList = "
                + getTimeRemoveStart(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции удаления элемента в конце коллекции arrayDeque = "
                + getTimeRemoveEnd(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента в конце коллекции linkedList = "
                + getTimeRemoveEnd(linkedList));
        System.out.println("Время выполнения операции удаления элемента в конце коллекции arrayList = "
                + getTimeRemoveEnd(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции удаления элемента в середине коллекции arrayDeque = "
                + getTimeRemoveMiddle(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента в середине коллекции linkedList = "
                + getTimeRemoveMiddle(linkedList));
        System.out.println("Время выполнения операции удаления элемента в середине коллекции arrayList = "
                + getTimeRemoveMiddle(arrayList));

        System.out.println("\n");
        System.out.println("Время выполнения операции получения элемента по индексу arrayDeque - " +
                "не позволяет обращаться к элементам по индексу ");
        System.out.println("Время выполнения операции получения элемента по индексу linkedList = "
                + getTimeByIndex(linkedList));
        System.out.println("Время выполнения операции получения элемента по индексу arrayList = "
                + getTimeByIndex(arrayList));

    }

    private static long getRunningTimeStart(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.addFirst(i);
        }

        long end = System.currentTimeMillis();
        return end - start;

    }

    private static long getRunningTimeStart(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeStart(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeEnd(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.add(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeEnd(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeEnd(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeMiddle(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i / 2);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeMiddle(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i / 2);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeMiddle(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.add(i / 2);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveStart(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.removeFirst();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveStart(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.removeFirst();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveStart(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        arrayList.clear();

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveEnd(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
           arrayDeque.removeLast();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveEnd(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.removeLast();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveEnd(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveMiddle(ArrayDeque<Integer> arrayDeque) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayDeque.add(i);
        }

        // Найдем значение элемента, который находится в середине
        int middleValue = 1000000 / 2;

        // Удалим этот элемент из коллекции
        arrayDeque.removeFirstOccurrence(middleValue);

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveMiddle(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        int middleValue1 = 1000000 / 2;

        linkedList.remove(middleValue1);

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveMiddle(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        int middleValue2 = 1000000 / 2;

        arrayList.remove(middleValue2);

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeByIndex(LinkedList<Integer> linkedList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }

        for (int i = 0; i < 10000; i++) {
            int value = linkedList.get(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeByIndex(ArrayList<Integer> arrayList) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 10000; i++) {
            int value = arrayList.get(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }


}
