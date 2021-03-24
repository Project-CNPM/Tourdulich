package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.DoanDuLichModel;

public class DoanDuLichMapper implements RowMapper<DoanDuLichModel> {

	@Override
	public DoanDuLichModel mapRow(ResultSet rs) {
		try {
			DoanDuLichModel doanDL = new DoanDuLichModel();    
                        doanDL.setId(rs.getInt("doan_id"));
			doanDL.setGiaTour(rs.getBigDecimal("doan_giatour").doubleValue());
                        doanDL.setTour_id(rs.getInt("tour_id"));
			doanDL.setTenDoan(rs.getString("doan_name"));
			doanDL.setNgayDi(rs.getDate("doan_ngaydi"));
			doanDL.setNgayVe(rs.getDate("doan_ngayve"));
			doanDL.setMoTa(rs.getString("doan_chitietchuongtrinh"));
			return doanDL;
		} catch (SQLException e) {
			return null;
	}
}
	
}