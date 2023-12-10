package lr5.Example3;

public class Task3 {
    public int x;
    public int y;

    Task3() {
        System.out.println("Koнcтpyиpoвaниe объекта Task3(1)\n");
    }

    Task3(int x) {
        System.out.println("Koнcтpyиpoвaниe объекта Task3(2)");
        this.x = x;
    }

    Task3(int x, int y) {
        System.out.println("Koнcтpyиpoвaниe объекта Task3(3)");
        this.x = x;
        this.y = y;
    }

}

