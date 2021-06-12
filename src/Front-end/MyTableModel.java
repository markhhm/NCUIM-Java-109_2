import javax.swing.*; 
import java.awt.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

class MyTableModel extends DefaultTableModel{

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    
    public MyTableModel(Object[][] rowData, Object[] columnNames){
        super(rowData, columnNames);
    }
    
}
    