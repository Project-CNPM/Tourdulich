package DAL.impl;

import java.util.List;

import DAL.IDoanDuLichDAO;
import DTO.DoanDuLichModel;
import Mapper.DoanDuLichMapper;

public class DoanDuLichDAO extends AbstractDAO<DoanDuLichModel> implements IDoanDuLichDAO {
	
	@Override
	public List<DoanDuLichModel> findAll(){
		String sql = "SELECT * FROM tour_doan";
		return query(sql, new DoanDuLichMapper());
	}
        @Override
        public DoanDuLichModel findById(int id) {
          String sql = "SELECT * FROM tour_doan WHERE doan_id = ?";
          List<DoanDuLichModel> news = query(sql, new DoanDuLichMapper(), id);
          return news.isEmpty() ? null : news.get(0);
        }
        @Override
        public List<DoanDuLichModel>  findByIdTour(int id) {
          String sql = "SELECT * FROM tour_doan WHERE tour_id = ?";
          List<DoanDuLichModel> news = query(sql, new DoanDuLichMapper(), id);
          return news.isEmpty() ? null : news;
        }

    @Override
    public int save(DoanDuLichModel newModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO tour_doan ( tour_id,doan_name");
	sql.append(", doan_ngaydi, doan_ngayve,doan_chitietchuongtrinh,doan_giatour)");
	sql.append(" VALUES(?, ?, ?,?,?,?)");
	return insert(sql.toString(), newModel.getTour_id(), newModel.getTenDoan(), 
		newModel.getNgayDi().toString(),newModel.getNgayVe().toString(),newModel.getMoTa(),newModel.getGiaTour());
    }

    @Override
    public void update(DoanDuLichModel updateNew) {
       StringBuilder sql = new StringBuilder("UPDATE tour_doan SET tour_id = ?, doan_name = ?,");
		sql.append(" doan_ngaydi = ? , doan_ngayve = ?,doan_chitietchuongtrinh = ?,doan_giatour=?");
		sql.append(" WHERE doan_id = ?");
		update(sql.toString(), updateNew.getTour_id(), updateNew.getTenDoan(), 
		updateNew.getNgayDi().toString(),updateNew.getNgayVe().toString(),updateNew.getMoTa(),updateNew.getGiaTour(),
			updateNew.getId());
    }

    @Override
    public void delete(int id) {
       String sql = "DELETE FROM tour_doan WHERE doan_id = ?";
	update(sql, id);
    }

}
