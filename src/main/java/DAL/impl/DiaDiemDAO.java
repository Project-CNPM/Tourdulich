package DAL.impl;

import DAL.IDiaDiemDAO;
import DTO.DiaDiemModel;
import Mapper.DiaDiemMapper;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemDAO extends AbstractDAO<DiaDiemModel> implements IDiaDiemDAO {
        @Override
	public List<DiaDiemModel> findAll(){
		String sql = "SELECT * FROM diadiem";
		return query(sql, new DiaDiemMapper());
	}
    
}
