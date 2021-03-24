package DAL;

import DTO.ChiPhiChiTietModel;
import DTO.ChiPhiModel;
import java.util.List;

public interface IChiPhiDAO extends GenericDAO<ChiPhiModel> {
	List<ChiPhiModel> findAll();
        ChiPhiModel findById(int id);
        int save(ChiPhiModel newModel);
        void update(ChiPhiModel updateNew);
        void delete(int id);
        ChiPhiModel findByDoanId(int id);
        void deleteByDoanId(int id);
}
