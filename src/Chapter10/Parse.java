public class Parse {
    public static void main(String[] args) {
        String s = "2";
        int x = Integer.parseInt(s);
        double d = Double.parseDouble("420.34");

        boolean b = new Boolean("true").booleanValue();

        System.out.println(x + " " + d + " " + b);
    }
}