// this demo should be wrong when you compile this class
// Static methods can't use non-static methods, either!
public class Duck2 {
    private int size;

    public static void main(String[] args) {
        System.out.println("Size of duck is " + getSize());
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }
}