package DTO;

import java.sql.Date;

public class DoanDuLichModel extends AbstractModel<DoanDuLichModel> {
	//private int maDoan;
    private String tenDoan;
    private Date ngayDi;
    private Date ngayVe;
    private int tour_id;
    private String moTa;
    private Double giaTour;

    public Double getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(Double giaTour) {
        this.giaTour = giaTour;
    }
    

    public String getTenDoan() {
        return tenDoan;
    }

    public void setTenDoan(String tenDoan) {
        this.tenDoan = tenDoan;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }

    public Date getNgayVe() {
        return ngayVe;
    }

    public void setNgayVe(Date ngayVe) {
        this.ngayVe = ngayVe;
    }

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
    
}
