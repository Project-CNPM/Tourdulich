/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DiaDiemModel;
import java.util.List;

/**
 *
 * @author hocgioinhatlop
 */
public interface IDiaDiemBLL  {
    List<DiaDiemModel> findAll();
    DiaDiemModel save(DiaDiemModel newModel);
    DiaDiemModel update(DiaDiemModel updateNew);
    void delete(int[] ids);
    DiaDiemModel save(DiaDiemModel model,int idTour);
    void AddDiaDiemToTour(int idDd,int idTour);
    void DeleteDiaDiemToTour(int idDd,int idTour);
    boolean findOneInTour(int idTour, int idDiaDiem);
    List<DiaDiemModel> findByThanhPho(String thanhPho);
    void AddDiaDiemToTour(List<Integer> idDd,int idTour);
    void DeleteAllDiaDiemInTour(int idTour);
}
