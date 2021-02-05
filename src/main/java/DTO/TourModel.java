package DTO;


public class TourModel extends AbstractModel<TourModel> {
	//private int maTour;
    private String tenTour;
    private String dacDiem;
    private String diemKH;
    private String diemDen;
    private String phuongTien;
    private String chiPhi;
    private int loaidulich_MaLoai;
    
    //	public int getMaTour() {
//		return maTour;
//	}
//	public void setMaTour(int maTour) {
//		this.maTour = maTour;
//	}
	public String getTenTour() {
		return tenTour;
	}
	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
	}
	public String getDacDiem() {
		return dacDiem;
	}
	public void setDacDiem(String dacDiem) {
		this.dacDiem = dacDiem;
	}
	public String getDiemKH() {
		return diemKH;
	}
	public void setDiemKH(String diemKH) {
		this.diemKH = diemKH;
	}
	public String getDiemDen() {
		return diemDen;
	}
	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}
	public String getPhuongTien() {
		return phuongTien;
	}
	public void setPhuongTien(String phuongTien) {
		this.phuongTien = phuongTien;
	}
	public String getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(String chiPhi) {
		this.chiPhi = chiPhi;
	}
	public int getLoaidulich_MaLoai() {
		return loaidulich_MaLoai;
	}
	public void setLoaidulich_MaLoai(int loaidulich_MaLoai) {
		this.loaidulich_MaLoai = loaidulich_MaLoai;
	}

}
