package BLL;

import java.util.List;

import DTO.NhanVienModel;

public interface INhanVienBLL {
	List<NhanVienModel> findAll();
        NhanVienModel save(NhanVienModel newModel);
        NhanVienModel update(NhanVienModel updateNew);
        void delete(int[] ids);
        NhanVienModel findById(int id);
}
