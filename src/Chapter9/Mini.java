class Mini extends Car {
    Color color;

    public Mini() {
        this(Color.Red);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
        // more initialization
    }

    public Mini(int size) {
        this(color.Red);
        // Wrong: call to super must be first statement
        // in constructor
        super(size);
    }
}