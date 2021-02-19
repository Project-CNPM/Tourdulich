package DAL.impl;

import java.util.List;

import DAL.INhanVienDAO;
import DTO.NhanVienModel;
import Mapper.NhanVienMapper;

public class NhanVienDAO extends AbstractDAO<NhanVienModel> implements INhanVienDAO {

	@Override
	public List<NhanVienModel> findAll() {
		String sql = "SELECT * FROM nhanvien";
		return query(sql, new NhanVienMapper());
	}

}
