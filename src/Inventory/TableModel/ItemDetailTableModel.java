/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory.TableModel;

import Inventory.BO.CondemItems;
import Inventory.BO.Item;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sibtain
 */
public class ItemDetailTableModel extends AbstractTableModel {

    private final String[] columnNames = 
                {"Sr.", "Item Id", "Item Name",  "Item Type", "Generic", "Strength",
                "Formulary", "Group"};

    private Object[][] data;

    public ItemDetailTableModel(List<Item> li) {
        data = new Object[li.size()][columnNames.length];
        for (int i = 0; i < li.size(); i++) {
            Item item = li.get(i);
            data[i][0] = (i+1);
            data[i][1] = item.getId();
            data[i][2] = item.getDescription();
            data[i][3] = item.getItemTypeDescription();
            data[i][4] = item.getGenericDescription();
            data[i][5] = item.getStrength();
            data[i][6] = item.getFormulary();
            data[i][7] = item.getGroupDescription();
            
        }
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private boolean DEBUG = false;

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
