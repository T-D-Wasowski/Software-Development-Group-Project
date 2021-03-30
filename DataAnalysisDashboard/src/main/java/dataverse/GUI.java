package dataverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax . swing .*;
import java . awt . event .*;

public class GUI {
    
    class MyWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("Closing window.");
            System.exit(0);
        }
    }
    
    
    public void login() {
     
    }
    
    
    public void loginPage2() {
    
}
   
    
    public void homePage() {
        JFrame frame = new JFrame("Home Page");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(600,600);
        
           //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        mb.add(m1);
        JMenuItem m11 = new JMenuItem("Confirm Logout");
        m1.add(m11);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
}
    
}
