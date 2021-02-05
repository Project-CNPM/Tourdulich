package DAL;

import java.util.List;

import DTO.NhanVienDLModel;

public interface INhanVienDLDAO extends GenericDAO<NhanVienDLModel> {
	List<NhanVienDLModel> findAll();

}
