class Duck2 {
    int size;

    public Duck2() {
        // supply default size
        size = 27;
        System.out.println("size is " + size);
    }

    public Duck2(int duckSize) {
        // use duckSize parameter
        size = duckSize;
        System.out.println("size is " + size);
    }
}

public class UseADuck3 {
    public static void main (String[] args) {
        Duck2 d1 = new Duck2();
        Duck2 d2 = new Duck2(42);
    }
}