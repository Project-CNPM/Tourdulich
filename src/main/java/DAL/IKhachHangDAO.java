package DAL;

import java.util.List;

import DTO.KhachHangModel;

public interface IKhachHangDAO extends GenericDAO<KhachHangModel> {
	List<KhachHangModel> findAll();

}
