// this demo should be wrong when you compile this class
// Static mehtods can't use non-static (instance) variables!
public class Duck {
    private int size;

    public static void main(String[] args) {
        System.out.println("Size of duck is " + size);
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }
}