package DAL;

import java.util.List;

import DTO.KhachHangModel;

public interface IKhachHangDAO extends GenericDAO<KhachHangModel> {
	List<KhachHangModel> findAll();
         int save(KhachHangModel newModel);
         void update(KhachHangModel updateNew);
         void delete(int id);
         KhachHangModel findOne(int id);

}
