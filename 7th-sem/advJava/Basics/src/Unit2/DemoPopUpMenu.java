package Unit2;
import javax.swing.*;
import java.awt.*;

class PopUp extends JFrame {
    public void setPopUp() {
        JPopupMenu p1 = new JPopupMenu();
        JMenuItem i1 = new JMenuItem("View");
        JMenuItem i2 = new JMenuItem("Refresh");
        JMenuItem i3 = new JMenuItem("Copy");

        // add items to popup
        p1.add(i1); p1.add(i2); p1.add(i3);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1.show(this, 150, 150);
    }
}

public class DemoPopUpMenu {
    public static void main(String[] args) {
        PopUp pu = new PopUp();
        pu.setPopUp();
    }
}
