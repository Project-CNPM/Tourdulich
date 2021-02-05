package BLL.impl;

import java.util.List;

import BLL.IDoanDLBLL;
import DAL.IDoanDLDAO;
import DAL.impl.DoanDLDAO;
import DTO.DoanDLModel;

public class DoanDLBLL implements IDoanDLBLL {
	private IDoanDLDAO doanDLDao;
    
	@Override
	public List<DoanDLModel> findAll() {
        doanDLDao = new DoanDLDAO();
	return doanDLDao.findAll();
	}
}
