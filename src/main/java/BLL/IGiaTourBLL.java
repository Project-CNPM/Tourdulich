package BLL;

import DTO.GiaTourModel;
import java.util.List;


public interface IGiaTourBLL {
	List<GiaTourModel> findAll();
        GiaTourModel findById(int id);
        GiaTourModel save(GiaTourModel newModel);
        GiaTourModel update(GiaTourModel updateNew);
        void delete(int[] id);
        List<GiaTourModel> findByTourId(int id);
}
