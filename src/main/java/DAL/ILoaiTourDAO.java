package DAL;

import java.util.List;

import DTO.ChucVuModel;
import DTO.LoaiTourModel;

public interface ILoaiTourDAO extends GenericDAO<LoaiTourModel> {
	List<LoaiTourModel> findAll();
        LoaiTourModel findById(int id);
}
