package DAL.impl;

import java.util.List;

import DAL.IDoanDuLichDAO;
import DTO.DoanDuLichModel;
import Mapper.DoanDuLichMapper;

public class DoanDuLichDAO extends AbstractDAO<DoanDuLichModel> implements IDoanDuLichDAO {
	
	@Override
	public List<DoanDuLichModel> findAll(){
		String sql = "SELECT * FROM doandulich";
		return query(sql, new DoanDuLichMapper());
	}
}
