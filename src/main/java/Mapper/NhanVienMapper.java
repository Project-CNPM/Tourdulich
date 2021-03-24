package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NhanVienModel;

public class NhanVienMapper implements RowMapper<NhanVienModel> {

	@Override
	public NhanVienModel mapRow(ResultSet resultSet) {
		try {
			NhanVienModel nhanVien = new NhanVienModel();
			nhanVien.setId(resultSet.getInt("nv_id"));
			nhanVien.setTenNhanVien(resultSet.getString("nv_ten"));
			nhanVien.setSdt(resultSet.getString("nv_sdt"));
			nhanVien.setNgaySinh(resultSet.getDate("nv_ngaysinh"));
			nhanVien.setEmail(resultSet.getString("nv_email"));
			nhanVien.setNhiemVu(resultSet.getString("nv_nhiemvu"));
			
			return nhanVien ;
		} catch (SQLException e) {
			return null;
		}
	}
	

}
