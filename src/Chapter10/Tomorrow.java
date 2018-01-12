import java.util.Calendar;
public class Tomorrow {
    public void tomorrow() {
        Calendar c = Calendar.getInstance();
        c.add(c.DATE, 1);
        System.out.println(c.getTime());
    }

    public static void main(String[] args) {
        Tomorrow t = new Tomorrow();
        t.tomorrow();
    }
}