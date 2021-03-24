package BLL.impl;

import java.util.List;

import BLL.IKhachHangBLL;

import DTO.KhachHangModel;
import Singleton.SingletonDaoUtil;

public class KhachHangBLL implements IKhachHangBLL {
	
	@Override
	public List<KhachHangModel> findAll() {
		
		return SingletonDaoUtil.getKhachHangDAOInstance().findAll();
	}
        @Override
        public KhachHangModel save(KhachHangModel newModel) {
            
             int id = SingletonDaoUtil.getKhachHangDAOInstance().save(newModel);
             return SingletonDaoUtil.getKhachHangDAOInstance().findOne(id);
        }

    @Override
    public KhachHangModel update(KhachHangModel updateNew) {
        SingletonDaoUtil.getKhachHangDAOInstance().update(updateNew);
	return SingletonDaoUtil.getKhachHangDAOInstance().findOne(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
        for (int id: ids) {
	SingletonDaoUtil.getKhachHangDAOInstance().delete(id);
       }
    }

    @Override
    public KhachHangModel findById(int id) {
        return SingletonDaoUtil.getKhachHangDAOInstance().findOne(id);
    }
}
