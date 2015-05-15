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
    private String forbidden [][] = new String [9][9];
    private Object rowData[][] = new Object [9][9];
    private Object colData[] = new Object [9];
    
    /**
     * Initializes the forbidden cells, rowData, and colData for the 
     * Table model
     * @param row The row data
     * @param col The column data
     * @param sudokuForbiddenCells The forbidden cells of the table
     */
    public MyTableModel(Object row[][], Object col[], String sudokuForbiddenCells[][]){
        for(int i = 0; i <9; i++){
            for(int j = 0; j < 9; j++){
                forbidden[i][j] = sudokuForbiddenCells[i][j];
                rowData[i][j] = row[i][j];
                colData[j] = col[j];
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
       if (rowData[row][column] == forbidden[row][column]){
           // Do nothing if its a forbidden cell
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
        if (rowData[row][column] == forbidden[row][column] ){
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
