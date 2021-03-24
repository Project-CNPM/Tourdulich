package Mapper;

import DTO.GiaTourModel;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.LoaiTourModel;
import DTO.NguoiDiModel;

public class NguoiDiMapper implements RowMapper<NguoiDiModel> {

	@Override
	public NguoiDiModel mapRow(ResultSet resultSet) {
		NguoiDiModel model = new NguoiDiModel();
		try {
                        model.setId(resultSet.getInt("nguoidi_id"));
			model.setDoanId(resultSet.getInt("doan_id"));
			model.setDsNhanVien(resultSet.getString("nguoidi_dsnhanvien"));
                        model.setDsKhach(resultSet.getString("nguoidi_dskhach"));
                       
			return model;
		} catch (SQLException e) {
			return null;		
		}
		
		
	}
	

}
