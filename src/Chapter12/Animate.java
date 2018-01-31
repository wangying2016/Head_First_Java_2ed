import javax.swing.*;
import java.awt.*;


public class Animate {
    private int x = 50;
    private int y = 50;
    private JFrame frame = new JFrame();

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.orange);
            g.fillOval(x,y,100,100);
            x += 5;
            y += 5;
            System.out.println("x = " + x + " , y = " + y);
            if (x < 255) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {

                }
                frame.repaint();
            }
        }
    }
}