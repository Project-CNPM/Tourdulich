/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author hocgioinhatlop
 */
public class NguoiDiModel extends AbstractModel<ChucVuModel> {
    private int doanId;
    private String dsNhanVien;
    private String dsKhach;

    public int getDoanId() {
        return doanId;
    }

    public void setDoanId(int doanId) {
        this.doanId = doanId;
    }

    public String getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(String dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    public String getDsKhach() {
        return dsKhach;
    }

    public void setDsKhach(String dsKhach) {
        this.dsKhach = dsKhach;
    }
    
    
    
}
