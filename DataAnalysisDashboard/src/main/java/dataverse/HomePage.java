
package dataverse;

import java.awt.BorderLayout;
import javax.swing.*;

public class HomePage extends JFrame {

    public HomePage() {
        initComponents();
        Dashboard1.setEnabled(false);
        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_5.setVisible(false);
        DashboardPanel_1.setVisible(true);       //add one panel
        pack();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DashboardPanel_1 = new javax.swing.JPanel();
        DashboardPanel_2 = new javax.swing.JPanel();
        DashboardPanel_3 = new javax.swing.JPanel();
        DashboardPanel_4 = new javax.swing.JPanel();
        DashboardPanel_5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Dashboard1 = new javax.swing.JButton();
        Dashboard2 = new javax.swing.JButton();
        Dashboard3 = new javax.swing.JButton();
        Dashboard4 = new javax.swing.JButton();
        AdminPanel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(177, 220, 253));

        jPanel1.setBackground(new java.awt.Color(177, 220, 253));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 160, 39));
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 142, 142));
        jLabel2.setText("verse");

        LogOut.setBackground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(177, 220, 253));

        DashboardPanel_1.setBackground(new java.awt.Color(235, 64, 52));
        DashboardPanel_1.setMaximumSize(new java.awt.Dimension(30000, 30000));
        DashboardPanel_1.setPreferredSize(new java.awt.Dimension(900, 400));

        javax.swing.GroupLayout DashboardPanel_1Layout = new javax.swing.GroupLayout(DashboardPanel_1);
        DashboardPanel_1.setLayout(DashboardPanel_1Layout);
        DashboardPanel_1Layout.setHorizontalGroup(
            DashboardPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_1Layout.setVerticalGroup(
            DashboardPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        DashboardPanel_2.setBackground(new java.awt.Color(52, 137, 235));
        DashboardPanel_2.setMaximumSize(new java.awt.Dimension(30000, 30000));
        DashboardPanel_2.setPreferredSize(new java.awt.Dimension(900, 400));

        javax.swing.GroupLayout DashboardPanel_2Layout = new javax.swing.GroupLayout(DashboardPanel_2);
        DashboardPanel_2.setLayout(DashboardPanel_2Layout);
        DashboardPanel_2Layout.setHorizontalGroup(
            DashboardPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_2Layout.setVerticalGroup(
            DashboardPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        DashboardPanel_3.setBackground(new java.awt.Color(52, 235, 162));
        DashboardPanel_3.setMaximumSize(new java.awt.Dimension(30000, 30000));
        DashboardPanel_3.setPreferredSize(new java.awt.Dimension(900, 400));

        javax.swing.GroupLayout DashboardPanel_3Layout = new javax.swing.GroupLayout(DashboardPanel_3);
        DashboardPanel_3.setLayout(DashboardPanel_3Layout);
        DashboardPanel_3Layout.setHorizontalGroup(
            DashboardPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_3Layout.setVerticalGroup(
            DashboardPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        DashboardPanel_4.setBackground(new java.awt.Color(134, 52, 235));
        DashboardPanel_4.setMaximumSize(new java.awt.Dimension(30000, 30000));
        DashboardPanel_4.setPreferredSize(new java.awt.Dimension(900, 400));

        javax.swing.GroupLayout DashboardPanel_4Layout = new javax.swing.GroupLayout(DashboardPanel_4);
        DashboardPanel_4.setLayout(DashboardPanel_4Layout);
        DashboardPanel_4Layout.setHorizontalGroup(
            DashboardPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_4Layout.setVerticalGroup(
            DashboardPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        DashboardPanel_5.setBackground(new java.awt.Color(235, 131, 52));
        DashboardPanel_5.setPreferredSize(new java.awt.Dimension(900, 400));

        javax.swing.GroupLayout DashboardPanel_5Layout = new javax.swing.GroupLayout(DashboardPanel_5);
        DashboardPanel_5.setLayout(DashboardPanel_5Layout);
        DashboardPanel_5Layout.setHorizontalGroup(
            DashboardPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_5Layout.setVerticalGroup(
            DashboardPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(177, 220, 253));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Dashboard1.setText("Dashboard1");
        Dashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard1ActionPerformed(evt);
            }
        });

        Dashboard2.setText("Dashboard2");
        Dashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard2ActionPerformed(evt);
            }
        });

        Dashboard3.setText("Dashboard3");
        Dashboard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard3ActionPerformed(evt);
            }
        });

        Dashboard4.setText("Dashboard4");
        Dashboard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard4ActionPerformed(evt);
            }
        });

        AdminPanel.setText("Admin Panel");
        AdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Dashboard1)
                .addGap(62, 62, 62)
                .addComponent(Dashboard2)
                .addGap(62, 62, 62)
                .addComponent(Dashboard3)
                .addGap(62, 62, 62)
                .addComponent(Dashboard4)
                .addGap(62, 62, 62)
                .addComponent(AdminPanel)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dashboard4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardPanel_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addComponent(DashboardPanel_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addComponent(DashboardPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addComponent(DashboardPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addComponent(DashboardPanel_5, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DashboardPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DashboardPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DashboardPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DashboardPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DashboardPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed

        System.out.println("This is Log Out Button.");
    }//GEN-LAST:event_LogOutActionPerformed

    private void AdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPanelActionPerformed
        AdminPanel.setEnabled(false);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Admin Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_1.setVisible(false);
        DashboardPanel_5.setVisible(true);       //add one panel
        

    }//GEN-LAST:event_AdminPanelActionPerformed

    private void Dashboard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard4ActionPerformed
        Dashboard4.setEnabled(false);
        AdminPanel.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);

        System.out.println("This is the Dashboard4 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_1.setVisible(false);
        DashboardPanel_5.setVisible(false);
        DashboardPanel_4.setVisible(true);       //add one panel
        

    }//GEN-LAST:event_Dashboard4ActionPerformed

    private void Dashboard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard3ActionPerformed
        Dashboard3.setEnabled(false);
        AdminPanel.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Dashboard3 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_1.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_5.setVisible(false);
        DashboardPanel_3.setVisible(true);       //add one panel
        

    }//GEN-LAST:event_Dashboard3ActionPerformed

    private void Dashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard2ActionPerformed
        Dashboard2.setEnabled(false);
        AdminPanel.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Dashboard2 Button.");

        DashboardPanel_1.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_5.setVisible(false);
        DashboardPanel_2.setVisible(true);       //add one panel
        

    }//GEN-LAST:event_Dashboard2ActionPerformed

    private void Dashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard1ActionPerformed
        Dashboard1.setEnabled(false);
        AdminPanel.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);

        System.out.println("This is the Dashboard1 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_5.setVisible(false);
        DashboardPanel_1.setVisible(true);       //add one panel
        

    }//GEN-LAST:event_Dashboard1ActionPerformed
    
    
    public void createHomePage(){
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage h = new HomePage();
                h.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminPanel;
    private javax.swing.JButton Dashboard1;
    private javax.swing.JButton Dashboard2;
    private javax.swing.JButton Dashboard3;
    private javax.swing.JButton Dashboard4;
    private javax.swing.JPanel DashboardPanel_1;
    private javax.swing.JPanel DashboardPanel_2;
    private javax.swing.JPanel DashboardPanel_3;
    private javax.swing.JPanel DashboardPanel_4;
    private javax.swing.JPanel DashboardPanel_5;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
