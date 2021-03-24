package DAL.impl;

import java.util.List;

import DAL.IKhachHangDAO;
import DTO.KhachHangModel;
import Mapper.KhachHangMapper;

public class KhachHangDAO extends AbstractDAO<KhachHangModel> implements IKhachHangDAO {

    @Override
	public List<KhachHangModel> findAll(){
		String sql = "SELECT * FROM tour_khachhang";
		return query(sql, new KhachHangMapper());
	}

    @Override
    public int save(KhachHangModel newModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO tour_khachhang (kh_ten, kh_sdt,");
	sql.append(" kh_ngaysinh,kh_email,kh_cmnd)");
	sql.append(" VALUES(?, ?, ?, ?,?)");
	return insert(sql.toString(), newModel.getTenKH(), newModel.getSdt(), 
                        newModel.getNgaySinh().toString(), newModel.getEmail(),newModel.getCmnd()
                      
                        );
    }

    @Override
    public void update(KhachHangModel updateNew) {
         StringBuilder sql = new StringBuilder("UPDATE tour_khachhang SET kh_ten = ?,");
		sql.append(" kh_sdt = ?, kh_ngaysinh = ?, kh_email = ?, kh_cmnd = ?");
		sql.append(" WHERE kh_id = ?");
		update(sql.toString(), updateNew.getTenKH(), updateNew.getSdt(), 
                        updateNew.getNgaySinh().toString(), updateNew.getEmail(),updateNew.getCmnd(),
                        updateNew.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM tour_khachhang WHERE kh_id = ?";
		update(sql, id);
    }

    @Override
    public KhachHangModel findOne(int id) {
        String sql = "SELECT * FROM tour_khachhang WHERE kh_id = ?";
		List<KhachHangModel> news = query(sql, new KhachHangMapper(), id);
		return news.isEmpty() ? null : news.get(0);
    }
	

}
