package Singleton;

import DAL.impl.ChiPhiDAO;
import DAL.impl.DiaDiemDAO;
import DAL.impl.DoanDuLichDAO;
import DAL.impl.GiaTourDAO;
import DAL.impl.KhachHangDAO;
import DAL.impl.LoaiTourDAO;
import DAL.impl.NguoiDiDAO;
import DAL.impl.NhanVienDAO;
import DAL.impl.TourDAO;


public class SingletonDaoUtil {
    private static NhanVienDAO nhanVienDAO=null;
    private static KhachHangDAO khachHangDAO=null;
    private static LoaiTourDAO loaiTourDAO=null;
    private static TourDAO tourDAO=null;
    private static DoanDuLichDAO doanDuLichDAO=null;
    private static DiaDiemDAO diaDiemDAO=null;
    private static GiaTourDAO giaTourDAO=null;
    private static NguoiDiDAO nguoiDiDAO=null;
    private static ChiPhiDAO chiPhiDAO= null;
    
    
    public static ChiPhiDAO getChiPhiDAOInstance(){
        if(chiPhiDAO==null){
            chiPhiDAO=new ChiPhiDAO();
        }
        return chiPhiDAO;
    }
    public static NguoiDiDAO getNguoiDiDAOInstance(){
        if(nguoiDiDAO==null){
            nguoiDiDAO=new NguoiDiDAO();
        }
        return nguoiDiDAO;
    }

    public static NhanVienDAO getNhanVienDAOInstance(){
        if(nhanVienDAO==null){
            nhanVienDAO=new NhanVienDAO();
        }
        return nhanVienDAO;
    }
    public static KhachHangDAO getKhachHangDAOInstance(){
        if(khachHangDAO==null){
            khachHangDAO=new KhachHangDAO();
        }
        return khachHangDAO;
    }
    public static LoaiTourDAO getLoaiTourDAOInstance(){
        if(loaiTourDAO==null){
            loaiTourDAO=new LoaiTourDAO();
        }
        return loaiTourDAO;
    }
    public static TourDAO getTourDAOInstance(){
        if(tourDAO==null){
            tourDAO=new TourDAO();
        }
        return tourDAO;
    }
    public static DoanDuLichDAO getDoanDuLichDAOInstance(){
        if(doanDuLichDAO==null){
            doanDuLichDAO=new DoanDuLichDAO();
        }
        return doanDuLichDAO;
    }
    public static DiaDiemDAO getDiaDiemDAOInstance(){
        if(diaDiemDAO==null){
            diaDiemDAO=new DiaDiemDAO();
        }
        return diaDiemDAO;
    }
    public static GiaTourDAO getGiaTourDAOInstance(){
        if(giaTourDAO==null){
            giaTourDAO=new GiaTourDAO();
        }
        return giaTourDAO;
    }
 
}
