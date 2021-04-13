/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataverse;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginUsernameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginPasswordTextField = new javax.swing.JPasswordField();
        loginLoginButton = new javax.swing.JButton();
        loginRegisterButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        registerPasswordTextField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        registerUsernameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registerEmailTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        loginRegisterButton1 = new javax.swing.JButton();
        loginLoginButton1 = new javax.swing.JButton();
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

        loginUsernameTextField.setToolTipText("Please Enter Username");
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

        loginLoginButton.setBackground(new java.awt.Color(132, 213, 255));
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

        loginRegisterButton.setBackground(new java.awt.Color(132, 213, 255));
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
                            .addComponent(jLabel2)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
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
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33))
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

        jLabel5.setText("Password");

        registerUsernameTextField.setToolTipText("Please Enter Username");
        registerUsernameTextField.setName(""); // NOI18N
        registerUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username");

        jLabel7.setText("Is this an Administrative account?");

        registerEmailTextBox.setToolTipText("Please Enter Username");
        registerEmailTextBox.setName(""); // NOI18N
        registerEmailTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEmailTextBoxActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email");

        loginRegisterButton1.setBackground(new java.awt.Color(132, 213, 255));
        loginRegisterButton1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        loginRegisterButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginRegisterButton1.setText("Register");
        loginRegisterButton1.setBorder(null);
        loginRegisterButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginRegisterButton1MouseMoved(evt);
            }
        });
        loginRegisterButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginRegisterButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginRegisterButton1MouseExited(evt);
            }
        });
        loginRegisterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisterButton1ActionPerformed(evt);
            }
        });

        loginLoginButton1.setBackground(new java.awt.Color(132, 213, 255));
        loginLoginButton1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        loginLoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginLoginButton1.setText("Back");
        loginLoginButton1.setBorder(null);
        loginLoginButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginLoginButton1MouseMoved(evt);
            }
        });
        loginLoginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLoginButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLoginButton1MouseExited(evt);
            }
        });
        loginLoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButton1ActionPerformed(evt);
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
                                        .addComponent(registerEmailTextBox, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(registerAdminCheckBox)))
                                .addComponent(jLabel5))))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(loginLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(loginRegisterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(registerEmailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(registerAdminCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginRegisterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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
   
    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButtonActionPerformed
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
    }//GEN-LAST:event_loginRegisterButtonActionPerformed

    private void registerPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordTextFieldActionPerformed

    private void registerUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerUsernameTextFieldActionPerformed

    private void registerEmailTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEmailTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerEmailTextBoxActionPerformed

    private void loginLoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButton1ActionPerformed
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_loginLoginButton1ActionPerformed

    private void loginRegisterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginRegisterButton1ActionPerformed

    private void registerAdminCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAdminCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerAdminCheckBoxActionPerformed

    private void loginLoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseEntered
        // login button hover
        loginLoginButton.setBackground(new Color(245,160,39));          //orange
    }//GEN-LAST:event_loginLoginButtonMouseEntered

    private void loginLoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseExited
        // login button unhover
        loginLoginButton.setBackground(new Color(132,213,255));      //blue
    }//GEN-LAST:event_loginLoginButtonMouseExited

    private void loginRegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseEntered
        // register button hover
        loginRegisterButton.setBackground(new Color(245,160,39));          //orange
    }//GEN-LAST:event_loginRegisterButtonMouseEntered

    private void loginRegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseExited
        // register button unhover
        loginRegisterButton.setBackground(new Color(132,213,255));      //blue
    }//GEN-LAST:event_loginRegisterButtonMouseExited

    private void loginLoginButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButton1MouseEntered
        // back button hover
        loginLoginButton1.setBackground(new Color(245,160,39));          //orange
    }//GEN-LAST:event_loginLoginButton1MouseEntered

    private void loginLoginButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButton1MouseExited
        // back button unhover
        loginLoginButton1.setBackground(new Color(132,213,255));      //blue
    }//GEN-LAST:event_loginLoginButton1MouseExited

    private void loginRegisterButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButton1MouseEntered
        // register 2 button hover
        loginRegisterButton1.setBackground(new Color(245,160,39));          //orange
    }//GEN-LAST:event_loginRegisterButton1MouseEntered

    private void loginRegisterButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButton1MouseExited
        // register 2 button unhover
        loginRegisterButton1.setBackground(new Color(132,213,255));      //blue
    }//GEN-LAST:event_loginRegisterButton1MouseExited

    private void loginLoginButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseMoved
        loginLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_loginLoginButtonMouseMoved

    private void loginRegisterButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButtonMouseMoved
        loginRegisterButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_loginRegisterButtonMouseMoved

    private void loginLoginButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButton1MouseMoved
        loginLoginButton1.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_loginLoginButton1MouseMoved

    private void loginRegisterButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginRegisterButton1MouseMoved
        loginRegisterButton1.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_loginRegisterButton1MouseMoved

    private void registerAdminCheckBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerAdminCheckBoxMouseMoved
        registerAdminCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerAdminCheckBoxMouseMoved
 
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
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JButton loginLoginButton1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordTextField;
    private javax.swing.JButton loginRegisterButton;
    private javax.swing.JButton loginRegisterButton1;
    private javax.swing.JTextField loginUsernameTextField;
    private javax.swing.JCheckBox registerAdminCheckBox;
    private javax.swing.JTextField registerEmailTextBox;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordTextField;
    private javax.swing.JTextField registerUsernameTextField;
    // End of variables declaration//GEN-END:variables
}
