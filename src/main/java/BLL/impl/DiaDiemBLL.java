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
import Singleton.SingletonDaoUtil;
import java.util.List;


/**
 *
 * @author hocgioinhatlop
 */
public class DiaDiemBLL implements IDiaDiemBLL {
      
	@Override
	public List<DiaDiemModel> findAll() {
       
	return SingletonDaoUtil.getDiaDiemDAOInstance().findAll();
	}

    @Override
    public DiaDiemModel save(DiaDiemModel model) {
         int id = SingletonDaoUtil.getDiaDiemDAOInstance().save(model);
         return SingletonDaoUtil.getDiaDiemDAOInstance().findOne(id);
    }
   
    public DiaDiemModel findOne(int id) {
         
         return SingletonDaoUtil.getDiaDiemDAOInstance().findOne(id);
    }
    @Override
     public DiaDiemModel save(DiaDiemModel model,int idTour) {
      
         int id = SingletonDaoUtil.getDiaDiemDAOInstance().save(model);
         SingletonDaoUtil.getDiaDiemDAOInstance().AddDiaDiemToTour(idTour, id);
         return SingletonDaoUtil.getDiaDiemDAOInstance().findOne(id);
    }
     @Override
     public void AddDiaDiemToTour(int idDd,int idTour) {
        
         SingletonDaoUtil.getDiaDiemDAOInstance().AddDiaDiemToTour(idTour, idDd);
    }
     @Override
     public void AddDiaDiemToTour(List<Integer> idDd,int idTour) {
        
         for(int item : idDd){
           if(!SingletonDaoUtil.getDiaDiemDAOInstance().findOneInTour(idTour,item))
           SingletonDaoUtil.getDiaDiemDAOInstance().AddDiaDiemToTour(idTour, item); 
           
           
            
         }     
     }
     
      @Override
     public void DeleteDiaDiemToTour(int idDd,int idTour) {
         
         SingletonDaoUtil.getDiaDiemDAOInstance().DeleteDiaDiemToTour(idTour, idDd);
    }
      @Override
     public void DeleteAllDiaDiemInTour(int idTour) {     
         SingletonDaoUtil.getDiaDiemDAOInstance().DeleteAllDiaDiemInTour(idTour);
    }

    @Override
    public DiaDiemModel update(DiaDiemModel updateNew) {
        
        SingletonDaoUtil.getDiaDiemDAOInstance().update(updateNew);
	return SingletonDaoUtil.getDiaDiemDAOInstance().findOne(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
      
        for (int id: ids) {
	SingletonDaoUtil.getDiaDiemDAOInstance().delete(id);
	}
    }

    @Override
    public boolean findOneInTour(int idTour, int idDiaDiem) {
         return SingletonDaoUtil.getDiaDiemDAOInstance().findOneInTour(idTour, idDiaDiem);
    }
    
    public List<DiaDiemModel> findByThanhPho(String thanhPho) {
        
        return SingletonDaoUtil.getDiaDiemDAOInstance().findByThanhPho(thanhPho);
    }
}
