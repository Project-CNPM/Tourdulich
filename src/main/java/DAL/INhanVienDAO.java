package DAL;

import java.util.List;

import DTO.NhanVienModel;

public interface INhanVienDAO extends GenericDAO<NhanVienModel> {
	List<NhanVienModel> findAll();
        void update(NhanVienModel updateNew);
        void delete(int id);
        NhanVienModel findOne(int id);
        int save(NhanVienModel newModel);
//        List<NhanVienModel> findByIdOrName();
}
