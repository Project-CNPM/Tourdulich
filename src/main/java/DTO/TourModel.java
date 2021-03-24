package DTO;

import java.util.List;


public class TourModel extends AbstractModel<TourModel> {
	//private int maTour;
    private String tenTour;
    private String moTa;
    private String diemKH;
    private String diemDen;
    private int loai_id;
    private int gia_id;
     private List<DiaDiemModel> listDiaDiem;

    public int getGia_id() {
        return gia_id;
    }

    public void setGia_id(int gia_id) {
        this.gia_id = gia_id;
    }
   
    

    public List<DiaDiemModel> getListDiaDiem() {
        return listDiaDiem;
    }

    public void setListDiaDiem(List<DiaDiemModel> listDiaDiem) {
        this.listDiaDiem = listDiaDiem;
    }
        
        
	public String getTenTour() {
		return tenTour;
	}
	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getLoai_id() {
        return loai_id;
    }

    public void setLoai_id(int loai_id) {
        this.loai_id = loai_id;
    }
	
	

}
