package dataverse;
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
       JFrame window = new JFrame("LoginWindow");
       window.addWindowListener(new MyWindowListener());
       window.setSize(400,400);
       window.setVisible(true);
       
       
    }
    
    public void homePage() {
    
}
    
}
