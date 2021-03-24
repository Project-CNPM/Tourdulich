/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DiaDiemModel;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public interface IDiaDiemDAO extends GenericDAO<DiaDiemModel> {
    List<DiaDiemModel> findAll();
    int save(DiaDiemModel newModel);
    void update(DiaDiemModel updateNew);
    void delete(int id);
    DiaDiemModel findOne(int id);
    void AddDiaDiemToTour(int idTour,int idDiaDiem);
    void DeleteDiaDiemToTour(int idTour,int idDiaDiem);
    boolean findOneInTour(int idTour,int idDiaDiem);
    List<DiaDiemModel> findByThanhPho(String thanhPho);
    void DeleteAllDiaDiemInTour(int idTour);
}
