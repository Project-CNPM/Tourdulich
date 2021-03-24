package DAL;

import java.util.List;

import DTO.ChucVuModel;
import DTO.GiaTourModel;
import DTO.LoaiTourModel;

public interface IGiaTourDAO extends GenericDAO<GiaTourModel> {
	List<GiaTourModel> findAll();
        GiaTourModel findById(int id);
        int save(GiaTourModel newModel);
        void update(GiaTourModel updateNew);
        void delete(int id);
        List<GiaTourModel> findByTourId(int id);
}
