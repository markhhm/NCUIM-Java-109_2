//<蘇湘婷--
import javax.swing.*; 
import java.awt.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

class MyTableModel extends DefaultTableModel{
    @Override
    public boolean isCellEditable(int row, int column) {
        //isCellEditable回傳false，讓表格不可編輯
        return false;
    }
}
//--蘇湘婷>