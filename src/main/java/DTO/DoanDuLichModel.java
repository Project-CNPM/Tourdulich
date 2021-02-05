package DTO;

import java.sql.Date;

public class DoanDuLichModel extends AbstractModel<DoanDuLichModel> {
	//private int maDoan;
    private String tenDoan;
    private Date ngayKH;
    private Date ngayKT;
    private String chiPhi;
    private String mota;
    
//	public int getMaDoan() {
//		return maDoan;
//	}
//	public void setMaDoan(int maDoan) {
//		this.maDoan = maDoan;
//	}
	public String getTenDoan() {
		return tenDoan;
	}
	public void setTenDoan(String tenDoan) {
		this.tenDoan = tenDoan;
	}
	public Date getNgayKH() {
		return ngayKH;
	}
	public void setNgayKH(Date ngayKH) {
		this.ngayKH = ngayKH;
	}
	public Date getNgayKT() {
		return ngayKT;
	}
	public void setNgayKT(Date ngayKT) {
		this.ngayKT = ngayKT;
	}
	public String getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(String chiPhi) {
		this.chiPhi = chiPhi;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
    
}
