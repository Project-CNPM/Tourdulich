package GUI;

import DTO.ChiPhiModel;
import DTO.DiaDiemModel;
import DTO.DoanDuLichModel;
import DTO.GiaTourModel;
import DTO.KhachHangModel;
import DTO.NguoiDiModel;
import DTO.NhanVienModel;
import DTO.TourModel;
import Singleton.SingletonBllUtil;
import Table.DiaDiemTable;
import Table.DoanTable;
import Table.GiaTourTable;
import Table.KhachHangTable;
import Table.NhanVienTable;
import Table.ThongKeChiTietTable;
import Table.ThongKeTable;
import Table.TourTable;
import Table.TourTableMini;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    TourTable tourTable = new TourTable();
    TourTableMini tourTableMini = new TourTableMini();
    DiaDiemTable diaDiemTable = new DiaDiemTable();
    GiaTourTable giaTourTable = new GiaTourTable();
    NhanVienTable nhanVienTable = new NhanVienTable();
    ThongKeTable thongKeTable = new ThongKeTable();
    ThongKeChiTietTable thongKeCTTable = new ThongKeChiTietTable();
    DoanTable doanTable = new DoanTable();
    DefaultTableModel nhanVienDaChon;
    DefaultTableModel khachHangDaChon;
    KhachHangTable khachHangTable = new KhachHangTable();
    private List<TourModel> tourData = new ArrayList<>();
    private List<DiaDiemModel> diaDiem = new ArrayList<>();
    private List<NhanVienModel> nhanVienList = new ArrayList<>();
    private List<GiaTourModel> giaTourList = new ArrayList<>();
    private List<DoanDuLichModel> doanList = new ArrayList<>();
    private List<KhachHangModel> khachHangList = new ArrayList<>();
    private List<NhanVienModel> nhanVienDaChonList = new ArrayList<>();
    private List<KhachHangModel> khachHangDaChonList = new ArrayList<>();

    int xMouse;
    int yMouse;

    public Menu() {

        initComponents();
        btnDash.setBackground(new java.awt.Color(44, 59, 66));
        pnlQLTour.setVisible(true);
        setInfor();
        setIcon();
       // initCbChonTour();
        initPage1QuanLyTour();
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourData.forEach((item) -> {
            cbChonTourTK.addItem(item.getTenTour());
        });

        // paint_table();
        // cod.preencherTabela("SELECT * FROM person ORDER BY id", table);
    }

    private void setInfor() {
        // txTen.setText(SessionUser.getTenDangNhap());
    }

    private void initPage1QuanLyTour() {
        paint_table(TourTable1);
        paint_table(TourTable);
        diaDiem = new ArrayList<DiaDiemModel>();
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) diaDiem, TourTable);
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourTable.showTable((ArrayList<TourModel>) tourData, TourTable1);
    }

    private void initPage2QuanLyDD() {
        paint_table(DiaDiemTable2);
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) SingletonBllUtil.getDiaDiemBLLInstance().findAll(), DiaDiemTable2);
    }

    private void initPage6QuanLyNV() {
        paint_table(NhanVienTable);
        nhanVienList = SingletonBllUtil.getNhanVienBLLInstance().findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);
    }

    private void initPage4DSGiaTour() {
        paint_table(GiaTourTable);
        cbListTour.removeAllItems();
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        for (TourModel item : tourData) {
            cbListTour.addItem(item.getTenTour());
        }
    }

    private void initPage3QuanLyDoan() {
        paint_table(DoanTable);
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        doanTable.showTable((ArrayList<DoanDuLichModel>) doanList, DoanTable);
    }

    private void initPageQuanLyKH() {
        paint_table(KhachHangTable);
        khachHangList = SingletonBllUtil.getKhachHangBLLInstance().findAll();
        khachHangTable.showTable((ArrayList<KhachHangModel>) khachHangList, KhachHangTable);
    }

    public void initPageLapDSDoan() {
        paint_table(KhachHangDaChonTable);
        paint_table(NhanVienDaChonTable);

    }

    public void initPageThongKe() {
        paint_table(ThongKeTable);
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        thongKeTable.showTable((ArrayList<TourModel>) tourData, ThongKeTable);

    }

    public void initCbChonTour() {
        
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourData.forEach((item) -> {
            cbChonTour.addItem(item.getTenTour());
        });

    }

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTest = new javax.swing.JPanel();
        TestVar = new javax.swing.JLabel();
        btnDash = new javax.swing.JPanel();
        btnDashBoard1 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JLabel();
        btnTest1 = new javax.swing.JPanel();
        btnShowKH = new javax.swing.JPanel();
        TestVar10 = new javax.swing.JLabel();
        btnDoan = new javax.swing.JPanel();
        TestVar2 = new javax.swing.JLabel();
        btnTest6 = new javax.swing.JPanel();
        TestVar6 = new javax.swing.JLabel();
        btnPage5 = new javax.swing.JPanel();
        btnPageNhanVien = new javax.swing.JLabel();
        btnDSGiaTour = new javax.swing.JPanel();
        TestVar3 = new javax.swing.JLabel();
        btnLapDSDoan = new javax.swing.JPanel();
        btnLapDoan = new javax.swing.JLabel();
        btnPage6 = new javax.swing.JPanel();
        btnPageThongKe = new javax.swing.JLabel();
        btnQuit1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pnlQLTour = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TourTable = new javax.swing.JTable();
        txtSearchTour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TourTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnSearchTour = new javax.swing.JButton();
        pnlDiaDiem = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtSearchDd = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        DiaDiemTable2 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        txtDiaDiem1 = new javax.swing.JTextField();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        tfDapAn5 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtMoTa1 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        kGradientPanel18 = new keeptoo.KGradientPanel();
        txtId = new javax.swing.JTextField();
        kGradientPanel19 = new keeptoo.KGradientPanel();
        tfDapAn9 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnSaveDiaDiem = new javax.swing.JButton();
        btnDeleteDiaDiem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnAddDiaDiem = new javax.swing.JButton();
        btnSearchDd = new javax.swing.JButton();
        cbChonTP = new javax.swing.JComboBox<>();
        pnl3QLDoan = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtSearchDoan = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        DoanTable = new javax.swing.JTable();
        btnXemDsKH = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        btnDeleteDoan = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        btnUpdateDoan = new javax.swing.JButton();
        btnSearchDoan = new javax.swing.JButton();
        pnl4QLKhachHang = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtSearchKH = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        KhachHangTable = new javax.swing.JTable();
        btnResetKH = new javax.swing.JButton();
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
        jLabel60 = new javax.swing.JLabel();
        kGradientPanel34 = new keeptoo.KGradientPanel();
        txtIdKH = new javax.swing.JTextField();
        kGradientPanel35 = new keeptoo.KGradientPanel();
        tfDapAn17 = new javax.swing.JTextField();
        kGradientPanel42 = new keeptoo.KGradientPanel();
        txtTenKH1 = new javax.swing.JTextField();
        kGradientPanel43 = new keeptoo.KGradientPanel();
        tfDapAn19 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        kGradientPanel44 = new keeptoo.KGradientPanel();
        txtTenKH2 = new javax.swing.JTextField();
        kGradientPanel45 = new keeptoo.KGradientPanel();
        tfDapAn20 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        kGradientPanel46 = new keeptoo.KGradientPanel();
        txtTenKH3 = new javax.swing.JTextField();
        kGradientPanel47 = new keeptoo.KGradientPanel();
        tfDapAn21 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        kGradientPanel56 = new keeptoo.KGradientPanel();
        txtTenKH4 = new javax.swing.JTextField();
        kGradientPanel57 = new keeptoo.KGradientPanel();
        tfDapAn22 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        kGradientPanel58 = new keeptoo.KGradientPanel();
        txtTenKH5 = new javax.swing.JTextField();
        kGradientPanel59 = new keeptoo.KGradientPanel();
        tfDapAn23 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        kGradientPanel60 = new keeptoo.KGradientPanel();
        txtTenKH6 = new javax.swing.JTextField();
        kGradientPanel61 = new keeptoo.KGradientPanel();
        tfDapAn28 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        kGradientPanel62 = new keeptoo.KGradientPanel();
        txtTenKH7 = new javax.swing.JTextField();
        kGradientPanel63 = new keeptoo.KGradientPanel();
        tfDapAn29 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        btnSaveKH = new javax.swing.JButton();
        btnDeleteKH = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
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
        btnAddKH = new javax.swing.JButton();
        btnSearchKH = new javax.swing.JButton();
        pnl5QLNhanVien = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        txtSearchNV = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        NhanVienTable = new javax.swing.JTable();
        jLabel86 = new javax.swing.JLabel();
        kGradientPanel48 = new keeptoo.KGradientPanel();
        txtEmail_nv = new javax.swing.JTextField();
        kGradientPanel49 = new keeptoo.KGradientPanel();
        tfDapAn24 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        kGradientPanel50 = new keeptoo.KGradientPanel();
        txtMaNV = new javax.swing.JTextField();
        kGradientPanel51 = new keeptoo.KGradientPanel();
        tfDapAn25 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        btnSaveNhanVien = new javax.swing.JButton();
        btnDeleteDoan3 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        btnResetDoan4 = new javax.swing.JButton();
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
        btnAddNV = new javax.swing.JButton();
        btnSearchNV = new javax.swing.JButton();
        pnlDSGiaTour = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        GiaTourTable = new javax.swing.JTable();
        btnXemGiaTour = new javax.swing.JButton();
        btnXoaGiaTour = new javax.swing.JButton();
        btnResetGiaTour = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        cbListTour = new javax.swing.JComboBox<>();
        btnSaveGiaTour = new javax.swing.JButton();
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
        kGradientPanel40 = new keeptoo.KGradientPanel();
        txtIdGiaTour = new javax.swing.JTextField();
        kGradientPanel41 = new keeptoo.KGradientPanel();
        txtGiaTour3 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        btnAddGiaTour = new javax.swing.JButton();
        pnlLapDSDoan = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        cbChonTour = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        cbChonTenDoan = new javax.swing.JComboBox<>();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        btnSelectKH = new javax.swing.JButton();
        btnSelectNV = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        NhanVienDaChonTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        KhachHangDaChonTable = new javax.swing.JTable();
        btnDSDoan = new javax.swing.JButton();
        btnXoaKH = new javax.swing.JButton();
        btnXoaNV1 = new javax.swing.JButton();
        pnlThongKe = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ThongKeTable = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        btnXemCTThongKe = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        txtSearchTourTK = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        pnlThongKeChiTiet = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ThongKeChiTietTable = new javax.swing.JTable();
        jLabel132 = new javax.swing.JLabel();
        btnXemChiPhi = new javax.swing.JButton();
        jLabel133 = new javax.swing.JLabel();
        txtLai = new javax.swing.JLabel();
        cbChonTourTK = new javax.swing.JComboBox<>();
        btnBackTK = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        txtTongDoanhThu1 = new javax.swing.JLabel();
        txtTongChiPhi1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jAbout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(35, 45, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_traveler_120px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 230, 100));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        btnTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestMouseClicked(evt);
            }
        });

        TestVar.setBackground(new java.awt.Color(34, 45, 49));
        TestVar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar.setForeground(new java.awt.Color(255, 255, 255));
        TestVar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_place_marker_24px_1.png"))); // NOI18N
        TestVar.setText("Quản lý địa điểm");
        TestVar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnTestLayout = new javax.swing.GroupLayout(btnTest);
        btnTest.setLayout(btnTestLayout);
        btnTestLayout.setHorizontalGroup(
            btnTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTestLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTestLayout.setVerticalGroup(
            btnTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTestLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 30));

        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        btnDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashMouseClicked(evt);
            }
        });

        btnDashBoard1.setBackground(new java.awt.Color(34, 45, 49));
        btnDashBoard1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnDashBoard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashBoard1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashBoard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_airplane_take_off_24px.png"))); // NOI18N
        btnDashBoard1.setText("Quản lý tour");
        btnDashBoard1.setToolTipText("");
        btnDashBoard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashBoard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashBoard1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDashLayout = new javax.swing.GroupLayout(btnDash);
        btnDash.setLayout(btnDashLayout);
        btnDashLayout.setHorizontalGroup(
            btnDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDashLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(btnDashBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDashLayout.setVerticalGroup(
            btnDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDashLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDashBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 30));

        btnQuit.setBackground(new java.awt.Color(34, 45, 49));
        btnQuit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_transaction_24px.png"))); // NOI18N
        btnQuit.setText("Quản lý chi phí");
        btnQuit.setToolTipText("");
        btnQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        jPanel2.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 460, 220, 30));

        btnTest1.setBackground(new java.awt.Color(34, 45, 49));
        btnTest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTest1MouseClicked(evt);
            }
        });

        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        btnShowKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowKHMouseClicked(evt);
            }
        });

        TestVar10.setBackground(new java.awt.Color(34, 45, 49));
        TestVar10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar10.setForeground(new java.awt.Color(255, 255, 255));
        TestVar10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_customer_24px.png"))); // NOI18N
        TestVar10.setText("Quản lý khách hàng");
        TestVar10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVar10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnShowKHLayout = new javax.swing.GroupLayout(btnShowKH);
        btnShowKH.setLayout(btnShowKHLayout);
        btnShowKHLayout.setHorizontalGroup(
            btnShowKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnShowKHLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnShowKHLayout.setVerticalGroup(
            btnShowKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnShowKHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout btnTest1Layout = new javax.swing.GroupLayout(btnTest1);
        btnTest1.setLayout(btnTest1Layout);
        btnTest1Layout.setHorizontalGroup(
            btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTest1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnShowKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnTest1Layout.setVerticalGroup(
            btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnTest1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnShowKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(btnTest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 30));

        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        btnDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoanMouseClicked(evt);
            }
        });

        TestVar2.setBackground(new java.awt.Color(34, 45, 49));
        TestVar2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar2.setForeground(new java.awt.Color(255, 255, 255));
        TestVar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_group_24px.png"))); // NOI18N
        TestVar2.setText("Quản lý đoàn");
        TestVar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDoanLayout = new javax.swing.GroupLayout(btnDoan);
        btnDoan.setLayout(btnDoanLayout);
        btnDoanLayout.setHorizontalGroup(
            btnDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDoanLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDoanLayout.setVerticalGroup(
            btnDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 30));

        btnTest6.setBackground(new java.awt.Color(34, 45, 49));
        btnTest6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTest6MouseClicked(evt);
            }
        });

        TestVar6.setBackground(new java.awt.Color(34, 45, 49));
        TestVar6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar6.setForeground(new java.awt.Color(255, 255, 255));
        TestVar6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar6.setText("Đăng nhập lại");
        TestVar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVar6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnTest6Layout = new javax.swing.GroupLayout(btnTest6);
        btnTest6.setLayout(btnTest6Layout);
        btnTest6Layout.setHorizontalGroup(
            btnTest6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTest6Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTest6Layout.setVerticalGroup(
            btnTest6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTest6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnTest6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 30));

        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        btnPage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPage5MouseClicked(evt);
            }
        });

        btnPageNhanVien.setBackground(new java.awt.Color(34, 45, 49));
        btnPageNhanVien.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnPageNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnPageNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPageNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_customer_support_24px.png"))); // NOI18N
        btnPageNhanVien.setText("Quản lý nhân viên");
        btnPageNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPageNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPageNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPage5Layout = new javax.swing.GroupLayout(btnPage5);
        btnPage5.setLayout(btnPage5Layout);
        btnPage5Layout.setHorizontalGroup(
            btnPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPage5Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(btnPageNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnPage5Layout.setVerticalGroup(
            btnPage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPage5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPageNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnPage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 240, 30));

        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        btnDSGiaTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDSGiaTourMouseClicked(evt);
            }
        });

        TestVar3.setBackground(new java.awt.Color(34, 45, 49));
        TestVar3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar3.setForeground(new java.awt.Color(255, 255, 255));
        TestVar3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_cheap_2_24px.png"))); // NOI18N
        TestVar3.setText("Danh sách giá tour");
        TestVar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDSGiaTourLayout = new javax.swing.GroupLayout(btnDSGiaTour);
        btnDSGiaTour.setLayout(btnDSGiaTourLayout);
        btnDSGiaTourLayout.setHorizontalGroup(
            btnDSGiaTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDSGiaTourLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDSGiaTourLayout.setVerticalGroup(
            btnDSGiaTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDSGiaTourLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnDSGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 240, 30));

        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        btnLapDSDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLapDSDoanMouseClicked(evt);
            }
        });

        btnLapDoan.setBackground(new java.awt.Color(34, 45, 49));
        btnLapDoan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnLapDoan.setForeground(new java.awt.Color(255, 255, 255));
        btnLapDoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLapDoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_group_of_projects_24px.png"))); // NOI18N
        btnLapDoan.setText("Lập danh sách đoàn");
        btnLapDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLapDoanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLapDSDoanLayout = new javax.swing.GroupLayout(btnLapDSDoan);
        btnLapDSDoan.setLayout(btnLapDSDoanLayout);
        btnLapDSDoanLayout.setHorizontalGroup(
            btnLapDSDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLapDSDoanLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(btnLapDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnLapDSDoanLayout.setVerticalGroup(
            btnLapDSDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLapDSDoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLapDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnLapDSDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        btnPage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPage6MouseClicked(evt);
            }
        });

        btnPageThongKe.setBackground(new java.awt.Color(34, 45, 49));
        btnPageThongKe.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnPageThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnPageThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPageThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_statistics_24px_1.png"))); // NOI18N
        btnPageThongKe.setText("Thống kê doanh thu");
        btnPageThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPageThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPageThongKeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPage6Layout = new javax.swing.GroupLayout(btnPage6);
        btnPage6.setLayout(btnPage6Layout);
        btnPage6Layout.setHorizontalGroup(
            btnPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPage6Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(btnPageThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnPage6Layout.setVerticalGroup(
            btnPage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPage6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPageThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnPage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 240, 30));

        btnQuit1.setBackground(new java.awt.Color(34, 45, 49));
        btnQuit1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnQuit1.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuit1.setText("Thoát");
        btnQuit1.setToolTipText("");
        btnQuit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuit1MouseClicked(evt);
            }
        });
        jPanel2.add(btnQuit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 214, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 700));

        jPanel7.setLayout(new java.awt.CardLayout());

        pnlQLTour.setBackground(new java.awt.Color(236, 239, 244));
        pnlQLTour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Version 1.0");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlQLTour.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel11.setText("Dashboard");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlQLTour.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel5.setBackground(new java.awt.Color(210, 214, 223));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel12.setText("Home >");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_airplane_take_off_24px.png"))); // NOI18N
        jLabel13.setText("Quản lý tour");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 680, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        pnlQLTour.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlQLTour.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        TourTable.setModel(new javax.swing.table.DefaultTableModel(
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
        TourTable.setFillsViewportHeight(true);
        TourTable.setShowHorizontalLines(false);
        TourTable.setShowVerticalLines(false);
        TourTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TourTableFocusGained(evt);
            }
        });
        TourTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TourTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TourTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TourTable);

        pnlQLTour.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 900, 190));

        txtSearchTour.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTourActionPerformed(evt);
            }
        });
        pnlQLTour.add(txtSearchTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tìm kiếm tour");
        pnlQLTour.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 30));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        TourTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        TourTable1.setFillsViewportHeight(true);
        TourTable1.setShowHorizontalLines(false);
        TourTable1.setShowVerticalLines(false);
        TourTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TourTable1FocusGained(evt);
            }
        });
        TourTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TourTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TourTable1MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(TourTable1);

        pnlQLTour.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 900, 280));

        jButton5.setBackground(new java.awt.Color(39, 62, 174));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Thêm Tour");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlQLTour.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 140, 30));

        jButton6.setBackground(new java.awt.Color(39, 62, 174));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Xóa Tour");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnlQLTour.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 140, 30));

        jButton7.setBackground(new java.awt.Color(39, 62, 174));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sửa Tour");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlQLTour.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 140, 30));

        btnSearchTour.setBackground(new java.awt.Color(200, 193, 92));
        btnSearchTour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchTour.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchTour.setText("Tìm");
        btnSearchTour.setContentAreaFilled(false);
        btnSearchTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchTour.setOpaque(true);
        btnSearchTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTourActionPerformed(evt);
            }
        });
        pnlQLTour.add(btnSearchTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 110, 30));

        jPanel7.add(pnlQLTour, "card3");

        pnlDiaDiem.setBackground(new java.awt.Color(236, 239, 244));
        pnlDiaDiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Version 1.0");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDiaDiem.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel22.setText("Dashboard");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDiaDiem.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel9.setBackground(new java.awt.Color(210, 214, 223));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel23.setText("Home >");

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_place_marker_24px_1.png"))); // NOI18N
        jLabel24.setText("Quản lý địa điểm");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 691, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        pnlDiaDiem.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlDiaDiem.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        txtSearchDd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchDd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchDd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDdActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(txtSearchDd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 300, 30));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        DiaDiemTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        DiaDiemTable2.setFillsViewportHeight(true);
        DiaDiemTable2.setShowHorizontalLines(false);
        DiaDiemTable2.setShowVerticalLines(false);
        DiaDiemTable2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DiaDiemTable2FocusGained(evt);
            }
        });
        DiaDiemTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiaDiemTable2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DiaDiemTable2MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(DiaDiemTable2);

        pnlDiaDiem.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 860, 300));

        btnReset.setBackground(new java.awt.Color(39, 62, 174));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setContentAreaFilled(false);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setOpaque(true);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 140, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Tên địa điểm:");
        pnlDiaDiem.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        kGradientPanel12.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel12.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel12.setkFillBackground(false);
        kGradientPanel12.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDiaDiem1.setBorder(null);
        txtDiaDiem1.setOpaque(false);
        kGradientPanel12.add(txtDiaDiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel13.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel13.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel13.setkFillBackground(false);
        kGradientPanel13.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn5.setBorder(null);
        tfDapAn5.setOpaque(false);
        kGradientPanel13.add(tfDapAn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel12.add(kGradientPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Tên địa điểm:");
        kGradientPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnlDiaDiem.add(kGradientPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 270, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Thành phố");
        pnlDiaDiem.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Mô tả");
        pnlDiaDiem.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 60, 20));

        txtMoTa1.setColumns(20);
        txtMoTa1.setRows(10);
        txtMoTa1.setWrapStyleWord(true);
        txtMoTa1.setAutoscrolls(false);
        jScrollPane6.setViewportView(txtMoTa1);

        pnlDiaDiem.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 410, 70));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlDiaDiem.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        kGradientPanel18.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel18.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel18.setkFillBackground(false);
        kGradientPanel18.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setEditable(false);
        txtId.setBorder(null);
        txtId.setOpaque(false);
        kGradientPanel18.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 20));

        kGradientPanel19.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel19.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel19.setkFillBackground(false);
        kGradientPanel19.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn9.setBorder(null);
        tfDapAn9.setOpaque(false);
        kGradientPanel19.add(tfDapAn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel18.add(kGradientPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Tên địa điểm:");
        kGradientPanel18.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnlDiaDiem.add(kGradientPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 130, 20));

        btnSaveDiaDiem.setBackground(new java.awt.Color(39, 62, 174));
        btnSaveDiaDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveDiaDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveDiaDiem.setText("Lưu");
        btnSaveDiaDiem.setContentAreaFilled(false);
        btnSaveDiaDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveDiaDiem.setOpaque(true);
        btnSaveDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDiaDiemActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(btnSaveDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 140, 30));

        btnDeleteDiaDiem.setBackground(new java.awt.Color(39, 62, 174));
        btnDeleteDiaDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteDiaDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDiaDiem.setText("Xóa");
        btnDeleteDiaDiem.setContentAreaFilled(false);
        btnDeleteDiaDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteDiaDiem.setOpaque(true);
        btnDeleteDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDiaDiemActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(btnDeleteDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tìm kiếm địa điểm");
        pnlDiaDiem.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Id");
        pnlDiaDiem.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        btnAddDiaDiem.setBackground(new java.awt.Color(39, 62, 174));
        btnAddDiaDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDiaDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDiaDiem.setText("Thêm mới");
        btnAddDiaDiem.setContentAreaFilled(false);
        btnAddDiaDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddDiaDiem.setOpaque(true);
        btnAddDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiaDiemActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(btnAddDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 140, 30));

        btnSearchDd.setBackground(new java.awt.Color(200, 193, 92));
        btnSearchDd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchDd.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDd.setText("Tìm");
        btnSearchDd.setContentAreaFilled(false);
        btnSearchDd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchDd.setOpaque(true);
        btnSearchDd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDdActionPerformed(evt);
            }
        });
        pnlDiaDiem.add(btnSearchDd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 110, 30));

        cbChonTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbChonTP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn tỉnh/tp", "TP HCM", "Hà Nội", "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        pnlDiaDiem.add(cbChonTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 270, -1));

        jPanel7.add(pnlDiaDiem, "card3");

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
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_group_24px.png"))); // NOI18N
        jLabel38.setText("Quản lý đoàn");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 707, Short.MAX_VALUE))
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

        txtSearchDoan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchDoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDoanActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(txtSearchDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 30));

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        DoanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        DoanTable.setFillsViewportHeight(true);
        DoanTable.setShowHorizontalLines(false);
        DoanTable.setShowVerticalLines(false);
        DoanTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoanTableFocusGained(evt);
            }
        });
        DoanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoanTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DoanTableMouseReleased(evt);
            }
        });
        jScrollPane8.setViewportView(DoanTable);

        pnl3QLDoan.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 880, 320));

        btnXemDsKH.setBackground(new java.awt.Color(39, 62, 174));
        btnXemDsKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXemDsKH.setForeground(new java.awt.Color(255, 255, 255));
        btnXemDsKH.setText("Thêm đoàn");
        btnXemDsKH.setContentAreaFilled(false);
        btnXemDsKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemDsKH.setOpaque(true);
        btnXemDsKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDsKHActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnXemDsKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 140, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl3QLDoan.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

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
        pnl3QLDoan.add(btnDeleteDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 140, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("Tìm kiếm đoàn:");
        pnl3QLDoan.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, 30));

        btnUpdateDoan.setBackground(new java.awt.Color(39, 62, 174));
        btnUpdateDoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateDoan.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDoan.setText("Sửa đoàn");
        btnUpdateDoan.setContentAreaFilled(false);
        btnUpdateDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateDoan.setOpaque(true);
        btnUpdateDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoanActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnUpdateDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 30));

        btnSearchDoan.setBackground(new java.awt.Color(200, 193, 92));
        btnSearchDoan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchDoan.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDoan.setText("Tìm");
        btnSearchDoan.setContentAreaFilled(false);
        btnSearchDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchDoan.setOpaque(true);
        btnSearchDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoanActionPerformed(evt);
            }
        });
        pnl3QLDoan.add(btnSearchDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 110, 30));

        jPanel7.add(pnl3QLDoan, "card3");

        pnl4QLKhachHang.setBackground(new java.awt.Color(236, 239, 244));
        pnl4QLKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("Version 1.0");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl4QLKhachHang.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel49.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel49.setText("Dashboard");
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl4QLKhachHang.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel13.setBackground(new java.awt.Color(210, 214, 223));

        jLabel52.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel52.setText("Home >");

        jLabel53.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_customer_24px.png"))); // NOI18N
        jLabel53.setText("Khách hàng");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 736, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53))
        );

        pnl4QLKhachHang.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnl4QLKhachHang.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        txtSearchKH.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(txtSearchKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 320, 30));

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        KhachHangTable.setModel(new javax.swing.table.DefaultTableModel(
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
        KhachHangTable.setFillsViewportHeight(true);
        KhachHangTable.setShowHorizontalLines(false);
        KhachHangTable.setShowVerticalLines(false);
        KhachHangTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KhachHangTableFocusGained(evt);
            }
        });
        KhachHangTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KhachHangTableMouseReleased(evt);
            }
        });
        jScrollPane10.setViewportView(KhachHangTable);

        pnl4QLKhachHang.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 880, 300));

        btnResetKH.setBackground(new java.awt.Color(39, 62, 174));
        btnResetKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetKH.setForeground(new java.awt.Color(255, 255, 255));
        btnResetKH.setText("Reset");
        btnResetKH.setContentAreaFilled(false);
        btnResetKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetKH.setOpaque(true);
        btnResetKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(btnResetKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 140, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Ngày sinh");
        pnl4QLKhachHang.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Email");
        pnl4QLKhachHang.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

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

        pnl4QLKhachHang.add(kGradientPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 270, 20));

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

        pnl4QLKhachHang.add(kGradientPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 270, 20));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl4QLKhachHang.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        kGradientPanel34.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel34.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel34.setkFillBackground(false);
        kGradientPanel34.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdKH.setEditable(false);
        txtIdKH.setBorder(null);
        txtIdKH.setOpaque(false);
        kGradientPanel34.add(txtIdKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel35.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel35.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel35.setkFillBackground(false);
        kGradientPanel35.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn17.setBorder(null);
        tfDapAn17.setOpaque(false);
        kGradientPanel35.add(tfDapAn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel34.add(kGradientPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        kGradientPanel42.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel42.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel42.setkFillBackground(false);
        kGradientPanel42.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH1.setBorder(null);
        txtTenKH1.setOpaque(false);
        kGradientPanel42.add(txtTenKH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel43.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel43.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel43.setkFillBackground(false);
        kGradientPanel43.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn19.setBorder(null);
        tfDapAn19.setOpaque(false);
        kGradientPanel43.add(tfDapAn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel42.add(kGradientPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Tên địa điểm:");
        kGradientPanel42.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel34.add(kGradientPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Tên khách");
        kGradientPanel34.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel44.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel44.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel44.setkFillBackground(false);
        kGradientPanel44.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH2.setBorder(null);
        txtTenKH2.setOpaque(false);
        kGradientPanel44.add(txtTenKH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel45.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel45.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel45.setkFillBackground(false);
        kGradientPanel45.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn20.setBorder(null);
        tfDapAn20.setOpaque(false);
        kGradientPanel45.add(tfDapAn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel44.add(kGradientPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Tên địa điểm:");
        kGradientPanel44.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel46.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel46.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel46.setkFillBackground(false);
        kGradientPanel46.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH3.setBorder(null);
        txtTenKH3.setOpaque(false);
        kGradientPanel46.add(txtTenKH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel47.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel47.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel47.setkFillBackground(false);
        kGradientPanel47.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn21.setBorder(null);
        tfDapAn21.setOpaque(false);
        kGradientPanel47.add(tfDapAn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel46.add(kGradientPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Tên địa điểm:");
        kGradientPanel46.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel44.add(kGradientPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Tên khách");
        kGradientPanel44.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel34.add(kGradientPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 230, 20));

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Tên khách");
        kGradientPanel34.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        kGradientPanel56.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel56.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel56.setkFillBackground(false);
        kGradientPanel56.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH4.setBorder(null);
        txtTenKH4.setOpaque(false);
        kGradientPanel56.add(txtTenKH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel57.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel57.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel57.setkFillBackground(false);
        kGradientPanel57.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn22.setBorder(null);
        tfDapAn22.setOpaque(false);
        kGradientPanel57.add(tfDapAn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel56.add(kGradientPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Tên địa điểm:");
        kGradientPanel56.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel58.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel58.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel58.setkFillBackground(false);
        kGradientPanel58.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH5.setBorder(null);
        txtTenKH5.setOpaque(false);
        kGradientPanel58.add(txtTenKH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel59.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel59.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel59.setkFillBackground(false);
        kGradientPanel59.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn23.setBorder(null);
        tfDapAn23.setOpaque(false);
        kGradientPanel59.add(tfDapAn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel58.add(kGradientPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("Tên địa điểm:");
        kGradientPanel58.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel56.add(kGradientPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Tên khách");
        kGradientPanel56.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel60.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel60.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel60.setkFillBackground(false);
        kGradientPanel60.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH6.setBorder(null);
        txtTenKH6.setOpaque(false);
        kGradientPanel60.add(txtTenKH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel61.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel61.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel61.setkFillBackground(false);
        kGradientPanel61.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn28.setBorder(null);
        tfDapAn28.setOpaque(false);
        kGradientPanel61.add(tfDapAn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel60.add(kGradientPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Tên địa điểm:");
        kGradientPanel60.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel62.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel62.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel62.setkFillBackground(false);
        kGradientPanel62.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH7.setBorder(null);
        txtTenKH7.setOpaque(false);
        kGradientPanel62.add(txtTenKH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

        kGradientPanel63.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel63.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel63.setkFillBackground(false);
        kGradientPanel63.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn29.setBorder(null);
        tfDapAn29.setOpaque(false);
        kGradientPanel63.add(tfDapAn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel62.add(kGradientPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Tên địa điểm:");
        kGradientPanel62.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        kGradientPanel60.add(kGradientPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Tên khách");
        kGradientPanel60.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        kGradientPanel56.add(kGradientPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 230, 20));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Tên khách");
        kGradientPanel56.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        kGradientPanel34.add(kGradientPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 230, 20));

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("Tên khách");
        kGradientPanel34.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        pnl4QLKhachHang.add(kGradientPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 230, 20));

        btnSaveKH.setBackground(new java.awt.Color(39, 62, 174));
        btnSaveKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveKH.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveKH.setText("Lưu");
        btnSaveKH.setContentAreaFilled(false);
        btnSaveKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveKH.setOpaque(true);
        btnSaveKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(btnSaveKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 630, 140, 30));

        btnDeleteKH.setBackground(new java.awt.Color(39, 62, 174));
        btnDeleteKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteKH.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteKH.setText("Xóa");
        btnDeleteKH.setContentAreaFilled(false);
        btnDeleteKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteKH.setOpaque(true);
        btnDeleteKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(btnDeleteKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 140, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Tìm kiếm khách hàng:");
        pnl4QLKhachHang.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Sdt");
        pnl4QLKhachHang.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 70, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Id");
        pnl4QLKhachHang.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("CMND");
        pnl4QLKhachHang.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

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

        pnl4QLKhachHang.add(kGradientPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 270, 20));
        pnl4QLKhachHang.add(dateNgaySinhKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 230, -1));

        kGradientPanel64.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel64.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel64.setkFillBackground(false);
        kGradientPanel64.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenKH.setBorder(null);
        txtTenKH.setOpaque(false);
        kGradientPanel64.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 20));

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

        pnl4QLKhachHang.add(kGradientPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 230, 20));

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Tên khách");
        pnl4QLKhachHang.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        btnAddKH.setBackground(new java.awt.Color(39, 62, 174));
        btnAddKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddKH.setForeground(new java.awt.Color(255, 255, 255));
        btnAddKH.setText("Thêm mới");
        btnAddKH.setContentAreaFilled(false);
        btnAddKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddKH.setOpaque(true);
        btnAddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(btnAddKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, 30));

        btnSearchKH.setBackground(new java.awt.Color(200, 193, 92));
        btnSearchKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchKH.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchKH.setText("Tìm");
        btnSearchKH.setContentAreaFilled(false);
        btnSearchKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchKH.setOpaque(true);
        btnSearchKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchKHActionPerformed(evt);
            }
        });
        pnl4QLKhachHang.add(btnSearchKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 30));

        jPanel7.add(pnl4QLKhachHang, "card3");

        pnl5QLNhanVien.setBackground(new java.awt.Color(236, 239, 244));
        pnl5QLNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(153, 153, 153));
        jLabel58.setText("Version 1.0");
        jLabel58.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl5QLNhanVien.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel68.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel68.setText("Dashboard");
        jLabel68.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnl5QLNhanVien.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel15.setBackground(new java.awt.Color(210, 214, 223));

        jLabel70.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel70.setText("Home >");

        jLabel71.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_customer_support_24px.png"))); // NOI18N
        jLabel71.setText("Nhân viên");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 736, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel71))
        );

        pnl5QLNhanVien.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnl5QLNhanVien.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        txtSearchNV.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNVActionPerformed(evt);
            }
        });
        pnl5QLNhanVien.add(txtSearchNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 330, 30));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnl5QLNhanVien.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel79.setText("Tìm kiếm nhân viên:");
        pnl5QLNhanVien.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 30));

        jScrollPane12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

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
        jScrollPane12.setViewportView(NhanVienTable);

        pnl5QLNhanVien.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 870, 290));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Email");
        pnl5QLNhanVien.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

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

        pnl5QLNhanVien.add(kGradientPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 270, 20));

        kGradientPanel50.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel50.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel50.setkFillBackground(false);
        kGradientPanel50.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaNV.setEditable(false);
        txtMaNV.setBorder(null);
        txtMaNV.setOpaque(false);
        kGradientPanel50.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 20));

        kGradientPanel51.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel51.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel51.setkFillBackground(false);
        kGradientPanel51.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn25.setBorder(null);
        tfDapAn25.setOpaque(false);
        kGradientPanel51.add(tfDapAn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 20));

        kGradientPanel50.add(kGradientPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 270, 20));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Tên địa điểm:");
        kGradientPanel50.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        pnl5QLNhanVien.add(kGradientPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 270, 20));

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
        pnl5QLNhanVien.add(btnSaveNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, 140, 30));

        btnDeleteDoan3.setBackground(new java.awt.Color(39, 62, 174));
        btnDeleteDoan3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteDoan3.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoan3.setText("Xóa");
        btnDeleteDoan3.setContentAreaFilled(false);
        btnDeleteDoan3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteDoan3.setOpaque(true);
        btnDeleteDoan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoan3ActionPerformed(evt);
            }
        });
        pnl5QLNhanVien.add(btnDeleteDoan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 140, 30));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Ngày sinh");
        pnl5QLNhanVien.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, 20));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Mã nv");
        pnl5QLNhanVien.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        btnResetDoan4.setBackground(new java.awt.Color(39, 62, 174));
        btnResetDoan4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetDoan4.setForeground(new java.awt.Color(255, 255, 255));
        btnResetDoan4.setText("Reset");
        btnResetDoan4.setContentAreaFilled(false);
        btnResetDoan4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetDoan4.setOpaque(true);
        btnResetDoan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDoan4ActionPerformed(evt);
            }
        });
        pnl5QLNhanVien.add(btnResetDoan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 140, 30));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("Số điện thoại");
        pnl5QLNhanVien.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

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

        pnl5QLNhanVien.add(kGradientPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 270, 20));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("Chức vụ");
        pnl5QLNhanVien.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, -1));

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

        pnl5QLNhanVien.add(kGradientPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 270, 20));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Tên nhân viên");
        pnl5QLNhanVien.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jDateChooser1.setMaxSelectableDate(new java.util.Date(253370743292000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135791108000L));
        pnl5QLNhanVien.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 120, 20));

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tài xế", "Hướng dẫn viên", "Phục vụ", "Thông dịch viên", "Tiền trạm" }));
        pnl5QLNhanVien.add(cbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 150, -1));

        btnAddNV.setBackground(new java.awt.Color(39, 62, 174));
        btnAddNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddNV.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNV.setText("Thêm mới");
        btnAddNV.setContentAreaFilled(false);
        btnAddNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNV.setOpaque(true);
        btnAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNVActionPerformed(evt);
            }
        });
        pnl5QLNhanVien.add(btnAddNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 140, 30));

        btnSearchNV.setBackground(new java.awt.Color(200, 193, 92));
        btnSearchNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchNV.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNV.setText("Tìm");
        btnSearchNV.setContentAreaFilled(false);
        btnSearchNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchNV.setOpaque(true);
        btnSearchNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNVActionPerformed(evt);
            }
        });
        pnl5QLNhanVien.add(btnSearchNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 30));

        jPanel7.add(pnl5QLNhanVien, "card3");

        pnlDSGiaTour.setBackground(new java.awt.Color(236, 239, 244));
        pnlDSGiaTour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(153, 153, 153));
        jLabel72.setText("Version 1.0");
        jLabel72.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDSGiaTour.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel73.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel73.setText("Dashboard");
        jLabel73.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDSGiaTour.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel17.setBackground(new java.awt.Color(210, 214, 223));

        jLabel74.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel74.setText("Home >");

        jLabel75.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_cheap_2_24px.png"))); // NOI18N
        jLabel75.setText("Quản lý giá tour");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 696, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel75))
        );

        pnlDSGiaTour.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlDSGiaTour.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlDSGiaTour.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setText("Chọn tour:");
        pnlDSGiaTour.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 20));

        jScrollPane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        GiaTourTable.setModel(new javax.swing.table.DefaultTableModel(
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
        GiaTourTable.setFillsViewportHeight(true);
        GiaTourTable.setShowHorizontalLines(false);
        GiaTourTable.setShowVerticalLines(false);
        GiaTourTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GiaTourTableFocusGained(evt);
            }
        });
        GiaTourTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GiaTourTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GiaTourTableMouseReleased(evt);
            }
        });
        jScrollPane13.setViewportView(GiaTourTable);

        pnlDSGiaTour.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 870, 300));

        btnXemGiaTour.setBackground(new java.awt.Color(0, 153, 204));
        btnXemGiaTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXemGiaTour.setForeground(new java.awt.Color(255, 255, 255));
        btnXemGiaTour.setText("Xem");
        btnXemGiaTour.setContentAreaFilled(false);
        btnXemGiaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemGiaTour.setOpaque(true);
        btnXemGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemGiaTourActionPerformed(evt);
            }
        });
        pnlDSGiaTour.add(btnXemGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 30));

        btnXoaGiaTour.setBackground(new java.awt.Color(39, 62, 174));
        btnXoaGiaTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoaGiaTour.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaGiaTour.setText("Xóa");
        btnXoaGiaTour.setContentAreaFilled(false);
        btnXoaGiaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaGiaTour.setOpaque(true);
        btnXoaGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaGiaTourActionPerformed(evt);
            }
        });
        pnlDSGiaTour.add(btnXoaGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 140, 30));

        btnResetGiaTour.setBackground(new java.awt.Color(39, 62, 174));
        btnResetGiaTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetGiaTour.setForeground(new java.awt.Color(255, 255, 255));
        btnResetGiaTour.setText("Reset");
        btnResetGiaTour.setContentAreaFilled(false);
        btnResetGiaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetGiaTour.setOpaque(true);
        btnResetGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetGiaTourActionPerformed(evt);
            }
        });
        pnlDSGiaTour.add(btnResetGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 140, 30));

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel81.setText("Danh sách bảng giá tour");
        pnlDSGiaTour.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 270, 30));

        pnlDSGiaTour.add(cbListTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        btnSaveGiaTour.setBackground(new java.awt.Color(39, 62, 174));
        btnSaveGiaTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveGiaTour.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveGiaTour.setText("Lưu");
        btnSaveGiaTour.setContentAreaFilled(false);
        btnSaveGiaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveGiaTour.setOpaque(true);
        btnSaveGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGiaTourActionPerformed(evt);
            }
        });
        pnlDSGiaTour.add(btnSaveGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 140, 30));

        jLabel76.setBackground(new java.awt.Color(0, 0, 0));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setText("Đến ngày");
        pnlDSGiaTour.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

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

        pnlDSGiaTour.add(kGradientPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 240, 20));

        jLabel82.setBackground(new java.awt.Color(0, 0, 0));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Giá Tour");
        pnlDSGiaTour.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jLabel83.setBackground(new java.awt.Color(0, 0, 0));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Từ ngày");
        pnlDSGiaTour.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));
        pnlDSGiaTour.add(dateDenNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 150, -1));
        pnlDSGiaTour.add(dateTuNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 150, -1));

        kGradientPanel40.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel40.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel40.setkFillBackground(false);
        kGradientPanel40.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdGiaTour.setEditable(false);
        txtIdGiaTour.setBorder(null);
        txtIdGiaTour.setOpaque(false);
        kGradientPanel40.add(txtIdGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 20));

        kGradientPanel41.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel41.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel41.setkFillBackground(false);
        kGradientPanel41.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGiaTour3.setBorder(null);
        txtGiaTour3.setOpaque(false);
        kGradientPanel41.add(txtGiaTour3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 20));

        kGradientPanel40.add(kGradientPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 240, 20));

        jLabel85.setBackground(new java.awt.Color(0, 0, 0));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setText("Giá Tour");
        kGradientPanel40.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        pnlDSGiaTour.add(kGradientPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 150, 20));

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel96.setText("Id");
        pnlDSGiaTour.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        btnAddGiaTour.setBackground(new java.awt.Color(39, 62, 174));
        btnAddGiaTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddGiaTour.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGiaTour.setText("Thêm mới");
        btnAddGiaTour.setContentAreaFilled(false);
        btnAddGiaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddGiaTour.setOpaque(true);
        btnAddGiaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGiaTourActionPerformed(evt);
            }
        });
        pnlDSGiaTour.add(btnAddGiaTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 140, 30));

        jPanel7.add(pnlDSGiaTour, "card3");

        pnlLapDSDoan.setBackground(new java.awt.Color(236, 239, 244));
        pnlLapDSDoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Version 1.0");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlLapDSDoan.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel40.setText("Dashboard");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlLapDSDoan.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel19.setBackground(new java.awt.Color(210, 214, 223));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel41.setText("Home >");

        jLabel42.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_group_of_projects_24px.png"))); // NOI18N
        jLabel42.setText("Lập danh sách đoàn");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 678, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42))
        );

        pnlLapDSDoan.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlLapDSDoan.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlLapDSDoan.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Chọn tour:");
        pnlLapDSDoan.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        cbChonTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonTourActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(cbChonTour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 640, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Danh sách khách hàng:");
        pnlLapDSDoan.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 170, 30));

        cbChonTenDoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn đoàn" }));
        cbChonTenDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonTenDoanActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(cbChonTenDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 640, 30));

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel97.setText("Chọn tên đoàn:");
        pnlLapDSDoan.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setText("Danh sách nhân viên:");
        pnlLapDSDoan.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 30));

        btnSelectKH.setBackground(new java.awt.Color(0, 153, 204));
        btnSelectKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelectKH.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectKH.setText("Thêm KH");
        btnSelectKH.setContentAreaFilled(false);
        btnSelectKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectKH.setOpaque(true);
        btnSelectKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectKHActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(btnSelectKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 90, 30));

        btnSelectNV.setBackground(new java.awt.Color(0, 153, 204));
        btnSelectNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelectNV.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectNV.setText("Thêm NV");
        btnSelectNV.setContentAreaFilled(false);
        btnSelectNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectNV.setOpaque(true);
        btnSelectNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectNVActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(btnSelectNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 90, 30));

        NhanVienDaChonTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NhanVienDaChonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NhanVienDaChonTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NhanVienDaChonTable.setFillsViewportHeight(true);
        NhanVienDaChonTable.setGridColor(new java.awt.Color(255, 255, 255));
        NhanVienDaChonTable.setInheritsPopupMenu(true);
        NhanVienDaChonTable.setOpaque(false);
        NhanVienDaChonTable.setRowHeight(18);
        NhanVienDaChonTable.setSelectionForeground(new java.awt.Color(204, 0, 0));
        NhanVienDaChonTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        NhanVienDaChonTable.setShowHorizontalLines(false);
        NhanVienDaChonTable.setShowVerticalLines(false);
        jScrollPane4.setViewportView(NhanVienDaChonTable);

        pnlLapDSDoan.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 350, 220));

        KhachHangDaChonTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KhachHangDaChonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KhachHangDaChonTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        KhachHangDaChonTable.setFillsViewportHeight(true);
        KhachHangDaChonTable.setGridColor(new java.awt.Color(255, 255, 255));
        KhachHangDaChonTable.setInheritsPopupMenu(true);
        KhachHangDaChonTable.setOpaque(false);
        KhachHangDaChonTable.setRowHeight(18);
        KhachHangDaChonTable.setSelectionForeground(new java.awt.Color(204, 0, 0));
        KhachHangDaChonTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KhachHangDaChonTable.setShowHorizontalLines(false);
        KhachHangDaChonTable.setShowVerticalLines(false);
        jScrollPane7.setViewportView(KhachHangDaChonTable);

        pnlLapDSDoan.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 370, 220));

        btnDSDoan.setBackground(new java.awt.Color(39, 62, 174));
        btnDSDoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDSDoan.setForeground(new java.awt.Color(255, 255, 255));
        btnDSDoan.setText("Lưu");
        btnDSDoan.setContentAreaFilled(false);
        btnDSDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDSDoan.setOpaque(true);
        btnDSDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSDoanActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(btnDSDoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 220, 30));

        btnXoaKH.setBackground(new java.awt.Color(0, 153, 204));
        btnXoaKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaKH.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaKH.setText("Xóa KH");
        btnXoaKH.setContentAreaFilled(false);
        btnXoaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaKH.setOpaque(true);
        btnXoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKHActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(btnXoaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 90, 30));

        btnXoaNV1.setBackground(new java.awt.Color(0, 153, 204));
        btnXoaNV1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoaNV1.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNV1.setText("Xóa NV");
        btnXoaNV1.setContentAreaFilled(false);
        btnXoaNV1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNV1.setOpaque(true);
        btnXoaNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNV1ActionPerformed(evt);
            }
        });
        pnlLapDSDoan.add(btnXoaNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 90, 30));

        jPanel7.add(pnlLapDSDoan, "card3");

        pnlThongKe.setBackground(new java.awt.Color(236, 239, 244));
        pnlThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Version 1.0");
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlThongKe.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel44.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel44.setText("Dashboard");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlThongKe.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel21.setBackground(new java.awt.Color(210, 214, 223));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel45.setText("Home >");

        jLabel55.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_statistics_24px_1.png"))); // NOI18N
        jLabel55.setText("Thống kê doanh thu");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 669, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55))
        );

        pnlThongKe.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlThongKe.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jScrollPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        ThongKeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ThongKeTable.setFillsViewportHeight(true);
        ThongKeTable.setShowHorizontalLines(false);
        ThongKeTable.setShowVerticalLines(false);
        ThongKeTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ThongKeTableFocusGained(evt);
            }
        });
        ThongKeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ThongKeTableMouseReleased(evt);
            }
        });
        jScrollPane9.setViewportView(ThongKeTable);

        pnlThongKe.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 900, 390));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlThongKe.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        btnXemCTThongKe.setBackground(new java.awt.Color(39, 62, 174));
        btnXemCTThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXemCTThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnXemCTThongKe.setText("Xem chi tiết");
        btnXemCTThongKe.setContentAreaFilled(false);
        btnXemCTThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemCTThongKe.setOpaque(true);
        btnXemCTThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTThongKeActionPerformed(evt);
            }
        });
        pnlThongKe.add(btnXemCTThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, 30));

        jLabel127.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel127.setText("Thống kê doanh thu tour");
        pnlThongKe.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 30));

        txtSearchTourTK.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtSearchTourTK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchTourTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTourTKActionPerformed(evt);
            }
        });
        pnlThongKe.add(txtSearchTourTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 30));

        btnSearch.setBackground(new java.awt.Color(200, 193, 92));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Tìm");
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setOpaque(true);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlThongKe.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 100, 30));

        jPanel7.add(pnlThongKe, "card3");

        pnlThongKeChiTiet.setBackground(new java.awt.Color(236, 239, 244));
        pnlThongKeChiTiet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel128.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(153, 153, 153));
        jLabel128.setText("Version 1.0");
        jLabel128.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlThongKeChiTiet.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        jLabel129.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel129.setText("Dashboard");
        jLabel129.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlThongKeChiTiet.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel23.setBackground(new java.awt.Color(210, 214, 223));

        jLabel130.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_home_24px.png")); // NOI18N
        jLabel130.setText("Home >");

        jLabel131.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_statistics_24px_1.png"))); // NOI18N
        jLabel131.setText("Thống kê doanh thu chi tiết");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 634, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel131))
        );

        pnlThongKeChiTiet.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 30));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlThongKeChiTiet.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jScrollPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        ThongKeChiTietTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ThongKeChiTietTable.setFillsViewportHeight(true);
        ThongKeChiTietTable.setShowHorizontalLines(false);
        ThongKeChiTietTable.setShowVerticalLines(false);
        ThongKeChiTietTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ThongKeChiTietTableFocusGained(evt);
            }
        });
        ThongKeChiTietTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeChiTietTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ThongKeChiTietTableMouseReleased(evt);
            }
        });
        jScrollPane11.setViewportView(ThongKeChiTietTable);

        pnlThongKeChiTiet.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 900, 330));

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlThongKeChiTiet.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        btnXemChiPhi.setBackground(new java.awt.Color(39, 62, 174));
        btnXemChiPhi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXemChiPhi.setForeground(new java.awt.Color(255, 255, 255));
        btnXemChiPhi.setText("Xem chi phí");
        btnXemChiPhi.setContentAreaFilled(false);
        btnXemChiPhi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemChiPhi.setOpaque(true);
        btnXemChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiPhiActionPerformed(evt);
            }
        });
        pnlThongKeChiTiet.add(btnXemChiPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 140, 30));

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel133.setText("Chọn tour:");
        pnlThongKeChiTiet.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        txtLai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLai.setText("lai");
        pnlThongKeChiTiet.add(txtLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 150, 30));

        cbChonTourTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChonTourTKActionPerformed(evt);
            }
        });
        pnlThongKeChiTiet.add(cbChonTourTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, 30));

        btnBackTK.setBackground(new java.awt.Color(39, 62, 174));
        btnBackTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackTK.setForeground(new java.awt.Color(255, 255, 255));
        btnBackTK.setText("BACK");
        btnBackTK.setContentAreaFilled(false);
        btnBackTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackTK.setOpaque(true);
        btnBackTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackTKActionPerformed(evt);
            }
        });
        pnlThongKeChiTiet.add(btnBackTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 140, 30));

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel135.setText("Chi tiết");
        pnlThongKeChiTiet.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 30));

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel136.setText("Tổng:");
        pnlThongKeChiTiet.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 80, 30));

        txtTongDoanhThu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongDoanhThu1.setText("tongTien");
        pnlThongKeChiTiet.add(txtTongDoanhThu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 140, 30));

        txtTongChiPhi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongChiPhi1.setText("chiPhi");
        pnlThongKeChiTiet.add(txtTongChiPhi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 150, 30));

        jPanel7.add(pnlThongKeChiTiet, "card3");

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 970, 710));

        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(54, 127, 168));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NHANVIEN");
        jLabel2.setOpaque(true);
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        jPanel3.setBackground(new java.awt.Color(60, 141, 166));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_close_window_24px.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, 40));

        jAbout.setBackground(new java.awt.Color(54, 127, 168));
        jAbout.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jAbout.setForeground(new java.awt.Color(255, 255, 255));
        jAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAbout.setText("About Team");
        jAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAboutMouseClicked(evt);
            }
        });
        jPanel3.add(jAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 130, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Tourdulich\\src\\main\\java\\img\\icons8_info_24px.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 40));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 980, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        setSize(new java.awt.Dimension(1209, 736));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TestVarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVarMouseClicked

        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnTest.setBackground(new java.awt.Color(44, 59, 66));
        pnlDiaDiem.setVisible(true);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPage2QuanLyDD();


    }//GEN-LAST:event_TestVarMouseClicked

    private void btnDashBoard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoard1MouseClicked
        btnDash.setBackground(new java.awt.Color(44, 59, 66));
        pnlQLTour.setVisible(true);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPage1QuanLyTour();
    }//GEN-LAST:event_btnDashBoard1MouseClicked

    private void btnTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseClicked

    }//GEN-LAST:event_btnTestMouseClicked

    private void btnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashMouseClicked

    }//GEN-LAST:event_btnDashMouseClicked

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAboutMouseClicked
        JOptionPane.showMessageDialog(this, "Nhóm gồm 4 thành viên: \n Trần Thanh Phú \n Bùi Minh Cương \n Trần Ngọc Sang \n Tô Hồng Phúc \n Lê Ngô Quyền");
    }//GEN-LAST:event_jAboutMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        FormChiPhi formChiPhi = new FormChiPhi(this, true);
        formChiPhi.setVisible(true);
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnTest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTest1MouseClicked

    }//GEN-LAST:event_btnTest1MouseClicked

    private void txtSearchDdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDdActionPerformed
        btnSearchDd.doClick();
    }//GEN-LAST:event_txtSearchDdActionPerformed

    private void DiaDiemTable2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DiaDiemTable2FocusGained
