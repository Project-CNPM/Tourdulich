package DAL;

import DTO.DiaDiemModel;
import java.util.List;

import DTO.TourModel;

public interface ITourDAO extends GenericDAO<TourModel> {
	 List<TourModel> findAll();
         TourModel findTourById(int id);
         List<DiaDiemModel> findDiaDiemOfTourById(int id);
         void delete(int id);
         void update(TourModel updateNew);
         int save(TourModel newModel);
         TourModel findByTenTour(String name);
         
}
