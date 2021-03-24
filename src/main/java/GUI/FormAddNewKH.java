/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DTO.KhachHangModel;
import Singleton.SingletonBllUtil;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author hocgioinhatlop
 */
public class FormAddNewKH extends javax.swing.JDialog {

    private int id;

    public FormAddNewKH(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public FormAddNewKH(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        this.id=id;    
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
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        kGradientPanel30 = new keeptoo.KGradientPanel();
        txtEmailiKH = new javax.swing.JTextField();
        kGradientPanel31 = new keeptoo.KGradientPanel();
        tfDapAn15 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        kGradientPanel32 = new keeptoo.KGradientPanel();
        txtSdtKH = new javax.swing.JTextField();
        kGradientPanel33 = new keeptoo.KGradientPanel();
        tfDapAn16 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        kGradientPanel36 = new keeptoo.KGradientPanel();
        txtCMND = new javax.swing.JTextField();
        kGradientPanel37 = new keeptoo.KGradientPanel();
        tfDapAn18 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        dateNgaySinhKH = new com.toedter.calendar.JDateChooser();
        kGradientPanel64 = new keeptoo.KGradientPanel();
        txtTenKH = new javax.swing.JTextField();
        kGradientPanel65 = new keeptoo.KGradientPanel();
        tfDapAn30 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        kGradientPanel66 = new keeptoo.KGradientPanel();
        txtTenKH9 = new javax.swing.JTextField();
        kGradientPanel67 = new keeptoo.KGradientPanel();
        tfDapAn31 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        kGradientPanel68 = new keeptoo.KGradientPanel();
        txtTenKH10 = new javax.swing.JTextField();
        kGradientPanel69 = new keeptoo.KGradientPanel();
        tfDapAn32 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        kGradientPanel70 = new keeptoo.KGradientPanel();
        txtTenKH11 = new javax.swing.JTextField();
        kGradientPanel71 = new keeptoo.KGradientPanel();
        tfDapAn33 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        kGradientPanel72 = new keeptoo.KGradientPanel();
        txtTenKH12 = new javax.swing.JTextField();
        kGradientPanel73 = new keeptoo.KGradientPanel();
        tfDapAn34 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        kGradientPanel74 = new keeptoo.KGradientPanel();
        txtTenKH13 = new javax.swing.JTextField();
        kGradientPanel75 = new keeptoo.KGradientPanel();
        tfDapAn35 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        kGradientPanel76 = new keeptoo.KGradientPanel();
        txtTenKH14 = new javax.swing.JTextField();
        kGradientPanel77 = new keeptoo.KGradientPanel();
        tfDapAn36 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        kGradientPanel78 = new keeptoo.KGradientPanel();
        txtTenKH15 = new javax.swing.JTextField();
        kGradientPanel79 = new keeptoo.KGradientPanel();
        tfDapAn37 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();

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
        jLabel10.setText("Thêm mới khách hàng");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 540, 40));

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
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 450, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Ngày sinh");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Email");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        kGradientPanel30.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel30.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel30.setkFillBackground(false);
        kGradientPanel30.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmailiKH.setBorder(null);
        txtEmailiKH.setOpaque(false);
        kGradientPanel30.add(txtEmailiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel31.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel31.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel31.setkFillBackground(false);
        kGradientPanel31.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn15.setBorder(null);
        tfDapAn15.setOpaque(false);
        kGradientPanel31.add(tfDapAn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel30.add(kGradientPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 270, 20));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Tên địa điểm:");
        kGradientPanel30.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        jPanel4.add(kGradientPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 270, 20));

        kGradientPanel32.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel32.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel32.setkFillBackground(false);
        kGradientPanel32.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSdtKH.setBorder(null);
        txtSdtKH.setOpaque(false);
        kGradientPanel32.add(txtSdtKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel33.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel33.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel33.setkFillBackground(false);
        kGradientPanel33.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn16.setBorder(null);
        tfDapAn16.setOpaque(false);
        kGradientPanel33.add(tfDapAn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel32.add(kGradientPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Tên địa điểm:");
        kGradientPanel32.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jPanel4.add(kGradientPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, 20));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Sdt");
        jPanel4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("CMND");
        jPanel4.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        kGradientPanel36.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel36.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel36.setkFillBackground(false);
        kGradientPanel36.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCMND.setBorder(null);
        txtCMND.setOpaque(false);
        kGradientPanel36.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel37.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel37.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel37.setkFillBackground(false);
        kGradientPanel37.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn18.setBorder(null);
        tfDapAn18.setOpaque(false);
        kGradientPanel37.add(tfDapAn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel36.add(kGradientPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Tên địa điểm:");
        kGradientPanel36.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jPanel4.add(kGradientPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 270, 20));
        jPanel4.add(dateNgaySinhKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 230, -1));

        kGradientPanel64.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel64.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel64.setkFillBackground(false);
        kGradientPanel64.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH.setBorder(null);
        txtTenKH.setOpaque(false);
        kGradientPanel64.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel65.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel65.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel65.setkFillBackground(false);
        kGradientPanel65.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn30.setBorder(null);
        tfDapAn30.setOpaque(false);
        kGradientPanel65.add(tfDapAn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel64.add(kGradientPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setText("Tên địa điểm:");
        kGradientPanel64.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel66.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel66.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel66.setkFillBackground(false);
        kGradientPanel66.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH9.setBorder(null);
        txtTenKH9.setOpaque(false);
        kGradientPanel66.add(txtTenKH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel67.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel67.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel67.setkFillBackground(false);
        kGradientPanel67.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn31.setBorder(null);
        tfDapAn31.setOpaque(false);
        kGradientPanel67.add(tfDapAn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel66.add(kGradientPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setText("Tên địa điểm:");
        kGradientPanel66.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel64.add(kGradientPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Tên khách");
        kGradientPanel64.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel68.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel68.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel68.setkFillBackground(false);
        kGradientPanel68.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH10.setBorder(null);
        txtTenKH10.setOpaque(false);
        kGradientPanel68.add(txtTenKH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel69.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel69.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel69.setkFillBackground(false);
        kGradientPanel69.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn32.setBorder(null);
        tfDapAn32.setOpaque(false);
        kGradientPanel69.add(tfDapAn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel68.add(kGradientPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Tên địa điểm:");
        kGradientPanel68.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel70.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel70.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel70.setkFillBackground(false);
        kGradientPanel70.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH11.setBorder(null);
        txtTenKH11.setOpaque(false);
        kGradientPanel70.add(txtTenKH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel71.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel71.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel71.setkFillBackground(false);
        kGradientPanel71.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn33.setBorder(null);
        tfDapAn33.setOpaque(false);
        kGradientPanel71.add(tfDapAn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel70.add(kGradientPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("Tên địa điểm:");
        kGradientPanel70.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel68.add(kGradientPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Tên khách");
        kGradientPanel68.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel64.add(kGradientPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 230, 20));

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Tên khách");
        kGradientPanel64.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        kGradientPanel72.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel72.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel72.setkFillBackground(false);
        kGradientPanel72.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH12.setBorder(null);
        txtTenKH12.setOpaque(false);
        kGradientPanel72.add(txtTenKH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel73.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel73.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel73.setkFillBackground(false);
        kGradientPanel73.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn34.setBorder(null);
        tfDapAn34.setOpaque(false);
        kGradientPanel73.add(tfDapAn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel72.add(kGradientPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Tên địa điểm:");
        kGradientPanel72.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel74.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel74.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel74.setkFillBackground(false);
        kGradientPanel74.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH13.setBorder(null);
        txtTenKH13.setOpaque(false);
        kGradientPanel74.add(txtTenKH13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel75.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel75.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel75.setkFillBackground(false);
        kGradientPanel75.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn35.setBorder(null);
        tfDapAn35.setOpaque(false);
        kGradientPanel75.add(tfDapAn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel74.add(kGradientPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Tên địa điểm:");
        kGradientPanel74.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel72.add(kGradientPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Tên khách");
        kGradientPanel72.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel76.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel76.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel76.setkFillBackground(false);
        kGradientPanel76.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH14.setBorder(null);
        txtTenKH14.setOpaque(false);
        kGradientPanel76.add(txtTenKH14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel77.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel77.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel77.setkFillBackground(false);
        kGradientPanel77.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn36.setBorder(null);
        tfDapAn36.setOpaque(false);
        kGradientPanel77.add(tfDapAn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel76.add(kGradientPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("Tên địa điểm:");
        kGradientPanel76.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel78.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel78.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel78.setkFillBackground(false);
        kGradientPanel78.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH15.setBorder(null);
        txtTenKH15.setOpaque(false);
        kGradientPanel78.add(txtTenKH15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel79.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel79.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel79.setkFillBackground(false);
        kGradientPanel79.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn37.setBorder(null);
        tfDapAn37.setOpaque(false);
        kGradientPanel79.add(tfDapAn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel78.add(kGradientPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("Tên địa điểm:");
        kGradientPanel78.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel76.add(kGradientPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setText("Tên khách");
        kGradientPanel76.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel72.add(kGradientPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 230, 20));

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel124.setText("Tên khách");
        kGradientPanel72.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        kGradientPanel64.add(kGradientPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel125.setText("Tên khách");
        kGradientPanel64.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jPanel4.add(kGradientPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, 20));

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Tên khách");
        jPanel4.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 550, 350));

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
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       
        
        KhachHangModel model = new KhachHangModel();
        
       if(txtTenKH.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống tên khách hàng !!");
            return;
        }
       if(txtCMND.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống CMND !!");
            return;
        }
       if(txtSdtKH.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống số điện thoại !!");
            return;
        }
       String regexSdt ="(09|01[2|6|8|9])+([0-9]{8})";
       if(!txtSdtKH.getText().matches(regexSdt)){
           JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại định dạng sdt!!");
           return;
       }
       if(txtEmailiKH.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống email !!");
            return;
        }
      
       if(!txtEmailiKH.getText().matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra định dang email !!");
            return;
        }
        model.setTenKH(txtTenKH.getText());
        model.setCmnd(txtCMND.getText());
        model.setSdt(txtSdtKH.getText());
        model.setEmail(txtEmailiKH.getText());
        String regex = "[0-9]+";
        if (dateNgaySinhKH.getDate() != null) {
            model.setNgaySinh(convertJavaDateToSqlDate(dateNgaySinhKH.getDate()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ngày sinh");
            return;
        }
        
        SingletonBllUtil.getKhachHangBLLInstance().save(model);
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
            java.util.logging.Logger.getLogger(FormAddNewKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddNewKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddNewKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddNewKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddNewKH dialog = new FormAddNewKH(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser dateNgaySinhKH;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel30;
    private keeptoo.KGradientPanel kGradientPanel31;
    private keeptoo.KGradientPanel kGradientPanel32;
    private keeptoo.KGradientPanel kGradientPanel33;
    private keeptoo.KGradientPanel kGradientPanel36;
    private keeptoo.KGradientPanel kGradientPanel37;
    private keeptoo.KGradientPanel kGradientPanel64;
    private keeptoo.KGradientPanel kGradientPanel65;
    private keeptoo.KGradientPanel kGradientPanel66;
    private keeptoo.KGradientPanel kGradientPanel67;
    private keeptoo.KGradientPanel kGradientPanel68;
    private keeptoo.KGradientPanel kGradientPanel69;
    private keeptoo.KGradientPanel kGradientPanel70;
    private keeptoo.KGradientPanel kGradientPanel71;
    private keeptoo.KGradientPanel kGradientPanel72;
    private keeptoo.KGradientPanel kGradientPanel73;
    private keeptoo.KGradientPanel kGradientPanel74;
    private keeptoo.KGradientPanel kGradientPanel75;
    private keeptoo.KGradientPanel kGradientPanel76;
    private keeptoo.KGradientPanel kGradientPanel77;
    private keeptoo.KGradientPanel kGradientPanel78;
    private keeptoo.KGradientPanel kGradientPanel79;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField tfDapAn15;
    private javax.swing.JTextField tfDapAn16;
    private javax.swing.JTextField tfDapAn18;
    private javax.swing.JTextField tfDapAn30;
    private javax.swing.JTextField tfDapAn31;
    private javax.swing.JTextField tfDapAn32;
    private javax.swing.JTextField tfDapAn33;
    private javax.swing.JTextField tfDapAn34;
    private javax.swing.JTextField tfDapAn35;
    private javax.swing.JTextField tfDapAn36;
    private javax.swing.JTextField tfDapAn37;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmailiKH;
    private javax.swing.JTextField txtSdtKH;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenKH10;
    private javax.swing.JTextField txtTenKH11;
    private javax.swing.JTextField txtTenKH12;
    private javax.swing.JTextField txtTenKH13;
    private javax.swing.JTextField txtTenKH14;
    private javax.swing.JTextField txtTenKH15;
    private javax.swing.JTextField txtTenKH9;
    // End of variables declaration//GEN-END:variables
}
