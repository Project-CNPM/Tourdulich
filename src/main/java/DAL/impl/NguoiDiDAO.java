package DAL.impl;

import DAL.INguoiDiDAO;
import DTO.NguoiDiModel;
import Mapper.NguoiDiMapper;
import java.util.List;



public class NguoiDiDAO extends AbstractDAO<NguoiDiModel> implements INguoiDiDAO {

        @Override
	public List<NguoiDiModel> findAll(){
		String sql = "SELECT * FROM tour_nguoidi";
		return query(sql, new NguoiDiMapper());
	}
        @Override
        public NguoiDiModel findById(int id) {
          String sql = "SELECT * FROM tour_nguoidi WHERE nguoidi_id = ?";
          List<NguoiDiModel> news = query(sql, new NguoiDiMapper(), id);
          return news.isEmpty() ? null : news.get(0);
        }

    @Override
    public int save(NguoiDiModel newModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO tour_nguoidi (doan_id, nguoidi_dsnhanvien,");
	sql.append(" nguoidi_dskhach)");
	sql.append(" VALUES(?, ?, ?)");
	return insert(sql.toString(), newModel.getDoanId(), newModel.getDsNhanVien(), 
		newModel.getDsKhach());
    }

    @Override
    public void update(NguoiDiModel updateNew) {
       StringBuilder sql = new StringBuilder("UPDATE tour_nguoidi SET doan_id = ?, nguoidi_dsnhanvien = ?,");
		sql.append(" nguoidi_dskhach = ?");
		sql.append(" WHERE nguoidi_id = ?");
		update(sql.toString(), updateNew.getDoanId(), updateNew.getDsNhanVien(), 
		updateNew.getDsKhach(),updateNew.getId());
    }

    @Override
    public void delete(int id) {
       String sql = "DELETE FROM tour_nguoidi WHERE nguoidi_id = ?";
	update(sql, id);
    }

    @Override
    public NguoiDiModel findByDoanId(int id) {
         String sql = "SELECT * FROM tour_nguoidi WHERE doan_id = ?";
          List<NguoiDiModel> news = query(sql, new NguoiDiMapper(), id);
          return news.isEmpty() ? null : news.get(0);
    }
    

}
