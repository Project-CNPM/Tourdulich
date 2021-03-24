package DAL;

import java.util.List;

import DTO.DoanDuLichModel;

public interface IDoanDuLichDAO extends GenericDAO<DoanDuLichModel> {
	 List<DoanDuLichModel> findAll();
         DoanDuLichModel findById(int id);
        int save(DoanDuLichModel newModel);
        void update(DoanDuLichModel updateNew);
        void delete(int id);
        List<DoanDuLichModel> findByIdTour(int id);
}
