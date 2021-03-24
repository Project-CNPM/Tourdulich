/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.GiaTourModel;

import Singleton.SingletonBllUtil;

import javax.swing.JOptionPane;

/**
 *
 * @author hocgioinhatlop
 */
public class FormAddGiaTour extends javax.swing.JDialog {

    private int id;

    public FormAddGiaTour(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
     public FormAddGiaTour(java.awt.Frame parent, boolean modal,int id) {
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
        jLabel76 = new javax.swing.JLabel();
        kGradientPanel38 = new keeptoo.KGradientPanel();
        txtGiaTour = new javax.swing.JTextField();
        kGradientPanel39 = new keeptoo.KGradientPanel();
        txtGiaTour1 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        dateDenNgay = new com.toedter.calendar.JDateChooser();
        dateTuNgay = new com.toedter.calendar.JDateChooser();

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
        jLabel10.setText("Thêm giá tour");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 350, 40));

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

        kGradientPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 40));

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
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 330, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel76.setBackground(new java.awt.Color(0, 0, 0));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setText("Đến ngày");
        jPanel4.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        kGradientPanel38.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel38.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel38.setkFillBackground(false);
        kGradientPanel38.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGiaTour.setBorder(null);
        txtGiaTour.setOpaque(false);
        kGradientPanel38.add(txtGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 20));

        kGradientPanel39.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel39.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel39.setkFillBackground(false);
        kGradientPanel39.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGiaTour1.setBorder(null);
        txtGiaTour1.setOpaque(false);
        kGradientPanel39.add(txtGiaTour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 20));

        kGradientPanel38.add(kGradientPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 240, 20));

        jLabel84.setBackground(new java.awt.Color(0, 0, 0));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setText("Giá Tour");
        kGradientPanel38.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jPanel4.add(kGradientPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 240, 20));

        jLabel82.setBackground(new java.awt.Color(0, 0, 0));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Giá Tour");
        jPanel4.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabel83.setBackground(new java.awt.Color(0, 0, 0));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Từ ngày");
        jPanel4.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));
        jPanel4.add(dateDenNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 20));
        jPanel4.add(dateTuNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 20));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        GiaTourModel model = new GiaTourModel();
        String regex = "[0-9]+";
         if(txtGiaTour.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống gia tour !!");
            return;
        }

        if (dateDenNgay.getDate() != null && dateTuNgay.getDate() != null && dateDenNgay.getDate().after(dateTuNgay.getDate())) {
            model.setGiaTuNgay(convertJavaDateToSqlDate(dateTuNgay.getDate()));
            model.setGiaDenNgay(convertJavaDateToSqlDate(dateDenNgay.getDate()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thông tin giá từ ngày và giá đến ngày không hợp lệ !!!");
            return;
        }
        if(Double.parseDouble(txtGiaTour.getText())>0)
        model.setSoTien(Double.parseDouble(txtGiaTour.getText()));
        else {
            JOptionPane.showMessageDialog(this, "Số tiền không dược âm");
            return;
        }
        
        model.setTour_id(id);
        SingletonBllUtil.getGiaTourBLLInstance().save(model);
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
            java.util.logging.Logger.getLogger(FormAddGiaTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddGiaTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddGiaTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddGiaTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddGiaTour dialog = new FormAddGiaTour(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser dateDenNgay;
    private com.toedter.calendar.JDateChooser dateTuNgay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel38;
    private keeptoo.KGradientPanel kGradientPanel39;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField txtGiaTour;
    private javax.swing.JTextField txtGiaTour1;
    // End of variables declaration//GEN-END:variables
}
