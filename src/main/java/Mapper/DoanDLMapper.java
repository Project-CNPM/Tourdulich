package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.DoanDLModel;

public class DoanDLMapper implements RowMapper<DoanDLModel> {

	@Override
	public DoanDLModel mapRow(ResultSet rs) {
		try {
			DoanDLModel doanDL = new DoanDLModel();            
			doanDL.setMaDoan(rs.getInt("madoan"));
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