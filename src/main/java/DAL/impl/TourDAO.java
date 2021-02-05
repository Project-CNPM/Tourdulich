package DAL.impl;

import java.util.List;

import DAL.ITourDAO;
import DTO.TourModel;
import Mapper.TourMapper;

public class TourDAO extends AbstractDAO<TourModel> implements ITourDAO {

	@Override
	public List<TourModel> findAll(){
		String sql = "SELECT * FROM tourdulich";
		return query(sql, new TourMapper());
	}
}
