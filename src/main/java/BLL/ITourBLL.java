package BLL;

import DTO.DiaDiemModel;
import java.util.List;

import DTO.TourModel;

public interface ITourBLL {
	List<TourModel> findAll();
        List<DiaDiemModel> findDiaDiemOfTourById(int id);
         TourModel findById(int id);
        TourModel save(TourModel newModel);
        TourModel update(TourModel updateNew);
        void delete(int[] ids);
        TourModel findByTenTour(String name);
}
