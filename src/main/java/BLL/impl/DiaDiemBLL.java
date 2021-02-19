/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.impl;

import BLL.IDiaDiemBLL;
import DAL.IDiaDiemDAO;
import DAL.impl.DiaDiemDAO;
import DTO.DiaDiemModel;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemBLL implements IDiaDiemBLL {
      
	private IDiaDiemDAO diaDiemDao;
        
	@Override
	public List<DiaDiemModel> findAll() {
        diaDiemDao=new DiaDiemDAO();
	return diaDiemDao.findAll();
	}
    
}
