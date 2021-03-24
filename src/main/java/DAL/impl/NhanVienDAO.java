package DAL.impl;

import java.util.List;

import DAL.INhanVienDAO;
import DTO.NhanVienModel;
import Mapper.NhanVienMapper;

public class NhanVienDAO extends AbstractDAO<NhanVienModel> implements INhanVienDAO {

	@Override
	public List<NhanVienModel> findAll() {
		String sql = "SELECT * FROM tour_nhanvien";
		return query(sql, new NhanVienMapper());
	}
        @Override
	public int save(NhanVienModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO tour_nhanvien (nv_ten,");
		sql.append(" nv_sdt, nv_ngaysinh,nv_email,nv_nhiemvu)");
		sql.append(" VALUES(?, ?, ?, ?,?)");
		return insert(sql.toString(), newModel.getTenNhanVien(), newModel.getSdt(), 
				newModel.getNgaySinh().toString(), newModel.getEmail(),newModel.getNhiemVu());
	}
        @Override
	public void update(NhanVienModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE tour_nhanvien SET nv_ten = ?, nv_sdt = ?,");
		sql.append(" nv_ngaysinh = ?, nv_email = ?, nv_nhiemvu = ?");
		sql.append(" WHERE nv_id = ?");
		update(sql.toString(), updateNew.getTenNhanVien(), updateNew.getSdt(), 
				updateNew.getNgaySinh().toString(), updateNew.getEmail(),updateNew.getNhiemVu(),updateNew.getId());
	}
        @Override
	public void delete(int id) {
		String sql = "DELETE FROM tour_nhanvien WHERE nv_id = ?";
		update(sql, id);
	}
        @Override
	public NhanVienModel findOne(int id) {
		String sql = "SELECT * FROM tour_nhanvien WHERE nv_id = ? ";
		List<NhanVienModel> news = query(sql, new NhanVienMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

//    @Override
//    public List<NhanVienModel> findByIdOrName(String search) {
//       String sql = "SELECT * FROM tour_nhanvien WHERE nv_id = ? or nv_ten LIKE '%?%'";
//		List<NhanVienModel> news = query(sql, new NhanVienMapper(), search);
//		return news.isEmpty() ? null : news;
//    }

}
