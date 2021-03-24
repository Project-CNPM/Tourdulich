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
public class DiaDiemModel extends AbstractModel<DiaDiemModel> {
    private String tenDiaDiem;
    private String thanhPho;
    private String moTa;
    private String tinhtrang;

    public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public String getTenDiaDiem() {
        return tenDiaDiem;
        }

        public void setTenDiaDiem(String tenDiaDiem) {
            this.tenDiaDiem = tenDiaDiem;
        }

        public String getThanhPho() {
            return thanhPho;
        }

        public void setThanhPho(String thanhPho) {
            this.thanhPho = thanhPho;
        }

    
    
}
