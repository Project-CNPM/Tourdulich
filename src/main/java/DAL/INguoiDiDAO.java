package DAL;

import DTO.NguoiDiModel;
import java.util.List;



public interface INguoiDiDAO extends GenericDAO<NguoiDiModel> {
	List<NguoiDiModel> findAll();
        NguoiDiModel findById(int id);
        int save(NguoiDiModel newModel);
        void update(NguoiDiModel updateNew);
        void delete(int id);
        NguoiDiModel findByDoanId(int id);
}
