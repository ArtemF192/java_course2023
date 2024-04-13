package lr9.Task7;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        int N = 10; // Количество человек в кругу
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполнение круга
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }

        System.out.println("Остался человек с номером: " + circle.get(0));
    }
}
