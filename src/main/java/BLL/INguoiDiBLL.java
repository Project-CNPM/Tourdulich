package BLL;


import DTO.NguoiDiModel;
import java.util.List;


public interface INguoiDiBLL {
	List<NguoiDiModel> findAll();
        NguoiDiModel findById(int id);
        NguoiDiModel save(NguoiDiModel newModel);
        NguoiDiModel update(NguoiDiModel updateNew);
        void delete(int[] id);
        NguoiDiModel findByDoanId(int id);
}
