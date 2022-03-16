/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodriguez.markel
 */
public class ProduktuenTableModela extends AbstractTableModel {
    private final String[] zutabeIzenak = {"Kodea","Izena","Prezioa"};
    private ArrayList<Produktua> data = new ArrayList<>();
    
    public ProduktuenTableModela(){
        data.add(new Produktua("J01","Ogia",1.5));
        data.add(new Produktua("J02","Esnea",1.05));
        data.add(new Produktua("J03","Magdalenak",2.25));
        data.add(new Produktua("J04","Mermelada",3.0));
    }
    public String getColumnName(int col){
        
            return zutabeIzenak[col];
        
        
    }
    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }
    
    public boolean isCellEditable(int row, int col){
        int prezioa = 0;
        String izena = null;
        String kodea;
        if(col == 0){
            
            data.get(row);
              return true;
              
          }
         if(col == 1){
            
            data.get(row).setIzena(izena);
              return true;
              
          }
        if(col == 2){
            
            data.get(row).setPrezioa(prezioa);
              return true;
              
          }
        return false;
    }
    @Override
    public int getRowCount() {
        //zerbait falta da
        return data.size();
    }

    @Override
    public int getColumnCount() {
        //zerbait falta da
        return zutabeIzenak.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //zerbait falta da
     
          if(columnIndex == 0){
              return data.get(rowIndex).getStrKodea();
          }
          if(columnIndex == 1){
              return data.get(rowIndex).getIzena();
          }
          if(columnIndex == 2){
              return data.get(rowIndex).getPrezioa();
          }
      
        return null ;
    }
  
}
