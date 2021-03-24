package BLL;

import java.util.List;

import DTO.KhachHangModel;

public interface IKhachHangBLL {
	List<KhachHangModel> findAll();
        KhachHangModel findById(int id);
        KhachHangModel save(KhachHangModel newModel);
        KhachHangModel update(KhachHangModel updateNew);
        void delete(int[] id);

}
