package BLL.impl;

import java.util.List;

import BLL.ILoaiTourBLL;
import DTO.ChucVuModel;
import DTO.LoaiTourModel;
import Singleton.SingletonDaoUtil;

public class LoaiTourBLL implements ILoaiTourBLL {
	
	@Override
	public List<LoaiTourModel> findAll() {
            return SingletonDaoUtil.getLoaiTourDAOInstance().findAll();
	}

    @Override
    public LoaiTourModel findById(int id) {
       return SingletonDaoUtil.getLoaiTourDAOInstance().findById(id);
    }

}
