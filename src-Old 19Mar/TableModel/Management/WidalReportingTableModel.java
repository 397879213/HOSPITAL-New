/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.Management;

import java.util.List;
import BO.Management.WidalReportingBo;
import javax.swing.table.AbstractTableModel;

public class WidalReportingTableModel extends AbstractTableModel {

    private String[] columnNames
            = { "Parameter Name", "1:20","1:40","1:80","1:160","1:320"};
    private Object[][] data;
   
  
    public WidalReportingTableModel(List<WidalReportingBo> li) {
      data = new Object[li.size()][columnNames.length];
        for (int i = 0; i < li.size(); i++) {
            WidalReportingBo cp = li.get(i);
            data[i][0] = cp.getParameterName();
            data[i][1] = cp.getSol20();
            data[i][2] = cp.getSol40();
            data[i][3] = cp.getSol80();
            data[i][4] = cp.getSol160();
            data[i][5] = cp.getSol320();
        }   
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */

    /*
     * Don't need to implement this method unless your table's
     * editable.
//     */
    @Override
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
  

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private final boolean DEBUG = false;

    @Override
    public void setValueAt(Object value, int row, int col) {
        if (DEBUG) {
            System.out.println("Setting value at " + row + "," + col
                    + " to " + value
                    + " (an instance of "
                    + value.getClass() + ")");
        }

        data[row][col] = value;
        fireTableCellUpdated(row, col);

        if (DEBUG) {
            System.out.println("New value of data:");
            printDebugData();
        }
    }

    private void printDebugData() {
        int numRows = getRowCount();
        int numCols = getColumnCount();

        for (int i = 0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("  " + data[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}
