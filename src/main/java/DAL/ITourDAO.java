package DAL;

import java.util.List;

import DTO.TourModel;

public interface ITourDAO extends GenericDAO<TourModel> {
	 List<TourModel> findAll();
}
