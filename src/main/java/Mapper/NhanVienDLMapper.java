package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NhanVienDLModel;

public class NhanVienDLMapper implements RowMapper<NhanVienDLModel> {

	@Override
	public NhanVienDLModel mapRow(ResultSet resultSet) {
		try {
			NhanVienDLModel nhanVien = new NhanVienDLModel();
			nhanVien.setMaNhanVien(resultSet.getInt("manv"));
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
