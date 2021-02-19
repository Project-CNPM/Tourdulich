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
			khachHang.setId(resultSet.getInt("makh"));
			khachHang.setTenKH(resultSet.getString("tenkh"));
			khachHang.setGioiTinh(resultSet.getString("gioitinh"));
			khachHang.setDiaChi(resultSet.getString("diachi"));
			khachHang.setNgaySinh(resultSet.getDate("ngaysinh"));
			khachHang.setCmnd(resultSet.getInt("cmnd"));
			khachHang.setQuocTich(resultSet.getString("quoctich"));
			khachHang.setDoanDuLich_MaDoan(resultSet.getInt("doandulich_madoan"));
			return khachHang ;
		} catch (SQLException e) {
			return null;
		}
	}

}
