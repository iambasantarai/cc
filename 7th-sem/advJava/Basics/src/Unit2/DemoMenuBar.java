package Unit2;
/*
    - Menu bar is a tab that contains sequence of item known as menu
    - Menu contain collection of item known as menu item
 */

import javax.swing.*;
import java.awt.*;

class Menu extends JFrame {
    public void setMenu() {
        // create menu bar
        JMenuBar mb = new JMenuBar();

        // create first menu
        JMenu m1 = new JMenu("File");

        // add mnemonic: shortcut key
        m1.setMnemonic('f');

        // create menu item for first menu
        JMenuItem i1 = new JMenuItem("Open", 'o');
        JMenuItem i2 = new JMenuItem("Save", 's');
        JMenuItem i3 = new JMenuItem("Save As",'a');

        // add item on menu 1
        m1.add(i1);m1.add(i2);m1.add(i3);

        // add menu on menu-bar

        mb.add(m1);
        // add branch: add subcomponent on particular menu item
        JMenu m2 = new JMenu("New");
        JMenuItem i4 = new JMenuItem("New File");
        JMenuItem i5 = new JMenuItem("New Window");

        m2.add(i4);m2.add(i5);
        m1.add(m2);

        // CheckBoxMenuItem: can be set on and off
        JMenu m3 = new JMenu("Edit");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Copy", true);
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("Paste");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("Cut");
        m3.add(c1); m3.add(c2); m3.add(c3);
        mb.add(m3);

        // RadioButtonMenuItem
        JMenu m4 = new JMenu("View");
        JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("Zoom");
        JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("Status Bar");
        m4.add(rb1); m4.add(rb2);
        mb.add(m4);

        // add menu-bar on JFrame
        add(mb);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class DemoMenuBar {
    public static void main(String[] args) {
        Menu m = new Menu();
        m.setMenu();
    }
}
