/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.impl.ChucVuBLL;
import BLL.impl.NhanVienBLL;
import DTO.ChucVuModel;
import DTO.NhanVienModel;
import Table.NhanVienTable;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author hocgioinhatlop
 */
public class NhanVienGUI extends javax.swing.JFrame {

    NhanVienBLL nhanVienBLL= new NhanVienBLL();
    List<NhanVienModel> nhanVienList = new ArrayList<NhanVienModel>();
    NhanVienTable nhanVienTable = new NhanVienTable();
    public NhanVienGUI() {
        initComponents();
        
        
        
    }

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl3QLDoan = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        NhanVienTable = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        kGradientPanel20 = new keeptoo.KGradientPanel();
        txtEmail_nv = new javax.swing.JTextField();
        kGradientPanel21 = new keeptoo.KGradientPanel();
        tfDapAn10 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        kGradientPanel26 = new keeptoo.KGradientPanel();
        txtMaNV = new javax.swing.JTextField();
        kGradientPanel27 = new keeptoo.KGradientPanel();
        tfDapAn13 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        btnSaveNhanVien = new javax.swing.JButton();
        btnDeleteDoan = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        btnResetDoan2 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        kGradientPanel28 = new keeptoo.KGradientPanel();
        txtSdt = new javax.swing.JTextField();
        kGradientPanel29 = new keeptoo.KGradientPanel();
        tfDapAn14 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        kGradientPanel34 = new keeptoo.KGradientPanel();
        txtTenNV = new javax.swing.JTextField();
        kGradientPanel35 = new keeptoo.KGradientPanel();
        tfDapAn17 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cbChucVu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl3QLDoan.setBackground(new java.awt.Color(236, 239, 244));
        pnl3QLDoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("Version 1.0");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl3QLDoan.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel36.setText("Dashboard");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl3QLDoan.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel11.setBackground(new java.awt.Color(210, 214, 223));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel37.setText("Home >");

