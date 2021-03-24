/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import DTO.GiaTourModel;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class GiaTourTable {
    public static ArrayList listObj = new ArrayList();
    
    String[] TenCot = new String[]{"ID","Giá tour", "Từ ngày", "Đến ngày"};
   

    public void showTable(ArrayList<GiaTourModel> data,JTable table) {
  
        String id = null;
       listObj=new ArrayList();
       for(GiaTourModel item:data){
       listObj.add(new Object[]{
                    item.getId(),
                    currency(item.getSoTien()),
                    item.getGiaTuNgay().toString(),
                    item.getGiaDenNgay().toString()
                    });
            }
        
        ModelTable model = new ModelTable(listObj, TenCot);
       
        initModel(model,table);
       
    }
    private String currency(double money){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
       return currencyVN.format(money);
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
