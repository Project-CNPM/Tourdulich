/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.impl.DiaDiemBLL;
import BLL.impl.TourBLL;
import DTO.DiaDiemModel;
import DTO.TourModel;
import Singleton.SingletonBllUtil;
import java.awt.Color;
import java.awt.Font;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class FormAddTour extends javax.swing.JDialog {

    /**
     * Creates new form FormAddTour
     */
    DefaultTableModel tableModel;
    DefaultTableModel tableModel1;
    DiaDiemBLL diaDiemBLL = new DiaDiemBLL();
    List<DiaDiemModel> listDiaDiem = new ArrayList<>();
    List<DiaDiemModel> listIdDiaDiemChon = new ArrayList<>();
    private int idUpdate = -1;

    public FormAddTour(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        showTable();

    }

    public FormAddTour(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        init();
        idUpdate = id;
        TourModel tourModel = SingletonBllUtil.getTourBLLInstance().findById(id);
        tfTenTour.setText(tourModel.getTenTour());
        cbLoaiDuLich.setSelectedItem(getTenLoaiDuLichById(tourModel.getLoai_id()));
        tfMoTa.setText(tourModel.getMoTa());
        listDiaDiem = diaDiemBLL.findByThanhPho(cbThanhPho.getSelectedItem().toString());
        List<DiaDiemModel> defaultDiaDiem = SingletonBllUtil.getTourBLLInstance().findDiaDiemOfTourById(id);
        listIdDiaDiemChon = defaultDiaDiem;
        tableModel1 = (DefaultTableModel) diaDiemTable1.getModel();
        tableModel = (DefaultTableModel) diaDiemTable.getModel();
        boolean flag = true;
        for (DiaDiemModel s : listDiaDiem) {
            flag = true;
            for (DiaDiemModel item : defaultDiaDiem) {
                if (item.getId() == s.getId()) {
                    flag = false;
                }
            }
            if (flag == true) {
                tableModel.addRow(new Object[]{
                    s.getId(), s.getTenDiaDiem()
                });
            }
        }
        for (DiaDiemModel s : defaultDiaDiem) {
            tableModel1.addRow(new Object[]{
                s.getId(), s.getTenDiaDiem()
            });

        }

    }

    private void init() {

        jScrollPane3.getViewport().setBackground(Color.WHITE);
        diaDiemTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jScrollPane5.getViewport().setBackground(Color.WHITE);
        diaDiemTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        diaDiemTable.getTableHeader().setOpaque(false);
        // ẩn cột ID đi
        diaDiemTable.getColumnModel().getColumn(0).setMaxWidth(0);
        diaDiemTable.getColumnModel().getColumn(0).setMinWidth(0);
        diaDiemTable.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        diaDiemTable.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        diaDiemTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        diaDiemTable1.getColumnModel().getColumn(0).setMinWidth(0);
        diaDiemTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        diaDiemTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        diaDiemTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        diaDiemTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // kết thúc ẩn cột ID
    }

    private void showTable() {    // cai dat cho bang 
        listDiaDiem = diaDiemBLL.findByThanhPho(cbThanhPho.getSelectedItem().toString());
        tableModel = (DefaultTableModel) diaDiemTable.getModel();
        boolean flag = true;
        if (listDiaDiem != null) {
            for (DiaDiemModel s : listDiaDiem) {
                flag = true;
                for (DiaDiemModel item : listIdDiaDiemChon) {
                    if (item.getId() == s.getId()) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    tableModel.addRow(new Object[]{
                        s.getId(), s.getTenDiaDiem()
                    });
                }
            }
        }

//            tableModel = (DefaultTableModel) diaDiemTable.getModel();
//            for (DiaDiemModel s : listDiaDiem) {
//                tableModel.addRow(new Object[]{
//                    s.getId(), s.getTenDiaDiem()
//                });
//            }
    }

    private String getTenLoaiDuLichById(int id) {
        if (id == 1) {
            return "Du lịch di động";
        } else if (id == 2) {
            return "Du lịch kết hợp nghề nghiệp";
        } else {
            return "Du lịch xã hội và gia đình";
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        tfTenTour = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfMoTa = new javax.swing.JTextArea();
        cbLoaiDuLich = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbThanhPho = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        diaDiemTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        diaDiemTable1 = new javax.swing.JTable();

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
        jLabel10.setText("Điền thông tin tour");
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
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 450, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(170, 170, 170));
        jLabel8.setText("Loại du lịch");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(170, 170, 170));
        jLabel9.setText("Mô tả");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTenTour.setBorder(null);
        tfTenTour.setOpaque(false);
        kGradientPanel6.add(tfTenTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 290, 20));

        tfMoTa.setColumns(20);
        tfMoTa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfMoTa.setLineWrap(true);
        tfMoTa.setRows(2);
        jScrollPane2.setViewportView(tfMoTa);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 360, 80));

        cbLoaiDuLich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Du lịch di động", "Du lịch kết hợp nghề nghiệp", "Du lịch xã hội và gia đình" }));
        cbLoaiDuLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiDuLichActionPerformed(evt);
            }
        });
        jPanel4.add(cbLoaiDuLich, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(170, 170, 170));
        jLabel14.setText("Tên Tour");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(170, 170, 170));
        jLabel11.setText("Chọn thành phố");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        cbThanhPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TP HCM", "Hà Nội", "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        cbThanhPho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbThanhPhoActionPerformed(evt);
            }
        });
        jPanel4.add(cbThanhPho, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 140, 20));

        diaDiemTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diaDiemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Địa điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        diaDiemTable.setColumnSelectionAllowed(true);
        diaDiemTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        diaDiemTable.setFillsViewportHeight(true);
        diaDiemTable.setGridColor(new java.awt.Color(255, 255, 255));
        diaDiemTable.setInheritsPopupMenu(true);
        diaDiemTable.setOpaque(false);
        diaDiemTable.setRowHeight(18);
        diaDiemTable.setSelectionForeground(new java.awt.Color(204, 0, 0));
        diaDiemTable.setShowHorizontalLines(false);
        diaDiemTable.setShowVerticalLines(false);
        jScrollPane3.setViewportView(diaDiemTable);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 150, 180));

        btnBack.setBackground(new java.awt.Color(0, 153, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<--");
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 50, 30));

        btnUp.setBackground(new java.awt.Color(0, 153, 204));
        btnUp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUp.setForeground(new java.awt.Color(255, 255, 255));
        btnUp.setText("UP");
        btnUp.setContentAreaFilled(false);
        btnUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUp.setOpaque(true);
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        jPanel4.add(btnUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 50, 30));

        btnNext.setBackground(new java.awt.Color(0, 153, 204));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("-->");
        btnNext.setContentAreaFilled(false);
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.setOpaque(true);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel4.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 50, 30));

        btnDown.setBackground(new java.awt.Color(0, 153, 204));
        btnDown.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDown.setForeground(new java.awt.Color(255, 255, 255));
        btnDown.setText("DOWN");
        btnDown.setContentAreaFilled(false);
        btnDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDown.setOpaque(true);
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });
        jPanel4.add(btnDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 80, 30));

        diaDiemTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diaDiemTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Các điểm được chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        diaDiemTable1.setColumnSelectionAllowed(true);
        diaDiemTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        diaDiemTable1.setFillsViewportHeight(true);
        diaDiemTable1.setGridColor(new java.awt.Color(255, 255, 255));
        diaDiemTable1.setInheritsPopupMenu(true);
        diaDiemTable1.setOpaque(false);
        diaDiemTable1.setRowHeight(18);
        diaDiemTable1.setSelectionForeground(new java.awt.Color(204, 0, 0));
        diaDiemTable1.setShowHorizontalLines(false);
        diaDiemTable1.setShowVerticalLines(false);
        jScrollPane5.setViewportView(diaDiemTable1);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 150, 180));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        TourModel model = new TourModel();
       if(tfTenTour.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống tên tour !!");
            return;
        }
       if(tfMoTa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống mô tả !!");
            return;
        } 
       
        model.setTenTour(tfTenTour.getText());
        model.setMoTa(tfMoTa.getText());
        model.setLoai_id(1);

        if (idUpdate == -1) {
            if (SingletonBllUtil.getTourBLLInstance().findByTenTour(tfTenTour.getText()) == null) {
                model = SingletonBllUtil.getTourBLLInstance().save(model);
            } else {
                JOptionPane.showMessageDialog(this, "Tên Tour đã tồn tại");
                return;
            }
        } else {
            model.setId(idUpdate);
            model = SingletonBllUtil.getTourBLLInstance().update(model);
            SingletonBllUtil.getDiaDiemBLLInstance().DeleteAllDiaDiemInTour(idUpdate);
        }

        List<Integer> idDd = new ArrayList<>();
        for (DiaDiemModel item : listIdDiaDiemChon) {
            idDd.add(item.getId());
        }
        SingletonBllUtil.getDiaDiemBLLInstance().AddDiaDiemToTour(idDd, model.getId());

        dispose();// 
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cbLoaiDuLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiDuLichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiDuLichActionPerformed

    private void cbThanhPhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbThanhPhoActionPerformed
        tableModel.setRowCount(0);
        showTable();
    }//GEN-LAST:event_cbThanhPhoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int id = (int) diaDiemTable1.getModel().getValueAt(diaDiemTable1.getSelectedRow(), 0);
        DiaDiemModel model = listIdDiaDiemChon.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
        listIdDiaDiemChon.remove(model);

        tableModel1.removeRow(diaDiemTable1.getSelectedRow());
        tableModel = (DefaultTableModel) diaDiemTable.getModel();
        if (model.getThanhPho().equals(cbThanhPho.getSelectedItem().toString())) {
            tableModel.addRow(new Object[]{
                model.getId(), model.getTenDiaDiem()
            });
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        int id = (int) diaDiemTable1.getModel().getValueAt(diaDiemTable1.getSelectedRow(), 0);
        DiaDiemModel model = listIdDiaDiemChon.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
        moveUpwards();

    }//GEN-LAST:event_btnUpActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int id = (int) diaDiemTable.getModel().getValueAt(diaDiemTable.getSelectedRow(), 0);
        DiaDiemModel model = listDiaDiem.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
        listIdDiaDiemChon.add(model);

        tableModel.removeRow(diaDiemTable.getSelectedRow());
        tableModel1 = (DefaultTableModel) diaDiemTable1.getModel();
        tableModel1.addRow(new Object[]{
            model.getId(), model.getTenDiaDiem()
        });


    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        moveDownwards();
    }//GEN-LAST:event_btnDownActionPerformed

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
            java.util.logging.Logger.getLogger(FormAddTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddTour dialog = new FormAddTour(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnUp;
    private javax.swing.JComboBox<String> cbLoaiDuLich;
    private javax.swing.JComboBox<String> cbThanhPho;
    private javax.swing.JTable diaDiemTable;
    private javax.swing.JTable diaDiemTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextArea tfMoTa;
    private javax.swing.JTextField tfTenTour;
    // End of variables declaration//GEN-END:variables
public void moveUpwards() {
        moveRowBy(-1);
    }

    public void moveDownwards() {
        moveRowBy(1);
    }

    private void moveRowBy(int by) {
        DefaultTableModel model = (DefaultTableModel) diaDiemTable1.getModel();
        int[] rows = diaDiemTable1.getSelectedRows();
        int destination = rows[0] + by;
        int rowCount = model.getRowCount();

        if (destination < 0 || destination >= rowCount) {
            return;
        }
        Collections.swap(listIdDiaDiemChon, rows[0], destination);
        model.moveRow(rows[0], rows[rows.length - 1], destination);
        diaDiemTable1.setRowSelectionInterval(rows[0] + by, rows[rows.length - 1] + by);
    }
}
