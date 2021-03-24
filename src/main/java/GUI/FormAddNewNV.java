/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.KhachHangModel;
import DTO.NhanVienModel;
import Singleton.SingletonBllUtil;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hocgioinhatlop
 */
public class FormAddNewNV extends javax.swing.JDialog {

    private int id;

    public FormAddNewNV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FormAddNewNV(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        this.id = id;
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
        jLabel86 = new javax.swing.JLabel();
        kGradientPanel48 = new keeptoo.KGradientPanel();
        txtEmail_nv = new javax.swing.JTextField();
        kGradientPanel49 = new keeptoo.KGradientPanel();
        tfDapAn24 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        kGradientPanel52 = new keeptoo.KGradientPanel();
        txtSdt = new javax.swing.JTextField();
        kGradientPanel53 = new keeptoo.KGradientPanel();
        tfDapAn26 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        kGradientPanel54 = new keeptoo.KGradientPanel();
        txtTenNV = new javax.swing.JTextField();
        kGradientPanel55 = new keeptoo.KGradientPanel();
        tfDapAn27 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cbChucVu = new javax.swing.JComboBox<>();

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
        jLabel10.setText("Thêm mới nhân viên");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 530, 40));

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

        kGradientPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 510, 40));

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
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 450, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Email");
        jPanel4.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        kGradientPanel48.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel48.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel48.setkFillBackground(false);
        kGradientPanel48.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail_nv.setBorder(null);
        txtEmail_nv.setOpaque(false);
        kGradientPanel48.add(txtEmail_nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel49.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel49.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel49.setkFillBackground(false);
        kGradientPanel49.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn24.setBorder(null);
        tfDapAn24.setOpaque(false);
        kGradientPanel49.add(tfDapAn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel48.add(kGradientPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Tên địa điểm:");
        kGradientPanel48.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jPanel4.add(kGradientPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 20));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Ngày sinh");
        jPanel4.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("Số điện thoại");
        jPanel4.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        kGradientPanel52.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel52.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel52.setkFillBackground(false);
        kGradientPanel52.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSdt.setBorder(null);
        txtSdt.setOpaque(false);
        kGradientPanel52.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel53.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel53.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel53.setkFillBackground(false);
        kGradientPanel53.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn26.setBorder(null);
        tfDapAn26.setOpaque(false);
        kGradientPanel53.add(tfDapAn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel52.add(kGradientPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Tên địa điểm:");
        kGradientPanel52.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jPanel4.add(kGradientPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 20));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("Chức vụ");
        jPanel4.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        kGradientPanel54.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel54.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel54.setkFillBackground(false);
        kGradientPanel54.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenNV.setBorder(null);
        txtTenNV.setOpaque(false);
        kGradientPanel54.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel55.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel55.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel55.setkFillBackground(false);
        kGradientPanel55.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn27.setBorder(null);
        tfDapAn27.setOpaque(false);
        kGradientPanel55.add(tfDapAn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel54.add(kGradientPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Tên địa điểm:");
        kGradientPanel54.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jPanel4.add(kGradientPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 270, 20));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Tên nhân viên");
        jPanel4.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370743292000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135791108000L));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 20));

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tài xế", "Hướng dẫn viên" }));
        jPanel4.add(cbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, -1));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String regex = "[0-9]+";
        NhanVienModel nhanVienModel = new NhanVienModel();
        if(txtTenNV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống tên khách hàng !!");
            return;
        }     
       if(txtSdt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống số điện thoại !!");
            return;
        }
       String regexSdt ="(09|01[2|6|8|9])+([0-9]{8})";
       if(!txtSdt.getText().matches(regexSdt)){
           JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại định dạng sdt!!");
           return;
       }
       if(txtEmail_nv.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống email !!");
            return;
        }
      
       if(!txtEmail_nv.getText().matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra định dang email !!");
            return;
        }
        nhanVienModel.setTenNhanVien(txtTenNV.getText());
        nhanVienModel.setEmail(txtEmail_nv.getText());
        nhanVienModel.setSdt(txtSdt.getText());
        nhanVienModel.setNhiemVu(cbChucVu.getSelectedItem().toString());
        if (jDateChooser1.getDate() != null) {
            nhanVienModel.setNgaySinh(convertJavaDateToSqlDate(jDateChooser1.getDate()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ngày sinh");
            return;
        }

        SingletonBllUtil.getNhanVienBLLInstance().save(nhanVienModel);
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
            java.util.logging.Logger.getLogger(FormAddNewNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddNewNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddNewNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddNewNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddNewNV dialog = new FormAddNewNV(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel48;
    private keeptoo.KGradientPanel kGradientPanel49;
    private keeptoo.KGradientPanel kGradientPanel52;
    private keeptoo.KGradientPanel kGradientPanel53;
    private keeptoo.KGradientPanel kGradientPanel54;
    private keeptoo.KGradientPanel kGradientPanel55;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField tfDapAn24;
    private javax.swing.JTextField tfDapAn26;
    private javax.swing.JTextField tfDapAn27;
    private javax.swing.JTextField txtEmail_nv;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
