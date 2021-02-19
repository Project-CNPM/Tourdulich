package DAL.impl;

import java.util.List;

import DAL.IChucVuDAO;
import DTO.ChucVuModel;
import Mapper.ChucVuMapper;

public class ChucVuDAO extends AbstractDAO<ChucVuModel> implements IChucVuDAO {

    @Override
	public List<ChucVuModel> findAll(){
		String sql = "SELECT * FROM chucvu";
		return query(sql, new ChucVuMapper());
	}
    

}
