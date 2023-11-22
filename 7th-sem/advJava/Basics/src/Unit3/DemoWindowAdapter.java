// in wondow event there are five methods but using adapter class we can use any of them according to our requirements

package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class  WindowsAdapters {
    JFrame jf;
    public void setWindowAdapters () {
        jf = new JFrame();
        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closed using corss sign.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized (iconified).");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window opened (deiconified).");
            }
        });

        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class DemoWindowAdapter {
    public static void main(String[] args) {
        WindowsAdapters wa = new WindowsAdapters();
        wa.setWindowAdapters();
    }
}
