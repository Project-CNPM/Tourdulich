package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.KhachHangModel;
import DTO.NhanVienModel;

public class KhachHangMapper implements RowMapper<KhachHangModel> {

	@Override
	public KhachHangModel mapRow(ResultSet resultSet) {
		try {
			KhachHangModel khachHang = new KhachHangModel();
			khachHang.setId(resultSet.getInt("kh_id"));
			khachHang.setTenKH(resultSet.getString("kh_ten"));
			khachHang.setSdt(resultSet.getString("kh_sdt"));
			khachHang.setNgaySinh(resultSet.getDate("kh_ngaysinh"));
			khachHang.setCmnd(resultSet.getString("kh_cmnd"));
			khachHang.setEmail(resultSet.getString("kh_email"));
			return khachHang ;
		} catch (SQLException e) {
			return null;
		}
	}

}
