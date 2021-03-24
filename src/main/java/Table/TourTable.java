/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import DTO.DiaDiemModel;
import DTO.TourModel;
import Singleton.SingletonBllUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class TourTable {
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Tên Tour", "Mô tả", "Loại tour","Danh sách các địa điểm"};
   

    public void showTable(ArrayList<TourModel> data,JTable table) {
    //Object[] objects= SingletonBusUtil.getNguoiDungBUSInstance().findByProperty(null,null,Constant.SORT_ASC,null, null);
  //  ArrayList<NguoiDungDTO> userDTOS = (ArrayList<NguoiDungDTO>)  objects[1];
        String id = null;
        
       listObj=new ArrayList();
        for(TourModel item:data){
            String diaDiem="";
            for(DiaDiemModel itemDd : item.getListDiaDiem()) {
                diaDiem = diaDiem + itemDd.getTenDiaDiem()+" - " ;
            }
            if(diaDiem.length()>0){
              diaDiem=diaDiem.substring(0, diaDiem.length()-2);
            }
            listObj.add(new Object[]{
                    item.getId(),
                    item.getTenTour(),
                    item.getMoTa(),
                    SingletonBllUtil.getLoaiTourBLLInstance().findById(item.getLoai_id()).getTenLoai(),
                    diaDiem
            
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
