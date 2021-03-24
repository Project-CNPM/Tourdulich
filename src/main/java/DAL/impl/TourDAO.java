package DAL.impl;

import java.util.List;

import DAL.ITourDAO;
import DTO.DiaDiemModel;
import DTO.TourModel;
import Mapper.DiaDiemMapper;
import Mapper.TourMapper;

public class TourDAO extends AbstractDAO<TourModel> implements ITourDAO {

	@Override
	public List<TourModel> findAll(){
		String sql = "SELECT * FROM tours";
		return query(sql, new TourMapper());
	}

        @Override
        public List<DiaDiemModel> findDiaDiemOfTourById(int id) {
            // id = mã tour
            StringBuilder sql = new StringBuilder("SELECT * FROM tour_chitiet AS u");
            sql.append(" INNER JOIN tour_diadiem AS r ON u.dd_id=r.dd_id");
            sql.append(" WHERE u.tour_id = ?");
            sql.append(" order by ct_id ");
            
            List<DiaDiemModel> result = query(sql.toString(), new DiaDiemMapper(), id);
            return result;
        }

    @Override
    public TourModel findTourById(int id) {
      String sql = "SELECT * FROM tours WHERE tour_id = ?";
      List<TourModel> news = query(sql, new TourMapper(), id);
      return news.isEmpty() ? null : news.get(0);
    }
        @Override
	public int save(TourModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO tours (tour_ten, tour_mota,");
		sql.append("loai_id)");
		sql.append(" VALUES(?, ?, ?)");
		return insert(sql.toString(), newModel.getTenTour(), newModel.getMoTa(), 
				newModel.getLoai_id()
                               );
	}
        @Override
	public void update(TourModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE tours SET tour_ten = ?, tour_mota = ?,");
		sql.append(" loai_id = ?");
		sql.append(" WHERE tour_id = ?");
		update(sql.toString(), updateNew.getTenTour(), updateNew.getMoTa(), 
				updateNew.getLoai_id(),
                                updateNew.getId());
	}
        @Override
	public void delete(int id) {
		String sql = "DELETE FROM tours WHERE tour_id = ?";
		update(sql, id);
	}
      @Override
      public TourModel findByTenTour(String name) {
      String sql = "SELECT * FROM tours WHERE tour_ten = ?";
      List<TourModel> news = query(sql, new TourMapper(), name);
      return news.isEmpty() ? null : news.get(0);
       }

    
}
