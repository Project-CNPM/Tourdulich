package DAL;

import java.util.List;

import DTO.DoanDLModel;

public interface IDoanDLDAO extends GenericDAO<DoanDLModel> {
	 List<DoanDLModel> findAll();
}
