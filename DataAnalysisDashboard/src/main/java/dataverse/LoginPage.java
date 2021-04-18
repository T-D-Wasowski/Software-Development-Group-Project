/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataverse;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginPage extends javax.swing.JFrame {

    UserController userController = new UserController();
    //HomePage homePage = new HomePage(); //Get rid off once in GUI

    public LoginPage() {
        initComponents();
        registerPanel.setVisible(false);
        hideNotifications();
        loginPanel.setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginUsernameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginPasswordTextField = new javax.swing.JPasswordField();
        loginLoginButton = new javax.swing.JButton();
        loginRegisterButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        loginNotificationLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoNotificationLabel = new javax.swing.JPanel();
        loginNotificationLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        registerPasswordTextField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        registerUsernameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registerEmailTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        registerRegisterButton = new javax.swing.JButton();
        registerBackButton = new javax.swing.JButton();
        registerAdminCheckBox = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 102, 153));
        setForeground(java.awt.Color.cyan);
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(208, 239, 255));

        loginPanel.setBackground(new java.awt.Color(208, 239, 255));
        loginPanel.setPreferredSize(new java.awt.Dimension(461, 338));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");

        loginUsernameTextField.setName(""); // NOI18N
        loginUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        loginPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordTextFieldActionPerformed(evt);
            }
        });
        loginPasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPasswordTextFieldKeyPressed(evt);
            }
        });

        loginLoginButton.setBackground(new java.awt.Color(62, 143, 185));
        loginLoginButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        loginLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginLoginButton.setText("Login");
        loginLoginButton.setBorder(null);
        loginLoginButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginLoginButtonMouseMoved(evt);
            }
        });
        loginLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLoginButtonMouseExited(evt);
            }
        });
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });

        loginRegisterButton.setBackground(new java.awt.Color(62, 143, 185));
        loginRegisterButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        loginRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        loginRegisterButton.setText("Register");
        loginRegisterButton.setBorder(null);
        loginRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginRegisterButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginRegisterButtonMouseMoved(evt);
            }
        });
        loginRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginRegisterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginRegisterButtonMouseExited(evt);
            }
        });
        loginRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisterButtonActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(208, 239, 255));

        loginNotificationLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        loginNotificationLabel.setText("Notification");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(loginNotificationLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(loginNotificationLabel)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(loginPasswordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginPasswordTextField, loginUsernameTextField});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginPasswordTextField, loginUsernameTextField});

        loginUsernameTextField.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(208, 239, 255));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 160, 39));
        jLabel3.setText("Data");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(145, 145, 145));
        jLabel4.setText("verse");

        logoNotificationLabel.setBackground(new java.awt.Color(208, 239, 255));

        loginNotificationLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        loginNotificationLabel1.setText("Notification");

        javax.swing.GroupLayout logoNotificationLabelLayout = new javax.swing.GroupLayout(logoNotificationLabel);
        logoNotificationLabel.setLayout(logoNotificationLabelLayout);
        logoNotificationLabelLayout.setHorizontalGroup(
            logoNotificationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoNotificationLabelLayout.createSequentialGroup()
                .addComponent(loginNotificationLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoNotificationLabelLayout.setVerticalGroup(
            logoNotificationLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoNotificationLabelLayout.createSequentialGroup()
                .addComponent(loginNotificationLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(logoNotificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addComponent(logoNotificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(208, 239, 255));

        registerPanel.setBackground(new java.awt.Color(208, 239, 255));
        registerPanel.setPreferredSize(new java.awt.Dimension(461, 338));

        registerPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Password (8 - 32 Characters)");

        registerUsernameTextField.setName(""); // NOI18N
        registerUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username (3 - 32 Characters)");

        jLabel7.setText("Is this an Administrative account?");

        registerEmailTextField.setName(""); // NOI18N
        registerEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEmailTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email (3 - 255 Characters)");

        registerRegisterButton.setBackground(new java.awt.Color(62, 143, 185));
        registerRegisterButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        registerRegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        registerRegisterButton.setText("Register");
        registerRegisterButton.setBorder(null);
        registerRegisterButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerRegisterButtonMouseMoved(evt);
            }
        });
        registerRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerRegisterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerRegisterButtonMouseExited(evt);
            }
        });
        registerRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerRegisterButtonActionPerformed(evt);
            }
        });

        registerBackButton.setBackground(new java.awt.Color(62, 143, 185));
        registerBackButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        registerBackButton.setForeground(new java.awt.Color(255, 255, 255));
        registerBackButton.setText("Back");
        registerBackButton.setBorder(null);
        registerBackButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerBackButtonMouseMoved(evt);
            }
        });
        registerBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBackButtonMouseExited(evt);
            }
        });
        registerBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackButtonActionPerformed(evt);
            }
        });

        registerAdminCheckBox.setText("Admin");
        registerAdminCheckBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registerAdminCheckBoxMouseMoved(evt);
            }
        });
        registerAdminCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAdminCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(registerUsernameTextField, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerPasswordTextField, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(registerEmailTextField, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(registerAdminCheckBox)))
                                .addComponent(jLabel5))))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(registerBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(registerRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(registerAdminCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordTextFieldActionPerformed

    private void loginUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameTextFieldActionPerformed

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed

        loginLogin();

    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButtonActionPerformed

        loginRegister();

    }//GEN-LAST:event_loginRegisterButtonActionPerformed

    private void registerPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordTextFieldActionPerformed

    private void registerUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerUsernameTextFieldActionPerformed

    private void registerEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerEmailTextFieldActionPerformed

    private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed

        registerBack();

    }//GEN-LAST:event_registerBackButtonActionPerformed

    private void registerRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerRegisterButtonActionPerformed

        registerRegister();

    }//GEN-LAST:event_registerRegisterButtonActionPerformed

    private void registerAdminCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAdminCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerAdminCheckBoxActionPerformed

    private void loginLoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseEntered
        // login button hover
        loginLoginButton.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_loginLoginButtonMouseEntered

    private void loginLoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseExited
        // login button unhover
        loginLoginButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_loginLoginButtonMouseExited

    private void loginRegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseEntered
        // register button hover
        loginRegisterButton.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_loginRegisterButtonMouseEntered

    private void loginRegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseExited
        // register button unhover
        loginRegisterButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_loginRegisterButtonMouseExited

    private void registerBackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBackButtonMouseEntered
        // back button hover
        registerBackButton.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_registerBackButtonMouseEntered

    private void registerBackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBackButtonMouseExited
        // back button unhover
        registerBackButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_registerBackButtonMouseExited

    private void registerRegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerRegisterButtonMouseEntered
        // register 2 button hover
        registerRegisterButton.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_registerRegisterButtonMouseEntered

    private void registerRegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerRegisterButtonMouseExited
        // register 2 button unhover
        registerRegisterButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_registerRegisterButtonMouseExited

    private void loginLoginButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseMoved
        loginLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginLoginButtonMouseMoved

    private void loginRegisterButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseMoved
        loginRegisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_loginRegisterButtonMouseMoved

    private void registerBackButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBackButtonMouseMoved
        registerBackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerBackButtonMouseMoved

    private void registerRegisterButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerRegisterButtonMouseMoved
        registerRegisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerRegisterButtonMouseMoved

    private void registerAdminCheckBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerAdminCheckBoxMouseMoved
        registerAdminCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerAdminCheckBoxMouseMoved

    private void loginPasswordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginLogin();
        }
    }//GEN-LAST:event_loginPasswordTextFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public void createLoginPage() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    private void showNotification(Boolean label, String message, Boolean colour) {

        if (label) {

            loginNotificationLabel1.setText(message);

            //True = green, False = red
            if (colour) {
                loginNotificationLabel1.setForeground(new Color(0, 153, 0));
            } else {
                loginNotificationLabel1.setForeground(Color.RED);
            }

            loginNotificationLabel1.setVisible(true);

        } else {

            loginNotificationLabel.setText(message);

            //True = green, False = red
            if (colour) {
                loginNotificationLabel.setForeground(new Color(0, 153, 0));
            } else {
                loginNotificationLabel.setForeground(Color.RED);
            }

            loginNotificationLabel.setVisible(true);
        }
    }

    private void hideNotifications() {
        loginNotificationLabel1.setVisible(false);
        loginNotificationLabel.setVisible(false);
    }

    private void clearLoginTextFields() {
        loginUsernameTextField.setText("");
        loginPasswordTextField.setText("");
    }

    private void clearRegisterTextFields() {
        registerUsernameTextField.setText("");
        registerPasswordTextField.setText("");
        registerEmailTextField.setText("");
        registerAdminCheckBox.setSelected(false);
    }

    private void loginLogin() {
        loginNotificationLabel.setVisible(false);

        String username = loginUsernameTextField.getText();

        //Put all this in a method in GUI and call the method from here instead!!!
        int status = userController.login(username, loginPasswordTextField.getText());

        switch (status) {
            case 0 -> {
                showNotification(false, "Error: This username does not exist. Please enter a valid username.", false);
                clearLoginTextFields();
            }
            case 1 -> {
                runHomePage(true, username); //Is admin
                //Create log
                //userController.createLog(true, username);
            }
            case 2 -> {
                showNotification(false, "Error: The password does not match. Please enter a valid password.", false);
                clearLoginTextFields();
            }
            case 3 -> {
                runHomePage(false, username); //Is NOT admin
                //userController.createLog(true, username);
            }
            default -> {
                showNotification(false, "Error: There was an SQL error. Please verify your credentials and try again.", false);
                clearLoginTextFields();
            }
        }
    }

    private void runHomePage(Boolean isAdmin, String username) {
        User user = userController.database.getUserByUsername(username);
        userController.createLog(true, user);

        HomePage homePage = new HomePage();
        homePage.createHomePage(isAdmin, user);

        this.dispose();
    }

    private void loginRegister() {
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
        hideNotifications();

        clearLoginTextFields();
    }

    private void registerBack() {
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);
        hideNotifications();

        clearRegisterTextFields();
    }

    private void registerRegister() {

        int status = userController.register(registerUsernameTextField.getText(),
                registerEmailTextField.getText(),
                registerPasswordTextField.getText(),
                registerAdminCheckBox.isSelected()
        );

        switch (status) {
            case 0 -> {
                showNotification(true, "Error: This username is already taken or invalid. Please enter a valid username.", false);
                clearRegisterTextFields();
            }
            case 1 -> {
                registerBack();
                showNotification(false, "Your account has been successfuly registered.", true);
            }
            case 2 -> {
                showNotification(true, "Error: The email is already taken or invalid. Please enter a valid email.", false);
                clearRegisterTextFields();
            }
            case 3 -> {
                showNotification(true, "Error: The password is invalid. Please enter a valid password.", false);
                clearRegisterTextFields();
            }
            default -> {
                showNotification(true, "Error: There was an SQL error. Please verify your credentials and try again.", false);
                clearRegisterTextFields();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JLabel loginNotificationLabel;
    private javax.swing.JLabel loginNotificationLabel1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordTextField;
    private javax.swing.JButton loginRegisterButton;
    private javax.swing.JTextField loginUsernameTextField;
    private javax.swing.JPanel logoNotificationLabel;
    private javax.swing.JCheckBox registerAdminCheckBox;
    private javax.swing.JButton registerBackButton;
    private javax.swing.JTextField registerEmailTextField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordTextField;
    private javax.swing.JButton registerRegisterButton;
    private javax.swing.JTextField registerUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
