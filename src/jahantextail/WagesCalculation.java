/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahantextail;

import static jahantextail.Employee.connection;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public final class WagesCalculation extends javax.swing.JPanel {


    DefaultComboBoxModel dm = new DefaultComboBoxModel();
    DefaultComboBoxModel dm2 = new DefaultComboBoxModel();

    private String fromDate ="";
    private String toDate = "";

    double workHour;
    int cardNo;
    String name;
    private String department;
    private String designation;
    private double dailyBasic;
    private double attAllowance;
    private double nightAllowance;
    private double redNightAllowance;
    private double festAllowance;
    private String product;
    private double quentity;
    private double empAttendance;
    private double weekAttendance;

    private String shift = "";
    private double totalBasic;
    private int totalPayable;
    private double totalAttendanceAllo;
    private double totalNightAllo;
    private double sallery;
    private String loomsNo;
    private double production;
    private double rate;
    private int hrDeduction;
    private int f_production;
    private double f_rate;
    private int fesHours;

    public WagesCalculation() {
        initComponents();
        productItem();
        departmentItem();
        setRunningWeek();
        setItemTable();
        folding_panel.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shiftRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cardNoTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        attendanceTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dayRadio = new javax.swing.JRadioButton();
        nightRadio = new javax.swing.JRadioButton();
        fromDateTf = new javax.swing.JTextField();
        toDateTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        workHourTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        dailyBasicTf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        panelToHide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        productCombo = new javax.swing.JComboBox<>();
        quentityTf = new javax.swing.JTextField();
        btnProductAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LoomNoTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        generalRadio = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        fesHourTf = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        previewTa = new javax.swing.JTextArea();
        folding_panel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        productionTf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 491));
        setPreferredSize(new java.awt.Dimension(1000, 491));

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 491));

        jLabel1.setText("Card No.");

        cardNoTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNoTfActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        nameTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setText("From");

        jLabel7.setText("To");

        jLabel8.setText("Attendance");

        attendanceTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        attendanceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceTfActionPerformed(evt);
            }
        });

        jLabel9.setText("Hours");

        jLabel10.setText("Shift");

        shiftRadio.add(dayRadio);
        dayRadio.setSelected(true);
        dayRadio.setText("Day");

        shiftRadio.add(nightRadio);
        nightRadio.setText("Night");

        fromDateTf.setEditable(false);
        fromDateTf.setBackground(new java.awt.Color(153, 255, 153));
        fromDateTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromDateTf.setForeground(new java.awt.Color(102, 0, 0));

        toDateTf.setEditable(false);
        toDateTf.setBackground(new java.awt.Color(153, 255, 153));
        toDateTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toDateTf.setForeground(new java.awt.Color(102, 0, 0));

        jLabel11.setText("Work Hour");

        workHourTf.setEditable(false);
        workHourTf.setBackground(new java.awt.Color(153, 255, 153));
        workHourTf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setText("Hours");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Refresh_20px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setText("D. basic");

        dailyBasicTf.setEditable(false);
        dailyBasicTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setText("Tk");

        panelToHide.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Product");

        productCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        productCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboActionPerformed(evt);
            }
        });
        productCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productComboKeyPressed(evt);
            }
        });

        quentityTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quentityTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quentityTfActionPerformed(evt);
            }
        });

        btnProductAdd.setText("Add");
        btnProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductAddActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LoomNoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoomNoTfActionPerformed(evt);
            }
        });

        jLabel5.setText("Loom No.");

        jLabel4.setText("X");

        productTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productTable.setRowHeight(25);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout panelToHideLayout = new javax.swing.GroupLayout(panelToHide);
        panelToHide.setLayout(panelToHideLayout);
        panelToHideLayout.setHorizontalGroup(
            panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToHideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelToHideLayout.createSequentialGroup()
                        .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quentityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProductAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelToHideLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelToHideLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoomNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelToHideLayout.setVerticalGroup(
            panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelToHideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelToHideLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductAdd)
                            .addComponent(quentityTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelToHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LoomNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(26, 26, 26))
        );

        shiftRadio.add(generalRadio);
        generalRadio.setText("General");
        generalRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalRadioActionPerformed(evt);
            }
        });

        jLabel17.setText("Fes. Hour");

        fesHourTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fesHourTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fesHourTfActionPerformed(evt);
            }
        });

        previewTa.setColumns(20);
        previewTa.setLineWrap(true);
        previewTa.setRows(10);
        previewTa.setMargin(new java.awt.Insets(3, 2, 3, 2));
        jScrollPane3.setViewportView(previewTa);

        jLabel15.setText("Production:");

        productionTf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productionTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionTfActionPerformed(evt);
            }
        });

        jLabel16.setText("Meter");

        javax.swing.GroupLayout folding_panelLayout = new javax.swing.GroupLayout(folding_panel);
        folding_panel.setLayout(folding_panelLayout);
        folding_panelLayout.setHorizontalGroup(
            folding_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(folding_panelLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(39, 39, 39)
                .addComponent(productionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(0, 112, Short.MAX_VALUE))
        );
        folding_panelLayout.setVerticalGroup(
            folding_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(folding_panelLayout.createSequentialGroup()
                .addGroup(folding_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setText("R. Department");

        departmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                departmentComboKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(560, 560, 560))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelToHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(dayRadio)
                                                .addGap(18, 18, 18)
                                                .addComponent(nightRadio)
                                                .addGap(18, 18, 18)
                                                .addComponent(generalRadio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(workHourTf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cardNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1))))))
                                    .addComponent(jLabel1)
                                    .addComponent(folding_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(departmentCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(attendanceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dailyBasicTf, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14))
                                            .addComponent(fesHourTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(fromDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workHourTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(dayRadio)
                                    .addComponent(nightRadio)
                                    .addComponent(generalRadio))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cardNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(attendanceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(dailyBasicTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(fesHourTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(folding_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelToHide, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        btnCalculate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalculateKeyPressed(evt);
            }
        });

        jButton4.setText("Update");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(btnCalculate)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(184, 184, 184))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setRunningWeek();
        setItemTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cardNoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNoTfActionPerformed
        // TODO add your handling code here:
        if (cardNoTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Card No.");
        } else {
            try {
                cardNo = Integer.parseInt(cardNoTf.getText());

                String sql_1 = "select * from employee where card_no='" + cardNo + "'";
                PreparedStatement st = connection.prepareStatement(sql_1);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    name = rs.getString("name");
                    department = rs.getString("department");
                    departmentCombo.setSelectedItem(department);
                    designation = rs.getString("designation");
                    dailyBasic = rs.getDouble("d_basic") / 12.0;
                    hrDeduction = rs.getInt("hr_deductiom");
                    nameTf.setText(name);
                    dailyBasicTf.setText(String.valueOf(rs.getDouble("d_basic")));
                    departmentSwitch(department);

                    setSelectItem();
                   departmentCombo.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(this, "Employee not found.");
                }
                st.close();
                rs.close();
                

            } catch (HeadlessException | NumberFormatException | SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cardNoTfActionPerformed

    private void btnProductAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductAddActionPerformed
        // TODO add your handling code here:

        addProduct();


    }//GEN-LAST:event_btnProductAddActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        calculate();
        cardNoTf.selectAll();
        cardNoTf.requestFocus();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void generalRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generalRadioActionPerformed

    private void quentityTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quentityTfActionPerformed
        // TODO add your handling code here:
        addProduct();
    }//GEN-LAST:event_quentityTfActionPerformed

    private void productionTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionTfActionPerformed
        // TODO add your handling code here:
        calculate();
        cardNoTf.selectAll();
        cardNoTf.requestFocus();
    }//GEN-LAST:event_productionTfActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        setSelectData();
    }//GEN-LAST:event_productTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        removeProduct();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void productComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_productComboActionPerformed

    private void productComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productComboKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            quentityTf.requestFocus();
            quentityTf.selectAll();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            btnCalculate.requestFocus();
        }
        
    }//GEN-LAST:event_productComboKeyPressed

    private void attendanceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceTfActionPerformed
        // TODO add your handling code here:
        fesHourTf.requestFocus();
        fesHourTf.selectAll();
    }//GEN-LAST:event_attendanceTfActionPerformed

    private void fesHourTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fesHourTfActionPerformed
        // TODO add your handling code here:
        productCombo.requestFocus();
    }//GEN-LAST:event_fesHourTfActionPerformed

    private void LoomNoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoomNoTfActionPerformed
        // TODO add your handling code here:
        btnCalculate.requestFocus();
    }//GEN-LAST:event_LoomNoTfActionPerformed

    private void btnCalculateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalculateKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           calculate();
        cardNoTf.selectAll();
        cardNoTf.requestFocus();
        }
    }//GEN-LAST:event_btnCalculateKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void departmentComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_departmentComboKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            department=departmentCombo.getSelectedItem().toString();
             departmentSwitch(department);
              attendanceTf.requestFocus();
                    attendanceTf.selectAll();
        }
    }//GEN-LAST:event_departmentComboKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LoomNoTf;
    private javax.swing.JTextField attendanceTf;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JTextField cardNoTf;
    private javax.swing.JTextField dailyBasicTf;
    private javax.swing.JRadioButton dayRadio;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JTextField fesHourTf;
    private javax.swing.JPanel folding_panel;
    private javax.swing.JTextField fromDateTf;
    private javax.swing.JRadioButton generalRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameTf;
    private javax.swing.JRadioButton nightRadio;
    private javax.swing.JPanel panelToHide;
    private javax.swing.JTextArea previewTa;
    private javax.swing.JComboBox<String> productCombo;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField productionTf;
    private javax.swing.JTextField quentityTf;
    private javax.swing.ButtonGroup shiftRadio;
    private javax.swing.JTextField toDateTf;
    private javax.swing.JTextField workHourTf;
    // End of variables declaration//GEN-END:variables

    void productItem() {
        productCombo.removeAllItems();
        dm.addElement("Select One");
        try {
            String sql_1 = "select * from product order by name asc";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                dm.addElement(rs.getString("name"));
                productCombo.setModel(dm);
                //productCombo.addItem(rs.getString("name"));                        
            }
            //System.err.println(list);
            st.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    void setRunningWeek() {
        try {
            String sql_1 = "select * from running_week";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                fromDate = rs.getString("from_date");
                fromDateTf.setText(fromDate);
                toDate = rs.getString("to_date");
                toDateTf.setText(toDate);
                workHour = rs.getDouble("work_hour");
                fesHours=rs.getInt("fes_hours");
                workHourTf.setText(String.valueOf(workHour));
                fesHourTf.setText(String.valueOf(fesHours));
            }
            
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void setItemTable() {

        try {
            String sql_1 = "select product, quantity from production_per_employee where card_no='" + cardNo + "'"
                    + " and from_date='" + fromDate + "' and to_date='" + toDate + "'";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            productTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void calculate() {

        weekAttendance = workHour;
        getAllowance();

        totalPayable = 0;
        sallery = 0;
        totalBasic = 0;
        totalAttendanceAllo = 0;
        totalNightAllo = 0;
        production = 0;

        if (dayRadio.isSelected()) {
            shift = dayRadio.getText();
        } else if (nightRadio.isSelected()) {
            shift = nightRadio.getText();
        } else if (generalRadio.isSelected()) {
            shift = generalRadio.getText();
        }

        if (!(attendanceTf.getText().isEmpty())) {
            try {
                empAttendance = Double.parseDouble(attendanceTf.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        fesHours=Integer.parseInt(fesHourTf.getText());

    switch (department) {
            case "Time Rate":
                //wages for time rate
                timeRateWages();
                break;
            case "Folding":
                //wages for folding department
                foldingWages();
                break;
            default:
                //wages for all department
                allDepartmentWages();
                break;
        }

    }

    private void getAllowance() {
        try {
            String sql_1 = "select * from allo_management";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                attAllowance = rs.getDouble("att_allo") / 12.0;
                nightAllowance = rs.getDouble("night_allo") / 12.0;
                redNightAllowance = rs.getDouble("red_night_all") / 12.0;
                festAllowance = rs.getDouble("festival_allo");

            }
            
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void insertSellary() {
        try {
            String sql_1 = "select * from sallery where card_no='" + cardNo + "' and "
                    + "week_start_date='" + fromDate + "' and week_end_date='" + toDate + "'";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                String sql_3 = "update sallery set name = '" + name + "',"
                        + "department = '" + department + "',"
                        + "designation = '" + designation + "',"
                        + "work_hour = '" + empAttendance + "',"
                        + "fol_production = '" + f_production + "',"
                        + "fol_rate = '" + f_rate + "',"
                        + "basic = '" + totalBasic + "',"
                        + "hr_deductiom = '" + hrDeduction + "',"
                        + "total_payable = '" + totalPayable + "',"
                        + "att_allow = '" + totalAttendanceAllo + "',"
                        + "night_allow = '" + totalNightAllo + "',"
                        + "fes_allow = '" + festAllowance() + "',"
                        + "looms = '" + loomsNo + "',"
                        + "production = '" + production + "',"
                        + "shift = '" + shift + "',"
                        + "daily_all = '" + dailyBasic * 12.0 + "',"
                        + "net_payable = '" + sallery + "'"
                        + " where card_no='" + cardNo + "' and week_start_date='" + fromDate + "' and "
                        + "week_end_date='" + toDate + "' ";
                PreparedStatement statement_2 = connection.prepareStatement(sql_3);
                statement_2.executeUpdate();
                statement_2.close();
                //initFields();

            } else {
                String sql_2 = "insert into sallery"
                        + "(card_no,name,designation,department,work_hour,basic,att_allow,night_allow,"
                        + "looms,production,net_payable,week_start_date,week_end_date,pay_date,"
                        + "shift,daily_all,total_payable,hr_deductiom,fes_allow)"
                        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try (PreparedStatement statement = connection.prepareStatement(sql_2)) {
                    statement.setInt(1, cardNo);
                    statement.setString(2, name);
                    statement.setString(3, designation);
                    statement.setString(4, department);
                    statement.setDouble(5, empAttendance);
                    statement.setDouble(6, totalBasic);
                    statement.setDouble(7, totalAttendanceAllo);
                    statement.setDouble(8, totalNightAllo);
                    statement.setString(9, loomsNo);
                   // statement.setString(10, product);
                    statement.setDouble(10, production);
                    statement.setDouble(11, sallery);
                    statement.setString(12, fromDate);
                    statement.setString(13, toDate);
                    statement.setDate(14, null);
                    statement.setString(15, shift);
                    statement.setDouble(16, dailyBasic * 12.0);
                    statement.setInt(17, totalPayable);
                    statement.setInt(18, hrDeduction);
                    statement.setInt(19, festAllowance());
                    
                    statement.executeUpdate();
                    statement.close();
                }
                setItemTable();
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initFields() {

        productItem();
        setRunningWeek();
        setItemTable();
        dailyBasic = 0;
        attAllowance = 0;
        nightAllowance = 0;
        redNightAllowance = 0;
        quentity = 0;
        empAttendance = 0;
        weekAttendance = 0;

        shift = "";
        totalBasic = 0;
        totalAttendanceAllo = 0;
        totalNightAllo = 0;
        sallery = 0;
        loomsNo = "";
        production = 0;

    }

    private void setSelectItem() {

        try {
            String sql = "select * from sallery where card_no='" + cardNo + "' and week_start_date='" + fromDate + "' and"
                    + " week_end_date='" + toDate + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                attendanceTf.setText(String.valueOf(rs.getDouble("work_hour")));
                String r_shift = rs.getString("shift");
                switch (r_shift) {
                    case "Day":
                        dayRadio.setSelected(true);
                        break;
                    case "Night":
                        nightRadio.setSelected(true);
                        break;
                    case "General":
                        generalRadio.setSelected(true);
                        break;
                    default:
                        break;
                }
                LoomNoTf.setText(rs.getString("looms"));
                if(rs.getString("department").equals("Folding")){
                    productionTf.setText(String.valueOf(rs.getInt("fol_production")));
                }
            }else{
                try {
            String sql_2="select * from sallery where card_no='" + cardNo + "' order by id desc limit 1";
            PreparedStatement statement_2=connection.prepareStatement(sql_2);
            ResultSet rs_2 = statement_2.executeQuery();
            if(rs_2.next()){
                LoomNoTf.setText(rs_2.getString("looms"));
            }
            statement_2.close();
            rs_2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
    }

    private void addProduct() {

        product = productCombo.getSelectedItem().toString();
        double sub_total = 0;

        try {
            quentity = Double.parseDouble(quentityTf.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid quentity.");
        }
        if (product.equals("Select One")) {
            JOptionPane.showMessageDialog(this, "Please select product.");
        } else if (quentityTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter quentity.");
        } else {
            try {
                
                try {
                    String sql_3 = "select * from product where name='" + product + "' ";
                    PreparedStatement st_3 = connection.prepareStatement(sql_3);
                    ResultSet rs_3 = st_3.executeQuery();

                    if (rs_3.next()) {
                        rate = rs_3.getDouble("rate");
                        sub_total = rate * quentity;
                        setItemTable();
                        System.out.println(rate);
                    }
                    
                    st_3.close();
                    rs_3.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
                
                String sql_1 = "select * from production_per_employee where card_no='" + cardNo + "' and "
                        + "product='" + product + "' and from_date='" + fromDate + "' and to_date='" + toDate + "'";
                PreparedStatement st = connection.prepareStatement(sql_1);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    
                    String sql_2 = "update production_per_employee set quantity='"+quentity+"',"
                            + "rate='"+rate+"',sub_total='"+sub_total+"' where card_no='" + cardNo + "' and "
                        + "product='" + product + "' and from_date='" + fromDate + "' and to_date='" + toDate + "'";
                    PreparedStatement statement =connection.prepareStatement(sql_2);
                    statement.executeUpdate();
                    statement.close();
                    setItemTable();
                                        
                } else {

                    

                    String sql_2 = "insert into production_per_employee"
                            + "(card_no,product,quantity,from_date,to_date,rate,sub_total)"
                            + " values(?,?,?,?,?,?,?)";
                    try (PreparedStatement statement = connection.prepareStatement(sql_2)) {
                        statement.setInt(1, cardNo);
                        statement.setString(2, product);
                        statement.setDouble(3, quentity);
                        statement.setString(4, fromDate);
                        statement.setString(5, toDate);
                        statement.setDouble(6, rate);
                        statement.setDouble(7, sub_total);
                        
                        statement.executeUpdate();
                        statement.close();
                    }
                    
                    setItemTable();

                }
                
                productCombo.requestFocus();
                st.close();
                rs.close();
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
            //dl.addElement(product +"   X   "+quentity);
        }
    }

    private void timeRateWages() {
        String preview = "Card No. " + cardNo + "\t\tName: " + name + "\n--------------------------------------------------------------------------------\n\n\n"
                + "\tPayable sallery\n--------------------------------------------------------------------------------";

        if (attendanceTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "please enter attendance.");

        } else if (shift.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Select Shift.");
        } else {

            totalBasic = dailyBasic * empAttendance;
            totalPayable = (int) Math.round(totalBasic);
            
            if (empAttendance >= weekAttendance) {
                totalAttendanceAllo = (empAttendance-(empAttendance%12)) * attAllowance;
            } else if (empAttendance < weekAttendance) {
                totalAttendanceAllo = 0;
            }
            if (empAttendance >= weekAttendance && shift.equals(nightRadio.getText())) {
                totalNightAllo = (empAttendance * nightAllowance);
            } else if (empAttendance < weekAttendance && shift.equals(nightRadio.getText())) {
                totalNightAllo = (empAttendance * redNightAllowance);
            }
            totalPayable+=totalAttendanceAllo + totalNightAllo;
            sallery = totalBasic + totalAttendanceAllo + totalNightAllo - hrDeduction;
            
            sallery=Math.round(sallery)+festAllowance();
            preview += "\nBasic\t\t: " + totalBasic + "\nAttendance Allowance\t: " + totalAttendanceAllo + ""
                    + "\nNight Allowance\t: " + totalNightAllo +"\nFestival Allowance\t: "+festAllowance()+""
                    + "\n--------------------------------------------------------------------------------\n"
                    + "\tTotal\t: " + sallery;
            previewTa.setText(preview);

            insertSellary();

        }
    }

    private void foldingWages() {
        String preview = "Card No. " + cardNo + "\t\tName: " + name + "\n--------------------------------------------------------------------------------\n\n\n"
                + "\tPayable sallery\n--------------------------------------------------------------------------------";
        preview += "\nProduction\tRate\t\tSub Total\n";
         f_production = 0;
         f_rate = 0.0;
        int f_quantity;
        try {
            f_production = Integer.valueOf(productionTf.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            String sql = "select * from folding_rate";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                f_rate = rs.getDouble("rate");
                f_quantity = rs.getInt("quentity");
                f_rate = f_rate / f_quantity;
               

            }
            totalBasic = f_rate * f_production;
             preview += "\n"+f_production+"\t"+f_rate+"/mrter\t\t"+totalBasic+"\n";
             preview+="\n--------------------------------------------------------------------------------\n";
            totalPayable = (int) Math.round(totalBasic);
            preview+="Total:\t\t\t"+totalPayable+"";
           // totalPayable+=totalAttendanceAllo + totalNightAllo;
            sallery = totalPayable + totalAttendanceAllo + totalNightAllo - hrDeduction;
            sallery=Math.round(sallery)+festAllowance();
            preview+="\nAttendence Allowance:\t\t"+totalAttendanceAllo+"";
            preview+="\nNight Allowance:\t\t"+totalNightAllo+"";
            preview+="\nFestival Allowance:\t\t"+festAllowance()+"";
            preview+="\nHouse Rent Deduction:\t\t"+hrDeduction+"";
            preview+="\n--------------------------------------------------------------------------------\n";
            preview+="\nNet Payable:\t\t\t"+sallery+"";
            previewTa.setText(preview);
            insertSellary();

            statement.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void allDepartmentWages() {
        String preview = "Card No. " + cardNo + "\t\tName: " + name + "\n--------------------------------------------------------------------------------\n\n\n"
                + "\tPayable sallery\n--------------------------------------------------------------------------------";
        loomsNo = LoomNoTf.getText();
        preview += "\nQuality\tQuantity\tRate\tSub Total\n";
        try {
            String sql_1 = "select * from production_per_employee where card_no='" + cardNo + "' and from_date='" + fromDate + "'"
                    + " and to_date='" + toDate + "'";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String c_quality = rs.getString("product");
                double c_rate = rs.getDouble("rate");
                double c_quantity = rs.getDouble("quantity");
                double sub_total = c_rate * c_quantity;
                production += c_quantity;

                totalBasic += sub_total;
                preview += "\n" + c_quality + "\t" + c_quantity + "\t" + c_rate + "\t" + sub_total + "";

            }
            totalPayable = (int) Math.round(totalBasic);
            sallery = totalPayable + totalAttendanceAllo + totalNightAllo - hrDeduction;
            sallery=Math.round(sallery)+festAllowance();
            preview += "\n\n--------------------------------------------------------------------------------\n"
                    + "Production: " + production + "\tTotal\t: " + sallery;
            previewTa.setText(preview);
            insertSellary();

            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void setSelectData() {
         int row = productTable.getSelectedRow();
        String tableClicked = (productTable.getModel().getValueAt(row, 0).toString());
        try {
            String sql_1 = "select * from production_per_employee where card_no='" + cardNo + "' "
                    + "and product='"+tableClicked+"' and from_date='" + fromDate + "'"
                    + " and to_date='" + toDate + "'";
            PreparedStatement statement = connection.prepareStatement(sql_1);
            ResultSet rs=statement.executeQuery();
            if(rs.next()){
                productCombo.setSelectedItem(rs.getString("product"));
                quentityTf.setText(rs.getString("quantity"));
            }
            
            statement.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

           }

    private void removeProduct() {
      int button=JOptionPane.YES_NO_OPTION;  
      int result=  JOptionPane.showConfirmDialog(this, "Are you sure to delete '"
              +productCombo.getSelectedItem().toString()+"'","Warning",button);
        
    
      if(result==0){
              try {
            String sql="delete from production_per_employee where card_no='" + cardNo + "' "
                    + "and product='"+productCombo.getSelectedItem().toString()+"' and from_date='" + fromDate + "'"
                    + " and to_date='" + toDate + "'";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.executeUpdate();
            setItemTable();
            productCombo.setSelectedIndex(0);
            quentityTf.setText("");
           
            
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
              
          
      }
         }

    private int festAllowance() {
        
        int fallow=(int) (dailyBasic*fesHours);
        return fallow;
            }

    private void departmentItem() {
        departmentCombo.removeAllItems();
        dm2.addElement("Select One");
        try {
            String sql_1 = "select * from department order by name asc";
            PreparedStatement st = connection.prepareStatement(sql_1);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                dm2.addElement(rs.getString("name"));
                departmentCombo.setModel(dm2);
                //productCombo.addItem(rs.getString("name"));                        
            }
            //System.err.println(list);
            st.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
           }

    private void departmentSwitch(String department) {
        switch (department) {
                        case "Folding":
                            panelToHide.setVisible(false);
                            folding_panel.setVisible(true);
                            break;
                        case "Time Rate":
                            panelToHide.setVisible(false);
                            folding_panel.setVisible(false);
                            break;
                        default:
                            panelToHide.setVisible(true);
                            folding_panel.setVisible(false);
                            setItemTable();
                            break;
                    }
            }
}
