package Singleton;

import BLL.impl.ChiPhiBLL;
import BLL.impl.DiaDiemBLL;
import BLL.impl.DoanDuLichBLL;
import BLL.impl.GiaTourBLL;
import BLL.impl.KhachHangBLL;
import BLL.impl.LoaiTourBLL;
import BLL.impl.NguoiDiBLL;
import BLL.impl.NhanVienBLL;
import BLL.impl.TourBLL;



public class SingletonBllUtil {
    private static NhanVienBLL nhanVienBLL=null;
    private static KhachHangBLL khachHangBLL=null;
    private static LoaiTourBLL loaiTourBLL=null;
    private static TourBLL tourBLL=null;
    private static DoanDuLichBLL doanDuLichBLL=null;
    private static DiaDiemBLL diaDiemBLL=null;
    private static GiaTourBLL giaTourBLL=null;
    private static NguoiDiBLL nguoiDiBLL=null;
    private static ChiPhiBLL chiPhiBLL= null;
    
    
    public static ChiPhiBLL getChiPhiBLLInstance(){
        if(chiPhiBLL==null){
            chiPhiBLL=new ChiPhiBLL();
        }
        return chiPhiBLL;
    }
    public static NguoiDiBLL getNguoiDiBLLInstance(){
        if(nguoiDiBLL==null){
            nguoiDiBLL=new NguoiDiBLL();
        }
        return nguoiDiBLL;
    }
    
    public static NhanVienBLL getNhanVienBLLInstance(){
        if(nhanVienBLL==null){
            nhanVienBLL=new NhanVienBLL();
        }
        return nhanVienBLL;
    }
    public static KhachHangBLL getKhachHangBLLInstance(){
        if(khachHangBLL==null){
            khachHangBLL=new KhachHangBLL();
        }
        return khachHangBLL;
    }
    public static LoaiTourBLL getLoaiTourBLLInstance(){
        if(loaiTourBLL==null){
            loaiTourBLL=new LoaiTourBLL();
        }
        return loaiTourBLL;
    }
    public static TourBLL getTourBLLInstance(){
        if(tourBLL==null){
            tourBLL=new TourBLL();
        }
        return tourBLL;
    }
    public static DoanDuLichBLL getDoanDuLichBLLInstance(){
        if(doanDuLichBLL==null){
            doanDuLichBLL=new DoanDuLichBLL();
        }
        return doanDuLichBLL;
    }
    public static DiaDiemBLL getDiaDiemBLLInstance(){
        if(diaDiemBLL==null){
            diaDiemBLL=new DiaDiemBLL();
        }
        return diaDiemBLL;
    }
    public static GiaTourBLL getGiaTourBLLInstance(){
        if(giaTourBLL==null){
            giaTourBLL=new GiaTourBLL();
        }
        return giaTourBLL;
    }
 
}
