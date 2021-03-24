package DAL.impl;

import DAL.IGiaTourDAO;
import DTO.GiaTourModel;
import Mapper.GiaTourMapper;
import java.util.List;



public class GiaTourDAO extends AbstractDAO<GiaTourModel> implements IGiaTourDAO {

        @Override
	public List<GiaTourModel> findAll(){
		String sql = "SELECT * FROM tour_gia";
		return query(sql, new GiaTourMapper());
	}
        @Override
        public GiaTourModel findById(int id) {
          String sql = "SELECT * FROM tour_gia WHERE gia_id = ?";
          List<GiaTourModel> news = query(sql, new GiaTourMapper(), id);
          return news.isEmpty() ? null : news.get(0);
        }

    @Override
    public int save(GiaTourModel newModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO tour_gia (gia_sotien, tour_id,");
	sql.append(" gia_tungay, gia_denngay)");
	sql.append(" VALUES(?, ?, ?,?)");
	return insert(sql.toString(), newModel.getSoTien(), newModel.getTour_id(), 
		newModel.getGiaTuNgay().toString(),newModel.getGiaDenNgay().toString());
    }

    @Override
    public void update(GiaTourModel updateNew) {
       StringBuilder sql = new StringBuilder("UPDATE tour_gia SET gia_sotien = ?, tour_id = ?,");
		sql.append(" gia_tungay = ? , gia_denngay = ?");
		sql.append(" WHERE gia_id = ?");
		update(sql.toString(), updateNew.getSoTien(), updateNew.getTour_id(), 
		updateNew.getGiaTuNgay().toString(),updateNew.getGiaDenNgay().toString(),
			updateNew.getId());
    }

    @Override
    public void delete(int id) {
       String sql = "DELETE FROM tour_gia WHERE gia_id = ?";
	update(sql, id);
    }

    @Override
    public List<GiaTourModel> findByTourId(int id) {
         String sql = "SELECT * FROM tour_gia WHERE tour_id = ?";
          List<GiaTourModel> news = query(sql, new GiaTourMapper(), id);
          return news.isEmpty() ? null : news;
    }
    

}
