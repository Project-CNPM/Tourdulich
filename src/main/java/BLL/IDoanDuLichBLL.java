package BLL;

import java.util.List;

import DTO.DoanDuLichModel;

public interface IDoanDuLichBLL {
	List<DoanDuLichModel> findAll();
        DoanDuLichModel findById(int id);
        DoanDuLichModel save(DoanDuLichModel newModel);
        DoanDuLichModel update(DoanDuLichModel updateNew);
        void delete(int[] id);
        List<DoanDuLichModel>  findByIdTour(int id);
        int countKhachHangInDoan(int id);
}
