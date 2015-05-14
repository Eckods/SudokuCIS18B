/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ncc
 */
public class MyTableModel extends AbstractTableModel{
    public MyTableModel(Object rowData, int sudokuForbiddenCells[][]){

        @Override
        boolean isCellEditable(int row, int col){ 
            if (rowData[row][col] == sudokuForbidden[col][row])
                return false;
            else
                return true;
        }
        
        public void setValueAt(Object value, int row, int col) {
            if (rowData[row][col] == sudokuForbidden[col][row]){
                
            }
            else{
                rowData[row][col] = value;
                fireTableCellUpdated(row, col);
            }
        }


        @Override
        public int getRowCount() {
            return rowData.length;
        }

        @Override
        public int getColumnCount() {
            return colData.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
             return rowData[row][col];
        }
    }
}
