package BLL.impl;

import java.util.List;

import BLL.INhanVienBLL;
import DAL.INhanVienDAO;
import DAL.impl.NhanVienDAO;
import DTO.NhanVienModel;

public class NhanVienBLL implements INhanVienBLL {
	private INhanVienDAO nhanVienDao;
	
	@Override
	public List<NhanVienModel> findAll() {
		nhanVienDao = new NhanVienDAO();
		return nhanVienDao.findAll();
	}

}
