/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import DTO.ChiPhiModel;
import DTO.DiaDiemModel;
import DTO.DoanDuLichModel;
import DTO.KhachHangModel;
import DTO.TourModel;
import Singleton.SingletonBllUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class ThongKeChiTietTable {
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Đoàn đi", "Số khách", "Giá tour","Doanh thu","Tổng chi phí","Lãi"};
   

    public void showTable(ArrayList<DoanDuLichModel> data,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
        
       listObj=new ArrayList();
        for(DoanDuLichModel item:data){
            List<DoanDuLichModel> doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(item.getId());
            int tongSoKhach = SingletonBllUtil.getDoanDuLichBLLInstance().countKhachHangInDoan(item.getId());
            Double tongDoanhThu=item.getGiaTour()*tongSoKhach;
            ChiPhiModel chiPhiModel = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(item.getId());
            Double chiPhi =0.0;
            if(chiPhiModel != null){
                chiPhi=chiPhiModel.getTotal();
            }
            
            
            
            listObj.add(new Object[]{
                    item.getId(),
                    item.getTenDoan(),
                    tongSoKhach,
                    item.getGiaTour(),
                    currency(tongDoanhThu),
                    currency(chiPhi),
                    currency(tongDoanhThu-chiPhi)                                             
                    });
            }     
        ModelTable model = new ModelTable(listObj, TenCot);     
        initModel(model,table);
       
    }
     public void initModel(ModelTable model,JTable table)
    {
         table.setModel((TableModel) model);
         //table.getColumnModel().getColumn(0).setCellRenderer(new ControlPerson.ImageRenderer());
        //table.getColumnModel().getColumn(1).setWidth(10);
         table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);
        table.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
       // CheckBoxRenderer checkBoxRenderer = new CheckBoxRenderer();
        //table.getColumnModel().getColumn(5).setCellRenderer(checkBoxRenderer);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
     private String currency(double money){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
       return currencyVN.format(money);
    }
}
