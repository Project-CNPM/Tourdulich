/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.impl.DiaDiemBLL;
import DTO.DoanDuLichModel;

import DTO.TourModel;
import Singleton.SingletonBllUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


/**
 *
 * @author hocgioinhatlop
 */
public class FormLapDoan extends javax.swing.JDialog {

    /**
     * Creates new form FormAddTour
     */
    
    DiaDiemBLL diaDiemBLL = new DiaDiemBLL();
    List<TourModel> tourList = new ArrayList<>();
    private int idUpdate = -1;

    public FormLapDoan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initCbChonTour();
        

    }

    public FormLapDoan(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        
        idUpdate=id;
        DoanDuLichModel model = SingletonBllUtil.getDoanDuLichBLLInstance().findById(id);
        tfTenDoan.setText(model.getTenDoan());
        txtMoTa.setText(model.getMoTa());
        dateNgayDi.setDate(model.getNgayDi());
        dateNgayVe.setDate(model.getNgayVe());
        initCbChonTour();
        String tenTour =SingletonBllUtil.getTourBLLInstance().findById(model.getTour_id()).getTenTour();
        cbChonTour.setSelectedItem(tenTour);
        cbChonGiaTour.setSelectedItem(model.getGiaTour());
        
       
        
    }
    public void initCbChonTour(){
        tourList = SingletonBllUtil.getTourBLLInstance().findAll();
        tourList.forEach((item) -> {
        cbChonTour.addItem(item.getTenTour());
        });
        
    }
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel9 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        saveButton = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        tfTenDoan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        cbChonTour = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbChonGiaTour = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dateNgayVe = new com.toedter.calendar.JDateChooser();
        dateNgayDi = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkFillBackground(false);
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 68, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(90, 68, 193));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lập đoàn đi tour");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

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

        kGradientPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 560, 40));

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
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 450, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(170, 170, 170));
        jLabel8.setText("Ngày về");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(170, 170, 170));
        jLabel9.setText("Mô tả");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTenDoan.setBorder(null);
        tfTenDoan.setOpaque(false);
        kGradientPanel6.add(tfTenDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 290, 20));

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMoTa.setLineWrap(true);
        txtMoTa.setRows(2);
        jScrollPane2.setViewportView(txtMoTa);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 380, 90));

        cbChonTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonTourActionPerformed(evt);
            }
        });
        jPanel4.add(cbChonTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 280, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(170, 170, 170));
        jLabel14.setText("Chọn tour");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(170, 170, 170));
        jLabel11.setText("Chọn giá tour");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, 20));

        cbChonGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonGiaTourActionPerformed(evt);
            }
        });
        jPanel4.add(cbChonGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 360, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(170, 170, 170));
        jLabel12.setText("Tên đoàn");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(170, 170, 170));
        jLabel13.setText("Ngày đi");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        jPanel4.add(dateNgayVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, -1));
        jPanel4.add(dateNgayDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, -1));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbChonGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonGiaTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChonGiaTourActionPerformed

    private void cbChonTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonTourActionPerformed
        cbChonGiaTour.removeAllItems();
        int tourId = tourList.stream().filter( a -> a.getTenTour().equals(cbChonTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0).getId();
        SingletonBllUtil.getGiaTourBLLInstance().findByTourId(tourId).forEach((item) -> {
        cbChonGiaTour.addItem(String.valueOf(item.getSoTien()));
        });
    }//GEN-LAST:event_cbChonTourActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DoanDuLichModel model = new DoanDuLichModel();
        if(tfTenDoan.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống tên đoàn !!");
            return;
        }
        if(txtMoTa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống mô tả!!");
            return;
        }
       
        model.setTenDoan(tfTenDoan.getText());
        model.setMoTa(txtMoTa.getText());
        int tourId = tourList.stream().filter( a -> a.getTenTour().equals(cbChonTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0).getId();
        model.setTour_id(tourId);
        model.setGiaTour(Double.parseDouble(cbChonGiaTour.getSelectedItem().toString()));
        if(dateNgayDi.getDate()!=null && dateNgayVe.getDate()!= null && dateNgayVe.getDate().after(dateNgayDi.getDate())){
          model.setNgayDi(convertJavaDateToSqlDate(dateNgayDi.getDate()));
          model.setNgayVe(convertJavaDateToSqlDate(dateNgayVe.getDate()));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Thông tin ngày đi và ngày về không hợp lệ !!!");
            return;
        }
        if(idUpdate == -1){
            model = SingletonBllUtil.getDoanDuLichBLLInstance().save(model);
        } else {
            model.setId(idUpdate);
            model = SingletonBllUtil.getDoanDuLichBLLInstance().update(model);
        }
        dispose();//
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormLapDoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLapDoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLapDoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLapDoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLapDoan dialog = new FormLapDoan(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbChonGiaTour;
    private javax.swing.JComboBox<String> cbChonTour;
    private com.toedter.calendar.JDateChooser dateNgayDi;
    private com.toedter.calendar.JDateChooser dateNgayVe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField tfTenDoan;
    private javax.swing.JTextArea txtMoTa;
    // End of variables declaration//GEN-END:variables
}
