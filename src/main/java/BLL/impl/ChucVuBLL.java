package BLL.impl;

import java.util.List;

import BLL.IChucVuBLL;
import DAL.IChucVuDAO;
import DAL.impl.ChucVuDAO;
import DTO.ChucVuModel;

public class ChucVuBLL implements IChucVuBLL {
	private IChucVuDAO chucVuDao;
	@Override
	public List<ChucVuModel> findAll() {
		chucVuDao = new ChucVuDAO();
		return chucVuDao.findAll();
	}

}
