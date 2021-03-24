/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author hocgioinhatlop
 */
public class GiaTourModel extends AbstractModel<GiaTourModel>{
    private double soTien;
    private int tour_id;
    private Date giaTuNgay;
    private Date giaDenNgay;

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    

    public int getTour_id() {
        return tour_id;
    }

    public void setTour_id(int tour_id) {
        this.tour_id = tour_id;
    }

    public Date getGiaTuNgay() {
        return giaTuNgay;
    }

    public void setGiaTuNgay(Date giaTuNgay) {
        this.giaTuNgay = giaTuNgay;
    }

    public Date getGiaDenNgay() {
        return giaDenNgay;
    }

    public void setGiaDenNgay(Date giaDenNgay) {
        this.giaDenNgay = giaDenNgay;
    }
    
    
}
