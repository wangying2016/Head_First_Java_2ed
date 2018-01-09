class Duck {
    int size;

    public Duck(int duckSize) {
        System.out.print("Quack");
        size = duckSize;
        System.out.println("size is " + size);
    }
}

public class UseADuck2 {
    public static void main (String[] args) {
        Duck d = new Duck(42);
    }
}
