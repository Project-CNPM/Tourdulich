package DTO;

import java.sql.Date;

public class NhanVienModel extends AbstractModel<NhanVienModel> {
	private String tenNhanVien;
	private String gioiTinh;
	private Date ngaySinh;
	private String diaChi;
	private int sdt;
	private int chucvu_MACV;
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public int getChucvu_MACV() {
		return chucvu_MACV;
	}
	public void setChucvu_MACV(int chucvu_MACV) {
		this.chucvu_MACV = chucvu_MACV;
	}
	
	

}
