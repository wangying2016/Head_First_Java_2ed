public class TryCatchTest {
    public String doRiskyThing() {
        try {
            System.out.println("try");
            return "try-return";
        } catch (Exception ex) {
            System.out.println("catch");
            return "catch-return";
        } finally {
            System.out.println("finally");
            return "finally-return";
        }
    }

    public static void main(String[] args) {
        TryCatchTest t = new TryCatchTest();
        System.out.println(t.doRiskyThing());
    }
}
