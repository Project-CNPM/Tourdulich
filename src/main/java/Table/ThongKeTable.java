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
public class ThongKeTable {
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Tour", "Tổng số đoàn đi", "Tổng doanh thu","Tổng chi phí","Lãi"};
   

    public void showTable(ArrayList<TourModel> data,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
        
       listObj=new ArrayList();
        for(TourModel item:data){
            List<DoanDuLichModel> doanList = SingletonBllUtil.getDoanDuLichBLLInstance().findByIdTour(item.getId());
            int tongSoDoan = doanList!=null ? doanList.size() : 0 ;
            Double tongDoanhThu=0.0;
            Double tongChiPhi =0.0;
            if(doanList != null)
            for(DoanDuLichModel c : doanList ){
                int soLuongKhach = SingletonBllUtil.getDoanDuLichBLLInstance().countKhachHangInDoan(c.getId());
                tongDoanhThu += c.getGiaTour()*soLuongKhach;
                 ChiPhiModel chiPhiModel = SingletonBllUtil.getChiPhiBLLInstance().findByDoanId(c.getId());                   
                 if(chiPhiModel != null){
                    tongChiPhi+=chiPhiModel.getTotal();
                  }
            }
            
            listObj.add(new Object[]{
                    item.getId(),
                    item.getTenTour(),
                    tongSoDoan,
                    currency(tongDoanhThu),
                    currency(tongChiPhi),
                    currency(tongDoanhThu-tongChiPhi)                                              
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
