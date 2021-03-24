package BLL;

import java.util.List;

import DTO.ChucVuModel;
import DTO.LoaiTourModel;

public interface ILoaiTourBLL {
	List<LoaiTourModel> findAll();
        LoaiTourModel findById(int id);
}
