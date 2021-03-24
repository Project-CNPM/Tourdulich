/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ChiPhiChiTietModel;
import DTO.ChiPhiModel;
import DTO.DoanDuLichModel;
import DTO.TourModel;
import Singleton.SingletonBllUtil;
import Table.ChiPhiChiTietTable;
import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author hocgioinhatlop
 */
public class FormChiPhi extends javax.swing.JDialog {

    List<TourModel> tourList = new ArrayList<>();
    List<DoanDuLichModel> listDoan = new ArrayList<>();
    ChiPhiChiTietTable table = new ChiPhiChiTietTable();
    List<ChiPhiChiTietModel> listChiTiet = new ArrayList<>();
    private int idUpdate = -1;

    public FormChiPhi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        paint_table(ChiPhiChiTietTable);
        initCbChonTour();
        initTableChiPhi();
         
    }

    public FormChiPhi(java.awt.Frame parent, boolean modal, int idTour,int idDoan) {
        super(parent, modal);
        initComponents();
        paint_table(ChiPhiChiTietTable);
        initCbChonTour();
        initTableChiPhi();
       // idUpdate = id;
        TourModel tourModel = SingletonBllUtil.getTourBLLInstance().findById(idTour);
        cbChonTour.setSelectedItem(tourModel.getTenTour());
        DoanDuLichModel doanModel = SingletonBllUtil.getDoanDuLichBLLInstance().findById(idDoan);
        cbChonDoan.setSelectedItem(doanModel.getTenDoan());
        
       

    }

    public void initCbChonTour() {
        tourList = SingletonBllUtil.getTourBLLInstance().findAll();
        tourList.forEach((item) -> {
            cbChonTour.addItem(item.getTenTour());
        });

    }
    public void initTableChiPhi() {
        listDoan = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        int doanId=0 ;
        if(cbChonDoan.getSelectedItem() != null)
         doanId = listDoan.stream().filter(a -> a.getTenDoan().equals(cbChonDoan.getSelectedItem().toString()))
        .collect(Collectors.toList()).get(0).getId();
        ChiPhiModel model = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(doanId);
        if(model!=null){
            listChiTiet = model.getListChiPhi();
            table.showTable((ArrayList<ChiPhiChiTietModel>) model.getListChiPhi(), ChiPhiChiTietTable);
             txtTotal.setText(currency(model.getTotal()));
        }else{
            listChiTiet= new ArrayList<>();
            table.showTable(new ArrayList<ChiPhiChiTietModel>(), ChiPhiChiTietTable);
             txtTotal.setText("không có");
        }        
    }
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel9 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        saveButton = new keeptoo.KButton();
        cbChonTour = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dateHoaDon = new com.toedter.calendar.JDateChooser();
        cbLoaiChiPhi = new javax.swing.JComboBox<>();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        txtHoaDon = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        txtNoiDung = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        txtSoTien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbChonDoan = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        ChiPhiChiTietTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkFillBackground(false);
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 68, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(213, 83, 83));
        jButton1.setToolTipText("Close");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 40));

        jLabel19.setBackground(new java.awt.Color(90, 68, 193));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Chi tiết chi phí");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 460, 40));

        kGradientPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 420, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveButton.setText("Lưu thông tin");
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setkAllowTab(false);
        saveButton.setkEndColor(new java.awt.Color(118, 195, 118));
        saveButton.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        saveButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        saveButton.setkHoverStartColor(new java.awt.Color(80, 142, 80));
        saveButton.setkPressedColor(new java.awt.Color(28, 72, 28));
        saveButton.setkStartColor(new java.awt.Color(87, 167, 87));
        saveButton.setOpaque(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 450, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbChonTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonTourActionPerformed(evt);
            }
        });
        jPanel4.add(cbChonTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 340, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(170, 170, 170));
        jLabel14.setText("Chọn tour");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(170, 170, 170));
        jLabel12.setText("Chọn tên đoàn");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(170, 170, 170));
        jLabel13.setText("Ngày hóa đơn");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        jPanel4.add(dateHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 340, 20));

        cbLoaiChiPhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ăn uống", "Phương tiện", "Khách sạn", "Chi phi khác" }));
        jPanel4.add(cbLoaiChiPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 340, -1));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoaDon.setBorder(null);
        txtHoaDon.setOpaque(false);
        kGradientPanel6.add(txtHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 20));

        jPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 340, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(170, 170, 170));
        jLabel15.setText("Hóa đơn");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        kGradientPanel7.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel7.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel7.setkFillBackground(false);
        kGradientPanel7.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNoiDung.setBorder(null);
        txtNoiDung.setOpaque(false);
        kGradientPanel7.add(txtNoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 20));

        jPanel4.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 340, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(170, 170, 170));
        jLabel16.setText("Nội dung");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        kGradientPanel8.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel8.setkFillBackground(false);
        kGradientPanel8.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSoTien.setBorder(null);
        txtSoTien.setOpaque(false);
        kGradientPanel8.add(txtSoTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 20));

        jPanel4.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 340, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(170, 170, 170));
        jLabel17.setText("Số tiền");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(170, 170, 170));
        jLabel18.setText("Loại chi phí");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        cbChonDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonDoanActionPerformed(evt);
            }
        });
        jPanel4.add(cbChonDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 340, -1));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        ChiPhiChiTietTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ChiPhiChiTietTable.setFillsViewportHeight(true);
        ChiPhiChiTietTable.setShowHorizontalLines(false);
        ChiPhiChiTietTable.setShowVerticalLines(false);
        ChiPhiChiTietTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ChiPhiChiTietTableFocusGained(evt);
            }
        });
        ChiPhiChiTietTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChiPhiChiTietTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChiPhiChiTietTableMouseReleased(evt);
            }
        });
        jScrollPane8.setViewportView(ChiPhiChiTietTable);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 460, 380));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tổng tiền");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 70, 30));

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 0));
        txtTotal.setText("tongTien");
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, 30));

        btnXoa.setBackground(new java.awt.Color(39, 62, 174));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa ");
        btnXoa.setContentAreaFilled(false);
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.setOpaque(true);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 140, 30));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 990, 550));

        jLabel11.setBackground(new java.awt.Color(90, 68, 193));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nhập chi phí chuyến đi tour");
        kGradientPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 460, 40));

        jPanel2.setBackground(new java.awt.Color(90, 68, 193));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(213, 83, 83));
        jButton2.setToolTipText("Close");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 40));

        jLabel21.setBackground(new java.awt.Color(90, 68, 193));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Nhập chi phí chuyến đi tour");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 460, 40));

        kGradientPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbChonTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonTourActionPerformed
        cbChonDoan.removeAllItems();
        int tourId = tourList.stream().filter(a -> a.getTenTour().equals(cbChonTour.getSelectedItem().toString()))
        .collect(Collectors.toList()).get(0).getId();
        listDoan = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(tourId);
        if (listDoan != null) {
            listDoan.forEach((item) -> {
                cbChonDoan.addItem(String.valueOf(item.getTenDoan()));
            });
        }
    }//GEN-LAST:event_cbChonTourActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        List<ChiPhiChiTietModel> listChiTiet = null;
        ChiPhiChiTietModel model = new ChiPhiChiTietModel();
        if(txtHoaDon.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống hóa đơn !!");
            return;
        }
        if(txtNoiDung.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống nội dung!!");
            return;
        }
        if(txtSoTien.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống số tiền!!");
            return;
        }
        
        int doanId = listDoan.stream().filter(a -> a.getTenDoan().equals(cbChonDoan.getSelectedItem().toString()))
        .collect(Collectors.toList()).get(0).getId();
        model.setLoaiChiPhi(cbLoaiChiPhi.getSelectedItem().toString());
        if (dateHoaDon.getDate() != null) {
            model.setNgayHoaDon(convertJavaDateToSqlDate(dateHoaDon.getDate()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thông tin ngày hóa đơn không hợp lệ !!!");
            return;
        }
        model.setNoiDung(txtNoiDung.getText());
        if(Double.parseDouble(txtSoTien.getText())>0)
        model.setSoTien(Double.parseDouble(txtSoTien.getText()));
        else {
            JOptionPane.showMessageDialog(this, "Số tiền không dược âm");
            return;
        }
        
        model.setHoaDon(txtHoaDon.getText());
        ChiPhiModel chiPhi = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(doanId);
         
        if(chiPhi == null){
            model.setId(1);
            listChiTiet= new ArrayList<>();
            chiPhi = new ChiPhiModel();
            listChiTiet.add(model);
            chiPhi.setDoanId(doanId);
            chiPhi.setListChiPhi(listChiTiet);
            chiPhi.setTotal(tinhTongTien(listChiTiet));
            chiPhi = SingletonBllUtil.getChiPhiBLLInstance().save(chiPhi);
        }
        else{
            model.setId(chiPhi.getListChiPhi().size()+1);
            listChiTiet = chiPhi.getListChiPhi();
            listChiTiet.add(model);
            chiPhi.setListChiPhi(listChiTiet);
            chiPhi.setTotal(tinhTongTien(listChiTiet));           
            chiPhi = SingletonBllUtil.getChiPhiBLLInstance().update(chiPhi);
        }       
                            
//        if(idUpdate == -1){
//            chiPhi = SingletonBllUtil.getChiPhiBLLInstance().save(chiPhi);
//        } else {
//            chiPhi.setId(idUpdate);
//            chiPhi = SingletonBllUtil.getChiPhiBLLInstance().update(chiPhi);
//        }
        dispose();//
    }//GEN-LAST:event_saveButtonActionPerformed

    private void ChiPhiChiTietTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ChiPhiChiTietTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ChiPhiChiTietTableFocusGained

    private void ChiPhiChiTietTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiPhiChiTietTableMouseClicked

        

    }//GEN-LAST:event_ChiPhiChiTietTableMouseClicked

    private void ChiPhiChiTietTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChiPhiChiTietTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ChiPhiChiTietTableMouseReleased

    private void cbChonDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonDoanActionPerformed
        initTableChiPhi();
    }//GEN-LAST:event_cbChonDoanActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (ChiPhiChiTietTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn chi phí cần xóa ! ");
            return;
        }
        int doanId = listDoan.stream().filter(a -> a.getTenDoan().equals(cbChonDoan.getSelectedItem().toString()))
        .collect(Collectors.toList()).get(0).getId();       
        ChiPhiModel chiPhi = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(doanId);
        if(chiPhi != null){
        listChiTiet.remove(ChiPhiChiTietTable.getSelectedRow());
        chiPhi.setListChiPhi(listChiTiet);
        chiPhi.setTotal(tinhTongTien(listChiTiet));           
        chiPhi = SingletonBllUtil.getChiPhiBLLInstance().update(chiPhi);
        table.showTable((ArrayList<ChiPhiChiTietModel>) listChiTiet, ChiPhiChiTietTable);
        txtTotal.setText(currency(chiPhi.getTotal()));
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        }else {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
        }
        
       
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(FormChiPhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChiPhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChiPhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChiPhi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormChiPhi dialog = new FormChiPhi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChiPhiChiTietTable;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbChonDoan;
    private javax.swing.JComboBox<String> cbChonTour;
    private javax.swing.JComboBox<String> cbLoaiChiPhi;
    private com.toedter.calendar.JDateChooser dateHoaDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane8;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField txtHoaDon;
    private javax.swing.JTextField txtNoiDung;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

    private Double tinhTongTien(List<ChiPhiChiTietModel> listChiTiet) {
      Double tongTien = 0.0;
        for(ChiPhiChiTietModel item : listChiTiet){
           tongTien += item.getSoTien();
       }
        return tongTien;
    }
    private void paint_table(JTable table) {
        jScrollPane8.getViewport().setBackground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(60, 127, 177));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(30);
        table.setShowGrid(true); // de the hien duong vien mac dich
        //  table.setShowHorizontalLines(false);// de the hien duong vien ngang
        table.setShowVerticalLines(false);// de the hien duong vien doc
    }
     private String currency(double money){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
       return currencyVN.format(money);
    }
}
