public class Duck3 {
    private int size;
    private static int duckCount = 0;

    public Duck3() {
        duckCount++;
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }
}