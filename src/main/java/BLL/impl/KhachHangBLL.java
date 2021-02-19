package BLL.impl;

import java.util.List;

import BLL.IKhachHangBLL;
import DAL.IKhachHangDAO;
import DAL.impl.KhachHangDAO;
import DTO.KhachHangModel;

public class KhachHangBLL implements IKhachHangBLL {
	private IKhachHangDAO khachHangDao;
	@Override
	public List<KhachHangModel> findAll() {
		khachHangDao = new KhachHangDAO();
		return khachHangDao.findAll();
	}

}
