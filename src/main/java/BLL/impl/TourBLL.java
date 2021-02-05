package BLL.impl;

import java.util.List;

import BLL.ITourBLL;
import DAL.ITourDAO;
import DAL.impl.TourDAO;
import DTO.TourModel;

public class TourBLL implements ITourBLL {
private ITourDAO tourDao;
    
	@Override
	public List<TourModel> findAll() {
        tourDao = new TourDAO();
	return tourDao.findAll();
	}
}
