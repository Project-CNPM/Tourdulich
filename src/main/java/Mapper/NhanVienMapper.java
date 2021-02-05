package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NhanVienModel;

public class NhanVienMapper implements RowMapper<NhanVienModel> {

	@Override
	public NhanVienModel mapRow(ResultSet resultSet) {
		try {
			NhanVienModel nhanVien = new NhanVienModel();
			nhanVien.setId(resultSet.getInt("manv"));
			nhanVien.setTenNhanVien(resultSet.getString("tennv"));
			nhanVien.setGioiTinh(resultSet.getString("gioitinh"));
			nhanVien.setNgaySinh(resultSet.getDate("ngaysinh"));
			nhanVien.setDiaChi(resultSet.getString("diachi"));
			nhanVien.setSdt(resultSet.getInt("sdt"));
			nhanVien.setChucvu_MACV(resultSet.getInt("chucvu_macv"));
			return nhanVien ;
		} catch (SQLException e) {
			return null;
		}
	}
	

}
