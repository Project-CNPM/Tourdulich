package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.DoanDuLichModel;

public class DoanDuLichMapper implements RowMapper<DoanDuLichModel> {

	@Override
	public DoanDuLichModel mapRow(ResultSet rs) {
		try {
			DoanDuLichModel doanDL = new DoanDuLichModel();            
			//doanDL.setMaDoan(rs.getInt("madoan"));
			doanDL.setTenDoan(rs.getString("tendoan"));
			doanDL.setNgayKH(rs.getDate("ngaykh"));
			doanDL.setNgayKT(rs.getDate("ngaykt"));
			doanDL.setChiPhi(rs.getString("chiphi"));
			doanDL.setMota(rs.getString("mota"));
			return doanDL;
		} catch (SQLException e) {
			return null;
	}
}
	
}