        jLabel38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_speed_24px_1.png")); // NOI18N
        jLabel38.setText("Nhân Viên");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 736, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38))
        );

        pnl3QLDoan.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnl3QLDoan.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        NhanVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        NhanVienTable.setFillsViewportHeight(true);
        NhanVienTable.setShowHorizontalLines(false);
        NhanVienTable.setShowVerticalLines(false);
        NhanVienTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NhanVienTableFocusGained(evt);
            }
        });
        NhanVienTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NhanVienTableMouseReleased(evt);
            }
        });
        jScrollPane8.setViewportView(NhanVienTable);

        pnl3QLDoan.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 800, 300));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Email");
        pnl3QLDoan.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        kGradientPanel20.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel20.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel20.setkFillBackground(false);
        kGradientPanel20.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail_nv.setBorder(null);
        txtEmail_nv.setOpaque(false);
        kGradientPanel20.add(txtEmail_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel21.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel21.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel21.setkFillBackground(false);
        kGradientPanel21.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn10.setBorder(null);
        tfDapAn10.setOpaque(false);
        kGradientPanel21.add(tfDapAn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel20.add(kGradientPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Tên địa điểm:");
        kGradientPanel20.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnl3QLDoan.add(kGradientPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 270, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3QLDoan.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        kGradientPanel26.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel26.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel26.setkFillBackground(false);
        kGradientPanel26.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaNV.setBorder(null);
        txtMaNV.setOpaque(false);
        kGradientPanel26.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel27.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel27.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel27.setkFillBackground(false);
        kGradientPanel27.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn13.setBorder(null);
        tfDapAn13.setOpaque(false);
        kGradientPanel27.add(tfDapAn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel26.add(kGradientPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Tên địa điểm:");
        kGradientPanel26.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnl3QLDoan.add(kGradientPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 270, 20));

        btnSaveNhanVien.setBackground(new java.awt.Color(39, 62, 174));
        btnSaveNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveNhanVien.setText("Lưu");
        btnSaveNhanVien.setContentAreaFilled(false);
        btnSaveNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveNhanVien.setOpaque(true);
        btnSaveNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNhanVienActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnSaveNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 140, 30));

        btnDeleteDoan.setBackground(new java.awt.Color(39, 62, 174));
        btnDeleteDoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteDoan.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoan.setText("Xóa");
        btnDeleteDoan.setContentAreaFilled(false);
        btnDeleteDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteDoan.setOpaque(true);
        btnDeleteDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoanActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnDeleteDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 140, 30));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Ngày sinh");
        pnl3QLDoan.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, 20));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Mã nv");
        pnl3QLDoan.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        btnResetDoan2.setBackground(new java.awt.Color(39, 62, 174));
        btnResetDoan2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetDoan2.setForeground(new java.awt.Color(255, 255, 255));
        btnResetDoan2.setText("Reset");
        btnResetDoan2.setContentAreaFilled(false);
        btnResetDoan2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetDoan2.setOpaque(true);
        btnResetDoan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDoan2ActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnResetDoan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 140, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Số điện thoại");
        pnl3QLDoan.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        kGradientPanel28.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel28.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel28.setkFillBackground(false);
        kGradientPanel28.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSdt.setBorder(null);
        txtSdt.setOpaque(false);
        kGradientPanel28.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel29.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel29.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel29.setkFillBackground(false);
        kGradientPanel29.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn14.setBorder(null);
        tfDapAn14.setOpaque(false);
        kGradientPanel29.add(tfDapAn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel28.add(kGradientPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Tên địa điểm:");
        kGradientPanel28.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnl3QLDoan.add(kGradientPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 270, 20));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Chức vụ");
        pnl3QLDoan.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        kGradientPanel34.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel34.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel34.setkFillBackground(false);
        kGradientPanel34.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenNV.setBorder(null);
        txtTenNV.setOpaque(false);
        kGradientPanel34.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel35.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel35.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel35.setkFillBackground(false);
        kGradientPanel35.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn17.setBorder(null);
        tfDapAn17.setOpaque(false);
        kGradientPanel35.add(tfDapAn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel34.add(kGradientPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Tên địa điểm:");
        kGradientPanel34.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnl3QLDoan.add(kGradientPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 270, 20));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Tên nhân viên");
        pnl3QLDoan.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370743292000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135791108000L));
        pnl3QLDoan.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 120, 20));

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tài xế", "Hướng dẫn viên" }));
        pnl3QLDoan.add(cbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl3QLDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(pnl3QLDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhanVienTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NhanVienTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NhanVienTableFocusGained

    private void NhanVienTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienTableMouseClicked

      NhanVienModel nhanVienModel = nhanVienList.get(NhanVienTable.getSelectedRow());
      txtMaNV.setText(Integer.toString(nhanVienModel.getId()));
      txtTenNV.setText(nhanVienModel.getTenNhanVien());
      txtEmail_nv.setText(nhanVienModel.getEmail());
      txtSdt.setText(nhanVienModel.getSdt());
      jDateChooser1.setDate(nhanVienModel.getNgaySinh());
      cbChucVu.setSelectedItem(nhanVienModel.getNhiemVu());
      
     
       
       
    }//GEN-LAST:event_NhanVienTableMouseClicked

    private void NhanVienTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NhanVienTableMouseReleased

    private void btnSaveNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNhanVienActionPerformed
      String regex = "[0-9]+";
      NhanVienModel nhanVienModel = new NhanVienModel();
      nhanVienModel.setTenNhanVien(txtTenNV.getText());
      nhanVienModel.setEmail(txtEmail_nv.getText());
      nhanVienModel.setSdt(txtSdt.getText());
      nhanVienModel.setNhiemVu(cbChucVu.getSelectedItem().toString());
      if(jDateChooser1.getDate()!=null)
        nhanVienModel.setNgaySinh(convertJavaDateToSqlDate(jDateChooser1.getDate()));
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ngày sinh");
            return;
        }
      if(!txtMaNV.getText().equals("") && txtMaNV.getText().matches(regex)){
            nhanVienModel.setId(Integer.parseInt(txtMaNV.getText()));
            nhanVienBLL.update(nhanVienModel);
        }else{
            nhanVienBLL.save(nhanVienModel); 
        }
       nhanVienList = nhanVienBLL.findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);
      
      
    }//GEN-LAST:event_btnSaveNhanVienActionPerformed

    private void btnDeleteDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoanActionPerformed
       if(NhanVienTable.getSelectedRow() == -1){
           JOptionPane.showMessageDialog(null, "Xóa thất bại");
           return;
       }
        nhanVienBLL.delete(new int[]{(int)NhanVienTable.getModel().getValueAt(NhanVienTable.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        nhanVienList = nhanVienBLL.findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);
    }//GEN-LAST:event_btnDeleteDoanActionPerformed

    private void btnResetDoan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDoan2ActionPerformed
      txtMaNV.setText("");
      txtTenNV.setText("");
      txtEmail_nv.setText("");
      txtSdt.setText("");
      jDateChooser1.setDate(null);
      cbChucVu.setSelectedIndex(1);
    }//GEN-LAST:event_btnResetDoan2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NhanVienTable;
    private javax.swing.JButton btnDeleteDoan;
    private javax.swing.JButton btnResetDoan2;
    private javax.swing.JButton btnSaveNhanVien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbChucVu;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane8;
    private keeptoo.KGradientPanel kGradientPanel20;
    private keeptoo.KGradientPanel kGradientPanel21;
    private keeptoo.KGradientPanel kGradientPanel26;
    private keeptoo.KGradientPanel kGradientPanel27;
    private keeptoo.KGradientPanel kGradientPanel28;
    private keeptoo.KGradientPanel kGradientPanel29;
    private keeptoo.KGradientPanel kGradientPanel34;
    private keeptoo.KGradientPanel kGradientPanel35;
    private javax.swing.JPanel pnl3QLDoan;
    private javax.swing.JTextField tfDapAn10;
    private javax.swing.JTextField tfDapAn13;
    private javax.swing.JTextField tfDapAn14;
    private javax.swing.JTextField tfDapAn17;
    private javax.swing.JTextField txtEmail_nv;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
private void paint_table(JTable table) {
        jScrollPane8.getViewport().setBackground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(60, 127, 177));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(30);
        table.setShowGrid(true); // de the hien duong vien mac dich
        table.setShowHorizontalLines(true);// de the hien duong vien ngang
        table.setShowVerticalLines(true);// de the hien duong vien doc
    }
}
