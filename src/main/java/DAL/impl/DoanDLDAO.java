package DAL.impl;

import java.util.List;

import DAL.IDoanDLDAO;
import DTO.DoanDLModel;
import Mapper.DoanDLMapper;

public class DoanDLDAO extends AbstractDAO<DoanDLModel> implements IDoanDLDAO {
	
	@Override
	public List<DoanDLModel> findAll(){
		String sql = "SELECT * FROM doandulich";
		return query(sql, new DoanDLMapper());
	}
}
