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
       JFrame window = new JFrame("LoginWindow"); //creating a frame
       window.setTitle("Login");
       window.addWindowListener(new MyWindowListener());
       window.setSize(400,400); //Setting size of frame
       
       
       
       //creating main panel
       JPanel mainPanel = new JPanel(new BorderLayout());
       window.add(mainPanel);
       
       
    
       //creating panel for bottom buttons
       JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
       bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
       //adding login button
       JButton loginButton = new JButton("Login");
       loginButton.setPreferredSize(new Dimension(100,50));
       
       bottomPanel.add(loginButton);
       
       
       //adding register button
       JButton registerButton = new JButton("Register");
       registerButton.setPreferredSize(new Dimension(100,50));
       
       bottomPanel.add(registerButton);   
      
       //creating upper panel for user details
       JPanel upperPanel = new JPanel();
       
       //creating upperp panel GridBagLayout
       GridBagLayout upperPanelLayout = new GridBagLayout();
       
       upperPanel.setLayout(new GridBagLayout());
       
       
       //welcome message
       JLabel welcomeMessage = new JLabel("Welcome to Dataverse");
       welcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
       upperPanel.add(welcomeMessage);
       
       
       //text fields for input
       JLabel usernameLabel = new JLabel("Username");      
       JTextField usernameInput = new JTextField(20);
     
       usernameInput.setPreferredSize(new Dimension(100,50));
       upperPanel.add(usernameInput);
       
       JPasswordField passwordInput = new JPasswordField(100);
       passwordInput.setPreferredSize(new Dimension(100,50));
       upperPanel.add(passwordInput);
      
       //adding bottom and upper panels to mainPanel
       mainPanel.add(bottomPanel, BorderLayout.SOUTH);
       mainPanel.add(upperPanel, BorderLayout.NORTH);
       
       window.setVisible(true); //Ensuring that frame is visible

    }
    
    
    public void loginPage2() {
    
}
   
    
    public void homePage() {
    
}
    
}
