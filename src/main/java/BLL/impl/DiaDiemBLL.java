/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.impl;

import BLL.IDiaDiemBLL;
import DAL.IDiaDiemDLDAO;
import DAL.impl.DiaDiemDLDAO;
import DTO.DiaDiemDLModel;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemBLL implements IDiaDiemBLL {
      
	private IDiaDiemDLDAO diaDiemDao;
        
	@Override
	public List<DiaDiemDLModel> findAll() {
        diaDiemDao=new DiaDiemDLDAO();
	return diaDiemDao.findAll();
	}
    
}
