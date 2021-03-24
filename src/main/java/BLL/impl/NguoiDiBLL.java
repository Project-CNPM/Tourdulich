package BLL.impl;

import java.util.List;

import BLL.INguoiDiBLL;
import DTO.GiaTourModel;
import DTO.NguoiDiModel;
import Singleton.SingletonDaoUtil;

public class NguoiDiBLL implements INguoiDiBLL {
	
        @Override
	public List<NguoiDiModel> findAll() {		
		return SingletonDaoUtil.getNguoiDiDAOInstance().findAll();
	}

        @Override
        public NguoiDiModel save(NguoiDiModel newModel) {
            
             int id = SingletonDaoUtil.getNguoiDiDAOInstance().save(newModel);
             return SingletonDaoUtil.getNguoiDiDAOInstance().findById(id);
        }

    @Override
    public NguoiDiModel update(NguoiDiModel updateNew) {
        SingletonDaoUtil.getNguoiDiDAOInstance().update(updateNew);
	return SingletonDaoUtil.getNguoiDiDAOInstance().findById(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
        for (int id: ids) {
	SingletonDaoUtil.getGiaTourDAOInstance().delete(id);
       }
    }

    @Override
    public NguoiDiModel findById(int id) {
        return SingletonDaoUtil.getNguoiDiDAOInstance().findById(id);
    }

    @Override
    public NguoiDiModel findByDoanId(int id) {
       return SingletonDaoUtil.getNguoiDiDAOInstance().findByDoanId(id);
    }
    
}
