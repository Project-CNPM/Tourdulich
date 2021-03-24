package Mapper;

import DTO.GiaTourModel;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.LoaiTourModel;

public class GiaTourMapper implements RowMapper<GiaTourModel> {

	@Override
	public GiaTourModel mapRow(ResultSet resultSet) {
		GiaTourModel giaTour = new GiaTourModel();
		try {
                        giaTour.setId(resultSet.getInt("gia_id"));
			giaTour.setTour_id(resultSet.getInt("tour_id"));
			giaTour.setSoTien(resultSet.getBigDecimal("gia_sotien").doubleValue());
                        giaTour.setGiaTuNgay(resultSet.getDate("gia_tungay"));
                        giaTour.setGiaDenNgay(resultSet.getDate("gia_denngay"));
			return giaTour;
		} catch (SQLException e) {
			return null;		
		}
		
		
	}
	

}
