// Initialize a final static varaible
// In a static initializer
public class Bar {
    public static final double BAR_SIGN;

    static {
        BAR_SIGN = (double)Math.random();
    }
}