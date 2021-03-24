package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.LoaiTourModel;

public class LoaiTourMapper implements RowMapper<LoaiTourModel> {

	@Override
	public LoaiTourModel mapRow(ResultSet resultSet) {
		LoaiTourModel loaiTour = new LoaiTourModel();
		try {
			loaiTour.setId(resultSet.getInt("loai_id"));
			loaiTour.setTenLoai(resultSet.getString("loai_ten"));
                        loaiTour.setMoTa(resultSet.getString("loai_mota"));
			return loaiTour;
		} catch (SQLException e) {
			return null;		
		}
		
		
	}
	

}
