/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardiacRegistry.TableModel;

import CardiacRegistry.BO.BloodGasses;
import CardiacRegistry.BO.PerfusionistBO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PerfusionBloodGasesTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Time", "On Vent", "DBP 1", "DBP 2", "DBP 3", "DBP 4",
                "DBP 5", "DBP 6", "DBP 7", "DBP 8", "DBP 9", "DBP 10", ""};
    private final Object[][] data;

    public PerfusionBloodGasesTableModel(List<BloodGasses> liInfo) {
        data = new Object[liInfo.size()][columnNames.length];

        int row = 0;

        for (BloodGasses currentinfo : liInfo) {

            data[row][0] = currentinfo.getBloodGasesId();
            data[row][1] = currentinfo.getOnVentDBP();
            data[row][2] = currentinfo.getBloodFlow();
            data[row][3] = currentinfo.getTemperature();
            data[row][4] = currentinfo.getFIO2();
            data[row][5] = currentinfo.getGFlow();
            data[row][6] = currentinfo.getPH();
            data[row][7] = currentinfo.getPCO2();
            data[row][8] = currentinfo.getHCO2();
            data[row][9] = currentinfo.getBE();
            data[row][10] = currentinfo.getO2Sat();
            data[row][11] = currentinfo.getTCO2();
            data[row][12] = currentinfo.getNA();
//            data[row][13] = currentinfo.getK();
//            data[row][14] = currentinfo.getCA();
//            data[row][15] = currentinfo.getLAC();
//            data[row][16] = currentinfo.getHB();
//            data[row][17] = currentinfo.getSugar();
//            data[row][18] = currentinfo.getACT();
//            data[row][19] = currentinfo.getHeparin();
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
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        //no matter where the cell appears onscreen
        if (col > 0) {

            return true;
        }
        return false;
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
