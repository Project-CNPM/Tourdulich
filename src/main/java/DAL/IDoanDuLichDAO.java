package DAL;

import java.util.List;

import DTO.DoanDuLichModel;

public interface IDoanDuLichDAO extends GenericDAO<DoanDuLichModel> {
	 List<DoanDuLichModel> findAll();
}
