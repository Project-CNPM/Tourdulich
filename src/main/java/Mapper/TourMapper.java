package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.TourModel;

public class TourMapper implements RowMapper<TourModel> {
	
	@Override
	public TourModel mapRow(ResultSet rs) {
		try {
			TourModel tour = new TourModel();            
			tour.setId(rs.getInt("tour_id"));
			tour.setTenTour(rs.getString("tour_ten"));
                        tour.setMoTa(rs.getString("tour_mota"));
			tour.setDiemKH(rs.getString("diemkh"));
			tour.setDiemDen(rs.getString("diemden"));
			tour.setLoai_id(rs.getInt("loai_id"));
                        tour.setGia_id(rs.getInt("gia_id"));
			return tour;
		} catch (SQLException e) {
			return null;
	}
}
}
