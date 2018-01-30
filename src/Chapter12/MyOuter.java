class MyOuter {
    private int x;
    MyInner inner = new MyInner();

    MyOuter() {
        System.out.println("Outer");
    }

    public void doStuff() {
        inner.go();
    }

    class MyInner {
        MyInner () {
            System.out.println("Inner");
        }

        void go() {
            x = 42;
        }
    }

    public static void main(String[] args) {
        MyOuter outerObj = new MyOuter();
        MyOuter.MyInner innerObj = outerObj.new MyInner();
    }
}