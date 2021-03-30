package dataverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
       window.setVisible(true); //Ensuring that frame is visible
       
       
       //creating panel for bottom buttons
       JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
       bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
       
       
       //adding login button
       JButton loginButton = new JButton("Login");
       loginButton.setBounds(130,100,100,40);
       
       bottomPanel.add(loginButton);
       
       
       //adding register button
       JButton registerButton = new JButton("Register");
       registerButton.setBounds(130,100,100,40);
       
       bottomPanel.add(registerButton);   
      
       //creating upper panel for user details
       JPanel upperPanel = new JPanel();
       upperPanel.setLayout(new GridLayout(0,1));
       
       //welcome message
       JLabel welcomeMessage = new JLabel("Welcome to Dataverse");
       welcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
       upperPanel.add(welcomeMessage);
       
       //text fields for input
       JLabel usernameLabel = new JLabel("Username");      
       JTextField usernameInput = new JTextField(20);
       
       
       
       usernameInput.setPreferredSize(new Dimension(50,24));
       upperPanel.add(usernameInput);
       
       JPasswordField passwordInput = new JPasswordField(100);
       passwordInput.setSize(200,24);
       upperPanel.add(passwordInput);
  
       //creating main panel
       JPanel mainPanel = new JPanel(new BorderLayout());
       window.add(mainPanel);
       mainPanel.add(upperPanel, BorderLayout.NORTH);
       mainPanel.add(bottomPanel, BorderLayout.SOUTH);
       mainPanel.setSize(400,400);
       

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
