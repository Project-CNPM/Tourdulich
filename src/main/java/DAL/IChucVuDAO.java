package DAL;

import java.util.List;

import DTO.ChucVuModel;

public interface IChucVuDAO extends GenericDAO<ChucVuModel> {
	List<ChucVuModel> findAll();

}
