class Foof {
    // now you can't change size
    final int size = 3;
    final int whuffie;

    Foof() {
        // now you can't change whuffie
        whuffie = 42;
    }

    void doStuff(final int x) {
        // you can't change x
    }

    void doMore() {
        final int z = 7;
        // you can't change z
    }

    public static void main(String[] args) {
        // you must initialize a
        final int a;
        a = 42;
        System.out.print(a);
    }
}