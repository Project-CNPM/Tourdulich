package DAL.impl;

import java.util.List;

import DAL.IKhachHangDAO;
import DTO.KhachHangModel;
import Mapper.KhachHangMapper;

public class KhachHangDAO extends AbstractDAO<KhachHangModel> implements IKhachHangDAO {

    @Override
	public List<KhachHangModel> findAll(){
		String sql = "SELECT * FROM khachhang";
		return query(sql, new KhachHangMapper());
	}
	

}
