package DAL.impl;

import DAL.IDiaDiemDLDAO;
import DTO.DiaDiemDLModel;
import Mapper.DiaDiemDLMapper;
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
public class DiaDiemDLDAO extends AbstractDAO<DiaDiemDLModel> implements IDiaDiemDLDAO {
        @Override
	public List<DiaDiemDLModel> findAll(){
		String sql = "SELECT * FROM diadiem";
		return query(sql, new DiaDiemDLMapper());
	}
    
}
