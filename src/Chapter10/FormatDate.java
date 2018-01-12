import java.util.Date;
public class FormatDate {
    public void completeTime() {
        String s = String.format("%tc", new Date());
        System.out.println(s);
    }

    public void time() {
        String s = String.format("%tr", new Date());
        System.out.println(s);
    }

    public void today() {
        Date today = new Date();
        String s = String.format("%tA, %tB %td", today, today, today);
        System.out.println(s);
    }

    public void day() {
        Date today = new Date();
        String s = String.format("%tA, %<tB %<td", today);
        System.out.println(s);
    }

    public static void main(String[] args) {
        FormatDate f = new FormatDate();
        f.completeTime();
        f.time();
        f.today();
        f.day();
    }
}