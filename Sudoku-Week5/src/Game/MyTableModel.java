/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.table.AbstractTableModel;

/**
 * MyTableModel represents a new model for the Sudoku Table to follow,
 * mainly existing to restrict what cells can be editable
 * @author Steve Sanchez
 */
public class MyTableModel extends AbstractTableModel{
    public final String forbidden[][] = new String[9][9];
    public final Object rowData[][] = new Object[9][9];
    private final Object colData[] = new Object[9];
    
    /**
     * Initializes the forbidden cells, rowData, and colData for the 
     * Table model
     * @param rowValues The row data
     * @param colValues The column data
     * @param forbiddenCells The forbidden cells of the table
     */
    public MyTableModel(Object rowValues[][], Object colValues[], String forbiddenCells[][]){
        for(int i = 0; i <9; i++){
            for(int j = 0; j < 9; j++){
                forbidden[i][j] = forbiddenCells[i][j];
                rowData[i][j] = rowValues[i][j];
                colData[j] = colValues[j];
            }
        }
    }
    
    /**
     * Sets the value for cell
     * @param value The new value of the cell
     * @param row The row of the cell
     * @param column The column of the cell
     */
    @Override
    public void setValueAt(Object value, int row, int column) {
        Object editable = "EditableValueHere";
        if (rowData[row][column] == forbidden[row][column]){
            // Do nothing if its a forbidden cell (value is given and displayed)
        }
        // If the value is entered in a blank cell, store it and update
        // (using "EditableValueHere" in this case, otherwise if forbidden had 
        // "" set for blank cells, it would not update/ use above if statement)
        else if (forbidden[row][column] == editable){
            rowData[row][column] = value;
            fireTableCellUpdated(row, column);
        }
        else{
            // Otherwise set its new value and update the cell
            rowData[row][column] = value;
            fireTableCellUpdated(row, column);
        }
    }

    /**
     * Indicates whether the cell is editable or not
     * @param row
     * @param column
     * @return boolean value indicating if cell is editable
     */
    @Override
    public boolean isCellEditable(int row, int column) { 
        // If cell is forbidden, its not editable
        if (rowData[row][column] == forbidden[row][column]){
            return false; 
        }
        else
            // If cell is not forbidden, allow it to be editable
            return true;
    }
    
    /**
     * Gets the number of rows in the table
     * @return number of rows
     */
    @Override
    public int getRowCount() {
        return rowData.length;
    }

    /**
     * Gets the number of columns in the table
     * @return number of columns
     */
    @Override
    public int getColumnCount() {
        return colData.length;
    }

    /**
     * Gets the value of the cell
     * @param rowIndex The row in the table
     * @param columnIndex The column in the table
     * @return value of the cell
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         return rowData[rowIndex][columnIndex];
    }
}
