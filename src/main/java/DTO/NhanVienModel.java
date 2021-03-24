package DTO;

import java.sql.Date;

public class NhanVienModel extends AbstractModel<NhanVienModel> {
	private String tenNhanVien;
	private Date ngaySinh;
	private String email;
	private String sdt;
        private String nhiemVu;
        private String nhiemVuTrongDoan;

    public String getNhiemVuTrongDoan() {
        return nhiemVuTrongDoan;
    }

    public void setNhiemVuTrongDoan(String nhiemVuTrongDoan) {
        this.nhiemVuTrongDoan = nhiemVuTrongDoan;
    }
        
        

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
	
	
	
	
	

}
