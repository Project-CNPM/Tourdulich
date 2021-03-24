package Mapper;

import DTO.ChiPhiChiTietModel;
import DTO.ChiPhiModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChiPhiMapper implements RowMapper<ChiPhiModel> {

	@Override
	public ChiPhiModel mapRow(ResultSet resultSet) {
		ChiPhiModel model = new ChiPhiModel();
		try {
                        model.setId(resultSet.getInt("chiphi_id"));
			model.setDoanId(resultSet.getInt("doan_id"));
                        model.setTotal(resultSet.getBigDecimal("chiphi_total").doubleValue());
                        String jsonChiTiet = resultSet.getString("chiphi_chitiet");
                       ObjectMapper objectMapper = new ObjectMapper();  
                       List<ChiPhiChiTietModel> listChiPhi = new ArrayList<>();
                    try {
                        listChiPhi = objectMapper.readValue(jsonChiTiet, new TypeReference<List<ChiPhiChiTietModel>>(){
                        });
                        model.setListChiPhi(listChiPhi);
                    } catch (JsonProcessingException ex) {
                        
                        Logger.getLogger(ChiPhiMapper.class.getName()).log(Level.SEVERE, null, ex);
                    }
			
			return model;
		} catch (SQLException e) {
			return null;		
		}
		
		
	}
	

}
