package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.TourModel;

public class TourMapper implements RowMapper<TourModel> {
	
	@Override
	public TourModel mapRow(ResultSet rs) {
		try {
			TourModel tour = new TourModel();            
			//tour.setMaTour(rs.getInt("matour"));
			tour.setTenTour(rs.getString("tentour"));
			tour.setDacDiem(rs.getString("dacdiem"));
			tour.setDiemKH(rs.getString("diemkh"));
			tour.setDiemDen(rs.getString("diemden"));
			tour.setPhuongTien(rs.getString("phuongtien"));
			tour.setChiPhi(rs.getString("chiphi"));
			tour.setLoaidulich_MaLoai(rs.getInt("loaidulich_maloai"));
			return tour;
		} catch (SQLException e) {
			return null;
	}
}
}