//       DiaDiemModel diaDiemModel= new DiaDiemModel();
//        diaDiemModel=diaDiemBLL.findOne((int) DiaDiemTable2.getModel().getValueAt(DiaDiemTable2.getSelectedRow(),0));
//        txtDiaDiem1.setText(diaDiemModel.getTenDiaDiem());
//        txtMoTa1.setText(diaDiemModel.getMoTa());
//        txtTinhTrang1.setText(diaDiemModel.getTinhtrang());
//        txtDiaChi1.setText(diaDiemModel.getDiaChi());
//        txtId.setText(Integer.toString(diaDiemModel.getId()));
    }//GEN-LAST:event_DiaDiemTable2FocusGained

    private void DiaDiemTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiaDiemTable2MouseClicked

        DiaDiemModel diaDiemModel = new DiaDiemModel();
        diaDiemModel = SingletonBllUtil.getDiaDiemBLLInstance().findOne((int) DiaDiemTable2.getModel().getValueAt(DiaDiemTable2.getSelectedRow(), 0));
        txtDiaDiem1.setText(diaDiemModel.getTenDiaDiem());
        txtMoTa1.setText(diaDiemModel.getMoTa());
        cbChonTP.setSelectedItem(diaDiemModel.getThanhPho());
        txtId.setText(Integer.toString(diaDiemModel.getId()));


    }//GEN-LAST:event_DiaDiemTable2MouseClicked

    private void DiaDiemTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiaDiemTable2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaDiemTable2MouseReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtDiaDiem1.setText("");
        txtMoTa1.setText("");
        cbChonTP.setSelectedIndex(0);
        txtId.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDiaDiemActionPerformed
        String regex = "[0-9]+";
        DiaDiemModel diaDiemModel = new DiaDiemModel();
        if(txtDiaDiem1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống tên đia điểm !!");
            return;
        }
        if(txtMoTa1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng không bỏ trống mô tả!!");
            return;
        }
        diaDiemModel.setTenDiaDiem(txtDiaDiem1.getText());
        if (cbChonTP.getSelectedIndex() != 0) {
            diaDiemModel.setThanhPho(cbChonTP.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng tỉnh/thành phố");
        }
        diaDiemModel.setMoTa(txtMoTa1.getText());
        if (!txtId.getText().equals("") && txtId.getText().matches(regex)) {
            diaDiemModel.setId(Integer.parseInt(txtId.getText()));
            SingletonBllUtil.getDiaDiemBLLInstance().update(diaDiemModel);

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đối tượng cần cập nhật");
        }
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) SingletonBllUtil.getDiaDiemBLLInstance().findAll(), DiaDiemTable2);
    }//GEN-LAST:event_btnSaveDiaDiemActionPerformed

    private void btnDeleteDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDiaDiemActionPerformed
         if (DiaDiemTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn địa điểm cần xóa ! ");
            return;
        }
        int idDelete = (int) DiaDiemTable2.getModel().getValueAt(DiaDiemTable2.getSelectedRow(), 0);
        SingletonBllUtil.getDiaDiemBLLInstance().delete(new int[]{idDelete});
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) SingletonBllUtil.getDiaDiemBLLInstance().findAll(), DiaDiemTable2);
    }//GEN-LAST:event_btnDeleteDiaDiemActionPerformed

    private void TestVar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVar2MouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(44, 59, 66));
        pnl3QLDoan.setVisible(true);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPage3QuanLyDoan();
    }//GEN-LAST:event_TestVar2MouseClicked

    private void btnDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoanMouseClicked


    }//GEN-LAST:event_btnDoanMouseClicked

    private void TestVar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TestVar6MouseClicked

    private void btnTest6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTest6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTest6MouseClicked

    private void btnShowKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowKHMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowKHMouseClicked

    private void btnPageNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPageNhanVienMouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(44, 59, 66));
        pnl5QLNhanVien.setVisible(true);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPage6QuanLyNV();
    }//GEN-LAST:event_btnPageNhanVienMouseClicked

    private void btnPage5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPage5MouseClicked

    }//GEN-LAST:event_btnPage5MouseClicked

    private void TestVar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVar10MouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(44, 59, 66));
        pnl4QLKhachHang.setVisible(true);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPageQuanLyKH();
    }//GEN-LAST:event_TestVar10MouseClicked

    private void txtSearchDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDoanActionPerformed
        btnSearchDoan.doClick();
    }//GEN-LAST:event_txtSearchDoanActionPerformed

    private void DoanTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoanTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_DoanTableFocusGained

    private void DoanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoanTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DoanTableMouseClicked

    private void DoanTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoanTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DoanTableMouseReleased

    private void btnXemDsKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDsKHActionPerformed
        FormLapDoan formLapDoan = new FormLapDoan(this, true);
        formLapDoan.setVisible(true);
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        doanTable.showTable((ArrayList<DoanDuLichModel>) doanList, DoanTable);

    }//GEN-LAST:event_btnXemDsKHActionPerformed

    private void btnDeleteDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoanActionPerformed
        if (DoanTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn đoàn cần xóa");
            return;
        }
        SingletonBllUtil.getDoanDuLichBLLInstance().delete(new int[]{(int) DoanTable.getModel().getValueAt(DoanTable.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        doanTable.showTable((ArrayList<DoanDuLichModel>) doanList, DoanTable);
    }//GEN-LAST:event_btnDeleteDoanActionPerformed

    private void txtSearchKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchKHActionPerformed
        btnSearchKH.doClick();
    }//GEN-LAST:event_txtSearchKHActionPerformed

    private void KhachHangTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KhachHangTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_KhachHangTableFocusGained

    private void KhachHangTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangTableMouseClicked
        int id = (int) KhachHangTable.getModel().getValueAt(KhachHangTable.getSelectedRow(), 0);
        KhachHangModel model = SingletonBllUtil.getKhachHangBLLInstance().findById(id);
        txtTenKH.setText(model.getTenKH());
        txtCMND.setText(model.getCmnd());
        txtSdtKH.setText(model.getSdt());
        txtEmailiKH.setText(model.getEmail());
        dateNgaySinhKH.setDate(model.getNgaySinh());
        txtIdKH.setText(String.valueOf(model.getId()));
    }//GEN-LAST:event_KhachHangTableMouseClicked

    private void KhachHangTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_KhachHangTableMouseReleased

    private void btnResetKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKHActionPerformed
        txtTenKH.setText("");
        txtCMND.setText("");
        txtSdtKH.setText("");
        txtEmailiKH.setText("");
        dateNgaySinhKH.setDate(null);
        txtIdKH.setText("");
    }//GEN-LAST:event_btnResetKHActionPerformed

    private void btnSaveKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveKHActionPerformed
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
        if (!txtIdKH.getText().equals("") && txtIdKH.getText().matches(regex)) {
            model.setId(Integer.parseInt(txtIdKH.getText()));
            SingletonBllUtil.getKhachHangBLLInstance().update(model);

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đối tượng cần cập nhật");
        }
        khachHangList = SingletonBllUtil.getKhachHangBLLInstance().findAll();
        khachHangTable.showTable((ArrayList<KhachHangModel>) khachHangList, KhachHangTable);

    }//GEN-LAST:event_btnSaveKHActionPerformed

    private void btnDeleteKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKHActionPerformed
        if (KhachHangTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng cần xóa");
            return;
        }
        SingletonBllUtil.getKhachHangBLLInstance().delete(new int[]{(int) KhachHangTable.getModel().getValueAt(KhachHangTable.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        btnResetKH.doClick();
        khachHangList = SingletonBllUtil.getKhachHangBLLInstance().findAll();
        khachHangTable.showTable((ArrayList<KhachHangModel>) khachHangList, KhachHangTable);
    }//GEN-LAST:event_btnDeleteKHActionPerformed

    private void txtSearchNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNVActionPerformed
        btnSearchNV.doClick();
    }//GEN-LAST:event_txtSearchNVActionPerformed

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
        if (!txtMaNV.getText().equals("") && txtMaNV.getText().matches(regex)) {

            nhanVienModel.setId(Integer.parseInt(txtMaNV.getText()));
            SingletonBllUtil.getNhanVienBLLInstance().update(nhanVienModel);

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đối tượng cần cập nhật");
        }
        nhanVienList = SingletonBllUtil.getNhanVienBLLInstance().findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);

    }//GEN-LAST:event_btnSaveNhanVienActionPerformed

    private void btnDeleteDoan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoan3ActionPerformed
       if (NhanVienTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa");
            return;
        }
        SingletonBllUtil.getNhanVienBLLInstance().delete(new int[]{(int) NhanVienTable.getModel().getValueAt(NhanVienTable.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        nhanVienList = SingletonBllUtil.getNhanVienBLLInstance().findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);
    }//GEN-LAST:event_btnDeleteDoan3ActionPerformed

    private void btnResetDoan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDoan4ActionPerformed
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtEmail_nv.setText("");
        txtSdt.setText("");
        jDateChooser1.setDate(null);
        cbChucVu.setSelectedIndex(1);
    }//GEN-LAST:event_btnResetDoan4ActionPerformed

    private void TestVar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVar3MouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(44, 59, 66));
        pnlDSGiaTour.setVisible(true);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPage4DSGiaTour();
    }//GEN-LAST:event_TestVar3MouseClicked

    private void btnDSGiaTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDSGiaTourMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDSGiaTourMouseClicked

    private void GiaTourTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GiaTourTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_GiaTourTableFocusGained

    private void GiaTourTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GiaTourTableMouseClicked
        int id = (int) GiaTourTable.getModel().getValueAt(GiaTourTable.getSelectedRow(), 0);
        GiaTourModel model = SingletonBllUtil.getGiaTourBLLInstance().findById(id);
        txtIdGiaTour.setText(String.valueOf(model.getId()));
        dateTuNgay.setDate(model.getGiaTuNgay());
        dateDenNgay.setDate(model.getGiaDenNgay());
        txtGiaTour.setText(String.valueOf(model.getSoTien()));
    }//GEN-LAST:event_GiaTourTableMouseClicked

    private void GiaTourTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GiaTourTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_GiaTourTableMouseReleased

    private void btnXemGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemGiaTourActionPerformed

        TourModel model = tourData.stream().filter(c -> c.getTenTour().equals(cbListTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        giaTourList = SingletonBllUtil.getGiaTourBLLInstance().findByTourId(model.getId());
        if (giaTourList == null) {
            giaTourList = new ArrayList<GiaTourModel>();
            JOptionPane.showMessageDialog(null, "Không tìm thấy giá tour");
        }
        giaTourTable.showTable((ArrayList<GiaTourModel>) giaTourList, GiaTourTable);

    }//GEN-LAST:event_btnXemGiaTourActionPerformed

    private void btnXoaGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaGiaTourActionPerformed
        if (GiaTourTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn giá tour cần xóa !");
            return;
        }
        SingletonBllUtil.getGiaTourBLLInstance().delete(new int[]{(int) GiaTourTable.getModel().getValueAt(GiaTourTable.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        TourModel tourModel = tourData.stream().filter(c -> c.getTenTour().equals(cbListTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        giaTourList = SingletonBllUtil.getGiaTourBLLInstance().findByTourId(tourModel.getId());
        if (giaTourList == null) {
            giaTourList = new ArrayList<GiaTourModel>();
            JOptionPane.showMessageDialog(null, "Không tìm thấy giá tour");
        }
        giaTourTable.showTable((ArrayList<GiaTourModel>) giaTourList, GiaTourTable);
    }//GEN-LAST:event_btnXoaGiaTourActionPerformed

    private void btnResetGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetGiaTourActionPerformed
        txtIdGiaTour.setText("");
        dateTuNgay.setDate(null);
        dateDenNgay.setDate(null);
        txtGiaTour.setText(null);
    }//GEN-LAST:event_btnResetGiaTourActionPerformed

    private void btnSaveGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGiaTourActionPerformed
        GiaTourModel model = new GiaTourModel();
        String regex = "[0-9]+";
        TourModel tourModel = tourData.stream().filter(c -> c.getTenTour().equals(cbListTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        if (dateDenNgay.getDate() != null && dateTuNgay.getDate() != null && dateDenNgay.getDate().after(dateTuNgay.getDate())) {
            model.setGiaTuNgay(convertJavaDateToSqlDate(dateTuNgay.getDate()));
            model.setGiaDenNgay(convertJavaDateToSqlDate(dateDenNgay.getDate()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thông tin giá từ ngày và giá đến ngày không hợp lệ !!!");
            return;
        }
        model.setSoTien(Double.parseDouble(txtGiaTour.getText()));
        model.setTour_id(tourModel.getId());
        if (!txtIdGiaTour.getText().equals("") && txtIdGiaTour.getText().matches(regex)) {
            model.setId(Integer.parseInt(txtIdGiaTour.getText()));
            SingletonBllUtil.getGiaTourBLLInstance().update(model);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đối tượng cần cập nhật");
        }
        giaTourList = SingletonBllUtil.getGiaTourBLLInstance().findByTourId(model.getTour_id());
        giaTourTable.showTable((ArrayList<GiaTourModel>) giaTourList, GiaTourTable);


    }//GEN-LAST:event_btnSaveGiaTourActionPerformed

    private void btnUpdateDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoanActionPerformed
        if (DoanTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn đoàn cần cập nhật");
            return;
        }
        FormLapDoan formLapDoan = new FormLapDoan(this, true, (int) DoanTable.getModel().getValueAt(DoanTable.getSelectedRow(), 0));
        formLapDoan.setVisible(true);
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        doanTable.showTable((ArrayList<DoanDuLichModel>) doanList, DoanTable);
    }//GEN-LAST:event_btnUpdateDoanActionPerformed

    private void btnLapDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLapDoanMouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(44, 59, 66));
        pnlLapDSDoan.setVisible(true);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(34, 45, 49));
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(false);
        initPageLapDSDoan();
        cbChonTour.removeAllItems();
          initCbChonTour();
        

    }//GEN-LAST:event_btnLapDoanMouseClicked

    private void btnLapDSDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLapDSDoanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLapDSDoanMouseClicked

    private void btnSelectKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectKHActionPerformed
        FormSelectKH addNv = new FormSelectKH(this, true);
        addNv.setVisible(true);
        if (FormSelectKH.idReturn.isEmpty()) {
            return;
        }
        for (Integer item : FormSelectKH.idReturn) {
            List<KhachHangModel> check = khachHangDaChonList.stream().filter(a -> String.valueOf(a.getId()).equals(String.valueOf(item)))
                    .collect(Collectors.toList());
            KhachHangModel model = SingletonBllUtil.getKhachHangBLLInstance().findById(item);
            if (check.size() == 0) {
                khachHangDaChon = (DefaultTableModel) KhachHangDaChonTable.getModel();
                khachHangDaChon.addRow(new Object[]{
                    item, model.getTenKH()
                });

                khachHangDaChonList.add(model);
            } else {
                JOptionPane.showMessageDialog(this, "Khách hàng " + model.getTenKH() + " đã có trong đoàn");
            }
        }

    }//GEN-LAST:event_btnSelectKHActionPerformed

    private void btnSelectNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectNVActionPerformed
        FormSelectNV addNv = new FormSelectNV(this, true);
        addNv.setVisible(true);
        if (FormSelectNV.idReturn == -1) {
            return;
        }
        List<NhanVienModel> check = nhanVienDaChonList.stream().filter(a -> String.valueOf(a.getId()).equals(String.valueOf(FormSelectNV.idReturn)))
                .collect(Collectors.toList());
        if (check.isEmpty()) {
            NhanVienModel model = SingletonBllUtil.getNhanVienBLLInstance().findById(FormSelectNV.idReturn);
            nhanVienDaChon = (DefaultTableModel) NhanVienDaChonTable.getModel();
            nhanVienDaChon.addRow(new Object[]{
                FormSelectNV.idReturn, model.getTenNhanVien(), FormSelectNV.nvReturn
            });
            model.setNhiemVuTrongDoan(FormSelectNV.nvReturn);
            nhanVienDaChonList.add(model);
        } else {
            JOptionPane.showMessageDialog(this, "Nhân viên đã có trong đoàn");
        }

    }//GEN-LAST:event_btnSelectNVActionPerformed

    private void btnAddGiaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGiaTourActionPerformed
        TourModel tourModel = tourData.stream().filter(c -> c.getTenTour().equals(cbListTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        FormAddGiaTour formAddGiaTour = new FormAddGiaTour(this, true, tourModel.getId());
        formAddGiaTour.setVisible(true);
        btnXemGiaTour.doClick();

    }//GEN-LAST:event_btnAddGiaTourActionPerformed

    private void btnAddKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKHActionPerformed
        FormAddNewKH formAddNewKH = new FormAddNewKH(this, true);
        formAddNewKH.setVisible(true);
        khachHangList = SingletonBllUtil.getKhachHangBLLInstance().findAll();
        khachHangTable.showTable((ArrayList<KhachHangModel>) khachHangList, KhachHangTable);
    }//GEN-LAST:event_btnAddKHActionPerformed

    private void btnAddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNVActionPerformed
        FormAddNewNV formAddNewNV = new FormAddNewNV(this, true);
        formAddNewNV.setVisible(true);
        nhanVienList = SingletonBllUtil.getNhanVienBLLInstance().findAll();
        nhanVienTable.showTable((ArrayList<NhanVienModel>) nhanVienList, NhanVienTable);


    }//GEN-LAST:event_btnAddNVActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (TourTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn tour cần cập nhật");
            return;
        }
        FormAddTour formAddTour = new FormAddTour(this, true, (int) TourTable1.getModel().getValueAt(TourTable1.getSelectedRow(), 0));
        formAddTour.setVisible(true);
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourTable.showTable((ArrayList<TourModel>) tourData, TourTable1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (TourTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn tour cần xóa ! ");
            return;
        }
        SingletonBllUtil.getTourBLLInstance().delete(new int[]{(int) TourTable1.getModel().getValueAt(TourTable1.getSelectedRow(), 0)});
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourTable.showTable((ArrayList<TourModel>) tourData, TourTable1);
        diaDiem = SingletonBllUtil.getDiaDiemBLLInstance().findAll();
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) diaDiem, TourTable);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FormAddTour formAddTour = new FormAddTour(this, true);
        formAddTour.setVisible(true);
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        tourTable.showTable((ArrayList<TourModel>) tourData, TourTable1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TourTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourTable1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TourTable1MouseReleased

    private void TourTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourTable1MouseClicked
        // txtDacDiem.setText(tourData.get(DiaDiemTable.getSelectedRow()).getDacDiem());
        diaDiem = SingletonBllUtil.getTourBLLInstance().findDiaDiemOfTourById(tourData.get(TourTable1.getSelectedRow()).getId());
        diaDiemTable.showTable((ArrayList<DiaDiemModel>) diaDiem, TourTable);
    }//GEN-LAST:event_TourTable1MouseClicked

    private void TourTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TourTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TourTable1FocusGained

    private void txtSearchTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTourActionPerformed
        btnSearchTour.doClick();
    }//GEN-LAST:event_txtSearchTourActionPerformed

    private void TourTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourTableMouseReleased

    }//GEN-LAST:event_TourTableMouseReleased

    private void TourTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TourTableMouseClicked

    }//GEN-LAST:event_TourTableMouseClicked

    private void TourTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TourTableFocusGained

    }//GEN-LAST:event_TourTableFocusGained

    private void btnSearchTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTourActionPerformed
        String key = txtSearchTour.getText().toString();

        List<TourModel> result = tourData.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenTour().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        tourTable.showTable((ArrayList<TourModel>) result, TourTable1);
    }//GEN-LAST:event_btnSearchTourActionPerformed

    private void btnAddDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiaDiemActionPerformed
        FormAddNewDiaDiem form = new FormAddNewDiaDiem(this, true);
        form.setVisible(true);
        initPage2QuanLyDD();
    }//GEN-LAST:event_btnAddDiaDiemActionPerformed

    private void btnSearchDdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDdActionPerformed
        String key = txtSearchDd.getText().toString();
        diaDiem = SingletonBllUtil.getDiaDiemBLLInstance().findAll();
        List<DiaDiemModel> result = diaDiem.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenDiaDiem().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        diaDiemTable.showTable((ArrayList<DiaDiemModel>) result, DiaDiemTable2);
    }//GEN-LAST:event_btnSearchDdActionPerformed

    private void cbChonTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonTourActionPerformed
        cbChonTenDoan.removeAllItems();    
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        if(cbChonTour.getSelectedItem() != null){
            List<TourModel> model = tourData.stream().filter(c -> c.getTenTour().equals(cbChonTour.getSelectedItem().toString()))
                .collect(Collectors.toList());
        if(model != null){
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(model.get(0).getId());
        if (doanList != null) {
            doanList.forEach((item) -> {
                cbChonTenDoan.addItem(item.getTenDoan());
            });
        }
        }
        }
        
    }//GEN-LAST:event_cbChonTourActionPerformed

    private void cbChonTenDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonTenDoanActionPerformed
        ObjectMapper objectMapper = new ObjectMapper();
        nhanVienDaChon = (DefaultTableModel) NhanVienDaChonTable.getModel();
        nhanVienDaChon.setRowCount(0);
        khachHangDaChon = (DefaultTableModel) KhachHangDaChonTable.getModel();
        khachHangDaChon.setRowCount(0);
        nhanVienDaChonList = new ArrayList<>();
        khachHangDaChonList = new ArrayList<>();
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        List<DoanDuLichModel> doanModel = null;
        if (cbChonTenDoan.getSelectedIndex() != -1) {
            doanModel = doanList.stream().filter(c -> c.getTenDoan().equals(cbChonTenDoan.getSelectedItem().toString()))
                    .collect(Collectors.toList());
        }
        if (doanModel != null) {
            NguoiDiModel model = SingletonBllUtil.getNguoiDiBLLInstance().findByDoanId(doanModel.get(0).getId());
            if(model != null){
                List<KhachHangModel> defaultKhachHang = null;
            List<NhanVienModel> defaultNhanVien = null;
            
            try {
                defaultKhachHang = objectMapper.readValue(model.getDsKhach(), new TypeReference<List<KhachHangModel>>() {
                });
                defaultNhanVien = objectMapper.readValue(model.getDsNhanVien(), new TypeReference<List<NhanVienModel>>() {
                });
            } catch (JsonProcessingException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            nhanVienDaChonList = defaultNhanVien;
            khachHangDaChonList = defaultKhachHang;
            defaultKhachHang.forEach((item) -> {
                khachHangDaChon.addRow(new Object[]{
                    item.getId(), item.getTenKH()
                });
            });
            defaultNhanVien.forEach((item) -> {
                nhanVienDaChon.addRow(new Object[]{
                    item.getId(), item.getTenNhanVien(), item.getNhiemVuTrongDoan()
                });
            });
            }           
        }


    }//GEN-LAST:event_cbChonTenDoanActionPerformed

    private void btnDSDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSDoanActionPerformed
        tourData = SingletonBllUtil.getTourBLLInstance().findAll();
        TourModel model = tourData.stream().filter(c -> c.getTenTour().equals(cbChonTour.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        DoanDuLichModel doanModel = doanList.stream().filter(c -> c.getTenDoan().equals(cbChonTenDoan.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0);
        NguoiDiModel dsNguoiDi = new NguoiDiModel();
        dsNguoiDi.setDoanId(doanModel.getId());
        dsNguoiDi.setId(doanModel.getId());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonKhach = objectMapper.writeValueAsString(khachHangDaChonList);
            String jsonNhanVien = objectMapper.writeValueAsString(nhanVienDaChonList);
            dsNguoiDi.setDsKhach(jsonKhach);
            dsNguoiDi.setDsNhanVien(jsonNhanVien);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (SingletonBllUtil.getNguoiDiBLLInstance().findByDoanId(doanModel.getId()) == null) {
            SingletonBllUtil.getNguoiDiBLLInstance().save(dsNguoiDi);
            JOptionPane.showMessageDialog(this, "Thêm mới thành công");
        } else {
            int id = SingletonBllUtil.getNguoiDiBLLInstance().findByDoanId(doanModel.getId()).getId();
            dsNguoiDi.setId(id);
            SingletonBllUtil.getNguoiDiBLLInstance().update(dsNguoiDi);
            JOptionPane.showMessageDialog(this, "Update thành công");
        }

    }//GEN-LAST:event_btnDSDoanActionPerformed

    private void btnXoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKHActionPerformed
        if (KhachHangDaChonTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa !");
            return;
        }
        int index = KhachHangDaChonTable.getSelectedRow();
        khachHangDaChon = (DefaultTableModel) KhachHangDaChonTable.getModel();
        khachHangDaChon.removeRow(index);
        khachHangDaChonList.remove(index);
    }//GEN-LAST:event_btnXoaKHActionPerformed

    private void btnXoaNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNV1ActionPerformed
        if (NhanVienDaChonTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa !");
            return;
        }
        int index = NhanVienDaChonTable.getSelectedRow();
        nhanVienDaChon = (DefaultTableModel) NhanVienDaChonTable.getModel();
        nhanVienDaChon.removeRow(index);
        nhanVienDaChonList.remove(index);
    }//GEN-LAST:event_btnXoaNV1ActionPerformed

    private void btnPageThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPageThongKeMouseClicked
        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        pnlQLTour.setVisible(false);
        btnPage5.setBackground(new java.awt.Color(34, 45, 49));
        pnl5QLNhanVien.setVisible(false);
        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        pnlDiaDiem.setVisible(false);
        btnDSGiaTour.setBackground(new java.awt.Color(34, 45, 49));
        pnlDSGiaTour.setVisible(false);
        btnDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnl3QLDoan.setVisible(false);
        btnLapDSDoan.setBackground(new java.awt.Color(34, 45, 49));
        pnlLapDSDoan.setVisible(false);
        btnShowKH.setBackground(new java.awt.Color(34, 45, 49));
        pnl4QLKhachHang.setVisible(false);
        btnPage6.setBackground(new java.awt.Color(44, 59, 66));
        pnlThongKe.setVisible(true);
        pnlThongKeChiTiet.setVisible(false);
        initPageThongKe();

    }//GEN-LAST:event_btnPageThongKeMouseClicked

    private void btnPage6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPage6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPage6MouseClicked

    private void ThongKeTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThongKeTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeTableFocusGained

    private void ThongKeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeTableMouseClicked

    private void ThongKeTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeTableMouseReleased

    private void btnXemCTThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTThongKeActionPerformed
        if (ThongKeTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn tour cần xem chi tiết !");
            return;
        }
        int id = (int) ThongKeTable.getModel().getValueAt(ThongKeTable.getSelectedRow(), 0);
        String tenTour = ThongKeTable.getModel().getValueAt(ThongKeTable.getSelectedRow(), 1).toString();
        pnlThongKe.setVisible(false);
        pnlThongKeChiTiet.setVisible(true);
        paint_table(ThongKeChiTietTable);
        cbChonTourTK.setSelectedItem(tenTour);
        List<DoanDuLichModel> list = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(id);
        if (list == null) {
            return;
        }
        thongKeCTTable.showTable((ArrayList<DoanDuLichModel>) list, ThongKeChiTietTable);


    }//GEN-LAST:event_btnXemCTThongKeActionPerformed

    private void ThongKeChiTietTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThongKeChiTietTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeChiTietTableFocusGained

    private void ThongKeChiTietTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeChiTietTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeChiTietTableMouseClicked

    private void ThongKeChiTietTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeChiTietTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongKeChiTietTableMouseReleased

    private void btnXemChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiPhiActionPerformed
      int tourId = tourData.stream().filter(a -> a.getTenTour().equals(cbChonTourTK.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0).getId();
      int doanId = (int) ThongKeChiTietTable.getModel().getValueAt(ThongKeChiTietTable.getSelectedRow(), 0);
      FormChiPhi formChiPhi = new FormChiPhi(this, true,tourId,doanId);
      formChiPhi.setVisible(true);
      cbChonTourTK.setSelectedIndex(cbChonTourTK.getSelectedIndex());
      
    }//GEN-LAST:event_btnXemChiPhiActionPerformed

    private void cbChonTourTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChonTourTKActionPerformed

        int tourId = tourData.stream().filter(a -> a.getTenTour().equals(cbChonTourTK.getSelectedItem().toString()))
                .collect(Collectors.toList()).get(0).getId();
        List<DoanDuLichModel> list = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(tourId);
        if (list == null) {
            thongKeCTTable.showTable(new ArrayList<DoanDuLichModel>(), ThongKeChiTietTable);
            JOptionPane.showMessageDialog(pnlThongKeChiTiet, "Không tìm thấy !!!");
            return;
        }
       
        thongKeCTTable.showTable((ArrayList<DoanDuLichModel>) list, ThongKeChiTietTable);
        Double tongDoanhThu=0.0,tongChiPhi=0.0,tongLoiNhuan=0.0;
        for(DoanDuLichModel item : list){
            int tongSoKhach = SingletonBllUtil.getDoanDuLichBLLInstance().countKhachHangInDoan(item.getId());
            tongDoanhThu += item.getGiaTour()*tongSoKhach;
            ChiPhiModel chiPhiModel = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(item.getId());
            if(chiPhiModel != null){
                tongChiPhi+=chiPhiModel.getTotal();
            }
                   
        }
        txtTongDoanhThu1.setText(currency(tongDoanhThu));
        txtTongChiPhi1.setText(currency(tongChiPhi));
        txtLai.setText(currency(tongDoanhThu-tongChiPhi));

    }//GEN-LAST:event_cbChonTourTKActionPerformed

    private void btnBackTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackTKActionPerformed
        pnlThongKeChiTiet.setVisible(false);
        pnlThongKe.setVisible(true);
        initPageThongKe();
    }//GEN-LAST:event_btnBackTKActionPerformed

    private void txtSearchTourTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTourTKActionPerformed
        btnSearch.doClick();
    }//GEN-LAST:event_txtSearchTourTKActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String key = txtSearchTourTK.getText().toString();

        List<TourModel> result = tourData.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenTour().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        thongKeTable.showTable((ArrayList<TourModel>) result, ThongKeTable);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoanActionPerformed
        String key = txtSearchDoan.getText().toString();
        doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findAll();
        List<DoanDuLichModel> result = doanList.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenDoan().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        doanTable.showTable((ArrayList<DoanDuLichModel>) result, DoanTable);
    }//GEN-LAST:event_btnSearchDoanActionPerformed

    private void btnSearchKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchKHActionPerformed
        String key = txtSearchKH.getText().toString();
        khachHangList = SingletonBllUtil.getKhachHangBLLInstance().findAll();
        List<KhachHangModel> result = khachHangList.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenKH().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        khachHangTable.showTable((ArrayList<KhachHangModel>) result, KhachHangTable);
    }//GEN-LAST:event_btnSearchKHActionPerformed

    private void btnSearchNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNVActionPerformed
        String key = txtSearchNV.getText().toString();
        nhanVienList = SingletonBllUtil.getNhanVienBLLInstance().findAll();
        List<NhanVienModel> result = nhanVienList.stream()
                .filter(a -> String.valueOf(a.getId()).equals(key) || (a.getTenNhanVien().toLowerCase()).indexOf(key.toLowerCase()) != -1)
                .collect(Collectors.toList());

        nhanVienTable.showTable((ArrayList<NhanVienModel>) result, NhanVienTable);
    }//GEN-LAST:event_btnSearchNVActionPerformed

    private void btnQuit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuit1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DiaDiemTable2;
    private javax.swing.JTable DoanTable;
    private javax.swing.JTable GiaTourTable;
    private javax.swing.JTable KhachHangDaChonTable;
    private javax.swing.JTable KhachHangTable;
    private javax.swing.JTable NhanVienDaChonTable;
    private javax.swing.JTable NhanVienTable;
    private javax.swing.JLabel TestVar;
    private javax.swing.JLabel TestVar10;
    private javax.swing.JLabel TestVar2;
    private javax.swing.JLabel TestVar3;
    private javax.swing.JLabel TestVar6;
    private javax.swing.JTable ThongKeChiTietTable;
    private javax.swing.JTable ThongKeTable;
    private javax.swing.JTable TourTable;
    private javax.swing.JTable TourTable1;
    private javax.swing.JButton btnAddDiaDiem;
    private javax.swing.JButton btnAddGiaTour;
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnBackTK;
    private javax.swing.JButton btnDSDoan;
    private javax.swing.JPanel btnDSGiaTour;
    private javax.swing.JPanel btnDash;
    private javax.swing.JLabel btnDashBoard1;
    private javax.swing.JButton btnDeleteDiaDiem;
    private javax.swing.JButton btnDeleteDoan;
    private javax.swing.JButton btnDeleteDoan3;
    private javax.swing.JButton btnDeleteKH;
    private javax.swing.JPanel btnDoan;
    private javax.swing.JPanel btnLapDSDoan;
    private javax.swing.JLabel btnLapDoan;
    private javax.swing.JPanel btnPage5;
    private javax.swing.JPanel btnPage6;
    private javax.swing.JLabel btnPageNhanVien;
    private javax.swing.JLabel btnPageThongKe;
    private javax.swing.JLabel btnQuit;
    private javax.swing.JLabel btnQuit1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetDoan4;
    private javax.swing.JButton btnResetGiaTour;
    private javax.swing.JButton btnResetKH;
    private javax.swing.JButton btnSaveDiaDiem;
    private javax.swing.JButton btnSaveGiaTour;
    private javax.swing.JButton btnSaveKH;
    private javax.swing.JButton btnSaveNhanVien;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchDd;
    private javax.swing.JButton btnSearchDoan;
    private javax.swing.JButton btnSearchKH;
    private javax.swing.JButton btnSearchNV;
    private javax.swing.JButton btnSearchTour;
    private javax.swing.JButton btnSelectKH;
    private javax.swing.JButton btnSelectNV;
    private javax.swing.JPanel btnShowKH;
    private javax.swing.JPanel btnTest;
    private javax.swing.JPanel btnTest1;
    private javax.swing.JPanel btnTest6;
    private javax.swing.JButton btnUpdateDoan;
    private javax.swing.JButton btnXemCTThongKe;
    private javax.swing.JButton btnXemChiPhi;
    private javax.swing.JButton btnXemDsKH;
    private javax.swing.JButton btnXemGiaTour;
    private javax.swing.JButton btnXoaGiaTour;
    private javax.swing.JButton btnXoaKH;
    private javax.swing.JButton btnXoaNV1;
    private javax.swing.JComboBox<String> cbChonTP;
    private javax.swing.JComboBox<String> cbChonTenDoan;
    private javax.swing.JComboBox<String> cbChonTour;
    private javax.swing.JComboBox<String> cbChonTourTK;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JComboBox<String> cbListTour;
    private com.toedter.calendar.JDateChooser dateDenNgay;
    private com.toedter.calendar.JDateChooser dateNgaySinhKH;
    private com.toedter.calendar.JDateChooser dateTuNgay;
    private javax.swing.JLabel jAbout;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel18;
    private keeptoo.KGradientPanel kGradientPanel19;
    private keeptoo.KGradientPanel kGradientPanel30;
    private keeptoo.KGradientPanel kGradientPanel31;
    private keeptoo.KGradientPanel kGradientPanel32;
    private keeptoo.KGradientPanel kGradientPanel33;
    private keeptoo.KGradientPanel kGradientPanel34;
    private keeptoo.KGradientPanel kGradientPanel35;
    private keeptoo.KGradientPanel kGradientPanel36;
    private keeptoo.KGradientPanel kGradientPanel37;
    private keeptoo.KGradientPanel kGradientPanel38;
    private keeptoo.KGradientPanel kGradientPanel39;
    private keeptoo.KGradientPanel kGradientPanel40;
    private keeptoo.KGradientPanel kGradientPanel41;
    private keeptoo.KGradientPanel kGradientPanel42;
    private keeptoo.KGradientPanel kGradientPanel43;
    private keeptoo.KGradientPanel kGradientPanel44;
    private keeptoo.KGradientPanel kGradientPanel45;
    private keeptoo.KGradientPanel kGradientPanel46;
    private keeptoo.KGradientPanel kGradientPanel47;
    private keeptoo.KGradientPanel kGradientPanel48;
    private keeptoo.KGradientPanel kGradientPanel49;
    private keeptoo.KGradientPanel kGradientPanel50;
    private keeptoo.KGradientPanel kGradientPanel51;
    private keeptoo.KGradientPanel kGradientPanel52;
    private keeptoo.KGradientPanel kGradientPanel53;
    private keeptoo.KGradientPanel kGradientPanel54;
    private keeptoo.KGradientPanel kGradientPanel55;
    private keeptoo.KGradientPanel kGradientPanel56;
    private keeptoo.KGradientPanel kGradientPanel57;
    private keeptoo.KGradientPanel kGradientPanel58;
    private keeptoo.KGradientPanel kGradientPanel59;
    private keeptoo.KGradientPanel kGradientPanel60;
    private keeptoo.KGradientPanel kGradientPanel61;
    private keeptoo.KGradientPanel kGradientPanel62;
    private keeptoo.KGradientPanel kGradientPanel63;
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
    private javax.swing.JPanel pnl3QLDoan;
    private javax.swing.JPanel pnl4QLKhachHang;
    private javax.swing.JPanel pnl5QLNhanVien;
    private javax.swing.JPanel pnlDSGiaTour;
    private javax.swing.JPanel pnlDiaDiem;
    private javax.swing.JPanel pnlLapDSDoan;
    private javax.swing.JPanel pnlQLTour;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JPanel pnlThongKeChiTiet;
    private javax.swing.JTextField tfDapAn15;
    private javax.swing.JTextField tfDapAn16;
    private javax.swing.JTextField tfDapAn17;
    private javax.swing.JTextField tfDapAn18;
    private javax.swing.JTextField tfDapAn19;
    private javax.swing.JTextField tfDapAn20;
    private javax.swing.JTextField tfDapAn21;
    private javax.swing.JTextField tfDapAn22;
    private javax.swing.JTextField tfDapAn23;
    private javax.swing.JTextField tfDapAn24;
    private javax.swing.JTextField tfDapAn25;
    private javax.swing.JTextField tfDapAn26;
    private javax.swing.JTextField tfDapAn27;
    private javax.swing.JTextField tfDapAn28;
    private javax.swing.JTextField tfDapAn29;
    private javax.swing.JTextField tfDapAn30;
    private javax.swing.JTextField tfDapAn31;
    private javax.swing.JTextField tfDapAn32;
    private javax.swing.JTextField tfDapAn33;
    private javax.swing.JTextField tfDapAn34;
    private javax.swing.JTextField tfDapAn35;
    private javax.swing.JTextField tfDapAn36;
    private javax.swing.JTextField tfDapAn37;
    private javax.swing.JTextField tfDapAn5;
    private javax.swing.JTextField tfDapAn9;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaDiem1;
    private javax.swing.JTextField txtEmail_nv;
    private javax.swing.JTextField txtEmailiKH;
    private javax.swing.JTextField txtGiaTour;
    private javax.swing.JTextField txtGiaTour1;
    private javax.swing.JTextField txtGiaTour3;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdGiaTour;
    private javax.swing.JTextField txtIdKH;
    private javax.swing.JLabel txtLai;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextArea txtMoTa1;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSdtKH;
    private javax.swing.JTextField txtSearchDd;
    private javax.swing.JTextField txtSearchDoan;
    private javax.swing.JTextField txtSearchKH;
    private javax.swing.JTextField txtSearchNV;
    private javax.swing.JTextField txtSearchTour;
    private javax.swing.JTextField txtSearchTourTK;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenKH1;
    private javax.swing.JTextField txtTenKH10;
    private javax.swing.JTextField txtTenKH11;
    private javax.swing.JTextField txtTenKH12;
    private javax.swing.JTextField txtTenKH13;
    private javax.swing.JTextField txtTenKH14;
    private javax.swing.JTextField txtTenKH15;
    private javax.swing.JTextField txtTenKH2;
    private javax.swing.JTextField txtTenKH3;
    private javax.swing.JTextField txtTenKH4;
    private javax.swing.JTextField txtTenKH5;
    private javax.swing.JTextField txtTenKH6;
    private javax.swing.JTextField txtTenKH7;
    private javax.swing.JTextField txtTenKH9;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JLabel txtTongChiPhi1;
    private javax.swing.JLabel txtTongDoanhThu1;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon_exam.png")));
    }

    private void paint_table(JTable table) {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
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
//
}
