/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapper;

import DTO.DiaDiemDLModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemDLMapper implements RowMapper<DiaDiemDLModel>{

    @Override
    public DiaDiemDLModel mapRow(ResultSet resultSet) {
        try {
			DiaDiemDLModel diaDiem = new DiaDiemDLModel();
                        
			diaDiem.setId(resultSet.getLong("id"));
			diaDiem.setDiaChi(resultSet.getString("diachi"));
			diaDiem.setTenDiaDiem(resultSet.getString("tendiadiem"));
			return diaDiem;
		} catch (SQLException e) {
			return null;
		}
    }
    
}
