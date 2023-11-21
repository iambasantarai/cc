package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class windowExample{
    JFrame jf;
    public void setWindow(){
        jf= new JFrame();
        jf.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
// when the window is open
                System.out.println("windows opening");

            }

            @Override
            public void windowClosing(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("windows closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("windows closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("windows minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("windows is actiavted from minimized state back to normal");
            }

            @Override
            public void windowActivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("window is currently working (activated)");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("windows not working(deactivated)");
            }

        });
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class DemoWindowEvent {
    public static void main(String[] args){
        windowExample w= new windowExample();
        w.setWindow();
    }
}