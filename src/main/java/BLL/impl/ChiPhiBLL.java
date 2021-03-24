package BLL.impl;

import BLL.IChiPhiBLL;
import DTO.ChiPhiModel;
import java.util.List;
import DTO.GiaTourModel;
import Singleton.SingletonDaoUtil;

public class ChiPhiBLL implements IChiPhiBLL {
	
        @Override
	public List<ChiPhiModel> findAll() {		
		return SingletonDaoUtil.getChiPhiDAOInstance().findAll();
	}

        @Override
        public ChiPhiModel save(ChiPhiModel newModel) {
            
             int id = SingletonDaoUtil.getChiPhiDAOInstance().save(newModel);
             return SingletonDaoUtil.getChiPhiDAOInstance().findById(id);
        }

    @Override
    public ChiPhiModel update(ChiPhiModel updateNew) {
        SingletonDaoUtil.getChiPhiDAOInstance().update(updateNew);
	return SingletonDaoUtil.getChiPhiDAOInstance().findById(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
        for (int id: ids) {
	SingletonDaoUtil.getChiPhiDAOInstance().delete(id);
       }
    }

    @Override
    public ChiPhiModel findById(int id) {
        return SingletonDaoUtil.getChiPhiDAOInstance().findById(id);
    }

    @Override
    public ChiPhiModel findByDoanId(int id) {
       return SingletonDaoUtil.getChiPhiDAOInstance().findByDoanId(id);
    }
}
