/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import DTO.KhachHangModel;
import DTO.NhanVienModel;
import DTO.TourModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class KhachHangTable {
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Tên khách hàng", "Ngày sinh","Số điện thoại","Email"};
   

    public void showTable(ArrayList<KhachHangModel> data,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
       listObj=new ArrayList();
        for(KhachHangModel item:data){
       listObj.add(new Object[]{
                    item.getId(),
                    item.getTenKH(),
                    item.getNgaySinh().toString(),
                    item.getSdt(),
                    item.getEmail()
                 
                    
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
}
