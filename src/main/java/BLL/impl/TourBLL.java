package BLL.impl;

import java.util.List;

import BLL.ITourBLL;
import DAL.ITourDAO;
import DAL.impl.TourDAO;
import DTO.DiaDiemModel;
import DTO.TourModel;
import Singleton.SingletonDaoUtil;

public class TourBLL implements ITourBLL {
       
    
	@Override
	public List<TourModel> findAll() {
        
	List<TourModel> tourList = SingletonDaoUtil.getTourDAOInstance().findAll();
        for(TourModel item : tourList) {
            item.setListDiaDiem(this.findDiaDiemOfTourById(item.getId()));
        }
        return tourList;
	}
        @Override
        public TourModel findById(int id) {
        return SingletonDaoUtil.getTourDAOInstance().findTourById(id);
        }
        @Override
        public TourModel findByTenTour(String name) {
        return SingletonDaoUtil.getTourDAOInstance().findByTenTour(name);
        }

    @Override
    public List<DiaDiemModel> findDiaDiemOfTourById(int id) {
        
	return SingletonDaoUtil.getTourDAOInstance().findDiaDiemOfTourById(id);
    }

    @Override
    public TourModel save(TourModel model) {
       
        int id = SingletonDaoUtil.getTourDAOInstance().save(model);
         return SingletonDaoUtil.getTourDAOInstance().findTourById(id);
    }

    @Override
    public TourModel update(TourModel updateNew) {
       
        SingletonDaoUtil.getTourDAOInstance().update(updateNew);
	return SingletonDaoUtil.getTourDAOInstance().findTourById(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
      
        for (int id: ids) {
	SingletonDaoUtil.getTourDAOInstance().delete(id);
	}
    }
}
