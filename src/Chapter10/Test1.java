// illegal
// non-static variable x cannot be referenced from a static context
public class Test1 {
    int x;

    public static void go() {
        System.out.println(x);
    }
}