/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import DTO.DiaDiemModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemMapper implements RowMapper<DiaDiemModel>{

    @Override
    public DiaDiemModel mapRow(ResultSet resultSet) {
        try {
			DiaDiemModel diaDiem = new DiaDiemModel();
                        
			diaDiem.setId(resultSet.getInt("madd"));
			diaDiem.setDiaChi(resultSet.getString("diachi"));
			diaDiem.setTenDiaDiem(resultSet.getString("tendd"));
			diaDiem.setMoTa(resultSet.getNString("mota"));
			diaDiem.setTinhtrang(resultSet.getString("tinhtrang"));
			return diaDiem;
		} catch (SQLException e) {
			return null;
		}
    }
    
}
