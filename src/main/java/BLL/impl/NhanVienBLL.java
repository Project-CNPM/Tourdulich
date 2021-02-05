package BLL.impl;

import java.util.List;

import BLL.INhanVienBLL;
import DAL.INhanVienDLDAO;
import DAL.impl.NhanVienDLDAO;
import DTO.NhanVienDLModel;

public class NhanVienBLL implements INhanVienBLL {
	private INhanVienDLDAO nhanVienDao;
	
	@Override
	public List<NhanVienDLModel> findAll() {
		nhanVienDao = new NhanVienDLDAO();
		return nhanVienDao.findAll();
	}

}
