package BLL.impl;

import java.util.List;

import BLL.IDoanDuLichBLL;
import DAL.IDoanDuLichDAO;
import DAL.impl.DoanDuLichDAO;
import DTO.DoanDuLichModel;
import DTO.KhachHangModel;
import DTO.NguoiDiModel;
import Singleton.SingletonBllUtil;
import Singleton.SingletonDaoUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoanDuLichBLL implements IDoanDuLichBLL {
	
    
	@Override
	public List<DoanDuLichModel> findAll() {
	return SingletonDaoUtil.getDoanDuLichDAOInstance().findAll();
	}
        @Override
        public DoanDuLichModel save(DoanDuLichModel newModel) {
            
             int id = SingletonDaoUtil.getDoanDuLichDAOInstance().save(newModel);
             return SingletonDaoUtil.getDoanDuLichDAOInstance().findById(id);
        }

    @Override
    public DoanDuLichModel update(DoanDuLichModel updateNew) {
        SingletonDaoUtil.getDoanDuLichDAOInstance().update(updateNew);
	return SingletonDaoUtil.getDoanDuLichDAOInstance().findById(updateNew.getId());
    }

    @Override
    public void delete(int[] ids) {
        for (int id: ids) {
	SingletonDaoUtil.getDoanDuLichDAOInstance().delete(id);
       }
    }

    @Override
    public DoanDuLichModel findById(int id) {
        return SingletonDaoUtil.getDoanDuLichDAOInstance().findById(id);
    }
    @Override
    public List<DoanDuLichModel> findByIdTour(int id){
        return SingletonDaoUtil.getDoanDuLichDAOInstance().findByIdTour(id);
    }
    @Override
    public int countKhachHangInDoan(int id) {
        ObjectMapper objectMapper = new ObjectMapper();
        NguoiDiModel nguoiDiModel = SingletonDaoUtil.getNguoiDiDAOInstance().findByDoanId(id);
        if(nguoiDiModel != null){
            String jsonKH = nguoiDiModel.getDsKhach();
            try {
                List<KhachHangModel> khachHangList = objectMapper.readValue(jsonKH, new TypeReference<List<KhachHangModel>>() {
                });
                return khachHangList.size();
            } catch (JsonProcessingException ex) {
                Logger.getLogger(DoanDuLichBLL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
         return 0;
    }
}
