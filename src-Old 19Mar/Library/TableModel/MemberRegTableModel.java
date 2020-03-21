/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.TableModel;

import BO.MemberReg;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MemberRegTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Sr.","Member ID", "Reference Id", "Name", "Contact No","Type"};
    private final Object[][] data;

    public MemberRegTableModel(List<MemberReg> LstMem) {
        data = new Object[LstMem.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < LstMem.size(); i++) {
           
            MemberReg memReg = LstMem.get(i);
            
            data[row][0] = i+1;
            data[row][1] = memReg.getMemberId( );
            data[row][2] = memReg.getRefId();
            data[row][3] = memReg.getName();
            data[row][4] = memReg.getContact();
            data[row][5] = memReg.getMrt();
            row++;
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
//    @Override
//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

    /*
   
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
