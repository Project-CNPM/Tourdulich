package DAL.impl;

import java.util.List;

import DAL.IChucVuDAO;
import DAL.ILoaiTourDAO;
import DTO.ChucVuModel;
import DTO.LoaiTourModel;
import Mapper.ChucVuMapper;
import Mapper.LoaiTourMapper;

public class LoaiTourDAO extends AbstractDAO<LoaiTourModel> implements ILoaiTourDAO {

        @Override
	public List<LoaiTourModel> findAll(){
		String sql = "SELECT * FROM tour_loai";
		return query(sql, new LoaiTourMapper());
	}
        @Override
    public LoaiTourModel findById(int id) {
      String sql = "SELECT * FROM tour_loai WHERE loai_id = ?";
      List<LoaiTourModel> news = query(sql, new LoaiTourMapper(), id);
      return news.isEmpty() ? null : news.get(0);
    }
    

}
