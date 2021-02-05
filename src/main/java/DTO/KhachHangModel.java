package DTO;

import java.sql.Date;

public class KhachHangModel extends AbstractModel<KhachHangModel> {
	
	private String tenKH;
	private String gioiTinh;
	private String diaChi;
	private Date ngaySinh;
	private int cmnd;
	private int sdt;
	private String quocTich;
	private int doanDuLich_MaDoan;
	
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public int getDoanDuLich_MaDoan() {
		return doanDuLich_MaDoan;
	}
	public void setDoanDuLich_MaDoan(int doanDuLich_MaDoan) {
		this.doanDuLich_MaDoan = doanDuLich_MaDoan;
	}
	
}
