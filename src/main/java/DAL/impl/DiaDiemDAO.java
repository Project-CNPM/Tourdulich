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
	String sql = "SELECT * FROM tour_diadiem";
	return query(sql, new DiaDiemMapper());
	}
        public List<DiaDiemModel> findDiaDiemOfTourById(int id) {
           StringBuilder sql = new StringBuilder("SELECT * FROM tourdulich_dd AS u");
            sql.append(" INNER JOIN diadiem AS r ON u.diadiem_madd=r.madd");
            sql.append(" WHERE u.tourdulich_matour = ?");
            List<DiaDiemModel> result = query(sql.toString(), new DiaDiemMapper(), id);
            return result;
        }
        
        @Override
	public int save(DiaDiemModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO tour_diadiem (dd_ten, dd_thanhpho,");
		sql.append(" dd_mota)");
		sql.append(" VALUES(?, ?, ?)");
		return insert(sql.toString(), newModel.getTenDiaDiem(), newModel.getThanhPho(), 
				newModel.getMoTa());
	}
        @Override
	public void update(DiaDiemModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE tour_diadiem SET dd_ten = ?, dd_thanhpho = ?,");
		sql.append(" dd_mota = ?");
		sql.append(" WHERE dd_id = ?");
		update(sql.toString(), updateNew.getTenDiaDiem(), updateNew.getThanhPho(), updateNew.getMoTa(),
			updateNew.getId());
	}
        @Override
	public void delete(int id) {
		String sql = "DELETE FROM tour_diadiem WHERE dd_id = ?";
		update(sql, id);
	}
        @Override
	public DiaDiemModel findOne(int id) {
		String sql = "SELECT * FROM tour_diadiem WHERE dd_id = ?";
		List<DiaDiemModel> news = query(sql, new DiaDiemMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}
        @Override
	public List<DiaDiemModel> findByThanhPho(String thanhPho) {
		String sql = "SELECT * FROM tour_diadiem WHERE dd_thanhpho = ?";
		List<DiaDiemModel> news = query(sql, new DiaDiemMapper(), thanhPho);
		return news.isEmpty() ? null : news;
	}
        @Override
	public void AddDiaDiemToTour(int idTour,int idDiaDiem) {
		StringBuilder sql = new StringBuilder("INSERT INTO tour_chitiet (tour_id, dd_id)");
		sql.append(" VALUES(?, ?)");
		insert(sql.toString(), idTour, idDiaDiem);
	}
        @Override
	public void DeleteDiaDiemToTour(int idTour,int idDiaDiem) {
		StringBuilder sql = new StringBuilder("DELETE FROM tour_chitiet");
		sql.append(" WHERE tour_id = ? AND dd_id = ?");
		update(sql.toString(), idTour, idDiaDiem);
	}
        @Override
        public void DeleteAllDiaDiemInTour(int idTour){
            StringBuilder sql = new StringBuilder("DELETE FROM tour_chitiet");
		sql.append(" WHERE tour_id = ?");
		update(sql.toString(), idTour);
        }

    @Override
    public boolean findOneInTour(int idTour, int idDiaDiem) {
        //true la co gia tri false ko co gia tri
        String sql = "SELECT * FROM tour_chitiet WHERE tour_id = ? AND dd_id = ?";
		List<DiaDiemModel> news = query(sql, new DiaDiemMapper(), idTour,idDiaDiem);
		return !news.isEmpty();
    }
    
}
