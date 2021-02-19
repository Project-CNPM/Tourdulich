package BLL.impl;

import java.util.List;

import BLL.IDoanDuLichBLL;
import DAL.IDoanDuLichDAO;
import DAL.impl.DoanDuLichDAO;
import DTO.DoanDuLichModel;

public class DoanDuLichBLL implements IDoanDuLichBLL {
	private IDoanDuLichDAO doanDLDao;
    
	@Override
	public List<DoanDuLichModel> findAll() {
        doanDLDao = new DoanDuLichDAO();
	return doanDLDao.findAll();
	}
}
