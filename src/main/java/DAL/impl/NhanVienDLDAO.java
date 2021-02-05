package DAL.impl;

import java.util.List;

import DAL.INhanVienDLDAO;
import DTO.NhanVienDLModel;
import Mapper.NhanVienDLMapper;

public class NhanVienDLDAO extends AbstractDAO<NhanVienDLModel> implements INhanVienDLDAO {

	@Override
	public List<NhanVienDLModel> findAll() {
		String sql = "SELECT * FROM nhanvien";
		return query(sql, new NhanVienDLMapper());
	}

}
