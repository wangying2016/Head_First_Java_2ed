import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextField {

    JTextField field;

    public static void main (String[] args) {
        TextField gui = new TextField();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        field = new JTextField(20);
        field.setText("Your name is: ");
        field.requestFocus();
        field.addActionListener(new InputListener());
        MyDrawPanel drawPanel = new MyDrawPanel();
        drawPanel.add(field);

        frame.getContentPane().add(drawPanel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            // do nothing
        }
    }

    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            field.selectAll();
            System.out.println(field.getText());
        }
    }
}