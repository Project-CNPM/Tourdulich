package DAL.impl;

import DAL.IChiPhiDAO;
import DTO.ChiPhiModel;
import Mapper.ChiPhiMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ChiPhiDAO extends AbstractDAO<ChiPhiModel> implements IChiPhiDAO {
        ObjectMapper objectMapper = new ObjectMapper();  
        @Override
	public List<ChiPhiModel> findAll(){
		String sql = "SELECT * FROM tour_chiphi";
		return query(sql, new ChiPhiMapper());
	}
        @Override
        public ChiPhiModel findById(int id) {
          String sql = "SELECT * FROM tour_chiphi WHERE chiphi_id = ?";
          List<ChiPhiModel> news = query(sql, new ChiPhiMapper(), id);
          return news.isEmpty() ? null : news.get(0);
        }

    @Override
    public int save(ChiPhiModel newModel) {
            try {
                StringBuilder sql = new StringBuilder("INSERT INTO tour_chiphi (doan_id, chiphi_total,");
                sql.append(" chiphi_chitiet)");
                sql.append(" VALUES(?, ?, ?)");
                String chiTiet = objectMapper.writeValueAsString(newModel.getListChiPhi());
                return insert(sql.toString(), newModel.getDoanId(), newModel.getTotal(),
                        chiTiet);
            } catch (JsonProcessingException ex) {
                Logger.getLogger(ChiPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return -1;
    }

    @Override
    public void update(ChiPhiModel updateNew) {
            try {
                StringBuilder sql = new StringBuilder("UPDATE tour_chiphi SET doan_id = ?, chiphi_total = ?,");
                sql.append(" chiphi_chitiet = ?");
                sql.append(" WHERE chiphi_id = ?");
                String chiTiet = objectMapper.writeValueAsString(updateNew.getListChiPhi());
                update(sql.toString(), updateNew.getDoanId(), updateNew.getTotal(),
                        chiTiet,updateNew.getId());
            } catch (JsonProcessingException ex) {
                Logger.getLogger(ChiPhiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void delete(int id) {
       String sql = "DELETE FROM tour_chiphi WHERE chiphi_id = ?";
	update(sql, id);
    }
    @Override
    public void deleteByDoanId(int id) {
       String sql = "DELETE FROM tour_chiphi WHERE doan_id = ?";
	update(sql, id);
    }

    @Override
    public ChiPhiModel findByDoanId(int id) {
         String sql = "SELECT * FROM tour_chiphi WHERE doan_id = ?";
          List<ChiPhiModel> news = query(sql, new ChiPhiMapper(), id);
          return news.isEmpty() ? null : news.get(0);
    }
    

}
