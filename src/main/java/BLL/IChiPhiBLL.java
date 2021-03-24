package BLL;

import DTO.ChiPhiModel;
import DTO.GiaTourModel;
import java.util.List;


public interface IChiPhiBLL {
	List<ChiPhiModel> findAll();
        ChiPhiModel findById(int id);
        ChiPhiModel save(ChiPhiModel newModel);
        ChiPhiModel update(ChiPhiModel updateNew);
        void delete(int[] id);
        ChiPhiModel findByDoanId(int id);
}
