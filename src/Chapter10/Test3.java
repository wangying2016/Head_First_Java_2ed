// legal
// static variable can be referenced from a non-static method
public class Test3 {
    static final int x = 12;

    public void go() {
        System.out.println(x);
    }
}