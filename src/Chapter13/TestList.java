import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TestList implements ListSelectionListener {

    JList<String> list;

    public static void main(String[] args) {
        TestList gui = new TestList();
        gui.go();
    }

    public void go() {
        String[] listEntries = {"alpha", "beta", "gamma", "delta",
                "epsilon", "zeta", "eta", "theta"};
        // list = new JList<String>(listEntries);
        list = new JList(listEntries);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        list.setVisibleRowCount(4);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(350,300);
        frame.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent lse) {
        if (!lse.getValueIsAdjusting()) {
            String selection = (String)list.getSelectedValue();
            System.out.println(selection);
        }
    }
}