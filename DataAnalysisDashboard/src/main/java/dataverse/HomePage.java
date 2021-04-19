package dataverse;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

public class HomePage extends JFrame {

    String road_dashboard2 = "A1";
    int hour_dashboard2 = 7;
    int year_dashboard2 = 2000;

    User user;
    UserController userController = new UserController();

    Boolean editBool = false;
    Boolean deleteBool = false;

    public HomePage() {
        initComponents();
        Dashboard1.setEnabled(false);
        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        AdminPanel.setVisible(false);
        DashboardPanel_1.setVisible(true);

        //add one panel
        pack();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                userController.createLog(false, user);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DashboardPanel_1 = new javax.swing.JPanel();
        ChartAreaYas = new javax.swing.JPanel();
        ButtonAreaYas = new javax.swing.JPanel();
        BC1Yasin = new javax.swing.JButton();
        BC2Yasin1 = new javax.swing.JButton();
        DashboardPanel_2 = new javax.swing.JPanel();
        Dashboard2Container = new javax.swing.JPanel();
        filtersPanelDashboard2 = new javax.swing.JPanel();
        BackButtonDashboard2 = new javax.swing.JButton();
        labelHourDashboard2 = new java.awt.Label();
        NextButtonDashboard2 = new javax.swing.JButton();
        RoadChoiceDashboard2 = new java.awt.Choice();
        lableYearDashboard2 = new javax.swing.JLabel();
        SlideBarDashboard2 = new javax.swing.JSlider();
        ResetButtonDashboard2 = new javax.swing.JButton();
        DescriptionLabelDashboard2 = new javax.swing.JLabel();
        DashboardPanel_3 = new javax.swing.JPanel();
        DashboardPanel_4 = new javax.swing.JPanel();
        D4PanelMain = new javax.swing.JPanel();
        D4PanelFilters = new javax.swing.JPanel();
        D4YearDropdown = new javax.swing.JComboBox<>();
        D4YearLabel = new javax.swing.JLabel();
        D4MajorButton = new javax.swing.JButton();
        D4MinorButton = new javax.swing.JButton();
        D4CarTaxiCheckbox = new javax.swing.JCheckBox();
        D4TwoWheelCheckbox = new javax.swing.JCheckBox();
        D4PedalCheckbox = new javax.swing.JCheckBox();
        D4BusCoachCheckbox = new javax.swing.JCheckBox();
        D4HeavyVehicCheckbox = new javax.swing.JCheckBox();
        D4LargeGoodsCheckbox = new javax.swing.JCheckBox();
        AdminPanel = new javax.swing.JPanel();
        editUserButton = new javax.swing.JButton();
        viewAllLogsButton = new javax.swing.JButton();
        viewAllUsersButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        adminRightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminNewUsernameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminNewEmailTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adminNewPasswordTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adminChangeAdminStatusCheckBox = new javax.swing.JCheckBox();
        clearButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        adminUsernameLabel = new javax.swing.JLabel();
        adminEmailLabel = new javax.swing.JLabel();
        adminStatusLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        adminNotificationLabel = new javax.swing.JLabel();
        adminLeftPanel = new javax.swing.JPanel();
        adminScrollPane = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Dashboard1 = new javax.swing.JButton();
        Dashboard2 = new javax.swing.JButton();
        Dashboard3 = new javax.swing.JButton();
        Dashboard4 = new javax.swing.JButton();
        adminPanelButton = new javax.swing.JButton();

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(208, 239, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 160, 39));
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 142, 142));
        jLabel2.setText("verse");

        logoutButton.setBackground(new java.awt.Color(62, 143, 185));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logoutButtonMouseMoved(evt);
            }
        });
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(208, 239, 255));

        DashboardPanel_1.setBackground(new java.awt.Color(235, 64, 52));
        DashboardPanel_1.setMaximumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_1.setMinimumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_1.setPreferredSize(new java.awt.Dimension(836, 500));

        ChartAreaYas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChartAreaYas.setPreferredSize(new java.awt.Dimension(813, 370));

        javax.swing.GroupLayout ChartAreaYasLayout = new javax.swing.GroupLayout(ChartAreaYas);
        ChartAreaYas.setLayout(ChartAreaYasLayout);
        ChartAreaYasLayout.setHorizontalGroup(
            ChartAreaYasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        ChartAreaYasLayout.setVerticalGroup(
            ChartAreaYasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        ButtonAreaYas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonAreaYas.setPreferredSize(new java.awt.Dimension(816, 111));

        BC1Yasin.setBackground(new java.awt.Color(71, 120, 250));
        BC1Yasin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BC1Yasin.setForeground(new java.awt.Color(255, 255, 255));
        BC1Yasin.setText("Bar Chart");
        BC1Yasin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BC1YasinActionPerformed(evt);
            }
        });

        BC2Yasin1.setBackground(new java.awt.Color(71, 120, 250));
        BC2Yasin1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BC2Yasin1.setForeground(new java.awt.Color(255, 255, 255));
        BC2Yasin1.setText("Test");
        BC2Yasin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BC2Yasin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonAreaYasLayout = new javax.swing.GroupLayout(ButtonAreaYas);
        ButtonAreaYas.setLayout(ButtonAreaYasLayout);
        ButtonAreaYasLayout.setHorizontalGroup(
            ButtonAreaYasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonAreaYasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BC1Yasin)
                .addGap(32, 32, 32)
                .addComponent(BC2Yasin1)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        ButtonAreaYasLayout.setVerticalGroup(
            ButtonAreaYasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonAreaYasLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(ButtonAreaYasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BC1Yasin)
                    .addComponent(BC2Yasin1))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout DashboardPanel_1Layout = new javax.swing.GroupLayout(DashboardPanel_1);
        DashboardPanel_1.setLayout(DashboardPanel_1Layout);
        DashboardPanel_1Layout.setHorizontalGroup(
            DashboardPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAreaYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChartAreaYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DashboardPanel_1Layout.setVerticalGroup(
            DashboardPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChartAreaYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonAreaYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DashboardPanel_2.setBackground(new java.awt.Color(208, 239, 255));
        DashboardPanel_2.setMaximumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_2.setMinimumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_2.setPreferredSize(new java.awt.Dimension(836, 500));

        Dashboard2Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dashboard2Container.setPreferredSize(new java.awt.Dimension(813, 370));
        Dashboard2Container.setLayout(new java.awt.BorderLayout());

        filtersPanelDashboard2.setBackground(new java.awt.Color(208, 239, 255));
        filtersPanelDashboard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BackButtonDashboard2.setBackground(new java.awt.Color(62, 143, 185));
        BackButtonDashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackButtonDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        BackButtonDashboard2.setText("Back");
        BackButtonDashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButtonDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonDashboard2MouseExited(evt);
            }
        });
        BackButtonDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonDashboard2ActionPerformed(evt);
            }
        });

        labelHourDashboard2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelHourDashboard2.setText("7 am");

        NextButtonDashboard2.setBackground(new java.awt.Color(62, 143, 185));
        NextButtonDashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NextButtonDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        NextButtonDashboard2.setText("Next");
        NextButtonDashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NextButtonDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextButtonDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextButtonDashboard2MouseExited(evt);
            }
        });
        NextButtonDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonDashboard2ActionPerformed(evt);
            }
        });

        RoadChoiceDashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RoadChoiceDashboard2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoadChoiceDashboard2ItemStateChanged(evt);
            }
        });

        lableYearDashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lableYearDashboard2.setText("Year 2005");

        SlideBarDashboard2.setMajorTickSpacing(1);
        SlideBarDashboard2.setMaximum(2019);
        SlideBarDashboard2.setMinimum(2000);
        SlideBarDashboard2.setPaintTicks(true);
        SlideBarDashboard2.setSnapToTicks(true);
        SlideBarDashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SlideBarDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SlideBarDashboard2MouseReleased(evt);
            }
        });

        ResetButtonDashboard2.setBackground(new java.awt.Color(62, 143, 185));
        ResetButtonDashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ResetButtonDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        ResetButtonDashboard2.setText("Reset");
        ResetButtonDashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButtonDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetButtonDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetButtonDashboard2MouseExited(evt);
            }
        });
        ResetButtonDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonDashboard2ActionPerformed(evt);
            }
        });

        DescriptionLabelDashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DescriptionLabelDashboard2.setText("Highest number of vehicles at 7 am in year 2005 on road A9999999999");

        javax.swing.GroupLayout filtersPanelDashboard2Layout = new javax.swing.GroupLayout(filtersPanelDashboard2);
        filtersPanelDashboard2.setLayout(filtersPanelDashboard2Layout);
        filtersPanelDashboard2Layout.setHorizontalGroup(
            filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtersPanelDashboard2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(BackButtonDashboard2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHourDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(NextButtonDashboard2)
                .addGap(35, 35, 35)
                .addGroup(filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(filtersPanelDashboard2Layout.createSequentialGroup()
                        .addComponent(RoadChoiceDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(filtersPanelDashboard2Layout.createSequentialGroup()
                                .addComponent(lableYearDashboard2)
                                .addGap(105, 105, 105))
                            .addComponent(SlideBarDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DescriptionLabelDashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResetButtonDashboard2)
                .addGap(31, 31, 31))
        );
        filtersPanelDashboard2Layout.setVerticalGroup(
            filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filtersPanelDashboard2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(DescriptionLabelDashboard2)
                .addGap(18, 18, 18)
                .addGroup(filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtersPanelDashboard2Layout.createSequentialGroup()
                        .addGroup(filtersPanelDashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlideBarDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetButtonDashboard2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lableYearDashboard2))
                    .addComponent(RoadChoiceDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHourDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButtonDashboard2)
                    .addComponent(NextButtonDashboard2))
                .addContainerGap())
        );

        javax.swing.GroupLayout DashboardPanel_2Layout = new javax.swing.GroupLayout(DashboardPanel_2);
        DashboardPanel_2.setLayout(DashboardPanel_2Layout);
        DashboardPanel_2Layout.setHorizontalGroup(
            DashboardPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard2Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtersPanelDashboard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DashboardPanel_2Layout.setVerticalGroup(
            DashboardPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashboard2Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filtersPanelDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DashboardPanel_3.setBackground(new java.awt.Color(52, 235, 162));
        DashboardPanel_3.setMaximumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_3.setMinimumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_3.setPreferredSize(new java.awt.Dimension(836, 500));

        javax.swing.GroupLayout DashboardPanel_3Layout = new javax.swing.GroupLayout(DashboardPanel_3);
        DashboardPanel_3.setLayout(DashboardPanel_3Layout);
        DashboardPanel_3Layout.setHorizontalGroup(
            DashboardPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardPanel_3Layout.setVerticalGroup(
            DashboardPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        DashboardPanel_4.setBackground(new java.awt.Color(208, 239, 255));
        DashboardPanel_4.setMaximumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_4.setMinimumSize(new java.awt.Dimension(836, 500));
        DashboardPanel_4.setPreferredSize(new java.awt.Dimension(836, 500));

        /*JFreeChart D4GUIChart = createD4PieChart(D4PieChart());
        D4PanelMain.add(new ChartPanel(D4GUIChart),BorderLayout.CENTER);
        D4PanelMain.setVisible(true);*/
        D4PanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout D4PanelMainLayout = new javax.swing.GroupLayout(D4PanelMain);
        D4PanelMain.setLayout(D4PanelMainLayout);
        D4PanelMainLayout.setHorizontalGroup(
            D4PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        D4PanelMainLayout.setVerticalGroup(
            D4PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        D4PanelFilters.setBackground(new java.awt.Color(208, 239, 255));
        D4PanelFilters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        D4YearDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        D4YearLabel.setText("Year");

        D4MajorButton.setText("Major");
        D4MajorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4MajorButtonActionPerformed(evt);
            }
        });

        D4MinorButton.setText("Minor");

        D4CarTaxiCheckbox.setText("Cars and Taxis");
        D4CarTaxiCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4CarTaxiCheckboxActionPerformed(evt);
            }
        });

        D4TwoWheelCheckbox.setText("Two Wheeled Motor Vehicles");
        D4TwoWheelCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4TwoWheelCheckboxActionPerformed(evt);
            }
        });

        D4PedalCheckbox.setText("Pedal Cycles");
        D4PedalCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4PedalCheckboxActionPerformed(evt);
            }
        });

        D4BusCoachCheckbox.setText("Buses and Coaches");

        D4HeavyVehicCheckbox.setText("Heavy Goods Vehicles");
        D4HeavyVehicCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4HeavyVehicCheckboxActionPerformed(evt);
            }
        });

        D4LargeGoodsCheckbox.setText("Large Goods Vehicles");
        D4LargeGoodsCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4LargeGoodsCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout D4PanelFiltersLayout = new javax.swing.GroupLayout(D4PanelFilters);
        D4PanelFilters.setLayout(D4PanelFiltersLayout);
        D4PanelFiltersLayout.setHorizontalGroup(
            D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addComponent(D4MajorButton)
                        .addGap(70, 70, 70)
                        .addComponent(D4YearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D4CarTaxiCheckbox))
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addComponent(D4MinorButton)
                        .addGap(47, 47, 47)
                        .addComponent(D4YearDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addComponent(D4TwoWheelCheckbox)
                        .addGap(18, 18, 18)
                        .addComponent(D4PedalCheckbox)
                        .addGap(18, 18, 18)
                        .addComponent(D4BusCoachCheckbox))
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(D4HeavyVehicCheckbox)
                        .addGap(18, 18, 18)
                        .addComponent(D4LargeGoodsCheckbox)))
                .addGap(53, 53, 53))
        );

        D4PanelFiltersLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {D4MajorButton, D4MinorButton});

        D4PanelFiltersLayout.setVerticalGroup(
            D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D4CarTaxiCheckbox)
                            .addComponent(D4TwoWheelCheckbox)
                            .addComponent(D4PedalCheckbox)
                            .addComponent(D4BusCoachCheckbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D4HeavyVehicCheckbox)
                            .addComponent(D4LargeGoodsCheckbox)))
                    .addGroup(D4PanelFiltersLayout.createSequentialGroup()
                        .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(D4MajorButton)
                            .addComponent(D4YearLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(D4PanelFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D4MinorButton)
                            .addComponent(D4YearDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardPanel_4Layout = new javax.swing.GroupLayout(DashboardPanel_4);
        DashboardPanel_4.setLayout(DashboardPanel_4Layout);
        DashboardPanel_4Layout.setHorizontalGroup(
            DashboardPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(D4PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(D4PanelFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashboardPanel_4Layout.setVerticalGroup(
            DashboardPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanel_4Layout.createSequentialGroup()
                .addComponent(D4PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D4PanelFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminPanel.setBackground(new java.awt.Color(208, 239, 255));
        AdminPanel.setMaximumSize(new java.awt.Dimension(836, 500));
        AdminPanel.setMinimumSize(new java.awt.Dimension(836, 500));
        AdminPanel.setPreferredSize(new java.awt.Dimension(836, 500));

        editUserButton.setBackground(new java.awt.Color(62, 143, 185));
        editUserButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(255, 255, 255));
        editUserButton.setText("Edit User");
        editUserButton.setMaximumSize(new java.awt.Dimension(112, 23));
        editUserButton.setMinimumSize(new java.awt.Dimension(112, 23));
        editUserButton.setPreferredSize(new java.awt.Dimension(112, 23));
        editUserButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                editUserButtonMouseMoved(evt);
            }
        });
        editUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editUserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editUserButtonMouseExited(evt);
            }
        });
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        viewAllLogsButton.setBackground(new java.awt.Color(62, 143, 185));
        viewAllLogsButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewAllLogsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAllLogsButton.setText("View All Logs");
        viewAllLogsButton.setMaximumSize(new java.awt.Dimension(112, 23));
        viewAllLogsButton.setMinimumSize(new java.awt.Dimension(112, 23));
        viewAllLogsButton.setPreferredSize(new java.awt.Dimension(112, 23));
        viewAllLogsButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewAllLogsButtonMouseMoved(evt);
            }
        });
        viewAllLogsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewAllLogsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewAllLogsButtonMouseExited(evt);
            }
        });
        viewAllLogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllLogsButtonActionPerformed(evt);
            }
        });

        viewAllUsersButton.setBackground(new java.awt.Color(62, 143, 185));
        viewAllUsersButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewAllUsersButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAllUsersButton.setText("View All Users");
        viewAllUsersButton.setMaximumSize(new java.awt.Dimension(112, 23));
        viewAllUsersButton.setMinimumSize(new java.awt.Dimension(112, 23));
        viewAllUsersButton.setPreferredSize(new java.awt.Dimension(112, 23));
        viewAllUsersButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewAllUsersButtonMouseMoved(evt);
            }
        });
        viewAllUsersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewAllUsersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewAllUsersButtonMouseExited(evt);
            }
        });
        viewAllUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllUsersButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setBackground(new java.awt.Color(62, 143, 185));
        deleteUserButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserButton.setText("Delete User");
        deleteUserButton.setMaximumSize(new java.awt.Dimension(112, 23));
        deleteUserButton.setMinimumSize(new java.awt.Dimension(112, 23));
        deleteUserButton.setPreferredSize(new java.awt.Dimension(112, 23));
        deleteUserButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteUserButtonMouseMoved(evt);
            }
        });
        deleteUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteUserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteUserButtonMouseExited(evt);
            }
        });
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        adminRightPanel.setBackground(new java.awt.Color(208, 239, 255));
        adminRightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminRightPanel.setMaximumSize(new java.awt.Dimension(313, 442));
        adminRightPanel.setMinimumSize(new java.awt.Dimension(313, 442));
        adminRightPanel.setPreferredSize(new java.awt.Dimension(313, 442));

        jLabel3.setText("Current Username:");

        jLabel4.setText("New Username:");

        adminNewUsernameTextField.setMaximumSize(new java.awt.Dimension(273, 31));
        adminNewUsernameTextField.setMinimumSize(new java.awt.Dimension(273, 31));
        adminNewUsernameTextField.setName(""); // NOI18N
        adminNewUsernameTextField.setPreferredSize(new java.awt.Dimension(273, 31));
        adminNewUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNewUsernameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Current Email:");

        jLabel6.setText("New Email:");

        adminNewEmailTextField.setMaximumSize(new java.awt.Dimension(273, 31));
        adminNewEmailTextField.setMinimumSize(new java.awt.Dimension(273, 31));
        adminNewEmailTextField.setName(""); // NOI18N
        adminNewEmailTextField.setPreferredSize(new java.awt.Dimension(273, 31));
        adminNewEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNewEmailTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("New Password:");

        adminNewPasswordTextField.setMaximumSize(new java.awt.Dimension(273, 31));
        adminNewPasswordTextField.setMinimumSize(new java.awt.Dimension(273, 31));
        adminNewPasswordTextField.setName(""); // NOI18N
        adminNewPasswordTextField.setPreferredSize(new java.awt.Dimension(273, 31));
        adminNewPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNewPasswordTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Current Admin Status:");

        adminChangeAdminStatusCheckBox.setText("Change Admin Status?");
        adminChangeAdminStatusCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminChangeAdminStatusCheckBoxActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(62, 143, 185));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setMaximumSize(new java.awt.Dimension(112, 23));
        clearButton.setMinimumSize(new java.awt.Dimension(112, 23));
        clearButton.setPreferredSize(new java.awt.Dimension(112, 23));
        clearButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clearButtonMouseMoved(evt);
            }
        });
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearButtonMouseExited(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(62, 185, 143));
        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm");
        confirmButton.setMaximumSize(new java.awt.Dimension(112, 23));
        confirmButton.setMinimumSize(new java.awt.Dimension(112, 23));
        confirmButton.setPreferredSize(new java.awt.Dimension(112, 23));
        confirmButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                confirmButtonMouseMoved(evt);
            }
        });
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        adminUsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminUsernameLabel.setText("Username");

        adminEmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminEmailLabel.setText("Email");

        adminStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminStatusLabel.setText("AdminStatus");

        jPanel5.setBackground(new java.awt.Color(208, 239, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(100, 21));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 21));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        adminNotificationLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        adminNotificationLabel.setText("Notification");

        javax.swing.GroupLayout adminRightPanelLayout = new javax.swing.GroupLayout(adminRightPanel);
        adminRightPanel.setLayout(adminRightPanelLayout);
        adminRightPanelLayout.setHorizontalGroup(
            adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminRightPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminRightPanelLayout.createSequentialGroup()
                        .addComponent(adminNotificationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adminChangeAdminStatusCheckBox)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(adminRightPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminStatusLabel)
                            .addComponent(adminEmailLabel)
                            .addComponent(adminUsernameLabel)))
                    .addGroup(adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminRightPanelLayout.createSequentialGroup()
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(adminNewEmailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminNewPasswordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminNewUsernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        adminRightPanelLayout.setVerticalGroup(
            adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminRightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(adminUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminNewUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(adminEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminNewEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminNewPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(adminStatusLabel)
                .addGap(9, 9, 9)
                .addComponent(adminChangeAdminStatusCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNotificationLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        adminLeftPanel.setMaximumSize(new java.awt.Dimension(313, 442));
        adminLeftPanel.setMinimumSize(new java.awt.Dimension(313, 442));
        adminLeftPanel.setPreferredSize(new java.awt.Dimension(313, 442));

        adminScrollPane.setBackground(new java.awt.Color(208, 239, 255));
        adminScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminScrollPane.setMaximumSize(new java.awt.Dimension(313, 442));
        adminScrollPane.setMinimumSize(new java.awt.Dimension(313, 442));
        adminScrollPane.setPreferredSize(new java.awt.Dimension(313, 442));
        adminScrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adminScrollPaneMouseReleased(evt);
            }
        });

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        adminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adminTableMouseReleased(evt);
            }
        });
        adminScrollPane.setViewportView(adminTable);

        javax.swing.GroupLayout adminLeftPanelLayout = new javax.swing.GroupLayout(adminLeftPanel);
        adminLeftPanel.setLayout(adminLeftPanelLayout);
        adminLeftPanelLayout.setHorizontalGroup(
            adminLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminLeftPanelLayout.setVerticalGroup(
            adminLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setText("User Details");

        jLabel10.setText("User / Log List");

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(adminRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(viewAllUsersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewAllLogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(viewAllLogsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(viewAllUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(208, 239, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Dashboard1.setBackground(new java.awt.Color(62, 143, 185));
        Dashboard1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dashboard1.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard1.setText("Dashboard 1");
        Dashboard1.setMaximumSize(new java.awt.Dimension(112, 23));
        Dashboard1.setMinimumSize(new java.awt.Dimension(112, 23));
        Dashboard1.setPreferredSize(new java.awt.Dimension(112, 23));
        Dashboard1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Dashboard1MouseMoved(evt);
            }
        });
        Dashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dashboard1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Dashboard1MouseExited(evt);
            }
        });
        Dashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard1ActionPerformed(evt);
            }
        });

        Dashboard2.setBackground(new java.awt.Color(62, 143, 185));
        Dashboard2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dashboard2.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard2.setText("Dashboard 2");
        Dashboard2.setMaximumSize(new java.awt.Dimension(112, 23));
        Dashboard2.setMinimumSize(new java.awt.Dimension(112, 23));
        Dashboard2.setPreferredSize(new java.awt.Dimension(112, 23));
        Dashboard2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Dashboard2MouseMoved(evt);
            }
        });
        Dashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Dashboard2MouseExited(evt);
            }
        });
        Dashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard2ActionPerformed(evt);
            }
        });

        Dashboard3.setBackground(new java.awt.Color(62, 143, 185));
        Dashboard3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dashboard3.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard3.setText("Dashboard 3");
        Dashboard3.setMaximumSize(new java.awt.Dimension(112, 23));
        Dashboard3.setMinimumSize(new java.awt.Dimension(112, 23));
        Dashboard3.setPreferredSize(new java.awt.Dimension(112, 23));
        Dashboard3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Dashboard3MouseMoved(evt);
            }
        });
        Dashboard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dashboard3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Dashboard3MouseExited(evt);
            }
        });
        Dashboard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard3ActionPerformed(evt);
            }
        });

        Dashboard4.setBackground(new java.awt.Color(62, 143, 185));
        Dashboard4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dashboard4.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard4.setText("Dashboard 4");
        Dashboard4.setMaximumSize(new java.awt.Dimension(112, 23));
        Dashboard4.setMinimumSize(new java.awt.Dimension(112, 23));
        Dashboard4.setPreferredSize(new java.awt.Dimension(112, 23));
        Dashboard4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Dashboard4MouseMoved(evt);
            }
        });
        Dashboard4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dashboard4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Dashboard4MouseExited(evt);
            }
        });
        Dashboard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard4ActionPerformed(evt);
            }
        });

        adminPanelButton.setBackground(new java.awt.Color(62, 143, 185));
        adminPanelButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adminPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminPanelButton.setText("Admin Panel");
        adminPanelButton.setMaximumSize(new java.awt.Dimension(112, 23));
        adminPanelButton.setMinimumSize(new java.awt.Dimension(112, 23));
        adminPanelButton.setPreferredSize(new java.awt.Dimension(112, 23));
        adminPanelButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                adminPanelButtonMouseMoved(evt);
            }
        });
        adminPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminPanelButtonMouseExited(evt);
            }
        });
        adminPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPanelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Dashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Dashboard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardPanel_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DashboardPanel_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DashboardPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DashboardPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        logout();
        //System.out.println("This is Log Out Button.");
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void adminPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPanelButtonActionPerformed
        adminPanelButton.setEnabled(false);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Admin Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        DashboardPanel_1.setVisible(false);
        AdminPanel.setVisible(true);       //add one panel

        adminDisplayUsers();
        resetAdminLabels();


    }//GEN-LAST:event_adminPanelButtonActionPerformed

    private void Dashboard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard4ActionPerformed
        Dashboard4.setEnabled(false);
        adminPanelButton.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);

        System.out.println("This is the Dashboard4 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_1.setVisible(false);
        AdminPanel.setVisible(false);
        DashboardPanel_4.setVisible(true);       //add one panel


    }//GEN-LAST:event_Dashboard4ActionPerformed

    private void Dashboard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard3ActionPerformed
        Dashboard3.setEnabled(false);
        adminPanelButton.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Dashboard3 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_1.setVisible(false);
        DashboardPanel_4.setVisible(false);
        AdminPanel.setVisible(false);
        DashboardPanel_3.setVisible(true);       //add one panel


    }//GEN-LAST:event_Dashboard3ActionPerformed

    private void Dashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard2ActionPerformed
        Dashboard2.setEnabled(false);
        adminPanelButton.setEnabled(true);
        Dashboard1.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);
        System.out.println("This is the Dashboard2 Button.");

        DashboardPanel_1.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        AdminPanel.setVisible(false);
        DashboardPanel_2.setVisible(true);       //add one panel

        paintLableYearDashboard2();
        paintlabelHourDashboard2();
        addElementsToChoiceDashboard2();        //fills up the dropdown with road choices       
        repaintDashboard2();     //repaint dashboard

        //DO NOT EDIT THIS - 

    }//GEN-LAST:event_Dashboard2ActionPerformed

    private void Dashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard1ActionPerformed
        Dashboard1.setEnabled(false);
        adminPanelButton.setEnabled(true);
        Dashboard2.setEnabled(true);
        Dashboard3.setEnabled(true);
        Dashboard4.setEnabled(true);

        System.out.println("This is the Dashboard1 Button.");

        DashboardPanel_2.setVisible(false);      //remove other panels
        DashboardPanel_3.setVisible(false);
        DashboardPanel_4.setVisible(false);
        AdminPanel.setVisible(false);
        DashboardPanel_1.setVisible(true);       //add one panel

        //TrafficController.getYas();
    }//GEN-LAST:event_Dashboard1ActionPerformed

    private void Dashboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard1MouseEntered
        //dashboard 1 hover
        Dashboard1.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_Dashboard1MouseEntered

    private void Dashboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard1MouseExited
        //dashboard 1 unhover
        Dashboard1.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_Dashboard1MouseExited

    private void Dashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard2MouseEntered
        //dashboard 2 hover
        Dashboard2.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_Dashboard2MouseEntered

    private void Dashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard2MouseExited
        //dashboard 2 unhover
        Dashboard2.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_Dashboard2MouseExited

    private void Dashboard3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard3MouseEntered
        //dashboard 3 hover
        Dashboard3.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_Dashboard3MouseEntered

    private void Dashboard3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard3MouseExited
        //dashboard 3 unhover
        Dashboard3.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_Dashboard3MouseExited

    private void Dashboard4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard4MouseEntered
        //dashboard 4 hover
        Dashboard4.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_Dashboard4MouseEntered

    private void Dashboard4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard4MouseExited
        //dashboard 4 unhover
        Dashboard4.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_Dashboard4MouseExited

    private void adminPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelButtonMouseEntered
        //AdminPanel hover
        adminPanelButton.setBackground(new Color(245, 160, 39));          //orange
    }//GEN-LAST:event_adminPanelButtonMouseEntered

    private void adminPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelButtonMouseExited
        //AdminPanel unhover
        adminPanelButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_adminPanelButtonMouseExited

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        //LogOut hover
        logoutButton.setBackground(new Color(255, 43, 43));          //red
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        //LogOut unhover
        logoutButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_logoutButtonMouseExited

    private void Dashboard1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard1MouseMoved
        Dashboard1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Dashboard1MouseMoved

    private void Dashboard2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard2MouseMoved
        Dashboard2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Dashboard2MouseMoved

    private void Dashboard3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard3MouseMoved
        Dashboard3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Dashboard3MouseMoved

    private void Dashboard4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard4MouseMoved
        Dashboard4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_Dashboard4MouseMoved

    private void adminPanelButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelButtonMouseMoved
        adminPanelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_adminPanelButtonMouseMoved

    private void logoutButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseMoved
        logoutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logoutButtonMouseMoved

    private void editUserButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseMoved
        editUserButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_editUserButtonMouseMoved

    private void editUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseEntered
        editUserButton.setBackground(new Color(245, 160, 39));      //orange
    }//GEN-LAST:event_editUserButtonMouseEntered

    private void editUserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseExited
        editUserButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_editUserButtonMouseExited

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        confirmButton.setEnabled(true);
        editBool = true;
        deleteBool = false;
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void viewAllLogsButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllLogsButtonMouseMoved
        viewAllLogsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_viewAllLogsButtonMouseMoved

    private void viewAllLogsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllLogsButtonMouseEntered
        viewAllLogsButton.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_viewAllLogsButtonMouseEntered

    private void viewAllLogsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllLogsButtonMouseExited
        viewAllLogsButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_viewAllLogsButtonMouseExited

    private void viewAllLogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllLogsButtonActionPerformed
        adminDisplayLogs();
        resetAdminLabels();
    }//GEN-LAST:event_viewAllLogsButtonActionPerformed

    private void viewAllUsersButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllUsersButtonMouseMoved
        viewAllUsersButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_viewAllUsersButtonMouseMoved

    private void viewAllUsersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllUsersButtonMouseEntered
        viewAllUsersButton.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_viewAllUsersButtonMouseEntered

    private void viewAllUsersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllUsersButtonMouseExited
        viewAllUsersButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_viewAllUsersButtonMouseExited

    private void viewAllUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllUsersButtonActionPerformed
        adminDisplayUsers();
        resetAdminLabels();
    }//GEN-LAST:event_viewAllUsersButtonActionPerformed

    private void deleteUserButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserButtonMouseMoved
        deleteUserButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_deleteUserButtonMouseMoved

    private void deleteUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserButtonMouseEntered
        deleteUserButton.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_deleteUserButtonMouseEntered

    private void deleteUserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserButtonMouseExited
        deleteUserButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_deleteUserButtonMouseExited

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        confirmButton.setEnabled(true);
        deleteBool = true;
        editBool = false;
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void adminChangeAdminStatusCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminChangeAdminStatusCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminChangeAdminStatusCheckBoxActionPerformed

    private void adminNewPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNewPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNewPasswordTextFieldActionPerformed

    private void adminNewEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNewEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNewEmailTextFieldActionPerformed

    private void adminNewUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNewUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNewUsernameTextFieldActionPerformed

    private void clearButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseMoved
        clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_clearButtonMouseMoved

    private void clearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseEntered
        clearButton.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_clearButtonMouseEntered

    private void clearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseExited
        clearButton.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_clearButtonMouseExited

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        resetAdminLabels();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void confirmButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseMoved
        confirmButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_confirmButtonMouseMoved

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        confirmButton.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        confirmButton.setBackground(new Color(62, 185, 143));      //blue
    }//GEN-LAST:event_confirmButtonMouseExited

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        if (deleteBool) {
            deleteUser();
        } else if (editBool) {
            editUser();
        }

        adminDisplayUsers();

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void BackButtonDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonDashboard2ActionPerformed
        //change hour
        if (hour_dashboard2 == 7) {
            hour_dashboard2 = 18;
        } else {
            hour_dashboard2--;
        }

        //display hour
        if (hour_dashboard2 < 12) {
            labelHourDashboard2.setText(hour_dashboard2 + " am");
        } else {
            labelHourDashboard2.setText(hour_dashboard2 + " pm");
        }
        labelHourDashboard2.repaint();

        repaintDashboard2();

    }//GEN-LAST:event_BackButtonDashboard2ActionPerformed

    private void NextButtonDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonDashboard2ActionPerformed
        //change hour
        if (hour_dashboard2 == 18) {
            hour_dashboard2 = 7;
        } else {
            hour_dashboard2++;
        }

        //display hour
        if (hour_dashboard2 < 12) {
            labelHourDashboard2.setText(hour_dashboard2 + " am");
        } else {
            labelHourDashboard2.setText(hour_dashboard2 + " pm");
        }
        labelHourDashboard2.repaint();

        repaintDashboard2();
    }//GEN-LAST:event_NextButtonDashboard2ActionPerformed

    private void RoadChoiceDashboard2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoadChoiceDashboard2ItemStateChanged
        System.out.println("New road selected : " + RoadChoiceDashboard2.getSelectedItem());
        road_dashboard2 = RoadChoiceDashboard2.getSelectedItem();
        repaintDashboard2();
    }//GEN-LAST:event_RoadChoiceDashboard2ItemStateChanged

    private void SlideBarDashboard2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SlideBarDashboard2MouseReleased
        year_dashboard2 = SlideBarDashboard2.getValue();
        System.out.println("New year selected: " + year_dashboard2);
        paintLableYearDashboard2();
        repaintDashboard2();
    }//GEN-LAST:event_SlideBarDashboard2MouseReleased

    private void ResetButtonDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonDashboard2ActionPerformed
        road_dashboard2 = "A1";
        hour_dashboard2 = 7;
        year_dashboard2 = 2000;

        SlideBarDashboard2.setValue(year_dashboard2);
        SlideBarDashboard2.repaint();
        paintLableYearDashboard2();
        paintlabelHourDashboard2();
        addElementsToChoiceDashboard2();
        repaintDashboard2();


    }//GEN-LAST:event_ResetButtonDashboard2ActionPerformed

    private void BackButtonDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonDashboard2MouseEntered
        BackButtonDashboard2.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_BackButtonDashboard2MouseEntered

    private void BackButtonDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonDashboard2MouseExited
        BackButtonDashboard2.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_BackButtonDashboard2MouseExited

    private void NextButtonDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonDashboard2MouseEntered
        NextButtonDashboard2.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_NextButtonDashboard2MouseEntered

    private void NextButtonDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonDashboard2MouseExited
        NextButtonDashboard2.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_NextButtonDashboard2MouseExited

    private void ResetButtonDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonDashboard2MouseEntered
        ResetButtonDashboard2.setBackground(new Color(245, 160, 39));       //orange
    }//GEN-LAST:event_ResetButtonDashboard2MouseEntered

    private void ResetButtonDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonDashboard2MouseExited
        ResetButtonDashboard2.setBackground(new Color(62, 143, 185));      //blue
    }//GEN-LAST:event_ResetButtonDashboard2MouseExited

    private void adminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTableMouseClicked

    }//GEN-LAST:event_adminTableMouseClicked

    private void adminScrollPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminScrollPaneMouseReleased

    }//GEN-LAST:event_adminScrollPaneMouseReleased

    private void adminTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTableMouseReleased

        if (!viewAllUsersButton.isEnabled()) {
            selectUserFromUserList();
        } else {
            selectUserFromLogList();
        }

    }//GEN-LAST:event_adminTableMouseReleased

    private void BC1YasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BC1YasinActionPerformed
        //TrafficController c = new TrafficController();
        //ResultSet rs = c.getYasinCon2();
        //try {
        //    System.out.println(rs.getInt("road_type"));
        //} catch (SQLException ex) {
        //    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        
    }//GEN-LAST:event_BC1YasinActionPerformed

    private void D4CarTaxiCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4CarTaxiCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4CarTaxiCheckboxActionPerformed

    private void D4TwoWheelCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4TwoWheelCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4TwoWheelCheckboxActionPerformed

    private void D4PedalCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4PedalCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4PedalCheckboxActionPerformed

    private void D4HeavyVehicCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4HeavyVehicCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4HeavyVehicCheckboxActionPerformed

    private void D4LargeGoodsCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4LargeGoodsCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4LargeGoodsCheckboxActionPerformed

    private void D4MajorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4MajorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4MajorButtonActionPerformed

    private void BC2Yasin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BC2Yasin1ActionPerformed
        TrafficController d = new TrafficController();
        ResultSet rs = d.getYasinCon3();
        try {
            System.out.println(rs.getString("Hello"));
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BC2Yasin1ActionPerformed

    public void createBar() {
        //TrafficController.getYas();
    }
    public void repaintDashboard2() {
        paintDescriptionLabelDashboard2();
        
        Dashboard2Container.removeAll();
        Dashboard2Container.repaint();
        Dashboard2Container.revalidate();

        JPanel c = Dashboard2Chart.getChart(hour_dashboard2, road_dashboard2, year_dashboard2);
        Dashboard2Container.add(c);
        Dashboard2Container.repaint();
        Dashboard2Container.validate();

    }

    public void paintDescriptionLabelDashboard2() {
        if (hour_dashboard2 < 12) {
            DescriptionLabelDashboard2.setText("Highest number of vehicles at " + hour_dashboard2 + " am in year " + year_dashboard2 + " on road " + road_dashboard2);
        } else {
            DescriptionLabelDashboard2.setText("Highest number of vehicles at " + hour_dashboard2 + " pm in year " + year_dashboard2 + " on road " + road_dashboard2);
        }
        DescriptionLabelDashboard2.repaint();
        
    }

    public void paintLableYearDashboard2() {
        lableYearDashboard2.setText(" Year " + year_dashboard2);
        lableYearDashboard2.repaint();
    }

    public void paintlabelHourDashboard2() {
        labelHourDashboard2.setText(hour_dashboard2 + " am");
    }

    public void addElementsToChoiceDashboard2() {
        RoadChoiceDashboard2.removeAll();
        String roads[] = {"A1", "A1087", "A198", "A199", "A6093", "A6094", "A6095", "A6124", "A6137", "A720", "B1349", "B1377", "B6355", "B6369", "B6414", "C", "U"};

        for (String road : roads) {
            RoadChoiceDashboard2.add(road);
        }
        RoadChoiceDashboard2.select(road_dashboard2);

    }

    public void createHomePage(Boolean isAdmin, User user) {
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

                if (isAdmin == false) {
                    h.hideAdmin();
                }

                h.user = user;
                //h.usernameLabel.setText("Current user: " + h.user.getUserName());

            }
        });
    }

    public void hideAdmin() {
        adminPanelButton.setVisible(false);
    }

    private void logout() {
        LoginPage loginPage = new LoginPage();
        loginPage.createLoginPage();
        userController.createLog(false, user);
        this.dispose();
    }

    private void adminDisplayLogs() {

        String[] headers = {
            "Log ID",
            "Log Date & Time",
            "Reason",
            "User ID"
        };

        Object[][] data = userController.displayLogData();

        //Reverse array order
        for (int i = 0; i < data.length / 2; i++) {
            Object[] temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }

        JTable table = new JTable(data, headers);

        adminTable.setModel(table.getModel());

        adjustLogColumns();

        viewAllUsersButton.setEnabled(true);
        viewAllLogsButton.setEnabled(false);
    }

    private void adminDisplayUsers() {

        String[] headers = {
            "User ID",
            "Username",
            "User Email",
            "Admin"
        };

        Object[][] data = userController.displayUserData();

        JTable table = new JTable(data, headers);

        adminTable.setModel(table.getModel());

        adjustUserColumns();

        viewAllUsersButton.setEnabled(false);
        viewAllLogsButton.setEnabled(true);
    }

    private void selectUserFromUserList() {

        int selectedRow = adminTable.getSelectedRow();

        adminUsernameLabel.setText(adminTable.getValueAt(selectedRow, 1).toString());

        adminEmailLabel.setText(adminTable.getValueAt(selectedRow, 2).toString());

        adminStatusLabel.setText(adminTable.getValueAt(selectedRow, 3).toString());

        editUserButton.setEnabled(true);
        deleteUserButton.setEnabled(true);

    }

    private void selectUserFromLogList() {

        int selectedRow = adminTable.getSelectedRow();

        int userID = Integer.parseInt(adminTable.getValueAt(selectedRow, 3).toString());

        System.out.println("UserID: " + userID);

        User user = userController.database.getUserById(userID);

        resetAdminLabels();

        if (user == null) {
            adminNotificationLabel.setText("That user no longer exists.");
            adminNotificationLabel.setForeground(Color.RED);
            adminNotificationLabel.setVisible(true);
        } else {
            adminUsernameLabel.setText(user.getUserName());

            adminEmailLabel.setText(user.getUserEmail());

            adminStatusLabel.setText(user.getUserAdminFlag().toString());

            editUserButton.setEnabled(true);
            deleteUserButton.setEnabled(true);
        }

    }

    private void resetAdminLabels() {

        adminNotificationLabel.setVisible(false);

        adminUsernameLabel.setText("Username");
        adminEmailLabel.setText("Email");
        adminStatusLabel.setText("Admin Status");

        clearAdminTextFields();

        editUserButton.setEnabled(false);
        deleteUserButton.setEnabled(false);

        confirmButton.setEnabled(false);

    }

    private void clearAdminTextFields() {

        adminNewUsernameTextField.setText("");
        adminNewEmailTextField.setText("");
        adminNewPasswordTextField.setText("");
        adminChangeAdminStatusCheckBox.setSelected(false);

    }

    private void editUser() {

        int status = userController.editUser(
                adminUsernameLabel.getText(),
                adminNewUsernameTextField.getText(),
                adminNewEmailTextField.getText(),
                adminNewPasswordTextField.getText(),
                adminChangeAdminStatusCheckBox.isSelected()
        );

        switch (status) {
            case 0 -> {
                adminNotificationLabel.setText("Error: Invalid username.");
                adminNotificationLabel.setForeground(Color.RED);
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
            case 1 -> {
                adminNotificationLabel.setText("Account updated.");
                adminNotificationLabel.setForeground(new Color(0, 153, 0)); //green
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
            case 2 -> {
                adminNotificationLabel.setText("Error: Invalid email.");
                adminNotificationLabel.setForeground(Color.RED);
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
            case 3 -> {
                adminNotificationLabel.setText("Error: Invalid password.");
                adminNotificationLabel.setForeground(Color.RED);
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
            default -> {
                adminNotificationLabel.setText("Error: SQL exception.");
                adminNotificationLabel.setForeground(Color.RED);
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
        }

    }

    private void deleteUser() {

        if (!adminUsernameLabel.getText().equals("Username")) {
            try {
                userController.database.deleteUser(adminUsernameLabel.getText());
                adminNotificationLabel.setText("Account deleted.");
                adminNotificationLabel.setForeground(new Color(0, 153, 0)); //green
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            } catch (SQLException ex) {
                adminNotificationLabel.setText("Error: SQL exception.");
                adminNotificationLabel.setForeground(Color.RED);
                resetAdminLabels();
                adminNotificationLabel.setVisible(true);
            }
        }
    }

    private void adjustUserColumns() {
        adjustColumnWidth(0, 58);
        adjustColumnWidth(1, 78);
        adjustColumnWidth(2, 118);
        adjustColumnWidth(3, 58);
    }

    private void adjustLogColumns() {
        adjustColumnWidth(0, 53);
        adjustColumnWidth(1, 143);
        adjustColumnWidth(2, 58);
        adjustColumnWidth(3, 58);
    }

    private void adjustColumnWidth(int col, int width) {
        adminTable.getColumnModel().getColumn(col).setPreferredWidth(width);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton BC1Yasin;
    private javax.swing.JButton BC2Yasin1;
    private javax.swing.JButton BackButtonDashboard2;
    private javax.swing.JPanel ButtonAreaYas;
    private javax.swing.JPanel ChartAreaYas;
    private javax.swing.JCheckBox D4BusCoachCheckbox;
    private javax.swing.JCheckBox D4CarTaxiCheckbox;
    private javax.swing.JCheckBox D4HeavyVehicCheckbox;
    private javax.swing.JCheckBox D4LargeGoodsCheckbox;
    private javax.swing.JButton D4MajorButton;
    private javax.swing.JButton D4MinorButton;
    private javax.swing.JPanel D4PanelFilters;
    private javax.swing.JPanel D4PanelMain;
    private javax.swing.JCheckBox D4PedalCheckbox;
    private javax.swing.JCheckBox D4TwoWheelCheckbox;
    private javax.swing.JComboBox<String> D4YearDropdown;
    private javax.swing.JLabel D4YearLabel;
    private javax.swing.JButton Dashboard1;
    private javax.swing.JButton Dashboard2;
    private javax.swing.JPanel Dashboard2Container;
    private javax.swing.JButton Dashboard3;
    private javax.swing.JButton Dashboard4;
    private javax.swing.JPanel DashboardPanel_1;
    private javax.swing.JPanel DashboardPanel_2;
    private javax.swing.JPanel DashboardPanel_3;
    private javax.swing.JPanel DashboardPanel_4;
    private javax.swing.JLabel DescriptionLabelDashboard2;
    private javax.swing.JButton NextButtonDashboard2;
    private javax.swing.JButton ResetButtonDashboard2;
    private java.awt.Choice RoadChoiceDashboard2;
    private javax.swing.JSlider SlideBarDashboard2;
    private javax.swing.JCheckBox adminChangeAdminStatusCheckBox;
    private javax.swing.JLabel adminEmailLabel;
    private javax.swing.JPanel adminLeftPanel;
    private javax.swing.JTextField adminNewEmailTextField;
    private javax.swing.JTextField adminNewPasswordTextField;
    private javax.swing.JTextField adminNewUsernameTextField;
    private javax.swing.JLabel adminNotificationLabel;
    private javax.swing.JButton adminPanelButton;
    private javax.swing.JPanel adminRightPanel;
    private javax.swing.JScrollPane adminScrollPane;
    private javax.swing.JLabel adminStatusLabel;
    private javax.swing.JTable adminTable;
    private javax.swing.JLabel adminUsernameLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JPanel filtersPanelDashboard2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label labelHourDashboard2;
    private javax.swing.JLabel lableYearDashboard2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton viewAllLogsButton;
    private javax.swing.JButton viewAllUsersButton;
    // End of variables declaration//GEN-END:variables

    public static class Dashboard2Chart extends JPanel {

        private static Map<Color, Integer> bars = new LinkedHashMap<>();
        static int barWidth = 80;
        static int barGap = 30;

        private void addVehicle(Color color, int noVehicles) {        //add bar to HashMap       
            bars.put(color, noVehicles);
            repaint();
        }

        protected static int findMaxHeight() {
            int maxHeight = Integer.MIN_VALUE;

            for (Integer value : bars.values()) {

                maxHeight = Math.max(maxHeight, value);

            }
            return maxHeight;
        }

        protected static int getPanelWidth() {
            int panelWidth = bars.size() * (barWidth + barGap);
            return panelWidth;
        }

        @Override
        protected void paintComponent(Graphics g) {

            int maxHeight = findMaxHeight();

            int x = 2;          //the value at which the bar will start at (x-axis value)

            for (Color color : bars.keySet()) {

                int barHeight = bars.get(color);

                int newBarHeight = (int) ((getHeight() - 20) * ((double) barHeight / maxHeight));

                g.setColor(color);
                g.fillRect(x, getHeight() - newBarHeight, barWidth, newBarHeight);      //paint the rectangle with a color
                g.setColor(Color.black);
                g.drawRect(x, getHeight() - newBarHeight, barWidth, newBarHeight);                     //paint border around rectangle with black

                //text above rectangle(no. of vehicles)
                g.setColor(Color.black);
                Font font = new Font("Arial", Font.BOLD, 12);
                g.setFont(font);
                g.drawString(String.valueOf(barHeight), x + 5, (getHeight() - newBarHeight) - 2);

                System.out.println("Panel height: " + getHeight() + " bar height: " + newBarHeight + " color: " + color);

                x += (barWidth + barGap);   // the value at which the next bar will start at (gap added #10)

            }

        }

        @Override
        public Dimension getPreferredSize() {
            //set size of panel
            int panelWidth = getPanelWidth();
            int panelHeight = 320;
            return new Dimension(panelWidth, panelHeight);

        }

        public static JPanel getChart(int hour, String road, int year) {
            Dashboard2Chart chart = new Dashboard2Chart();
            JPanel container = new JPanel();
            container.setBackground(new Color(208, 239, 255));                    // blue - graph background color

            Dashboard2LablesPanel labels = new Dashboard2LablesPanel();

            TrafficController controller = new TrafficController();

            ResultSet result = controller.getHighestTrafficVolume(hour, road, year);

            int ped = 0;
            int twoMV = 0;
            int cars = 0;
            int buses = 0;
            int lgvs = 0;
            int hgvs = 0;
            int allveh = 0;

            try {
                try {
                    ped = (Integer.parseInt(result.getString("pedal_cycles")));
                    twoMV = (Integer.parseInt(result.getString("two_wheeled_motor_vehicles")));
                    cars = (Integer.parseInt(result.getString("cars_and_taxis")));
                    buses = (Integer.parseInt(result.getString("buses_and_coaches")));
                    lgvs = (Integer.parseInt(result.getString("lgvs")));
                    hgvs = (Integer.parseInt(result.getString("all_hgvs")));
                    allveh = (Integer.parseInt(result.getString("MAX(all_motor_vehicles)")));

                } catch (SQLException ex) {
                    ped = 0;
                    twoMV = 0;
                    cars = 0;
                    buses = 0;
                    lgvs = 0;
                    hgvs = 0;
                    allveh = 0;
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (Exception e) {     //if int values are null
                ped = 0;
                twoMV = 0;
                cars = 0;
                buses = 0;
                lgvs = 0;
                hgvs = 0;
                allveh = 0;
            }

            //all colours must be different otherwise bars won't show
            chart.addVehicle(new Color(221, 240, 224), ped);

            chart.addVehicle(new Color(170, 218, 178), twoMV);

            chart.addVehicle(new Color(134, 203, 146), cars);

            chart.addVehicle(new Color(113, 180, 141), buses);

            chart.addVehicle(new Color(64, 78, 124), lgvs);

            chart.addVehicle(new Color(37, 31, 71), hgvs);

            chart.addVehicle(new Color(38, 15, 38), allveh);

            container.setPreferredSize(new Dimension(getPanelWidth(), 370));

            container.add(chart, BorderLayout.NORTH);
            container.add(labels, BorderLayout.SOUTH);

            return container;

        }

        public static class Dashboard2LablesPanel extends JPanel {

            @Override
            public Dimension getPreferredSize() {
                //set size of panel
                int panelWidth = getPanelWidth();
                int panelHeight = 50;
                return new Dimension(panelWidth, panelHeight);

            }

            @Override
            protected void paintComponent(Graphics g) {
                String vehicles[] = {"Pedal cycles", "2 wmv", "Cars", "Buses", "LGVS", "HGVS", "All motor vehicles"};       //list of vehicles
                int x = 2;
                int i = 0;
                int maxHeight = findMaxHeight();
                for (Color color : bars.keySet()) {
                    int barHeight = bars.get(color);
                    int newBarHeight = (int) ((getHeight() - 20) * ((double) barHeight / maxHeight));

                    //text below rectangles (type of vehicle)
                    Font font = new Font("Arial", Font.PLAIN, 15);
                    g.setFont(font);
                    g.drawString(vehicles[i++], x, 20);
                    x += (barWidth + barGap);
                }
            }

        }

    }
    
    //Pie Chart Creation (Isa)
    public PieDataset D4PieChart() {
        DefaultPieDataset D4Dataset = new DefaultPieDataset();
        D4Dataset.setValue("Cars", 20);
        D4Dataset.setValue("Boats", 30);
        D4Dataset.setValue("Motorbikes", 6);
        
        return D4Dataset;
}
    
    public JFreeChart createD4PieChart(PieDataset D4PieDataset) {
        JFreeChart D4Chart = ChartFactory.createPieChart(
                "Vehicles on major or minor roads per year",
                D4PieDataset,
                true,
                true,
                false 
        );
        return D4Chart;
    } 

}
