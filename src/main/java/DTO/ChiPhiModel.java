/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public class ChiPhiModel extends AbstractModel<ChiPhiModel>{   
    private int doanId;
    private Double total;
    private List<ChiPhiChiTietModel> listChiPhi;

    public int getDoanId() {
        return doanId;
    }

    public void setDoanId(int doanId) {
        this.doanId = doanId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<ChiPhiChiTietModel> getListChiPhi() {
        return listChiPhi;
    }

    public void setListChiPhi(List<ChiPhiChiTietModel> listChiPhi) {
        this.listChiPhi = listChiPhi;
    }
    
}
