package BLL.impl;

import java.util.List;

import BLL.INhanVienBLL;
import DTO.NhanVienModel;
import Singleton.SingletonDaoUtil;

public class NhanVienBLL implements INhanVienBLL {
	
	
	@Override
	public List<NhanVienModel> findAll() {		
		return SingletonDaoUtil.getNhanVienDAOInstance().findAll();
	}

        @Override
        public NhanVienModel save(NhanVienModel newModel) {
            
             int id = SingletonDaoUtil.getNhanVienDAOInstance().save(newModel);
             return SingletonDaoUtil.getNhanVienDAOInstance().findOne(id);
        }

    @Override
    public NhanVienModel update(NhanVienModel updateNew) {
        
        SingletonDaoUtil.getNhanVienDAOInstance().update(updateNew);
	return SingletonDaoUtil.getNhanVienDAOInstance().findOne(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
       
        for (int id: ids) {
	SingletonDaoUtil.getNhanVienDAOInstance().delete(id);
      
    }
    }
    @Override
    public NhanVienModel findById(int id) {
        return SingletonDaoUtil.getNhanVienDAOInstance().findOne(id);
    }

}
