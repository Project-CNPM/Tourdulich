package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.ChucVuModel;

public class ChucVuMapper implements RowMapper<ChucVuModel> {

	@Override
	public ChucVuModel mapRow(ResultSet resultSet) {
		ChucVuModel chucVu = new ChucVuModel();
		try {
			chucVu.setId(resultSet.getInt("macv"));
			chucVu.setTenChucVu(resultSet.getString("tencv"));
			return chucVu;
		} catch (SQLException e) {
			return null;		
		}
		
		
	}
	

}
