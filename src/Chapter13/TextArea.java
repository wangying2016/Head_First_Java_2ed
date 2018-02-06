import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea {
    JTextArea text;

    public static void main(String[] args) {
        TextArea gui = new TextArea();
        gui.go();
    }

    public void go() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        JButton button = new JButton("Just Click It");
        button.addActionListener(new InputListener());

        text = new JTextArea(10,20);
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        drawPanel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

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
            text.append("over!");
            text.selectAll();
            text.requestFocus();
        }
    }
}