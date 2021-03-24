package BLL.impl;

import java.util.List;

import BLL.IChucVuBLL;
import BLL.IGiaTourBLL;
import DAL.IChucVuDAO;
import DAL.impl.ChucVuDAO;
import DTO.ChucVuModel;
import DTO.GiaTourModel;
import Singleton.SingletonDaoUtil;

public class GiaTourBLL implements IGiaTourBLL {
	
        @Override
	public List<GiaTourModel> findAll() {		
		return SingletonDaoUtil.getGiaTourDAOInstance().findAll();
	}

        @Override
        public GiaTourModel save(GiaTourModel newModel) {
            
             int id = SingletonDaoUtil.getGiaTourDAOInstance().save(newModel);
             return SingletonDaoUtil.getGiaTourDAOInstance().findById(id);
        }

    @Override
    public GiaTourModel update(GiaTourModel updateNew) {
        SingletonDaoUtil.getGiaTourDAOInstance().update(updateNew);
	return SingletonDaoUtil.getGiaTourDAOInstance().findById(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
        for (int id: ids) {
	SingletonDaoUtil.getGiaTourDAOInstance().delete(id);
       }
    }

    @Override
    public GiaTourModel findById(int id) {
        return SingletonDaoUtil.getGiaTourDAOInstance().findById(id);
    }

    @Override
    public List<GiaTourModel> findByTourId(int id) {
       return SingletonDaoUtil.getGiaTourDAOInstance().findByTourId(id);
    }
}
