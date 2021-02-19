package DAL;

import java.util.List;

import DTO.NhanVienModel;

public interface INhanVienDAO extends GenericDAO<NhanVienModel> {
	List<NhanVienModel> findAll();

}
